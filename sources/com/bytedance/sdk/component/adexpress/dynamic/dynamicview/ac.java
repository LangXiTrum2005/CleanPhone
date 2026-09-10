package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends xha implements com.bytedance.sdk.component.adexpress.dynamic.ik {
    public ac(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public void di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.mj);
        int i = this.jbs;
        layoutParams.leftMargin = i;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xha, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.vr).getText())) {
            setMeasuredDimension(0, this.mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik
    public void ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (i != 0) {
            ((TextView) this.vr).setText(" | " + String.format(com.bytedance.sdk.component.utils.uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_full_skip_count_down"), Integer.valueOf(i)));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }
}
