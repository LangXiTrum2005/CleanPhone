package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static Drawable LD() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 44.0f));
        gradientDrawable.setStroke(le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }

    public static Drawable Lxb() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }
}
