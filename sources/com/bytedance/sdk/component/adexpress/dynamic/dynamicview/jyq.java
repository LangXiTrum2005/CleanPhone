package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class jyq extends wd implements com.bytedance.sdk.component.adexpress.dynamic.lnr {
    private int aaj;
    private int[] qdl;
    private int ud;

    public jyq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public void mo() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.wd, this.jpc);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (TextUtils.isEmpty(((TextView) this.bjy).getText())) {
            setMeasuredDimension(0, this.jpc);
        } else {
            setMeasuredDimension(this.wd, this.jpc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr
    public void qdl(CharSequence charSequence, boolean z2, int i2, boolean z3) {
        String strQdl = com.bytedance.sdk.component.utils.ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_screen_skip_tx");
        if (i2 == 0) {
            this.bjy.setVisibility(0);
            ((TextView) this.bjy).setText("| ".concat(String.valueOf(strQdl)));
            this.bjy.measure(-2, -2);
            this.qdl = new int[]{this.bjy.getMeasuredWidth() + 1, this.bjy.getMeasuredHeight()};
            View view = this.bjy;
            int[] iArr = this.qdl;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.bjy).setGravity(17);
            ((TextView) this.bjy).setIncludeFontPadding(false);
            qdl();
            this.bjy.setPadding(this.fs.lnr(), this.ud, this.fs.mml(), this.aaj);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wd, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        super.tvp();
        ((TextView) this.bjy).setText("");
        return true;
    }

    private void qdl() {
        int iQdl = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.mzz());
        this.ud = ((this.jpc - iQdl) / 2) - this.fs.qdl();
        this.aaj = 0;
    }
}
