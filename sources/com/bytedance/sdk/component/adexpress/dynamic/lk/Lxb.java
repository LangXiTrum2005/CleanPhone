package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements ebl {
    private com.bytedance.sdk.component.adexpress.lc.LD Lxb;

    public Lxb(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        double dAe = eblVar.ae();
        dAe = dAe == 0.0d ? 1.0d : dAe;
        double dXr = eblVar.xr();
        double d = dXr != 0.0d ? dXr : 1.0d;
        int dynamicWidth = (int) (((double) jXs.getDynamicWidth()) * 0.32d * dAe);
        int dynamicWidth2 = (int) (((double) jXs.getDynamicWidth()) * 0.32d * d);
        this.Lxb = new com.bytedance.sdk.component.adexpress.lc.LD(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, eblVar.wbY() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, eblVar.FD() - 3);
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
    public ViewGroup lk() {
        return this.Lxb;
    }
}
