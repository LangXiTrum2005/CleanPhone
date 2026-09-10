package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class v0 extends y0 {
    private static final String d = "VAST";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35232e = "Error";
    private static final String f = "Ad";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w f35233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<a> f35234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35235c;

    public v0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, d);
        this.f35235c = xmlPullParser.getAttributeValue(null, "version");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f35232e)) {
                    xmlPullParser.require(2, null, f35232e);
                    this.f35233a = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f35232e);
                } else if (name == null || !name.equals(f)) {
                    b(xmlPullParser);
                } else {
                    if (this.f35234b == null) {
                        this.f35234b = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, f);
                    this.f35234b.add(new a(xmlPullParser));
                    xmlPullParser.require(3, null, f);
                }
            }
        }
    }

    public ArrayList<a> a() {
        return this.f35234b;
    }

    public w b() {
        return this.f35233a;
    }

    public String c() {
        return this.f35235c;
    }
}
