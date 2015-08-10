package com.fyrecloud.andrinoime;

import android.app.Activity;
import android.os.Bundle;

/**
 * This Activity is the entry point to the application.  Although technically not necessary,
 * because an IME isa Service, it's handy to have this Activity so that we can display
 * a simple UI that uses the IME, for purposes of debugging.
 *
 * @author Thomas Radloff  bostontrader@gmail.com
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}