package com.example.phonecalllog;

import android.content.Context;
import android.provider.CallLog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonecalllog.alphabeticscroll.RecyclerViewFastScroller;
import com.example.phonecalllog.databinding.ListRowBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.CallLogViewHolder> implements RecyclerViewFastScroller.BubbleTextGetter, Filterable {

    private List<Contacts> contactList;
    private List<Contacts> contactListfull;
    Context context;
    OnCallLogItemClickListener onItemClickListener;

    interface OnCallLogItemClickListener {
        void onItemClicked(CallLogInfo callLogInfo);
    }

    public ContactsAdapter(Context context) {
        contactList = new ArrayList<>();
        this.context = context;
    }

    public void setOnItemClickListener(OnCallLogItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public CallLogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ListRowBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.list_row, parent, false);
        return new CallLogViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CallLogViewHolder holder, int position) {

        holder.itemBinding.textViewName.setText(contactList.get(position).getName());
        holder.itemBinding.textViewCallNumber.setText(contactList.get(position).getNumber());
        holder.itemBinding.textViewCallDate.setVisibility(View.GONE);
        holder.itemBinding.textViewCallDuration.setVisibility(View.GONE);
    }

    public void addContacts(List<Contacts> list) {
        contactList.clear();
        contactList.addAll(list);
        contactListfull = new ArrayList<>(contactList);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }


    @Override
    public String getTextToShowInBubble(int pos) {
        if (pos < 0 || pos >= contactList.size())
            return null;

        String name = String.valueOf(contactList.get(pos));
        if (name == null || name.length() < 1)
            return null;

        return contactList.get(pos).toString().substring(0, 1);
    }

    class CallLogViewHolder extends RecyclerView.ViewHolder {
        ListRowBinding itemBinding;

        public CallLogViewHolder(ListRowBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
        }
    }

    @Override
    public Filter getFilter() {
        return contactFilter;
    }

    private Filter contactFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence input) {
            List<Contacts> filteredList = new ArrayList<>();
            if (input == null || input.length() == 0) {
                filteredList.addAll(contactListfull);
            } else {
                String searchInput = input.toString().toLowerCase().trim();
                for (Contacts contacts : contactListfull) {
                    if (contacts.getName().toLowerCase().contains(searchInput) || contacts.getNumber().toLowerCase().contains(searchInput)) {
                        filteredList.add(contacts);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            contactList.clear();
            contactList.addAll((List) filterResults.values);
            notifyDataSetChanged();
        }
    };
}
