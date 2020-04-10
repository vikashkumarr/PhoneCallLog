package com.example.phonecalllog;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phonecalllog.databinding.FragmentCallLogBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class CallLogFragment extends Fragment {

    FragmentCallLogBinding binding;
    CallLogAdapter adapter;

    public CallLogFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()),R.layout.fragment_call_log,container,false);
        initComponents();
        return binding.getRoot();
    }

    public void initComponents(){
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        binding.recyclerView.setLayoutManager(mLayoutManager);
        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new CallLogAdapter(getContext());
        binding.recyclerView.setAdapter(adapter);
        loadData();
    }
    public void loadData(){
        CallLogUtils callLogUtils = CallLogUtils.getInstance(getContext());
        adapter.addAllCallLog(callLogUtils.readCallLogs());
        adapter.notifyDataSetChanged();
       /* onItemClickListener = new CallLogAdapter.OnCallLogItemClickListener() {
            @Override
            public void onItemClicked(CallLogInfo callLogInfo) {
                Intent intent = new Intent(getContext(),StatisticsActivity.class);
                intent.putExtra("number",callLogInfo.getNumber());
                intent.putExtra("name",callLogInfo.getName());
                startActivity(intent);
            }
        };*/
       // adapter.setOnItemClickListener(onItemClickListener);
    }
}
