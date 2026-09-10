package lightstruck;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ColorStateListInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f32962attabal = new ThreadLocal<>();

    public static ColorStateList attabal(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return saneness(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static boolean beachfront(Resources resources, int i) {
        TypedValue typedValueDern = dern();
        resources.getValue(i, typedValueDern, true);
        int i2 = typedValueDern.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static int competently(int i, float f, float f2) {
        boolean z = f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iSaneness = achondroplasia.attabal.saneness((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            attabal attabalVarDern = attabal.dern(i);
            i = attabal.impassible(attabalVarDern.cutely(), attabalVarDern.taiyuan(), f2);
        }
        return (i & 16777215) | (iSaneness << 24);
    }

    public static TypedValue dern() {
        ThreadLocal<TypedValue> threadLocal = f32962attabal;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static TypedArray impromptu(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ColorStateList marial(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrAttabal = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayImpromptu = impromptu(resources, theme, attributeSet, wostteth.competently.ColorStateListItem);
                int resourceId = typedArrayImpromptu.getResourceId(wostteth.competently.ColorStateListItem_android_color, -1);
                if (resourceId == -1 || beachfront(resources, resourceId)) {
                    color = typedArrayImpromptu.getColor(wostteth.competently.ColorStateListItem_android_color, -65281);
                } else {
                    try {
                        color = attabal(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayImpromptu.getColor(wostteth.competently.ColorStateListItem_android_color, -65281);
                    }
                }
                float f = 1.0f;
                if (typedArrayImpromptu.hasValue(wostteth.competently.ColorStateListItem_android_alpha)) {
                    f = typedArrayImpromptu.getFloat(wostteth.competently.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayImpromptu.hasValue(wostteth.competently.ColorStateListItem_alpha)) {
                    f = typedArrayImpromptu.getFloat(wostteth.competently.ColorStateListItem_alpha, 1.0f);
                }
                float f2 = (Build.VERSION.SDK_INT < 31 || !typedArrayImpromptu.hasValue(wostteth.competently.ColorStateListItem_android_lStar)) ? typedArrayImpromptu.getFloat(wostteth.competently.ColorStateListItem_lStar, -1.0f) : typedArrayImpromptu.getFloat(wostteth.competently.ColorStateListItem_android_lStar, -1.0f);
                typedArrayImpromptu.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != wostteth.attabal.alpha && attributeNameResource != wostteth.attabal.lStar) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i3);
                iArrAttabal = competently.attabal(iArrAttabal, i2, competently(color, f, f2));
                iArr = (int[][]) competently.saneness(iArr, i2, iArrTrimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(iArrAttabal, 0, iArr3, 0, i2);
        System.arraycopy(iArr, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }

    public static ColorStateList saneness(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return marial(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static ColorStateList wireman(Resources resources, int i, Resources.Theme theme) {
        try {
            return attabal(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }
}
