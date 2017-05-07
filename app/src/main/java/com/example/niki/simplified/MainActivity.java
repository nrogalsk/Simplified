package com.example.niki.simplified;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create tab host and connect it to the tab host widget
        TabHost menuTab = (TabHost) findViewById(android.R.id.tabhost); // initiate TabHost

        // setup
        menuTab.setup();

        // tab host option 1
        // set the content
        TabHost.TabSpec tabSpec1 = menuTab.newTabSpec("Weather");
        tabSpec1.setContent(R.id.WeatherTab);

        // set the title and icon
        View tabIndicator1 = LayoutInflater.from(this).inflate(R.layout.tab_indicator, menuTab.getTabWidget(), false);
        ((TextView) tabIndicator1.findViewById(R.id.tab_title)).setText(R.string.tab1Name);
        ((ImageView) tabIndicator1.findViewById(R.id.tab_icon)).setImageResource(R.drawable.ic_weather);

        // set the intent
        tabSpec1.setIndicator(tabIndicator1).setContent(new Intent(this, WeatherActivity.class));

        // tab host option 2
        // set the content
        TabHost.TabSpec tabSpec2 = menuTab.newTabSpec("Clock");
        tabSpec2.setContent(R.id.ClockTab);

        // set the title and icon
        View tabIndicator2 = LayoutInflater.from(this).inflate(R.layout.tab_indicator, menuTab.getTabWidget(), false);
        ((TextView) tabIndicator2.findViewById(R.id.tab_title)).setText(R.string.tab2Name);
        ((ImageView) tabIndicator2.findViewById(R.id.tab_icon)).setImageResource(R.drawable.ic_clock);

        // set the intent
        tabSpec2.setIndicator(tabIndicator2).setContent(new Intent(this, ClockActivity.class));

        // tab host option 3
        // set the content
        TabHost.TabSpec tabSpec3 = menuTab.newTabSpec("About");
        tabSpec3.setContent(R.id.AboutTab);

        // set the title and icon
        View tabIndicator3 = LayoutInflater.from(this).inflate(R.layout.tab_indicator, menuTab.getTabWidget(), false);
        ((TextView) tabIndicator3.findViewById(R.id.tab_title)).setText(R.string.tab3Name);
        ((ImageView) tabIndicator3.findViewById(R.id.tab_icon)).setImageResource(R.drawable.ic_about);

        // set the intent
        tabSpec3.setIndicator(tabIndicator3).setContent(new Intent(this, AboutActivity.class));

        // tab host option 4
        // set the content
        TabHost.TabSpec tabSpec4 = menuTab.newTabSpec("Email");
        tabSpec4.setContent(R.id.EmailTab);

        // set the title and icon
        // Reference for ic_about_us icon: icons8, https://icons8.com/web-app/23264/user#filled
        View tabIndicator4 = LayoutInflater.from(this).inflate(R.layout.tab_indicator, menuTab.getTabWidget(), false);
        ((TextView) tabIndicator4.findViewById(R.id.tab_title)).setText(R.string.tab4Name);
        ((ImageView) tabIndicator4.findViewById(R.id.tab_icon)).setImageResource(R.drawable.ic_mail);

        // set the intent
        tabSpec4.setIndicator(tabIndicator4).setContent(new Intent(this, EmailActivity.class));


        // add all tab to the tab host
        //weather
        menuTab.addTab(tabSpec1);
        //clock
        menuTab.addTab(tabSpec2);
        //email
        menuTab.addTab(tabSpec4);
        //about
        menuTab.addTab(tabSpec3);

        //set clock tab as the default tab
        menuTab.setCurrentTab(1);
    }
}
