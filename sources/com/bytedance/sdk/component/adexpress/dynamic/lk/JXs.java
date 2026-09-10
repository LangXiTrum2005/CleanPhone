package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lc.HD;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends kqm<com.bytedance.sdk.component.adexpress.lc.ebl> {
    public JXs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        super(context, jXs, eblVar);
        Lxb(eblVar);
    }

    private void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        this.Lxb = new com.bytedance.sdk.component.adexpress.lc.OY(this.LD);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.Lxb.setLayoutParams(layoutParams);
        HD hd = this.Lxb;
        if (hd instanceof com.bytedance.sdk.component.adexpress.lc.OY) {
            ((com.bytedance.sdk.component.adexpress.lc.OY) hd).setButtonText(this.ZU.Ns());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.kqm, com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void LD() {
        this.Lxb.LD();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.kqm
    public void ZU() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.kqm, com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void Lxb() {
        this.Lxb.Lxb();
    }
}
