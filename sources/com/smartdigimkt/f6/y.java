package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class y extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35248b = "Extensions";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35249c = "Extension";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<x> f35250a = new ArrayList<>();

    public y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35248b);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35249c)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35249c);
                    this.f35250a.add(new x(xmlPullParser));
                    xmlPullParser.require(3, null, f35249c);
                }
            }
        }
    }

    public ArrayList<x> a() {
        return this.f35250a;
    }
}
