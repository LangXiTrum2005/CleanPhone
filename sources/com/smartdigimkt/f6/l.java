package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class l extends y0 {
    private static final String r = "Companion";
    private static final String s = "StaticResource";
    private static final String t = "IFrameResource";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f35177u = "HTMLResource";
    private static final String v = "AdParameters";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f35178w = "AltText";
    private static final String x = "CompanionClickThrough";
    private static final String y = "CompanionClickTracking";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f35179z = "TrackingEvents";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35182c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35183e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f35184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f35185i;
    private r0 j;
    private a0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private z f35186l;
    private b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f35187n;
    private n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private o f35188p;
    private ArrayList<t0> q;

    public l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, r);
        this.f35180a = xmlPullParser.getAttributeValue(null, "id");
        this.f35181b = xmlPullParser.getAttributeValue(null, "width");
        this.f35182c = xmlPullParser.getAttributeValue(null, "height");
        this.d = xmlPullParser.getAttributeValue(null, "assetWidth");
        this.f35183e = xmlPullParser.getAttributeValue(null, "assetHeight");
        this.f = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.g = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f35184h = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f35185i = xmlPullParser.getAttributeValue(null, "adSlotID");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(s)) {
                    xmlPullParser.require(2, null, s);
                    this.j = new r0(xmlPullParser);
                    xmlPullParser.require(3, null, s);
                } else if (name != null && name.equals(t)) {
                    xmlPullParser.require(2, null, t);
                    this.k = new a0(xmlPullParser);
                    xmlPullParser.require(3, null, t);
                } else if (name != null && name.equals(f35177u)) {
                    xmlPullParser.require(2, null, f35177u);
                    this.f35186l = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f35177u);
                } else if (name != null && name.equals(v)) {
                    xmlPullParser.require(2, null, v);
                    this.m = new b(xmlPullParser);
                    xmlPullParser.require(3, null, v);
                } else if (name != null && name.equals(f35178w)) {
                    xmlPullParser.require(2, null, f35178w);
                    this.f35187n = new g(xmlPullParser);
                    xmlPullParser.require(3, null, f35178w);
                } else if (name != null && name.equals(x)) {
                    xmlPullParser.require(2, null, x);
                    this.o = new n(xmlPullParser);
                    xmlPullParser.require(3, null, x);
                } else if (name != null && name.equals(y)) {
                    xmlPullParser.require(2, null, y);
                    this.f35188p = new o(xmlPullParser);
                    xmlPullParser.require(3, null, y);
                } else if (name == null || !name.equals(f35179z)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35179z);
                    this.q = new u0(xmlPullParser).a();
                    xmlPullParser.require(3, null, f35179z);
                }
            }
        }
    }

    public b a() {
        return this.m;
    }

    public String b() {
        return this.f35185i;
    }

    public g c() {
        return this.f35187n;
    }

    public String d() {
        return this.f35184h;
    }

    public String e() {
        return this.f35183e;
    }

    public String f() {
        return this.d;
    }

    public n g() {
        return this.o;
    }

    public o h() {
        return this.f35188p;
    }

    public String i() {
        return this.g;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.f35182c;
    }

    public z l() {
        return this.f35186l;
    }

    public a0 m() {
        return this.k;
    }

    public String n() {
        return this.f35180a;
    }

    public r0 o() {
        return this.j;
    }

    public ArrayList<t0> p() {
        return this.q;
    }

    public String q() {
        return this.f35181b;
    }
}
