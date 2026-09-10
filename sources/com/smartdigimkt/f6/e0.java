package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class e0 extends y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35140c = "IconClicks";
    private static final String d = "IconClickThrough";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35141e = "IconClickTracking";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c0 f35142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0 f35143b;

    public e0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35140c);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(d)) {
                    xmlPullParser.require(2, null, d);
                    this.f35142a = new c0(xmlPullParser);
                    xmlPullParser.require(3, null, d);
                } else if (name == null || !name.equals(f35141e)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35141e);
                    this.f35143b = new d0(xmlPullParser);
                    xmlPullParser.require(3, null, f35141e);
                }
            }
        }
    }

    public c0 a() {
        return this.f35142a;
    }

    public d0 b() {
        return this.f35143b;
    }
}
