package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class sLN implements ebl {
    private com.bytedance.sdk.component.adexpress.lc.STP Lxb;

    public sLN(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        this.Lxb = new com.bytedance.sdk.component.adexpress.lc.STP(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, 180.0f));
        layoutParams.gravity = 17;
        this.Lxb.setLayoutParams(layoutParams);
        this.Lxb.setGuideText(eblVar.Ns());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void LD() {
        this.Lxb.LD();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void Lxb() {
        this.Lxb.Lxb();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public ViewGroup lk() {
        return this.Lxb;
    }
}
