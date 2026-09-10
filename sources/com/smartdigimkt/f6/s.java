package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class s extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35224b = "Creatives";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35225c = "Creative";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<p> f35226a = new ArrayList<>();

    public s(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35224b);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35225c)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35225c);
                    this.f35226a.add(new p(xmlPullParser));
                    xmlPullParser.require(3, null, f35225c);
                }
            }
        }
    }

    public ArrayList<p> a() {
        return this.f35226a;
    }
}
