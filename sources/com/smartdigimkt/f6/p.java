package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class p extends y0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f35209i = "Creative";
    private static final String j = "CreativeExtensions";
    private static final String k = "Linear";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f35210l = "CompanionAds";
    private static final String m = "NonLinearAds";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35213c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<q> f35214e;
    private j0 f;
    private ArrayList<l> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n0 f35215h;

    public p(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35209i);
        this.f35211a = xmlPullParser.getAttributeValue(null, "id");
        this.f35212b = xmlPullParser.getAttributeValue(null, "sequence");
        this.f35213c = xmlPullParser.getAttributeValue(null, "adID");
        this.d = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(j)) {
                    b(xmlPullParser);
                } else if (name != null && name.equals(k)) {
                    xmlPullParser.require(2, null, k);
                    this.f = new j0(xmlPullParser);
                    xmlPullParser.require(3, null, k);
                } else if (name != null && name.equals(f35210l)) {
                    xmlPullParser.require(2, null, f35210l);
                    this.g = new m(xmlPullParser).a();
                    xmlPullParser.require(3, null, f35210l);
                } else if (name == null || !name.equals(m)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, m);
                    this.f35215h = new n0(xmlPullParser);
                    xmlPullParser.require(3, null, m);
                }
            }
        }
    }

    public String a() {
        return this.f35213c;
    }

    public String b() {
        return this.d;
    }

    public ArrayList<l> c() {
        return this.g;
    }

    public String d() {
        return this.f35211a;
    }

    public j0 e() {
        return this.f;
    }

    public n0 f() {
        return this.f35215h;
    }

    public String g() {
        return this.f35212b;
    }

    public void a(ArrayList<l> arrayList) {
        this.g = arrayList;
    }
}
