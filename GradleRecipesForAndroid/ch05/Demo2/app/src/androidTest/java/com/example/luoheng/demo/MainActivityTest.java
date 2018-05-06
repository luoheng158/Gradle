package com.example.luoheng.demo;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;
    private TextView textView;
    private EditText editText;
    private Button button;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        activity = getActivity();

        textView = activity.findViewById(R.id.tv_text);
        editText = activity.findViewById(R.id.et_text);
        button = activity.findViewById(R.id.btn);
    }

    @Test
    public void testPreconditions() {
        assertNotNull("Activity is null", activity);
        assertNotNull("TextView is null", textView);
        assertNotNull("EditText is null", editText);
        assertNotNull("Button is null", button);
        Log.d("luoheng", "--dd---" + Utils.printPTID() + ", pkd " + activity.getPackageName());
    }

    @After
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}