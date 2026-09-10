package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class u0 extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35229b = "TrackingEvents";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35230c = "Tracking";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<t0> f35231a = new ArrayList<>();

    public u0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35229b);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35230c)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35230c);
                    this.f35231a.add(new t0(xmlPullParser));
                    xmlPullParser.require(3, null, f35230c);
                }
            }
        }
    }

    public ArrayList<t0> a() {
        return this.f35231a;
    }
}
