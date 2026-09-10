package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class b1 extends y0 {
    private static final String d = "VideoClicks";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35123e = "ClickThrough";
    private static final String f = "ClickTracking";
    private static final String g = "CustomClick";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f35124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<k> f35125b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<t> f35126c = new ArrayList<>();

    public b1(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, d);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f35123e)) {
                    xmlPullParser.require(2, null, f35123e);
                    this.f35124a = new j(xmlPullParser);
                    xmlPullParser.require(3, null, f35123e);
                } else if (name != null && name.equals(f)) {
                    xmlPullParser.require(2, null, f);
                    this.f35125b.add(new k(xmlPullParser));
                    xmlPullParser.require(3, null, f);
                } else if (name == null || !name.equals(g)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, g);
                    this.f35126c.add(new t(xmlPullParser));
                    xmlPullParser.require(3, null, g);
                }
            }
        }
    }

    public j a() {
        return this.f35124a;
    }

    public ArrayList<k> b() {
        return this.f35125b;
    }

    public ArrayList<t> c() {
        return this.f35126c;
    }
}
