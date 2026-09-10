package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes2.dex */
public class brP extends lc {
    public LD Lxb;

    public brP(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public LD Lxb(Bitmap bitmap) {
        Lxb lxb = new Lxb(bitmap, this.Lxb);
        this.Lxb = lxb;
        return lxb;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        return super.QAg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public GradientDrawable getDrawable() {
        LD ld = new LD();
        this.Lxb = ld;
        return ld;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public GradientDrawable Lxb(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        LD ld = new LD(orientation, iArr);
        this.Lxb = ld;
        return ld;
    }
}
