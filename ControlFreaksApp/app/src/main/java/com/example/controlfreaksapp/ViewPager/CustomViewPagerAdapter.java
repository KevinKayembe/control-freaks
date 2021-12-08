package com.example.controlfreaksapp.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CustomViewPagerAdapter extends FragmentStateAdapter {
    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /**
     * This will create a fragment of its own and 
     * @param position
     * @return void
     */
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return InfoFragment.newInstance("To Get Started", "Press F");
            default: return InfoFragment.newInstance("Invalid Title", "Page does not exist: 404");
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
