package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public class jl extends mo {
    public ud qdl;

    public jl(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public GradientDrawable getDrawable() {
        ud udVar = new ud();
        this.qdl = udVar;
        return udVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public ud qdl(Bitmap bitmap) {
        qdl qdlVar = new qdl(bitmap, this.qdl);
        this.qdl = qdlVar;
        return qdlVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        return super.tvp();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public GradientDrawable qdl(GradientDrawable.Orientation orientation, int[] iArr) {
        ud udVar = new ud(orientation, iArr);
        this.qdl = udVar;
        return udVar;
    }
}
