package chinny;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: StateListShapeAppearanceModel.java */
/* JADX INFO: loaded from: classes3.dex */
public class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f15467attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final dovishness f15468beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final dovishness f15469competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int[][] f15470dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final dovishness f15471impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final dovishness f15472marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kowloon f15473saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final kowloon[] f15474wireman;

    /* JADX INFO: compiled from: StateListShapeAppearanceModel.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f15475attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public dovishness f15476beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public dovishness f15477competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int[][] f15478dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public dovishness f15479impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public dovishness f15480marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public kowloon f15481saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public kowloon[] f15482wireman;

        public final boolean apical(int i, int i2) {
            return (i2 | i) == i;
        }

        public gintrap cutely() {
            if (this.f15475attabal == 0) {
                return null;
            }
            return new gintrap(this);
        }

        public final void formularize(int i, int i2) {
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f15478dern, 0, iArr, 0, i);
            this.f15478dern = iArr;
            kowloon[] kowloonVarArr = new kowloon[i2];
            System.arraycopy(this.f15482wireman, 0, kowloonVarArr, 0, i);
            this.f15482wireman = kowloonVarArr;
        }

        public final void impassible() {
            this.f15481saneness = new kowloon();
            this.f15478dern = new int[10][];
            this.f15482wireman = new kowloon[10];
        }

        public saneness taiyuan(int[] iArr, kowloon kowloonVar) {
            int i = this.f15475attabal;
            if (i == 0 || iArr.length == 0) {
                this.f15481saneness = kowloonVar;
            }
            if (i >= this.f15478dern.length) {
                formularize(i, i + 10);
            }
            int[][] iArr2 = this.f15478dern;
            int i2 = this.f15475attabal;
            iArr2[i2] = iArr;
            this.f15482wireman[i2] = kowloonVar;
            this.f15475attabal = i2 + 1;
            return this;
        }

        public saneness triweekly(dovishness dovishnessVar, int i) {
            if (apical(i, 1)) {
                this.f15480marial = dovishnessVar;
            }
            if (apical(i, 2)) {
                this.f15476beachfront = dovishnessVar;
            }
            if (apical(i, 4)) {
                this.f15477competently = dovishnessVar;
            }
            if (apical(i, 8)) {
                this.f15479impromptu = dovishnessVar;
            }
            return this;
        }

        public saneness(gintrap gintrapVar) {
            int i = gintrapVar.f15467attabal;
            this.f15475attabal = i;
            this.f15481saneness = gintrapVar.f15473saneness;
            int[][] iArr = gintrapVar.f15470dern;
            int[][] iArr2 = new int[iArr.length][];
            this.f15478dern = iArr2;
            this.f15482wireman = new kowloon[gintrapVar.f15474wireman.length];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(gintrapVar.f15474wireman, 0, this.f15482wireman, 0, this.f15475attabal);
            this.f15480marial = gintrapVar.f15472marial;
            this.f15476beachfront = gintrapVar.f15468beachfront;
            this.f15477competently = gintrapVar.f15469competently;
            this.f15479impromptu = gintrapVar.f15471impromptu;
        }

        public saneness(kowloon kowloonVar) {
            impassible();
            taiyuan(StateSet.WILD_CARD, kowloonVar);
        }

        public saneness(Context context, int i) {
            int next;
            impassible();
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            gintrap.competently(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
                } catch (Throwable th) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                impassible();
            }
        }
    }

    public static void competently(saneness sanenessVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, bubbles.impassible.MaterialShape) : theme.obtainStyledAttributes(attributeSet, bubbles.impassible.MaterialShape, 0, 0);
                kowloon kowloonVarImpassible = kowloon.saneness(context, typedArrayObtainAttributes.getResourceId(bubbles.impassible.MaterialShape_shapeAppearance, 0), typedArrayObtainAttributes.getResourceId(bubbles.impassible.MaterialShape_shapeAppearanceOverlay, 0)).impassible();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != bubbles.dern.shapeAppearance && attributeNameResource != bubbles.dern.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                sanenessVar.taiyuan(StateSet.trimStateSet(iArr, i), kowloonVarImpassible);
            }
        }
    }

    public static int impromptu(int i) {
        int i2 = i & 5;
        return ((i & 10) >> 1) | (i2 << 1);
    }

    public static gintrap saneness(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new saneness(context, resourceId).cutely();
        }
        return null;
    }

    public boolean beachfront() {
        dovishness dovishnessVar;
        dovishness dovishnessVar2;
        dovishness dovishnessVar3;
        dovishness dovishnessVar4;
        return this.f15467attabal > 1 || ((dovishnessVar = this.f15472marial) != null && dovishnessVar.impromptu()) || (((dovishnessVar2 = this.f15468beachfront) != null && dovishnessVar2.impromptu()) || (((dovishnessVar3 = this.f15469competently) != null && dovishnessVar3.impromptu()) || ((dovishnessVar4 = this.f15471impromptu) != null && dovishnessVar4.impromptu())));
    }

    public kowloon dern(boolean z) {
        if (!z || (this.f15472marial == null && this.f15468beachfront == null && this.f15469competently == null && this.f15471impromptu == null)) {
            return this.f15473saneness;
        }
        kowloon.saneness sanenessVarGintrap = this.f15473saneness.gintrap();
        dovishness dovishnessVar = this.f15472marial;
        if (dovishnessVar != null) {
            sanenessVarGintrap.sealless(dovishnessVar.marial());
        }
        dovishness dovishnessVar2 = this.f15468beachfront;
        if (dovishnessVar2 != null) {
            sanenessVarGintrap.merc(dovishnessVar2.marial());
        }
        dovishness dovishnessVar3 = this.f15469competently;
        if (dovishnessVar3 != null) {
            sanenessVarGintrap.gintrap(dovishnessVar3.marial());
        }
        dovishness dovishnessVar4 = this.f15471impromptu;
        if (dovishnessVar4 != null) {
            sanenessVarGintrap.cuirassed(dovishnessVar4.marial());
        }
        return sanenessVarGintrap.impassible();
    }

    public final int marial(int[] iArr) {
        int[][] iArr2 = this.f15470dern;
        for (int i = 0; i < this.f15467attabal; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public saneness taiyuan() {
        return new saneness(this);
    }

    public kowloon wireman(int[] iArr) {
        int iMarial = marial(iArr);
        if (iMarial < 0) {
            iMarial = marial(StateSet.WILD_CARD);
        }
        if (this.f15472marial == null && this.f15468beachfront == null && this.f15469competently == null && this.f15471impromptu == null) {
            return this.f15474wireman[iMarial];
        }
        kowloon.saneness sanenessVarGintrap = this.f15474wireman[iMarial].gintrap();
        dovishness dovishnessVar = this.f15472marial;
        if (dovishnessVar != null) {
            sanenessVarGintrap.sealless(dovishnessVar.wireman(iArr));
        }
        dovishness dovishnessVar2 = this.f15468beachfront;
        if (dovishnessVar2 != null) {
            sanenessVarGintrap.merc(dovishnessVar2.wireman(iArr));
        }
        dovishness dovishnessVar3 = this.f15469competently;
        if (dovishnessVar3 != null) {
            sanenessVarGintrap.gintrap(dovishnessVar3.wireman(iArr));
        }
        dovishness dovishnessVar4 = this.f15471impromptu;
        if (dovishnessVar4 != null) {
            sanenessVarGintrap.cuirassed(dovishnessVar4.wireman(iArr));
        }
        return sanenessVarGintrap.impassible();
    }

    public gintrap(saneness sanenessVar) {
        this.f15467attabal = sanenessVar.f15475attabal;
        this.f15473saneness = sanenessVar.f15481saneness;
        this.f15470dern = sanenessVar.f15478dern;
        this.f15474wireman = sanenessVar.f15482wireman;
        this.f15472marial = sanenessVar.f15480marial;
        this.f15468beachfront = sanenessVar.f15476beachfront;
        this.f15469competently = sanenessVar.f15477competently;
        this.f15471impromptu = sanenessVar.f15479impromptu;
    }
}
