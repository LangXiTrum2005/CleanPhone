package mullein;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.restrictive;
import beachfront.cutely;
import bubbles.impassible;

/* JADX INFO: compiled from: MaterialResources.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {
    public static boolean apical(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static ColorStateList attabal(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListAttabal;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListAttabal = competently.attabal.attabal(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListAttabal;
    }

    public static float beachfront(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static int competently(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static int cutely(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, cutely.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(cutely.TextAppearance_android_textSize, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return dern(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i2;
    }

    public static int dern(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static boolean formularize(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static marial impromptu(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new marial(context, resourceId);
    }

    public static Drawable marial(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableSaneness;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableSaneness = competently.attabal.saneness(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableSaneness;
    }

    public static ColorStateList saneness(Context context, restrictive restrictiveVar, int i) {
        int iTriweekly;
        ColorStateList colorStateListAttabal;
        return (!restrictiveVar.molybdenite(i) || (iTriweekly = restrictiveVar.triweekly(i, 0)) == 0 || (colorStateListAttabal = competently.attabal.attabal(context, iTriweekly)) == null) ? restrictiveVar.dern(i) : colorStateListAttabal;
    }

    public static int taiyuan(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, impassible.MaterialTextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(impassible.MaterialTextAppearance_lineHeight, typedValue);
            if (!value) {
                value = typedArrayObtainStyledAttributes.getValue(impassible.MaterialTextAppearance_android_lineHeight, typedValue);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return dern(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i2;
    }

    public static int wireman(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}
