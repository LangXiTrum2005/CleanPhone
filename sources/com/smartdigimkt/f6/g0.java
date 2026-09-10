package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class g0 extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35144b = "Icons";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35145c = "Icon";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<b0> f35146a = new ArrayList<>();

    public g0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35144b);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35145c)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35145c);
                    this.f35146a.add(new b0(xmlPullParser));
                    xmlPullParser.require(3, null, f35145c);
                }
            }
        }
    }

    public ArrayList<b0> a() {
        return this.f35146a;
    }
}
