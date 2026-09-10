package sensatory;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: StateSet.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f37498attabal = -1;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f37500saneness = -1;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f37499dern = -1;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public SparseArray<attabal> f37501wireman = new SparseArray<>();

    /* JADX INFO: compiled from: StateSet.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f37502attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f37503dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ArrayList<saneness> f37504saneness = new ArrayList<>();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f37505wireman;

        public attabal(Context context, XmlPullParser xmlPullParser) {
            this.f37503dern = -1;
            this.f37505wireman = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), wireman.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.State_android_id) {
                    this.f37502attabal = typedArrayObtainStyledAttributes.getResourceId(index, this.f37502attabal);
                } else if (index == wireman.State_constraints) {
                    this.f37503dern = typedArrayObtainStyledAttributes.getResourceId(index, this.f37503dern);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f37503dern);
                    context.getResources().getResourceName(this.f37503dern);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f37505wireman = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void attabal(saneness sanenessVar) {
            this.f37504saneness.add(sanenessVar);
        }

        public int saneness(float f, float f2) {
            for (int i = 0; i < this.f37504saneness.size(); i++) {
                if (this.f37504saneness.get(i).attabal(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: StateSet.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public float f37506attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f37507beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f37508dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f37509marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f37510saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f37511wireman;

        public saneness(Context context, XmlPullParser xmlPullParser) {
            this.f37506attabal = Float.NaN;
            this.f37510saneness = Float.NaN;
            this.f37508dern = Float.NaN;
            this.f37511wireman = Float.NaN;
            this.f37509marial = -1;
            this.f37507beachfront = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), wireman.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.Variant_constraints) {
                    this.f37509marial = typedArrayObtainStyledAttributes.getResourceId(index, this.f37509marial);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f37509marial);
                    context.getResources().getResourceName(this.f37509marial);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f37507beachfront = true;
                    }
                } else if (index == wireman.Variant_region_heightLessThan) {
                    this.f37511wireman = typedArrayObtainStyledAttributes.getDimension(index, this.f37511wireman);
                } else if (index == wireman.Variant_region_heightMoreThan) {
                    this.f37510saneness = typedArrayObtainStyledAttributes.getDimension(index, this.f37510saneness);
                } else if (index == wireman.Variant_region_widthLessThan) {
                    this.f37508dern = typedArrayObtainStyledAttributes.getDimension(index, this.f37508dern);
                } else if (index == wireman.Variant_region_widthMoreThan) {
                    this.f37506attabal = typedArrayObtainStyledAttributes.getDimension(index, this.f37506attabal);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean attabal(float f, float f2) {
            if (!Float.isNaN(this.f37506attabal) && f < this.f37506attabal) {
                return false;
            }
            if (!Float.isNaN(this.f37510saneness) && f2 < this.f37510saneness) {
                return false;
            }
            if (Float.isNaN(this.f37508dern) || f <= this.f37508dern) {
                return Float.isNaN(this.f37511wireman) || f2 <= this.f37511wireman;
            }
            return false;
        }
    }

    public marial(Context context, XmlPullParser xmlPullParser) {
        saneness(context, xmlPullParser);
    }

    public int attabal(int i, int i2, float f, float f2) {
        attabal attabalVar = this.f37501wireman.get(i2);
        if (attabalVar == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            saneness sanenessVar = null;
            for (saneness sanenessVar2 : attabalVar.f37504saneness) {
                if (sanenessVar2.attabal(f, f2)) {
                    if (i != sanenessVar2.f37509marial) {
                        sanenessVar = sanenessVar2;
                    }
                }
            }
            return sanenessVar != null ? sanenessVar.f37509marial : attabalVar.f37503dern;
        }
        if (attabalVar.f37503dern != i) {
            Iterator<saneness> it = attabalVar.f37504saneness.iterator();
            while (it.hasNext()) {
                if (i == it.next().f37509marial) {
                }
            }
            return attabalVar.f37503dern;
        }
        return i;
    }

    public int dern(int i, int i2, int i3) {
        return wireman(-1, i, i2, i3);
    }

    public final void saneness(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), wireman.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == wireman.StateSet_defaultState) {
                this.f37498attabal = typedArrayObtainStyledAttributes.getResourceId(index, this.f37498attabal);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            attabal attabalVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                attabalVar = new attabal(context, xmlPullParser);
                                this.f37501wireman.put(attabalVar.f37502attabal, attabalVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                saneness sanenessVar = new saneness(context, xmlPullParser);
                                if (attabalVar != null) {
                                    attabalVar.attabal(sanenessVar);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public int wireman(int i, int i2, float f, float f2) {
        int iSaneness;
        if (i != i2) {
            attabal attabalVar = this.f37501wireman.get(i2);
            if (attabalVar == null) {
                return -1;
            }
            int iSaneness2 = attabalVar.saneness(f, f2);
            return iSaneness2 == -1 ? attabalVar.f37503dern : attabalVar.f37504saneness.get(iSaneness2).f37509marial;
        }
        attabal attabalVarValueAt = i2 == -1 ? this.f37501wireman.valueAt(0) : this.f37501wireman.get(this.f37500saneness);
        if (attabalVarValueAt == null) {
            return -1;
        }
        if ((this.f37499dern == -1 || !attabalVarValueAt.f37504saneness.get(i).attabal(f, f2)) && i != (iSaneness = attabalVarValueAt.saneness(f, f2))) {
            return iSaneness == -1 ? attabalVarValueAt.f37503dern : attabalVarValueAt.f37504saneness.get(iSaneness).f37509marial;
        }
        return i;
    }
}
