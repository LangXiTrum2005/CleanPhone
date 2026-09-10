package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class c extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35128b;

    public c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35127a = xmlPullParser.getAttributeValue(null, "version");
        this.f35128b = a(xmlPullParser);
    }

    public String a() {
        return this.f35128b;
    }

    public String b() {
        return this.f35127a;
    }
}
