package com.bytedance.sdk.component.adexpress.ZU;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    public static Drawable Lxb(Context context, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        if (context == null || eblVar == null) {
            return null;
        }
        return Lxb(context, (int) OY.Lxb(context, eblVar.kqm()), eblVar.VVE(), eblVar.KPU());
    }

    public static Drawable Lxb(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }
}
