package com.fyrecloud.andrinoime;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

/**
 * This Activity is the entry point to the application.  Although technically not necessary,
 * because an IME isa Service, it's handy to have this Activity so that we can display
 * a simple UI that uses the IME, for purposes of debugging.
 *
 * @author Thomas Radloff  bostontrader@gmail.com
 */
public class MainActivity extends Activity {

    //public native String  stringFromJNI();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //final EditText thePrompt = (EditText) findViewById(R.id.thePrompt);
        //String s = stringFromJNI();
        //thePrompt.setText(s);
    }

    static {
        //try {
            System.loadLibrary("jni_latinime");
        //} catch(Exception e) {
            //e.printStackTrace();;
        //}
    }
}