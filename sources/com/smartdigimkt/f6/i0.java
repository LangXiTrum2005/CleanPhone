package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class i0 extends y0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f35150l = "InLine";
    private static final String m = "AdSystem";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f35151n = "AdTitle";
    private static final String o = "Description";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f35152p = "Advertiser";
    private static final String q = "Pricing";
    private static final String r = "Survey";
    private static final String s = "Error";
    private static final String t = "Impression";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f35153u = "Creatives";
    private static final String v = "Extensions";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f35154w = "AdVerifications";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f35155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f35156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u f35157c;
    private f d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q0 f35158e;
    private s0 f;
    private w g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<h0> f35159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<p> f35160i;
    private y j;
    private e k;

    public i0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35150l);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(m)) {
                    xmlPullParser.require(2, null, m);
                    this.f35155a = new c(xmlPullParser);
                    xmlPullParser.require(3, null, m);
                } else if (name != null && name.equals(f35151n)) {
                    xmlPullParser.require(2, null, f35151n);
                    this.f35156b = new d(xmlPullParser);
                    xmlPullParser.require(3, null, f35151n);
                } else if (name != null && name.equals(o)) {
                    xmlPullParser.require(2, null, o);
                    this.f35157c = new u(xmlPullParser);
                    xmlPullParser.require(3, null, o);
                } else if (name != null && name.equals(f35152p)) {
                    xmlPullParser.require(2, null, f35152p);
                    this.d = new f(xmlPullParser);
                    xmlPullParser.require(3, null, f35152p);
                } else if (name != null && name.equals(q)) {
                    xmlPullParser.require(2, null, q);
                    this.f35158e = new q0(xmlPullParser);
                    xmlPullParser.require(3, null, q);
                } else if (name != null && name.equals(r)) {
                    xmlPullParser.require(2, null, r);
                    this.f = new s0(xmlPullParser);
                    xmlPullParser.require(3, null, r);
                } else if (name != null && name.equals(s)) {
                    xmlPullParser.require(2, null, s);
                    this.g = new w(xmlPullParser);
                    xmlPullParser.require(3, null, s);
                } else if (name != null && name.equals(t)) {
                    if (this.f35159h == null) {
                        this.f35159h = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, t);
                    this.f35159h.add(new h0(xmlPullParser));
                    xmlPullParser.require(3, null, t);
                } else if (name != null && name.equals(f35153u)) {
                    xmlPullParser.require(2, null, f35153u);
                    this.f35160i = new s(xmlPullParser).a();
                    xmlPullParser.require(3, null, f35153u);
                } else if (name != null && name.equals(v)) {
                    xmlPullParser.require(2, null, v);
                    this.j = new y(xmlPullParser);
                    xmlPullParser.require(3, null, v);
                } else if (name == null || !name.equals(f35154w)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35154w);
                    this.k = new e(xmlPullParser);
                    xmlPullParser.require(3, null, f35154w);
                }
            }
        }
    }

    public c a() {
        return this.f35155a;
    }

    public d b() {
        return this.f35156b;
    }

    public e c() {
        return this.k;
    }

    public f d() {
        return this.d;
    }

    public ArrayList<p> e() {
        return this.f35160i;
    }

    public u f() {
        return this.f35157c;
    }

    public w g() {
        return this.g;
    }

    public y h() {
        return this.j;
    }

    public ArrayList<h0> i() {
        return this.f35159h;
    }

    public q0 j() {
        return this.f35158e;
    }

    public s0 k() {
        return this.f;
    }

    public void a(ArrayList<p> arrayList) {
        this.f35160i = arrayList;
    }
}
