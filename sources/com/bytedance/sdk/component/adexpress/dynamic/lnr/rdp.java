package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class rdp implements wd<com.bytedance.sdk.component.adexpress.mo.jtx> {
    private com.bytedance.sdk.component.adexpress.mo.jtx qdl;

    public rdp(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        this.qdl = new com.bytedance.sdk.component.adexpress.mo.jtx(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 20.0f);
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setGuideText(wdVar.jjk());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.mo.jtx lnr() {
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
