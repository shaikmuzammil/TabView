package com.example.a4_cse_a.tabnew;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.pager);
        tb=(TabLayout)findViewById(R.id.tab1);
        tb.setupWithViewPager(viewPager);
        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager()));
        tb.getTabAt(0).setIcon(R.mipmap.ic_launcher_round);
        tb.getTabAt(1).setIcon(R.mipmap.ic_launcher);
        tb.getTabAt(2).setIcon(R.drawable.hie);

    }

    class TabAdapter extends FragmentPagerAdapter{

        public TabAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    return new Shaik();
                case 1:
                    return new Bhanu();
                case 2:
                    return new Harsha();

            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "shaik";
                case 1:
                    return "Bhanu";
                case 2:
                    return "harsha";

            }
            return super.getPageTitle(position);
        }
    }

}
