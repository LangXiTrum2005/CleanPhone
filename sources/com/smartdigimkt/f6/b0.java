package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class b0 extends y0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f35114n = "Icon";
    private static final String o = "StaticResource";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f35115p = "IFrameResource";
    private static final String q = "HTMLResource";
    private static final String r = "IconClicks";
    private static final String s = "IconViewTracking";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35118c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35119e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f35120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r0 f35121i;
    private a0 j;
    private z k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private e0 f35122l;
    private f0 m;

    public b0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35114n);
        this.f35116a = xmlPullParser.getAttributeValue(null, "program");
        this.f35117b = xmlPullParser.getAttributeValue(null, "width");
        this.f35118c = xmlPullParser.getAttributeValue(null, "height");
        this.d = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f35119e = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f = xmlPullParser.getAttributeValue(null, "duration");
        this.g = xmlPullParser.getAttributeValue(null, "offset");
        this.f35120h = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(o)) {
                    xmlPullParser.require(2, null, o);
                    this.f35121i = new r0(xmlPullParser);
                    xmlPullParser.require(3, null, o);
                } else if (name != null && name.equals(f35115p)) {
                    xmlPullParser.require(2, null, f35115p);
                    this.j = new a0(xmlPullParser);
                    xmlPullParser.require(3, null, f35115p);
                } else if (name != null && name.equals(q)) {
                    xmlPullParser.require(2, null, q);
                    this.k = new z(xmlPullParser);
                    xmlPullParser.require(3, null, q);
                } else if (name != null && name.equals(r)) {
                    xmlPullParser.require(2, null, r);
                    this.f35122l = new e0(xmlPullParser);
                    xmlPullParser.require(3, null, r);
                } else if (name == null || !name.equals(s)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, s);
                    this.m = new f0(xmlPullParser);
                    xmlPullParser.require(3, null, s);
                }
            }
        }
    }

    public String a() {
        return this.f35120h;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.f35118c;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.f35116a;
    }

    public String f() {
        return this.f35117b;
    }

    public String g() {
        return this.d;
    }

    public String h() {
        return this.f35119e;
    }
}
