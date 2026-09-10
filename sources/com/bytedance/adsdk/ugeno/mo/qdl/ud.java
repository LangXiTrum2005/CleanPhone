package com.bytedance.adsdk.ugeno.mo.qdl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public class ud extends qdl {
    public ud(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.mo.qdl.qdl
    public Drawable ud(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }
}
