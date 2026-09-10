package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class m extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35192b = "CompanionAds";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35193c = "Companion";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<l> f35194a = new ArrayList<>();

    public m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, f35192b);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35193c)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35193c);
                    this.f35194a.add(new l(xmlPullParser));
                    xmlPullParser.require(3, null, f35193c);
                }
            }
        }
    }

    public ArrayList<l> a() {
        return this.f35194a;
    }
}
