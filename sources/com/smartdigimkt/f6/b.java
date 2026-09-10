package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class b extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35113b;

    public b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35112a = xmlPullParser.getAttributeValue(null, "xmlEncoded");
        this.f35113b = a(xmlPullParser);
    }

    public String a() {
        return this.f35113b;
    }

    public String b() {
        return this.f35112a;
    }
}
