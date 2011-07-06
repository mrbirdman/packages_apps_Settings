package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Changelog111 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Added support for the Droid Eris." + "\n-Add on/off animations by default." + "\n-Ubuntu font set by default." + "\n-Fix Launcher landscape hotseat backgrounds.");
       setContentView(tv);
   }
}
