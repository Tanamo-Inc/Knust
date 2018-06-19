package com.tanamo.knust.ui;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import com.tanamo.knust.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static junit.framework.Assert.assertNotNull;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> actRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity mAct = null;

    @Before
    public void setUp() {

        mAct = actRule.getActivity();

    }

    @Test
    public void testLaunch() {

        View view = mAct.findViewById(R.id.viewpager);


        assertNotNull(view);

    }

    @After
    public void tearDown() {

        mAct = null;

    }
}