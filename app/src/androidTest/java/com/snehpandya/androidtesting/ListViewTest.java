package com.snehpandya.androidtesting;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;

/**
 * Created by sneh.pandya on 25/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class ListViewTest {

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testListView() {
        onView(withId(R.id.btn_listview)).perform(click());

        //Click at specified value
        onData(allOf(is(instanceOf(String.class)), is("Oreo"))).perform(click());

        //Click at specified position
        onData(anything()).inAdapterView(withId(R.id.listview)).atPosition(5).perform(click());
    }
}
