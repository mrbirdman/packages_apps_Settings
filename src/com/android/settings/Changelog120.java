package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Changelog120 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Rebuilt from scratch yet again." + "\n-Update to Android 2.3.4" + "\n-Inclusion of stripped down God Mode for easy access to Addons and Nightlies." + "\n-Inclusion of T3hh4xx0r Wallpapers." + "\n-Add support for Fascinate, OG Droid, CDMA Hero, Incredible 2, and the Thunderbolt." + "\n-Add Tmobile Theme Engine." + "\n-Add FM Radio for applicable devices.");
       setContentView(tv);
   }
}

