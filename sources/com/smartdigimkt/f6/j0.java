package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class j0 extends y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f35161h = "Linear";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f35162i = "AdParameters";
    private static final String j = "Duration";
    private static final String k = "MediaFiles";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f35163l = "TrackingEvents";
    private static final String m = "VideoClicks";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f35164n = "Icons";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f35166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v f35167c;
    private ArrayList<k0> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<t0> f35168e;
    private b1 f;
    private ArrayList<b0> g;

    public j0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35161h);
        this.f35165a = xmlPullParser.getAttributeValue(null, "skipoffset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f35162i)) {
                    xmlPullParser.require(2, null, f35162i);
                    this.f35166b = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f35162i);
                } else if (name != null && name.equals(j)) {
                    xmlPullParser.require(2, null, j);
                    this.f35167c = new v(xmlPullParser);
                    xmlPullParser.require(3, null, j);
                } else if (name != null && name.equals(k)) {
                    xmlPullParser.require(2, null, k);
                    this.d = new l0(xmlPullParser).a();
                    xmlPullParser.require(3, null, k);
                } else if (name != null && name.equals(f35163l)) {
                    xmlPullParser.require(2, null, f35163l);
                    this.f35168e = new u0(xmlPullParser).a();
                    xmlPullParser.require(3, null, f35163l);
                } else if (name != null && name.equals(m)) {
                    xmlPullParser.require(2, null, m);
                    this.f = new b1(xmlPullParser);
                    xmlPullParser.require(3, null, m);
                } else if (name == null || !name.equals(f35164n)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35164n);
                    this.g = new g0(xmlPullParser).a();
                    xmlPullParser.require(3, null, f35164n);
                }
            }
        }
    }

    public b a() {
        return this.f35166b;
    }

    public v b() {
        return this.f35167c;
    }

    public ArrayList<b0> c() {
        return this.g;
    }

    public ArrayList<k0> d() {
        return this.d;
    }

    public String e() {
        return this.f35165a;
    }

    public ArrayList<t0> f() {
        return this.f35168e;
    }

    public b1 g() {
        return this.f;
    }
}
