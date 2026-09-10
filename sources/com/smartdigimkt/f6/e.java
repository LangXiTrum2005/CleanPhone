package com.smartdigimkt.f6;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class e extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35138b = "Verification";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<a1> f35139a = new ArrayList<>();

    public e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f35138b)) {
                    b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f35138b);
                    this.f35139a.add(new a1(xmlPullParser));
                    xmlPullParser.require(3, null, f35138b);
                }
            }
        }
    }

    public ArrayList<a1> a() {
        return this.f35139a;
    }
}
