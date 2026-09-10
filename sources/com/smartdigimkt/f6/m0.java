package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class m0 extends y0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f35195p = "NonLinear";
    private static final String q = "StaticResource";
    private static final String r = "IFrameResource";
    private static final String s = "HTMLResource";
    private static final String t = "AdParameters";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f35196u = "NonLinearClickThrough";
    private static final String v = "NonLinearClickTracking";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35199c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35200e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f35201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f35202i;
    private r0 j;
    private a0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private z f35203l;
    private b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f35204n;
    private p0 o;

    public m0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35195p);
        this.f35197a = xmlPullParser.getAttributeValue(null, "id");
        this.f35198b = xmlPullParser.getAttributeValue(null, "width");
        this.f35199c = xmlPullParser.getAttributeValue(null, "height");
        this.d = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f35200e = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f = xmlPullParser.getAttributeValue(null, "scalable");
        this.g = xmlPullParser.getAttributeValue(null, "maintainAspectRatio");
        this.f35201h = xmlPullParser.getAttributeValue(null, "minSuggestedDuration");
        this.f35202i = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(q)) {
                    xmlPullParser.require(2, null, q);
                    this.j = new r0(xmlPullParser);
                    xmlPullParser.require(3, null, q);
                } else if (name != null && name.equals(r)) {
                    xmlPullParser.require(2, null, r);
                    this.k = new a0(xmlPullParser);
                    xmlPullParser.require(3, null, r);
                } else if (name != null && name.equals(s)) {
                    xmlPullParser.require(2, null, s);
                    this.f35203l = new z(xmlPullParser);
                    xmlPullParser.require(3, null, s);
                } else if (name != null && name.equals(t)) {
                    xmlPullParser.require(2, null, t);
                    this.m = new b(xmlPullParser);
                    xmlPullParser.require(3, null, t);
                } else if (name != null && name.equals(f35196u)) {
                    xmlPullParser.require(2, null, f35196u);
                    this.f35204n = new o0(xmlPullParser);
                    xmlPullParser.require(3, null, f35196u);
                } else if (name == null || !name.equals(v)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, v);
                    this.o = new p0(xmlPullParser);
                    xmlPullParser.require(3, null, v);
                }
            }
        }
    }

    public b a() {
        return this.m;
    }

    public String b() {
        return this.f35202i;
    }

    public String c() {
        return this.f35200e;
    }

    public String d() {
        return this.d;
    }

    public z e() {
        return this.f35203l;
    }

    public String f() {
        return this.f35199c;
    }

    public a0 g() {
        return this.k;
    }

    public String h() {
        return this.f35197a;
    }

    public String i() {
        return this.g;
    }

    public String j() {
        return this.f35201h;
    }

    public o0 k() {
        return this.f35204n;
    }

    public p0 l() {
        return this.o;
    }

    public String m() {
        return this.f;
    }

    public r0 n() {
        return this.j;
    }

    public String o() {
        return this.f35198b;
    }
}
