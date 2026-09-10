package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class h extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35148b;

    public h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35147a = xmlPullParser.getAttributeValue(null, "id");
        this.f35148b = a(xmlPullParser);
    }

    public String a() {
        return this.f35147a;
    }

    public String b() {
        return this.f35148b;
    }
}
