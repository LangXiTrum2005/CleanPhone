package com.bytedance.adsdk.ugeno.mo.qdl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends qdl {
    public lnr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.mo.qdl.qdl
    public Drawable ud(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }
}
