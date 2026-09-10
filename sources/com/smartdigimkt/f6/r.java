package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class r extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35219b = "CreativeExtensions";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35220c = "CreativeExtension";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<q> f35221a = new ArrayList<>();

    public r(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35219b);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35220c)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35220c);
                    this.f35221a.add(new q(xmlPullParser));
                    xmlPullParser.require(3, null, f35220c);
                }
            }
        }
    }

    public ArrayList<q> a() {
        return this.f35221a;
    }
}
