package com.fyrecloud.andrinoime;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 *  @author Thomas Radloff  bostontrader@gmail.com
 */

public class AITC2_MainActivity extends ActivityInstrumentationTestCase2<MainActivity> {

    public AITC2_MainActivity() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity(); // Start the activity, but we don't need a reference to it.
    }

    public void testPreconditions() {

        // Can I see the single EditText?
        //onView(withId(R.id.thePrompt)).check(matches(isDisplayed()));
        //onView(withId(R.id.thePrompt)).perform(click());

        // This doesn't work.  We can't use Espresso to deal with
        // the soft keyboard
        //onView(withText("123")).check(matches(isDisplayed()));

    }

}
