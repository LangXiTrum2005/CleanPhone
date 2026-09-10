package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class a1 extends y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35108e = "JavaScriptResource";
    private static final String f = "VerificationParameters";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35111c;
    private String d;

    public a1(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35109a = xmlPullParser.getAttributeValue(null, "vendor");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f35108e)) {
                    xmlPullParser.require(2, null, f35108e);
                    this.d = xmlPullParser.getAttributeValue(null, "apiFramework");
                    this.f35110b = a(xmlPullParser);
                    xmlPullParser.require(3, null, f35108e);
                } else if (name == null || !name.equals(f)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f);
                    this.f35111c = a(xmlPullParser);
                    xmlPullParser.require(3, null, f);
                }
            }
        }
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f35110b;
    }

    public String c() {
        return this.f35109a;
    }

    public String d() {
        return this.f35111c;
    }
}
