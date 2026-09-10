package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mo.oth;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends yt<com.bytedance.sdk.component.adexpress.mo.wd> {
    public mzz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        super(context, mzzVar, wdVar);
        qdl(wdVar);
    }

    private void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        this.qdl = new com.bytedance.sdk.component.adexpress.mo.jpc(this.ud);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.qdl.setLayoutParams(layoutParams);
        oth othVar = this.qdl;
        if (othVar instanceof com.bytedance.sdk.component.adexpress.mo.jpc) {
            ((com.bytedance.sdk.component.adexpress.mo.jpc) othVar).setButtonText(this.mml.jjk());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.yt
    public void mml() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.yt, com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void ud() {
        this.qdl.ud();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.yt, com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void qdl() {
        this.qdl.qdl();
    }
}
