package com.example.israeltourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LocationPagerAdapter extends FragmentStateAdapter {

    int mNumOfTabs;

    public LocationPagerAdapter(@NonNull FragmentActivity fragmentActivity, int mNumOfTabs) {
        super(fragmentActivity);
        this.mNumOfTabs = mNumOfTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new RestaurantFragment();
            case 1:
                return new BeachesFragment();
            case 2:
                return new OutdoorsFragment();
            case 3:
                return new EventsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return mNumOfTabs;
    }
}
