package spartacus.andrinoime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * This Activity is the entry point to the application.  Although technically not necessary,
 * because an IME isa Service, it's handy to have this Activity so that we can display
 * a simple UI that uses the IME, for purposes of debugging.
 *
 * @author Thomas Radloff  bostontrader@gmail.com https://bostontrader.github.io/androidime
*/

public class MainActivity extends Activity {

    //public native String stringFromC();
    //public native String stringFromCpp();
    //public native long longFromC();
    //public native long longFromCpp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit = (Button) this.findViewById(R.id.btnDoit);
        btnSubmit.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        System.loadLibrary("jni-latinime");
                        //((EditText) findViewById(R.id.stringFromC)).setText(stringFromC());
                        //((EditText) findViewById(R.id.stringFromCpp)).setText(stringFromCpp());
                        //((EditText) findViewById(R.id.longFromC)).setText(Long.toString(longFromC()));
                        //((EditText) findViewById(R.id.longFromCpp)).setText(Long.toString(longFromCpp()));
                    }
                }
        );
    }
}
