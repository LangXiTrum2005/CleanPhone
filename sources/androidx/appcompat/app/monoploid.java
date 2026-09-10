package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: LayoutIncludeDetector.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Deque<WeakReference<XmlPullParser>> f4823attabal = new ArrayDeque();

    public static XmlPullParser dern(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!saneness(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    public static boolean saneness(XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3 && xmlPullParser.getEventType() != 1) {
                    return false;
                }
            } catch (XmlPullParserException unused) {
            }
        }
        return true;
    }

    public static boolean wireman(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    public boolean attabal(AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserDern = dern(this.f4823attabal);
        this.f4823attabal.push(new WeakReference<>(xmlPullParser));
        return wireman(xmlPullParser, xmlPullParserDern);
    }
}
