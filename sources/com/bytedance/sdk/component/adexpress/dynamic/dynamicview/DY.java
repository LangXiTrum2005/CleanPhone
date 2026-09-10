package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class DY extends ebl implements com.bytedance.sdk.component.adexpress.dynamic.lk {
    public DY(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk
    public void Lxb(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (i != 0) {
            ((TextView) this.IeN).setText(" | ".concat(String.format(com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_full_skip_count_down"), Integer.valueOf(i))));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ebl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public void lc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ebl, this.OY);
        int i = this.QAg;
        layoutParams.leftMargin = i;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i);
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
