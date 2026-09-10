package com.google.android.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes4.dex */
public class RippleUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f19399a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f19400b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f19401c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f19402e = {R.attr.state_enabled, R.attr.state_pressed};

    public static class RippleUtilsLollipop {
        private static Drawable a(Context context, int i2) {
            ColorStateList colorStateList;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i2, i2, i2, i2);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
            TypedValue typedValueA = MaterialAttributes.a(context, com.charging.screenshow.battery.animations.themes.R.attr.colorControlHighlight);
            if (typedValueA != null) {
                int i3 = typedValueA.resourceId;
                colorStateList = i3 != 0 ? ContextCompat.getColorStateList(context, i3) : ColorStateList.valueOf(typedValueA.data);
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                colorStateListValueOf = colorStateList;
            }
            return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
        }
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f19400b;
        return new ColorStateList(new int[][]{d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f19401c), b(colorStateList, iArr), b(colorStateList, f19399a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return ColorUtils.e(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f19402e, 0)) != 0) {
            Log.w("RippleUtils", "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z2 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }
}
