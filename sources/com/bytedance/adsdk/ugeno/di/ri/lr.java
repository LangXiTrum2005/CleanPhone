package com.bytedance.adsdk.ugeno.di.ri;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri {
    public lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.di.ri.ri
    public Drawable lr(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
