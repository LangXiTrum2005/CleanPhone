package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrames {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f3821b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3822a = new HashMap();

    static {
        HashMap map = new HashMap();
        f3821b = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            map.put("KeyPosition", KeyPosition.class.getConstructor(new Class[0]));
            map.put("KeyCycle", KeyCycle.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            map.put("KeyTrigger", KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e2) {
            Log.e("KeyFrames", "unable to load", e2);
        }
    }

    public KeyFrames(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map = f3821b;
                    if (map.containsKey(name)) {
                        try {
                            Key key = (Key) ((Constructor) map.get(name)).newInstance(new Object[0]);
                            key.a(context, Xml.asAttributeSet(xmlResourceParser));
                            Integer numValueOf = Integer.valueOf(key.f3804b);
                            HashMap map2 = this.f3822a;
                            if (!map2.containsKey(numValueOf)) {
                                map2.put(Integer.valueOf(key.f3804b), new ArrayList());
                            }
                            ((ArrayList) map2.get(Integer.valueOf(key.f3804b))).add(key);
                        } catch (Exception e2) {
                            Log.e("KeyFrames", "unable to create ", e2);
                        }
                    } else {
                        name.equalsIgnoreCase("CustomAttribute");
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
