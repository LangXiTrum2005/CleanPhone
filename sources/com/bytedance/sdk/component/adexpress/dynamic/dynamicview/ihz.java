package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class ihz extends xha implements com.bytedance.sdk.component.adexpress.dynamic.ik {
    private int ac;
    private int lr;
    private int[] ri;

    public ihz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public void di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.mj);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xha, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        ((TextView) this.vr).setText("");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.vr).getText())) {
            setMeasuredDimension(0, this.mj);
        } else {
            setMeasuredDimension(this.xha, this.mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik
    public void ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        String strRi = com.bytedance.sdk.component.utils.uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.vr.setVisibility(0);
            ((TextView) this.vr).setText("| ".concat(String.valueOf(strRi)));
            this.vr.measure(-2, -2);
            this.ri = new int[]{this.vr.getMeasuredWidth() + 1, this.vr.getMeasuredHeight()};
            View view = this.vr;
            int[] iArr = this.ri;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.vr).setGravity(17);
            ((TextView) this.vr).setIncludeFontPadding(false);
            ri();
            this.vr.setPadding(this.f18035co.ik(), this.lr, this.f18035co.ka(), this.ac);
        }
        requestLayout();
    }

    private void ri() {
        int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.fi());
        this.lr = ((this.mj - iRi) / 2) - this.f18035co.ri();
        this.ac = 0;
    }
}
