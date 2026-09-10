package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class exu implements wd {
    private com.bytedance.sdk.component.adexpress.mo.bjy qdl;

    public exu(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        this.qdl = new com.bytedance.sdk.component.adexpress.mo.bjy(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mzzVar.getDynamicHeight(), mzzVar.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.qdl.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.mo.bjy lnr() {
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
