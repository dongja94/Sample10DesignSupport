package com.example.dongja94.sampledesignsupport;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class TabPagerActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager pager;
    MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_pager);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        pager = (ViewPager)findViewById(R.id.pager);
        mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(mAdapter);

        tabLayout.setupWithViewPager(pager);
//        tabLayout.setTabsFromPagerAdapter(mAdapter);
        tabLayout.removeAllTabs();

        for (int i = 0 ; i < 10; i++) {
            tabLayout.addTab(tabLayout.newTab().setText("TTT" + i));
        }
    }
}
