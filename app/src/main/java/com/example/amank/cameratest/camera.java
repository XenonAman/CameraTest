package com.example.amank.cameratest;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.amank.cameratest.R.id.add;
import static com.example.amank.cameratest.R.id.view;

public class camera extends AppCompatActivity {

    TabLayout myTab;
    ViewPager myPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        myTab = (TabLayout)findViewById(R.id.myTab);
        myPager = (ViewPager)findViewById(R.id.mypager);

        myPager.setAdapter(new MyOwnPageAdapter(getSupportFragmentManager()));
        myTab.setupWithViewPager(myPager);

        myTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                myPager.setCurrentItem(tab.getPosition() );
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }



    class MyOwnPageAdapter extends FragmentPagerAdapter{

        String data[]={"AddReminder","ReminderList","Setting"};

        public MyOwnPageAdapter(FragmentManager fm) {super(fm);}

        @Override
        public Fragment getItem(int position) {

            if (position == 0){
                return new AddReminder();
            }

            if (position == 1){
                return new ReminderList();
            }

            if (position == 2){
                return new Setting();
            }

            return null;

        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }
}
