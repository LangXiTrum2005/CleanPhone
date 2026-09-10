package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class t0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35228b;

    public t0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35227a = xmlPullParser.getAttributeValue(null, "event");
        this.f35228b = a(xmlPullParser);
    }

    public String a() {
        return this.f35227a;
    }

    public String b() {
        return this.f35228b;
    }

    public void a(String str) {
        this.f35227a = str;
    }
}
