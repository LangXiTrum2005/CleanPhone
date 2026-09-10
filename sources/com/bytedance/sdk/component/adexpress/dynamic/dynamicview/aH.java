package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class aH extends lc {
    private int Lxb;

    public aH(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.Lxb = 0;
        com.bytedance.sdk.component.adexpress.lc.aH aHVar = new com.bytedance.sdk.component.adexpress.lc.aH(context, null);
        this.IeN = aHVar;
        aHVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.IeN, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        DynamicRootView dynamicRootView;
        super.QAg();
        double dNXR = this.sLN.NXR();
        if (com.bytedance.sdk.component.adexpress.ZU.LD() && (dNXR < 0.0d || dNXR > 5.0d || ((dynamicRootView = this.STP) != null && dynamicRootView.getRenderRequest() != null && this.STP.getRenderRequest().nBu() != 4))) {
            this.IeN.setVisibility(8);
            return true;
        }
        double d = (dNXR < 0.0d || dNXR > 5.0d) ? 5.0d : dNXR;
        this.IeN.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.lc.aH) this.IeN).Lxb(d, this.sLN.ebl(), (int) this.sLN.JXs(), ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.LD())) + ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.Lxb())) + ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.JXs())));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iLxb = (int) (com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.ZU()) + this.sLN.lk()) + (com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.JXs()) * 5.0f));
        if (this.ebl > iLxb && 4 == this.sLN.OY()) {
            this.Lxb = (this.ebl - iLxb) / 2;
        }
        this.ebl = iLxb;
        return new FrameLayout.LayoutParams(this.ebl, this.OY);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public void lc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ebl, this.OY);
        layoutParams.topMargin = this.nBu;
        int i = this.QAg + this.Lxb;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}
