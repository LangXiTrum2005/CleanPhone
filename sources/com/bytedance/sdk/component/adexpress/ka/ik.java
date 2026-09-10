package com.bytedance.sdk.component.adexpress.ka;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    public static Drawable ri(Context context, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        if (context == null || xhaVar == null) {
            return null;
        }
        return ri(context, (int) xha.ri(context, xhaVar.bu()), xhaVar.slm(), xhaVar.zf());
    }

    public static Drawable ri(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }
}
