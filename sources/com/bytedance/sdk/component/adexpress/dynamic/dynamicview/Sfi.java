package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class Sfi extends ebl implements com.bytedance.sdk.component.adexpress.dynamic.lk {
    private int DY;
    private int LD;
    private int[] Lxb;

    public Sfi(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk
    @SuppressLint({"SetTextI18n"})
    public void Lxb(CharSequence charSequence, boolean z, int i, boolean z2) {
        String strLxb = com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.IeN.setVisibility(0);
            ((TextView) this.IeN).setText("| ".concat(String.valueOf(strLxb)));
            this.IeN.measure(-2, -2);
            this.Lxb = new int[]{this.IeN.getMeasuredWidth() + 1, this.IeN.getMeasuredHeight()};
            View view = this.IeN;
            int[] iArr = this.Lxb;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.IeN).setGravity(17);
            ((TextView) this.IeN).setIncludeFontPadding(false);
            Lxb();
            this.IeN.setPadding(this.sLN.lk(), this.LD, this.sLN.ZU(), this.DY);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ebl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        ((TextView) this.IeN).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public void lc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ebl, this.OY);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.IeN).getText())) {
            setMeasuredDimension(0, this.OY);
        } else {
            setMeasuredDimension(this.ebl, this.OY);
        }
    }

    private void Lxb() {
        int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.JXs());
        this.LD = ((this.OY - iLxb) / 2) - this.sLN.Lxb();
        this.DY = 0;
    }
}
