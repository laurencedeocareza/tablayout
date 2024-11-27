package com.example.tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tabs.fragments.CICT;
import com.example.tabs.fragments.TCU;
import com.example.tabs.fragments.profile;

public class pageadapter extends FragmentStateAdapter {
    public pageadapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TCU();
            case 1:
                return new CICT();
            case 2:
                return new profile();
            default:
                return new TCU();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
