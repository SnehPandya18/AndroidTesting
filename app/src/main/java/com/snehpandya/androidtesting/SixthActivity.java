package com.snehpandya.androidtesting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sneh.pandya on 26/10/17.
 */

public class SixthActivity extends AppCompatActivity {

    private FragmentPagerAdapter mFragmentPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        mFragmentPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mFragmentPagerAdapter);
        viewPager.getCurrentItem();
    }
}
