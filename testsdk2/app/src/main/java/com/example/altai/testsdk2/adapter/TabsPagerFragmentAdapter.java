package com.example.altai.testsdk2.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.altai.testsdk2.fragment.ExampleFragment;

/**
 * Created by Алтай on 01.10.2015.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);

        tabs = new String[]{
                "Tab 1",
                "Напоминания",
                "Tab 1"
        };

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               return ExampleFragment.getInstance();
           case 1:
               return ExampleFragment.getInstance();
           case 2:
               return ExampleFragment.getInstance();
       }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
