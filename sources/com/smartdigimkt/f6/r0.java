package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class r0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35223b;

    public r0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35222a = xmlPullParser.getAttributeValue(null, "creativeType");
        this.f35223b = a(xmlPullParser);
    }

    public String a() {
        return this.f35222a;
    }

    public String b() {
        return this.f35223b;
    }
}
