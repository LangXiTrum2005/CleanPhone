package com.unity3d.scar.adapter.common;

import android.util.Pair;
import i1.e0;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f38583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f38585d;

    public h(c cVar) {
        this.f38583b = new ConcurrentHashMap();
        this.f38585d = cVar;
    }

    public static int j(XmlPullParser xmlPullParser, String str) throws e0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e10) {
            throw e0.b(null, e10);
        }
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j10) throws e0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e10) {
            throw e0.b(null, e10);
        }
    }

    public static int l(XmlPullParser xmlPullParser, String str) throws e0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new e2.d(str, 0);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e10) {
            throw e0.b(null, e10);
        }
    }

    public abstract Object e();

    public Object f(String str) {
        LinkedList linkedList = (LinkedList) this.f38585d;
        for (int i10 = 0; i10 < linkedList.size(); i10++) {
            Pair pair = (Pair) linkedList.get(i10);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
        }
        h hVar = (h) this.f38584c;
        if (hVar == null) {
            return null;
        }
        return hVar.f(str);
    }

    public boolean g(String str) {
        return false;
    }

    public Object h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            h hVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (((String) this.f38583b).equals(name)) {
                    m(xmlPullParser);
                    z10 = true;
                } else if (z10) {
                    if (i10 > 0) {
                        i10++;
                    } else if (g(name)) {
                        m(xmlPullParser);
                    } else {
                        String str = (String) this.f38582a;
                        if ("QualityLevel".equals(name)) {
                            hVar = new e2.f(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            hVar = new e2.e(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            hVar = new e2.h(this, str);
                        }
                        if (hVar == null) {
                            i10 = 1;
                        } else {
                            d(hVar.h(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z10 && i10 == 0) {
                    n(xmlPullParser);
                }
            } else if (!z10) {
                continue;
            } else if (i10 > 0) {
                i10--;
            } else {
                String name2 = xmlPullParser.getName();
                i(xmlPullParser);
                if (!g(name2)) {
                    return e();
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void m(XmlPullParser xmlPullParser);

    public void o(Object obj, String str) {
        ((LinkedList) this.f38585d).add(Pair.create(str, obj));
    }

    public h(h hVar, String str, String str2) {
        this.f38584c = hVar;
        this.f38582a = str;
        this.f38583b = str2;
        this.f38585d = new LinkedList();
    }

    public void d(Object obj) {
    }

    public void i(XmlPullParser xmlPullParser) {
    }

    public void n(XmlPullParser xmlPullParser) {
    }
}
