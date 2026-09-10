package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class c1 extends y0 {
    private static final String j = "Wrapper";
    private static final String k = "AdSystem";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f35129l = "Impression";
    private static final String m = "VASTAdTagURI";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f35130n = "Error";
    private static final String o = "Creatives";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f35131p = "Extensions";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35134c;
    private c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z0 f35135e;
    private w f;
    private ArrayList<h0> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<p> f35136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f35137i;

    public c1(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, j);
        this.f35132a = xmlPullParser.getAttributeValue(null, "followAdditionalWrappers");
        this.f35133b = xmlPullParser.getAttributeValue(null, "allowMultipleAds");
        this.f35134c = xmlPullParser.getAttributeValue(null, "fallbackOnNoAd");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(k)) {
                    xmlPullParser.require(2, null, k);
                    this.d = new c(xmlPullParser);
                    xmlPullParser.require(3, null, k);
                } else if (name != null && name.equals(f35130n)) {
                    xmlPullParser.require(2, null, f35130n);
                    this.f = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f35130n);
                } else if (name != null && name.equals(m)) {
                    xmlPullParser.require(2, null, m);
                    this.f35135e = new z0(xmlPullParser);
                    xmlPullParser.require(3, null, m);
                } else if (name != null && name.equals(f35129l)) {
                    if (this.g == null) {
                        this.g = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, f35129l);
                    this.g.add(new h0(xmlPullParser));
                    xmlPullParser.require(3, null, f35129l);
                } else if (name != null && name.equals(o)) {
                    xmlPullParser.require(2, null, o);
                    this.f35136h = new s(xmlPullParser).a();
                    xmlPullParser.require(3, null, o);
                } else if (name == null || !name.equals(f35131p)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35131p);
                    this.f35137i = new y(xmlPullParser);
                    xmlPullParser.require(3, null, f35131p);
                }
            }
        }
    }

    public c a() {
        return this.d;
    }

    public String b() {
        return this.f35133b;
    }

    public ArrayList<p> c() {
        return this.f35136h;
    }

    public w d() {
        return this.f;
    }

    public y e() {
        return this.f35137i;
    }

    public String f() {
        return this.f35134c;
    }

    public ArrayList<h0> g() {
        return this.g;
    }

    public z0 h() {
        return this.f35135e;
    }
}
