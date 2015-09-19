package spartacus.andrinoime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android_cy.inputmethod.latin.personalization.PersonalizationDictionaryTests;
/**
 * This Activity is the entry point to the application.  Although technically not necessary,
 * because an IME isa Service, it's handy to have this Activity so that we can display
 * a simple UI that uses the IME, for purposes of debugging.
 *
 * @author Thomas Radloff  bostontrader@gmail.com https://bostontrader.github.io/androidime
*/

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit = (Button) this.findViewById(R.id.btnDoit);
        btnSubmit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        System.loadLibrary("jni_latinime");

                        PersonalizationDictionaryTests pdt = new PersonalizationDictionaryTests();
                        pdt.testAddManyTokens(MainActivity.this);
                    }
                }
        );
    }
}
