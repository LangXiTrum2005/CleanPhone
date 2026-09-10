package com.facebook.ads.redexgen.core;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1606gK {
    public static String[] A00 = {"cBWiy6IO4n8CoMmWJlXpTl3qA0hHZOzL", "Q8hZKPh", "FW9CTtnuVGpBU1M1", "PRH1ssN", "W0kEUQmroDHVBGOl4ureZeC4BxUYERgb", "fmDeqTqiiJ3tpigihEc9KfGThfPV9xLC", "p3YYgoBzEvK53i2y", "hrnqGPhHVJT9DD5SH"};

    public static String A00(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                String[] strArr = A00;
                String str2 = strArr[2];
                String str3 = strArr[6];
                int i2 = str2.length();
                int attributeCount2 = str3.length();
                if (i2 != attributeCount2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[5] = "eaNTK2Riu8YtvsOmH0AbWlsI29ICHBQc";
                strArr2[4] = "wuittzPNiuEJAG2aYeCrevxDWaHvYMnP";
                return attributeValue;
            }
        }
        return null;
    }

    public static boolean A01(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean A02(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean A03(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return A01(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean A04(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (A02(xmlPullParser)) {
            String name = xmlPullParser.getName();
            String[] strArr = A00;
            if (strArr[5].charAt(7) == strArr[4].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[5] = "9TstfI7aps6jib1iHyTHGsqP6zhM9Blf";
            strArr2[4] = "YFUSu8x3Lt9zLQIuWQVZ3ePFtCjROuzm";
            if (name.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
