package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import java.io.IOException;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3704a;
    public final String b;
    public final S80 c;
    public final LinkedList d = new LinkedList();

    public S80(S80 s80, String str, String str2) {
        this.c = s80;
        this.f3704a = str;
        this.b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) throws KT {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw KT.b(null, e);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) throws KT {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e) {
            throw KT.b(null, e);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) throws KT {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new Ua0(str, 1);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw KT.b(null, e);
        }
    }

    public abstract Object b();

    public final Object c(String str) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.d;
            if (i >= linkedList.size()) {
                S80 s80 = this.c;
                if (s80 == null) {
                    return null;
                }
                return s80.c(str);
            }
            Pair pair = (Pair) linkedList.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            S80 w80 = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.b.equals(name)) {
                    j(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean zEquals = "QualityLevel".equals(name);
                        String str = this.f3704a;
                        if (zEquals) {
                            w80 = new U80(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            w80 = new T80(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            w80 = new W80(this, str);
                        }
                        if (w80 == null) {
                            i = 1;
                        } else {
                            a(w80.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    k(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public final void l(Object obj, String str) {
        this.d.add(Pair.create(str, obj));
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
