package czestochowa;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: KeyFrames.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static HashMap<String, Constructor<? extends wireman>> f24883saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public HashMap<Integer, ArrayList<wireman>> f24884attabal = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends wireman>> map = new HashMap<>();
        f24883saneness = map;
        try {
            map.put("KeyAttribute", marial.class.getConstructor(null));
            f24883saneness.put("KeyPosition", impromptu.class.getConstructor(null));
            f24883saneness.put("KeyCycle", beachfront.class.getConstructor(null));
            f24883saneness.put("KeyTimeCycle", cutely.class.getConstructor(null));
            f24883saneness.put("KeyTrigger", apical.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public competently() {
    }

    public void attabal(impassible impassibleVar) {
        ArrayList<wireman> arrayList = this.f24884attabal.get(-1);
        if (arrayList != null) {
            impassibleVar.saneness(arrayList);
        }
    }

    public void dern(wireman wiremanVar) {
        if (!this.f24884attabal.containsKey(Integer.valueOf(wiremanVar.f25036saneness))) {
            this.f24884attabal.put(Integer.valueOf(wiremanVar.f25036saneness), new ArrayList<>());
        }
        ArrayList<wireman> arrayList = this.f24884attabal.get(Integer.valueOf(wiremanVar.f25036saneness));
        if (arrayList != null) {
            arrayList.add(wiremanVar);
        }
    }

    public void saneness(impassible impassibleVar) {
        ArrayList<wireman> arrayList = this.f24884attabal.get(Integer.valueOf(impassibleVar.f24943dern));
        if (arrayList != null) {
            impassibleVar.saneness(arrayList);
        }
        ArrayList<wireman> arrayList2 = this.f24884attabal.get(-1);
        if (arrayList2 != null) {
            for (wireman wiremanVar : arrayList2) {
                if (wiremanVar.beachfront(((ConstraintLayout.LayoutParams) impassibleVar.f24962saneness.getLayoutParams()).f8878timberyard)) {
                    impassibleVar.attabal(wiremanVar);
                }
            }
        }
    }

    public ArrayList<wireman> wireman(int i) {
        return this.f24884attabal.get(Integer.valueOf(i));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public competently(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        wireman cutelyVar;
        try {
            int eventType = xmlPullParser.getEventType();
            wireman wiremanVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f24883saneness.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    cutelyVar = new cutely();
                                    cutelyVar.marial(context, Xml.asAttributeSet(xmlPullParser));
                                    dern(cutelyVar);
                                    wiremanVar = cutelyVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    cutelyVar = new marial();
                                    cutelyVar.marial(context, Xml.asAttributeSet(xmlPullParser));
                                    dern(cutelyVar);
                                    wiremanVar = cutelyVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    cutelyVar = new beachfront();
                                    cutelyVar.marial(context, Xml.asAttributeSet(xmlPullParser));
                                    dern(cutelyVar);
                                    wiremanVar = cutelyVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    cutelyVar = new impromptu();
                                    cutelyVar.marial(context, Xml.asAttributeSet(xmlPullParser));
                                    dern(cutelyVar);
                                    wiremanVar = cutelyVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    cutelyVar = new apical();
                                    cutelyVar.marial(context, Xml.asAttributeSet(xmlPullParser));
                                    dern(cutelyVar);
                                    wiremanVar = cutelyVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                        return;
                    }
                    if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (wiremanVar != null && (map2 = wiremanVar.f25035marial) != null) {
                            ConstraintAttribute.taiyuan(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && wiremanVar != null && (map = wiremanVar.f25035marial) != null) {
                        ConstraintAttribute.taiyuan(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
