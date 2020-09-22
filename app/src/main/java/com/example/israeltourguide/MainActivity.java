package com.example.israeltourguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.viewPager2)
    ViewPager2 viewPager2;

    LocationPagerAdapter mLocationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mLocationAdapter = new LocationPagerAdapter(this, tabLayout.getTabCount());

        viewPager2.setAdapter(mLocationAdapter);
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    if (position == 0) {
                        tab.setText(getString(R.string.restaurant_tab));
                    } else if (position == 1) {
                        tab.setText(getString(R.string.beaches_tab));
                    } else if (position == 2) {
                        tab.setText(getString(R.string.outdoor_activities_tab));
                    } else if (position == 3) {
                        tab.setText(getString(R.string.events_tab));
                    }
                }).attach();
    }
}