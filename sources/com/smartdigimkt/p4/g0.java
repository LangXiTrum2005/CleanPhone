package com.smartdigimkt.p4;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 {
    private g0() {
    }

    public static boolean a(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return b(xmlPullParser) && a(xmlPullParser.getName()).equals(str);
    }

    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (a(xmlPullParser.getAttributeName(i2)).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    private static String a(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }
}
