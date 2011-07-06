package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Changelog112 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("\n-Fix Launcher landscape hotseat backgrounds...Again." + "\n-Add support for WiMax for applicable devices." + "\n-Remove redundant settings info.");
       setContentView(tv);
   }
}
