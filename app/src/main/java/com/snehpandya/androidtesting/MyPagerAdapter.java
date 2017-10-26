package com.snehpandya.androidtesting;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sneh.pandya on 26/10/17.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return FragmentOne.newInstance(0, "One");
            case 1: return FragmentTwo.newInstance(1, "Two");
            default: return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
    @Override
    public int getCount() {
        return 2;
    }
}
