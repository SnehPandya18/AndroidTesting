package com.snehpandya.androidtesting;

import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.contrib.NavigationViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by sneh.pandya on 24/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class NavigationDrawerTest {

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void launchSecondActivity() {
        onView(withId(R.id.btn_activity)).perform(click());

        //Open Navigation Drawer
        onView(withId(R.id.drawer)).perform(DrawerActions.open());

        //Perform Navigation Drawer actions
        onView(withId(R.id.navigationview)).perform(NavigationViewActions.navigateTo(R.id.two));
    }
}
