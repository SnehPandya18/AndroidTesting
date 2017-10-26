package com.snehpandya.androidtesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by sneh.pandya on 26/10/17.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ExampleInstrumentedTest.class,
        MainActivityTest.class,
        NavigationDrawerTest.class,
        FragmentTest.class,
        ListViewTest.class,
        RecyclerViewTest.class,
        ViewPagerTest.class
})
public class AllTestsSuit {}
