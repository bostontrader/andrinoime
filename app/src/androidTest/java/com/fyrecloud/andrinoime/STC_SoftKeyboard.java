package com.fyrecloud.andrinoime;

import android.content.Intent;
import android.test.ServiceTestCase;
import android.view.View;

import com.example.android.softkeyboard.SoftKeyboard;

/**
 *  @author Thomas Radloff  bostontrader@gmail.com
 */

public class STC_SoftKeyboard extends ServiceTestCase<SoftKeyboard> {

    public STC_SoftKeyboard() {
        super(SoftKeyboard.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void test() {
        Intent intent = new Intent(getContext(), SoftKeyboard.class);
        SoftKeyboard skb = getService();
        startService(intent);
        skb = getService();
        skb.onInitializeInterface();
        View v1 = skb.onCreateInputView();
        View v2 = skb.onCreateCandidatesView();
        boolean b = skb.isInputViewShown();
        //skb.onStartInput();

    }
}