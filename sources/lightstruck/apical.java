package lightstruck;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: TypedArrayUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class apical {
    public static TypedArray apical(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean attabal(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !cutely(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static float beachfront(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !cutely(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int competently(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !cutely(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static boolean cutely(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static ColorStateList dern(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!cutely(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? dern.wireman(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : wireman(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    public static int impromptu(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !cutely(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    public static wireman marial(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (cutely(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return wireman.saneness(typedValue.data);
            }
            wireman wiremanVarCompetently = wireman.competently(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (wiremanVarCompetently != null) {
                return wiremanVarCompetently;
            }
        }
        return wireman.saneness(i2);
    }

    public static int saneness(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !cutely(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static String taiyuan(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (cutely(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static ColorStateList wireman(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }
}
