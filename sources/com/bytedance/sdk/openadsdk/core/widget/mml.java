package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    public static Drawable qdl() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(ax.ud(com.bytedance.sdk.openadsdk.core.yt.qdl(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }

    public static Drawable ud() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(ax.ud(com.bytedance.sdk.openadsdk.core.yt.qdl(), 44.0f));
        gradientDrawable.setStroke(ax.ud(com.bytedance.sdk.openadsdk.core.yt.qdl(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }
}
