package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class a extends y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35104e = "Ad";
    private static final String f = "InLine";
    private static final String g = "Wrapper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i0 f35105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f35106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35107c;
    private String d;

    public a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35104e);
        this.f35107c = xmlPullParser.getAttributeValue(null, "id");
        this.d = xmlPullParser.getAttributeValue(null, "sequence");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f)) {
                    xmlPullParser.require(2, null, f);
                    this.f35105a = new i0(xmlPullParser);
                    xmlPullParser.require(3, null, f);
                } else if (name == null || !name.equals(g)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, g);
                    this.f35106b = new c1(xmlPullParser);
                    xmlPullParser.require(3, null, g);
                }
            }
        }
    }

    public String a() {
        return this.f35107c;
    }

    public i0 b() {
        return this.f35105a;
    }

    public String c() {
        return this.d;
    }

    public c1 d() {
        return this.f35106b;
    }
}
