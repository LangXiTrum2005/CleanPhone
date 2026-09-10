package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes2.dex */
public class su extends xha implements com.bytedance.sdk.component.adexpress.dynamic.ik {
    private boolean ac;
    private boolean lr;
    private boolean ri;

    public su(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(mjVar.qt().lr())) {
            dynamicRootView.setTimedown(this.mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public void di() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.aw.qt().lr()) && !TextUtils.equals("skip-with-time-countdown", this.aw.qt().lr())) {
            super.di();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.mj);
        layoutParams.gravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            layoutParams.leftMargin = this.jbs;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xha, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        if (com.bytedance.sdk.component.adexpress.ka.di.lr(this.bgr.getRenderRequest().ka())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.aw.qt().lr())) {
            ((TextView) this.vr).setText(String.valueOf((int) Double.parseDouble(this.f18035co.qt())));
            return true;
        }
        ((TextView) this.vr).setText(((int) Double.parseDouble(this.f18035co.qt())) + "s");
        return true;
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
        if (z2 || this.ac) {
            ((TextView) this.vr).setText("");
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
        if (!z && this.bgr.getRenderRequest().ri() && com.bytedance.sdk.component.adexpress.ka.di.lr(this.bgr.getRenderRequest().ka())) {
            if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                ((TextView) this.vr).setText(i + "s");
            } else {
                ((TextView) this.vr).setText(String.format(com.bytedance.sdk.component.utils.uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_full_skip"), Integer.valueOf(i)));
            }
            this.ri = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.ka.lr() && !"open_ad".equals(this.bgr.getRenderRequest().ka()) && this.bgr.getRenderRequest().ri()) {
            this.ac = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.aw.qt().lr())) {
            ((TextView) this.vr).setText(charSequence);
            return;
        }
        ((TextView) this.vr).setText(((Object) charSequence) + "s");
        this.lr = true;
        if (this.ri) {
            CharSequence text = ((TextView) this.vr).getText();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.dynamic.fi.sf.lr(text != null ? text.toString() : "", this.f18035co.fi(), true)[0] + com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ik() + this.f18035co.ka())), this.mj);
            layoutParams.gravity = 8388629;
            this.vr.setLayoutParams(layoutParams);
            this.ri = false;
            requestLayout();
        }
    }
}
