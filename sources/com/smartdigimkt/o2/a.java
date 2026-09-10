package com.smartdigimkt.o2;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static void a(View view, int i2, int i3, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(v.a(view.getContext(), i3));
            gradientDrawable.setStroke(v.a(view.getContext(), i2), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }

    public static void a(View view, float f, float f2, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view == null || strArr == null) {
            return;
        }
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = Color.parseColor(strArr[i2]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(v.a(view.getContext(), f2));
        gradientDrawable.setStroke(v.a(view.getContext(), f), Color.parseColor(str));
        view.setBackgroundDrawable(gradientDrawable);
    }
}
