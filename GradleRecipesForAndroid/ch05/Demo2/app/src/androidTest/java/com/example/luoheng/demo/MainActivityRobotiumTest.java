package com.example.luoheng.demo;

import android.test.ActivityInstrumentationTestCase2;
import com.robotium.solo.Solo;

public class MainActivityRobotiumTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityRobotiumTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testMyActivity() {
        solo.assertCurrentActivity("MyActivity", MainActivity.class);
    }

    public void testSayHello() {
        solo.enterText(0, "Dolly");
        solo.clickOnButton("Button");
        solo.assertCurrentActivity("WelcomeActivity", WelcomeActivity.class);
        solo.searchText("Hello,Dolly!");
    }

    public void tearDown() {
        solo.finishOpenedActivities();
    }
}