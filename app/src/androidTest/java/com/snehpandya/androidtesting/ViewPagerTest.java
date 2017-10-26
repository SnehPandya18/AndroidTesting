package com.snehpandya.androidtesting;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by sneh.pandya on 26/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class ViewPagerTest {

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void swipeViewPager() {
        onView(withId(R.id.btn_viewpager)).perform(click());
        onView(ViewMatchers.withId(R.id.viewpager)).perform(swipeLeft());
        onView(ViewMatchers.withId(R.id.viewpager)).perform(swipeRight());
    }
}
