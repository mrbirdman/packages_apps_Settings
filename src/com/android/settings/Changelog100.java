package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Changelog100 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Initial release, I jumped the gun and didnt test throughly. This build was later pulled.");
       setContentView(tv);
   }
}
