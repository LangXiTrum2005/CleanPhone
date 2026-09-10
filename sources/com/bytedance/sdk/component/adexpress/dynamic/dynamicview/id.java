package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.umeng.analytics.pro.bc;

/* JADX INFO: loaded from: classes2.dex */
public class id extends ebl implements com.bytedance.sdk.component.adexpress.dynamic.lk {
    private boolean DY;
    private boolean LD;
    private boolean Lxb;

    public id(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(oy.nBu().LD())) {
            dynamicRootView.setTimedown(this.OY);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk
    public void Lxb(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 || this.DY) {
            ((TextView) this.IeN).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z && this.STP.getRenderRequest().Lxb() && com.bytedance.sdk.component.adexpress.ZU.ebl.LD(this.STP.getRenderRequest().ZU())) {
            if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                ((TextView) this.IeN).setText(i + bc.aH);
            } else {
                ((TextView) this.IeN).setText(String.format(com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_full_skip"), Integer.valueOf(i)));
            }
            this.Lxb = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.ZU.LD() && !"open_ad".equals(this.STP.getRenderRequest().ZU()) && this.STP.getRenderRequest().Lxb()) {
            this.DY = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.NXR.nBu().LD())) {
            ((TextView) this.IeN).setText(charSequence);
            return;
        }
        ((TextView) this.IeN).setText(((Object) charSequence) + bc.aH);
        this.LD = true;
        if (this.Lxb) {
            CharSequence text = ((TextView) this.IeN).getText();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.sLN.ZU() + this.sLN.lk()) + com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.LD(text != null ? text.toString() : "", this.sLN.JXs(), true)[0]), this.OY);
            layoutParams.gravity = 8388629;
            this.IeN.setLayoutParams(layoutParams);
            this.Lxb = false;
            requestLayout();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ebl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        if (com.bytedance.sdk.component.adexpress.ZU.ebl.LD(this.STP.getRenderRequest().ZU())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.NXR.nBu().LD())) {
            ((TextView) this.IeN).setText(String.valueOf((int) Double.parseDouble(this.sLN.nBu())));
            return true;
        }
        ((TextView) this.IeN).setText(((int) Double.parseDouble(this.sLN.nBu())) + bc.aH);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public void lc() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.NXR.nBu().LD()) && !TextUtils.equals("skip-with-time-countdown", this.NXR.nBu().LD())) {
            super.lc();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ebl, this.OY);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            layoutParams.leftMargin = this.QAg;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.IeN).getText())) {
            setMeasuredDimension(0, this.OY);
        }
    }
}
