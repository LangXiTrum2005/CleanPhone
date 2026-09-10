package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lc.HD;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends kqm<com.bytedance.sdk.component.adexpress.lc.ebl> {
    public ZU(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        super(context, jXs, eblVar);
        Lxb(eblVar);
    }

    private void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        this.Lxb = new com.bytedance.sdk.component.adexpress.lc.ebl(this.LD);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.LD, eblVar.Of());
        this.Lxb.setLayoutParams(layoutParams);
        this.Lxb.setSlideText(this.ZU.Ns());
        HD hd = this.Lxb;
        if (hd instanceof com.bytedance.sdk.component.adexpress.lc.ebl) {
            ((com.bytedance.sdk.component.adexpress.lc.ebl) hd).setButtonText(this.ZU.nBu());
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
