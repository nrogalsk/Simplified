package com.example.niki.simplified;

/**
 * Created by niki on 18/4/17.
 * To store and retrieve the name of the city
 */

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Melbourne, AU");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}