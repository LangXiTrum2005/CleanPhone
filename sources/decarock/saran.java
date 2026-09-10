package decarock;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: XmlPullParserUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class saran {
    public static String attabal(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean dern(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return saneness(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean marial(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return wireman(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean saneness(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean wireman(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }
}
