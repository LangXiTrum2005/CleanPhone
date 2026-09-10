package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class foI extends lc implements com.bytedance.sdk.component.adexpress.dynamic.lk {
    private int DY;
    private boolean HD;
    boolean LD;
    int Lxb;
    private int Sfi;

    public foI(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.Sfi = 0;
        setTag(Integer.valueOf(getClickArea()));
        Lxb();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().CSn()) {
            return;
        }
        View view = this.IeN;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    private void Lxb() {
        List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> listJVA = this.NXR.JVA();
        if (listJVA == null || listJVA.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy : listJVA) {
            if (TextUtils.equals("skip-with-time-skip-btn", oy.nBu().LD())) {
                int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, oy.OY() + (com.bytedance.sdk.component.adexpress.ZU.LD() ? oy.NXR() : 0));
                this.DY = iLxb;
                this.Lxb = this.ebl - iLxb;
                break;
            }
        }
        this.Sfi = this.ebl - this.Lxb;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        if (com.bytedance.sdk.component.adexpress.ZU.ebl.LD(this.STP.getRenderRequest().ZU())) {
            return true;
        }
        super.QAg();
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
        if (this.LD) {
            layoutParams.leftMargin = this.QAg;
        } else {
            layoutParams.leftMargin = this.QAg + this.Sfi;
        }
        if (this.HD && this.sLN != null) {
            layoutParams.leftMargin = ((this.QAg + this.Sfi) - ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.lk()))) - ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.ZU()));
        }
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            layoutParams.topMargin = this.nBu - ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.LD()));
        } else {
            layoutParams.topMargin = this.nBu;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.HD && this.sLN != null) {
            setMeasuredDimension(this.DY + ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.lk())) + ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.ZU())), this.OY);
        } else if (this.LD) {
            setMeasuredDimension(this.ebl, this.OY);
        } else {
            setMeasuredDimension(this.Lxb, this.OY);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk
    public void Lxb(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 && this.HD != z2) {
            this.HD = z2;
            lc();
            return;
        }
        if (z && this.LD != z) {
            this.LD = z;
            lc();
        }
        this.LD = z;
    }
}
