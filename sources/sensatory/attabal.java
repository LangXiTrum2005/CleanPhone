package sensatory;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ConstraintLayoutStates.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37481attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public androidx.constraintlayout.widget.attabal f37485saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f37483dern = -1;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f37486wireman = -1;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public SparseArray<C0796attabal> f37484marial = new SparseArray<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.attabal> f37482beachfront = new SparseArray<>();

    /* JADX INFO: renamed from: sensatory.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    public static class C0796attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f37487attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f37488dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ArrayList<saneness> f37489saneness = new ArrayList<>();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public androidx.constraintlayout.widget.attabal f37490wireman;

        public C0796attabal(Context context, XmlPullParser xmlPullParser) {
            this.f37488dern = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), wireman.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.State_android_id) {
                    this.f37487attabal = typedArrayObtainStyledAttributes.getResourceId(index, this.f37487attabal);
                } else if (index == wireman.State_constraints) {
                    this.f37488dern = typedArrayObtainStyledAttributes.getResourceId(index, this.f37488dern);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f37488dern);
                    context.getResources().getResourceName(this.f37488dern);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.attabal attabalVar = new androidx.constraintlayout.widget.attabal();
                        this.f37490wireman = attabalVar;
                        attabalVar.triweekly(context, this.f37488dern);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void attabal(saneness sanenessVar) {
            this.f37489saneness.add(sanenessVar);
        }

        public int saneness(float f, float f2) {
            for (int i = 0; i < this.f37489saneness.size(); i++) {
                if (this.f37489saneness.get(i).attabal(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public float f37491attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public androidx.constraintlayout.widget.attabal f37492beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f37493dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f37494marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f37495saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f37496wireman;

        public saneness(Context context, XmlPullParser xmlPullParser) {
            this.f37491attabal = Float.NaN;
            this.f37495saneness = Float.NaN;
            this.f37493dern = Float.NaN;
            this.f37496wireman = Float.NaN;
            this.f37494marial = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), wireman.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.Variant_constraints) {
                    this.f37494marial = typedArrayObtainStyledAttributes.getResourceId(index, this.f37494marial);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f37494marial);
                    context.getResources().getResourceName(this.f37494marial);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.attabal attabalVar = new androidx.constraintlayout.widget.attabal();
                        this.f37492beachfront = attabalVar;
                        attabalVar.triweekly(context, this.f37494marial);
                    }
                } else if (index == wireman.Variant_region_heightLessThan) {
                    this.f37496wireman = typedArrayObtainStyledAttributes.getDimension(index, this.f37496wireman);
                } else if (index == wireman.Variant_region_heightMoreThan) {
                    this.f37495saneness = typedArrayObtainStyledAttributes.getDimension(index, this.f37495saneness);
                } else if (index == wireman.Variant_region_widthLessThan) {
                    this.f37493dern = typedArrayObtainStyledAttributes.getDimension(index, this.f37493dern);
                } else if (index == wireman.Variant_region_widthMoreThan) {
                    this.f37491attabal = typedArrayObtainStyledAttributes.getDimension(index, this.f37491attabal);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean attabal(float f, float f2) {
            if (!Float.isNaN(this.f37491attabal) && f < this.f37491attabal) {
                return false;
            }
            if (!Float.isNaN(this.f37495saneness) && f2 < this.f37495saneness) {
                return false;
            }
            if (Float.isNaN(this.f37493dern) || f <= this.f37493dern) {
                return Float.isNaN(this.f37496wireman) || f2 <= this.f37496wireman;
            }
            return false;
        }
    }

    public attabal(Context context, ConstraintLayout constraintLayout, int i) {
        this.f37481attabal = constraintLayout;
        attabal(context, i);
    }

    public final void attabal(Context context, int i) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0796attabal c0796attabal = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                saneness(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C0796attabal c0796attabal2 = new C0796attabal(context, xml);
                                this.f37484marial.put(c0796attabal2.f37487attabal, c0796attabal2);
                                c0796attabal = c0796attabal2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                saneness sanenessVar = new saneness(context, xml);
                                if (c0796attabal != null) {
                                    c0796attabal.attabal(sanenessVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void saneness(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.attabal attabalVar = new androidx.constraintlayout.widget.attabal();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                attabalVar.oilcan(context, xmlPullParser);
                this.f37482beachfront.put(identifier, attabalVar);
                return;
            }
        }
    }

    public void wireman(int i, float f, float f2) {
        int iSaneness;
        int i2 = this.f37483dern;
        if (i2 != i) {
            this.f37483dern = i;
            C0796attabal c0796attabal = this.f37484marial.get(i);
            int iSaneness2 = c0796attabal.saneness(f, f2);
            androidx.constraintlayout.widget.attabal attabalVar = iSaneness2 == -1 ? c0796attabal.f37490wireman : c0796attabal.f37489saneness.get(iSaneness2).f37492beachfront;
            if (iSaneness2 != -1) {
                int i3 = c0796attabal.f37489saneness.get(iSaneness2).f37494marial;
            }
            if (attabalVar == null) {
                return;
            }
            this.f37486wireman = iSaneness2;
            attabalVar.taiyuan(this.f37481attabal);
            return;
        }
        C0796attabal c0796attabalValueAt = i == -1 ? this.f37484marial.valueAt(0) : this.f37484marial.get(i2);
        int i4 = this.f37486wireman;
        if ((i4 == -1 || !c0796attabalValueAt.f37489saneness.get(i4).attabal(f, f2)) && this.f37486wireman != (iSaneness = c0796attabalValueAt.saneness(f, f2))) {
            androidx.constraintlayout.widget.attabal attabalVar2 = iSaneness == -1 ? this.f37485saneness : c0796attabalValueAt.f37489saneness.get(iSaneness).f37492beachfront;
            if (iSaneness != -1) {
                int i5 = c0796attabalValueAt.f37489saneness.get(iSaneness).f37494marial;
            }
            if (attabalVar2 == null) {
                return;
            }
            this.f37486wireman = iSaneness;
            attabalVar2.taiyuan(this.f37481attabal);
        }
    }

    public void dern(sensatory.saneness sanenessVar) {
    }
}
