package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HD extends lc implements com.bytedance.sdk.component.adexpress.dynamic.lk {
    private int DY;
    private int LD;
    private int Lxb;

    public HD(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        Lxb();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk
    public void Lxb(CharSequence charSequence, boolean z, int i, boolean z2) {
        this.DY = i;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.lk()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.LD()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.ZU()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.Lxb()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public void lc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = this.QAg;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = this.nBu;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.DY == 0) {
            setMeasuredDimension(this.LD, this.OY);
        } else {
            setMeasuredDimension(this.Lxb, this.OY);
        }
    }

    private void Lxb() {
        List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> listJVA = this.NXR.JVA();
        if (listJVA == null || listJVA.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy : listJVA) {
            if (oy.nBu().Lxb() == 21) {
                this.Lxb = (int) (this.ebl - com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, oy.OY()));
            }
            if (oy.nBu().Lxb() == 20) {
                this.LD = (int) (this.ebl - com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, oy.OY()));
            }
        }
    }
}
