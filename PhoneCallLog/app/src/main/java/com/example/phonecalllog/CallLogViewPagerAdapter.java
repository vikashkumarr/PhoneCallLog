package com.example.phonecalllog;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CallLogViewPagerAdapter extends FragmentStateAdapter {

    public CallLogViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0 :
                return new CallLogFragment();
            case 1 :
                return new ContactListFragment();
            default:
                return new SmsListFragment();
        }
     }

    @Override
    public int getItemCount() {
        return 3;
    }
}
