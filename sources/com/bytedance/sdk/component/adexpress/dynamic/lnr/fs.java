package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class fs implements wd {
    private com.bytedance.sdk.component.adexpress.mo.rdp qdl;

    public fs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        this.qdl = new com.bytedance.sdk.component.adexpress.mo.rdp(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, 180.0f));
        layoutParams.gravity = 17;
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setGuideText(wdVar.jjk());
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
