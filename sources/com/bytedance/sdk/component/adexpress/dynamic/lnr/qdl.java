package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements wd {
    private com.bytedance.sdk.component.adexpress.mo.ud qdl;

    public qdl(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        double dDk = wdVar.dk();
        dDk = dDk == 0.0d ? 1.0d : dDk;
        double dIjp = wdVar.ijp();
        double d = dIjp != 0.0d ? dIjp : 1.0d;
        int dynamicWidth = (int) (((double) mzzVar.getDynamicWidth()) * 0.32d * dDk);
        int dynamicWidth2 = (int) (((double) mzzVar.getDynamicWidth()) * 0.32d * d);
        this.qdl = new com.bytedance.sdk.component.adexpress.mo.ud(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, wdVar.mlb() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, wdVar.lte() - 3);
        this.qdl.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public ViewGroup lnr() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void qdl() {
        this.qdl.qdl();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void ud() {
        this.qdl.ud();
    }
}
