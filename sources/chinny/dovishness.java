package chinny;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: StateListCornerSize.java */
/* JADX INFO: loaded from: classes3.dex */
public class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f15461attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public wireman f15463saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int[][] f15462dern = new int[10][];

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public wireman[] f15464wireman = new wireman[10];

    public static dovishness dern(wireman wiremanVar) {
        dovishness dovishnessVar = new dovishness();
        dovishnessVar.attabal(StateSet.WILD_CARD, wiremanVar);
        return dovishnessVar;
    }

    public static dovishness saneness(Context context, TypedArray typedArray, int i, wireman wiremanVar) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return dern(kowloon.impassible(typedArray, i, wiremanVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return dern(kowloon.impassible(typedArray, i, wiremanVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                dovishness dovishnessVar = new dovishness();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    dovishnessVar.taiyuan(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return dovishnessVar;
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
            return dern(wiremanVar);
        }
    }

    public final void attabal(int[] iArr, wireman wiremanVar) {
        int i = this.f15461attabal;
        if (i == 0 || iArr.length == 0) {
            this.f15463saneness = wiremanVar;
        }
        if (i >= this.f15462dern.length) {
            beachfront(i, i + 10);
        }
        int[][] iArr2 = this.f15462dern;
        int i2 = this.f15461attabal;
        iArr2[i2] = iArr;
        this.f15464wireman[i2] = wiremanVar;
        this.f15461attabal = i2 + 1;
    }

    public final void beachfront(int i, int i2) {
        int[][] iArr = new int[i2][];
        System.arraycopy(this.f15462dern, 0, iArr, 0, i);
        this.f15462dern = iArr;
        wireman[] wiremanVarArr = new wireman[i2];
        System.arraycopy(this.f15464wireman, 0, wiremanVarArr, 0, i);
        this.f15464wireman = wiremanVarArr;
    }

    public final int competently(int[] iArr) {
        int[][] iArr2 = this.f15462dern;
        for (int i = 0; i < this.f15461attabal; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public boolean impromptu() {
        return this.f15461attabal > 1;
    }

    public wireman marial() {
        return this.f15463saneness;
    }

    public final void taiyuan(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, bubbles.impassible.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, bubbles.impassible.ShapeAppearance, 0, 0);
                wireman wiremanVarImpassible = kowloon.impassible(typedArrayObtainAttributes, bubbles.impassible.ShapeAppearance_cornerSize, new attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != bubbles.dern.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                attabal(StateSet.trimStateSet(iArr, i), wiremanVarImpassible);
            }
        }
    }

    public wireman wireman(int[] iArr) {
        int iCompetently = competently(iArr);
        if (iCompetently < 0) {
            iCompetently = competently(StateSet.WILD_CARD);
        }
        return iCompetently < 0 ? this.f15463saneness : this.f15464wireman[iCompetently];
    }
}
