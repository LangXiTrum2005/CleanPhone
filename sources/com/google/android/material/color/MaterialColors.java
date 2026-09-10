package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialColors {
    public static int a(int i2, int i3) {
        return ColorUtils.e(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static int b(int i2, View view) {
        Context context = view.getContext();
        TypedValue typedValueC = MaterialAttributes.c(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = typedValueC.resourceId;
        return i3 != 0 ? ContextCompat.getColor(context, i3) : typedValueC.data;
    }

    public static int c(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueA = MaterialAttributes.a(context, i2);
        if (typedValueA != null) {
            int i4 = typedValueA.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? ContextCompat.getColor(context, i4) : typedValueA.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static boolean d(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = ColorUtils.f4295a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static int e(float f, int i2, int i3) {
        return ColorUtils.c(ColorUtils.e(i3, Math.round(Color.alpha(i3) * f)), i2);
    }
}
