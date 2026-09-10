package com.bytedance.adsdk.ugeno.di.ri;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ri {
    public ik(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.di.ri.ri
    public Drawable lr(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
