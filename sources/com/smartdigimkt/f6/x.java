package com.smartdigimkt.f6;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class x extends y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35245c = "AdVerifications";
    private static final String d = "Extension";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f35247b;

    public x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f35246a = xmlPullParser.getAttributeValue(null, "type");
        xmlPullParser.require(2, null, d);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35245c)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35245c);
                    this.f35247b = new e(xmlPullParser);
                    xmlPullParser.require(3, null, f35245c);
                }
            }
        }
    }

    public e a() {
        return this.f35247b;
    }

    public String b() {
        return this.f35246a;
    }
}
