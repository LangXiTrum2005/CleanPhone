package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements ebl {
    com.bytedance.sdk.component.adexpress.lc.JXs Lxb;

    public lk(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        this.Lxb = new com.bytedance.sdk.component.adexpress.lc.JXs(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(jXs.getDynamicHeight(), jXs.getDynamicHeight());
        layoutParams.gravity = 17;
        this.Lxb.setLayoutParams(layoutParams);
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
    /* JADX INFO: renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.lc.JXs lk() {
        return this.Lxb;
    }
}
