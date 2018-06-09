package com.example.megan.password_validator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestUI {

    @Rule
    public ActivityTestRule<ValidateActivity> mActivityRule =
            new ActivityTestRule(ValidateActivity.class);

    @Test
    public void testUI() {
        //valid password test
        onView(withId(R.id.editText)).perform(typeText("AGoodPassword123"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Your password is strong!")));

        onView(withId(R.id.editText)).perform(clearText());

        //invalid password test
        onView(withId(R.id.editText)).perform(typeText("abadpassword"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Your password is not strong enough")));

    }
}
