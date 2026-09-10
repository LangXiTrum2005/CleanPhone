package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class n0 extends y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35205c = "NonLinearAds";
    private static final String d = "NonLinear";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35206e = "TrackingEvents";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<m0> f35207a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<t0> f35208b;

    public n0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35205c);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(d)) {
                    xmlPullParser.require(2, null, d);
                    this.f35207a.add(new m0(xmlPullParser));
                    xmlPullParser.require(3, null, d);
                } else if (name == null || !name.equals(f35206e)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35206e);
                    this.f35208b = new u0(xmlPullParser).a();
                    xmlPullParser.require(3, null, f35206e);
                }
            }
        }
    }

    public ArrayList<m0> a() {
        return this.f35207a;
    }

    public ArrayList<t0> b() {
        return this.f35208b;
    }
}
