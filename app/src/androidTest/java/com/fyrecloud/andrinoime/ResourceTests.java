/**
 *  @author Thomas Radloff  bostontrader@gmail.com
 */

package com.fyrecloud.andrinoime;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.test.AndroidTestCase;
import android.util.AttributeSet;
import android.util.Xml;

import com.android_cy.inputmethod.latin.utils.XmlParseUtils;

import org.xmlpull.v1.XmlPullParser;

public class ResourceTests extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void test() {
        /*Context c = getContext();
        Resources resources = c.getResources();
        XmlPullParser parser = resources.getXml(R.xml.rowkeys_qwerty1);
        AttributeSet attributes = Xml.asAttributeSet(parser);

        try {
            while (parser.getEventType() != XmlPullParser.END_DOCUMENT) {
                final int event = parser.next();
                int count = attributes.getAttributeCount();
                if (count > 0) {
                    String d = attributes.getPositionDescription();
                    String d1;
                    int gARV;
                    for (int i = 0; i < count; i++) {
                        d1 = attributes.getAttributeName(i);
                        d1 = attributes.getAttributeValue(i);
                        gARV = attributes.getAttributeResourceValue(i, 0);
                    }
                }
                if (event == XmlPullParser.START_TAG) {
                    final String tag = parser.getName();
                    //if (TAG_KEY.equals(tag)) {
                        //parseKey(parser, row, skip);
                    //} else if (TAG_SPACER.equals(tag)) {
                        //parseSpacer(parser, row, skip);
                    //} else if (TAG_INCLUDE.equals(tag)) {
                        //parseIncludeRowContent(parser, row, skip);
                    //} else if (TAG_SWITCH.equals(tag)) {
                        //parseSwitchRowContent(parser, row, skip);
                    //} else if (TAG_KEY_STYLE.equals(tag)) {
                        //parseKeyStyle(parser, skip);
                    //} else {
                        //throw new XmlParseUtils.IllegalStartTag(parser, tag, TAG_ROW);
                    //}
                } else if (event == XmlPullParser.END_TAG) {
                    final String tag = parser.getName();
                    //if (DEBUG) endTag("</%s>", tag);
                    //if (TAG_ROW.equals(tag)) {
                        //if (!skip) {
                        //endRow(row);
                        //}
                        //return;
                    //}
                    //if (TAG_CASE.equals(tag) || TAG_DEFAULT.equals(tag) || TAG_MERGE.equals(tag)) {
                    //return;
                    //}
                    //throw new XmlParseUtils.IllegalEndTag(parser, tag, TAG_ROW);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }


        //TypedArray ta = r.obtainAttributes(attr, R.styleable.Keyboard_Key);

        assert(true);*/
    }

}
