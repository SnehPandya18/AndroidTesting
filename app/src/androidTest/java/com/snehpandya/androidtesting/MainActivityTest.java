package com.snehpandya.androidtesting;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by sneh.pandya on 24/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void ensureTextView() {
        //Check text inside TextView
        onView(withId(R.id.text_hello)).check(matches(withText("Hello Android!")));
    }

    @Test
    public void ensureTypeTextLaunchActivity() {
        onView(withId(R.id.et_hello)).perform(typeText("Oreo"), closeSoftKeyboard());

        //Button click
        onView(withId(R.id.btn_next)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("Oreo")));
    }

    @Test
    public void ensureCheckBoxWithToast() {
        ensureTypeTextLaunchActivity();
        onView(withId(R.id.checkbox_toast)).perform(click());

        //Check Toast
        onView(withText("Oreo")).inRoot(withDecorView(not(is(mMainActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }
}
