package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Changelog120 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Rebuilt from scratch yet again." + "\n-Update to Android 2.3.4" + "\n-Add support for OG Droid, CDMA Hero, and the Thunderbolt." + "\n-Add Tmobile Theme Engine." + "\n-Add FM Radio for applicable devices.");
       setContentView(tv);
   }
}

