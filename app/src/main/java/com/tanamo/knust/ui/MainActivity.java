package com.tanamo.knust.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.tanamo.knust.R;
import com.tanamo.knust.frag.Fragment_Main;

import java.util.ArrayList;
import java.util.List;

// This my Main Class.
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    // Initialize Method.
    private void init() {

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager vp = findViewById(R.id.viewpager);
        setupViewPager(vp);

    }

    // Setup ViewPager Method.
    private void setupViewPager(ViewPager vp) {

        Pager pager = new Pager(getSupportFragmentManager());
        pager.addFragment(new Fragment_Main());

        vp.setAdapter(pager);
    }

    // My Pager Adapter Class.
    class Pager extends FragmentPagerAdapter {

        private final List<Fragment> myList;

        Pager(FragmentManager fragmentManager) {
            super(fragmentManager);

            myList = new ArrayList<>();

        }

        @Override
        public Fragment getItem(int position) {
            return myList.get(position);
        }

        @Override
        public int getCount() {
            return myList.size();
        }

        void addFragment(Fragment frag) {
            myList.add(frag);

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


}
