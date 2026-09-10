package com.mbridge.msdk.video.dynview.util.drawable;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static void a(View view, int i10, int i11, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(v0.a(view.getContext(), i11));
            gradientDrawable.setStroke(v0.a(view.getContext(), i10), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }

    public static void a(View view, float f10, float f11, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view == null || strArr == null) {
            return;
        }
        int[] iArr = new int[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            iArr[i10] = Color.parseColor(strArr[i10]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(v0.a(view.getContext(), f11));
        gradientDrawable.setStroke(v0.a(view.getContext(), f10), Color.parseColor(str));
        view.setBackground(gradientDrawable);
    }
}
