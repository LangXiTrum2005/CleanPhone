package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class l0 extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35189b = "MediaFiles";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35190c = "MediaFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<k0> f35191a = new ArrayList<>();

    public l0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35189b);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35190c)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35190c);
                    this.f35191a.add(new k0(xmlPullParser));
                    xmlPullParser.require(3, null, f35190c);
                }
            }
        }
    }

    public ArrayList<k0> a() {
        return this.f35191a;
    }
}
