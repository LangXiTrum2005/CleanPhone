package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements xha {
    private com.bytedance.sdk.component.adexpress.di.lr ri;

    public ri(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        double dAac = xhaVar.aac();
        dAac = dAac == 0.0d ? 1.0d : dAac;
        double dXe = xhaVar.xe();
        double d = dXe != 0.0d ? dXe : 1.0d;
        int dynamicWidth = (int) (((double) fiVar.getDynamicWidth()) * 0.32d * dAac);
        int dynamicWidth2 = (int) (((double) fiVar.getDynamicWidth()) * 0.32d * d);
        this.ri = new com.bytedance.sdk.component.adexpress.di.lr(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, xhaVar.nd() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, xhaVar.zb() - 3);
        this.ri.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public ViewGroup ik() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        this.ri.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        this.ri.ri();
    }
}
