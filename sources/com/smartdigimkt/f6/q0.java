package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class q0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35218c;

    public q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35216a = xmlPullParser.getAttributeValue(null, "model");
        this.f35217b = xmlPullParser.getAttributeValue(null, "currency");
        this.f35218c = a(xmlPullParser);
    }

    public String a() {
        return this.f35217b;
    }

    public String b() {
        return this.f35216a;
    }

    public String c() {
        return this.f35218c;
    }
}
