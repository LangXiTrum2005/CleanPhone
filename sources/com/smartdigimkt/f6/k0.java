package com.smartdigimkt.f6;

import com.p004ironsource.C3381s;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class k0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35171c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35172e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f35173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f35174i;
    private String j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35175l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f35176n;

    public k0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35169a = xmlPullParser.getAttributeValue(null, "id");
        this.f35171c = xmlPullParser.getAttributeValue(null, C3381s.g);
        this.d = xmlPullParser.getAttributeValue(null, "type");
        this.f35172e = xmlPullParser.getAttributeValue(null, "bitrate");
        this.f = xmlPullParser.getAttributeValue(null, "minBitrate");
        this.g = xmlPullParser.getAttributeValue(null, "maxBitrate");
        this.f35173h = xmlPullParser.getAttributeValue(null, "width");
        this.f35174i = xmlPullParser.getAttributeValue(null, "height");
        this.j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f35175l = xmlPullParser.getAttributeValue(null, "duration");
        this.m = xmlPullParser.getAttributeValue(null, "offset");
        this.f35176n = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f35170b = a(xmlPullParser);
    }

    public String a() {
        return this.f35176n;
    }

    public String b() {
        return this.f35172e;
    }

    public String c() {
        return this.f35171c;
    }

    public String d() {
        return this.f35175l;
    }

    public String e() {
        return this.f35174i;
    }

    public String f() {
        return this.f35169a;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.f;
    }

    public String i() {
        return this.m;
    }

    public String j() {
        return this.d;
    }

    public String k() {
        return this.f35170b;
    }

    public String l() {
        return this.f35173h;
    }

    public String m() {
        return this.j;
    }

    public String n() {
        return this.k;
    }
}
