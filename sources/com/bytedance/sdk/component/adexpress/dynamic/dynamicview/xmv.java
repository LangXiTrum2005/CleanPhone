package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class xmv extends wd implements com.bytedance.sdk.component.adexpress.dynamic.lnr {
    private boolean aaj;
    private boolean qdl;
    private boolean ud;

    public xmv(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(jpcVar.to().ud())) {
            dynamicRootView.setTimedown(this.jpc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public void mo() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.exu.to().ud()) && !TextUtils.equals("skip-with-time-countdown", this.exu.to().ud())) {
            super.mo();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.wd, this.jpc);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            layoutParams.leftMargin = this.tvp;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (TextUtils.isEmpty(((TextView) this.bjy).getText())) {
            setMeasuredDimension(0, this.jpc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr
    public void qdl(CharSequence charSequence, boolean z2, int i2, boolean z3) {
        if (z3 || this.aaj) {
            ((TextView) this.bjy).setText("");
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
        if (!z2 && this.rdp.getRenderRequest().qdl() && com.bytedance.sdk.component.adexpress.mml.mo.ud(this.rdp.getRenderRequest().mml())) {
            if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                ((TextView) this.bjy).setText(i2 + "s");
            } else {
                ((TextView) this.bjy).setText(String.format(com.bytedance.sdk.component.utils.ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_full_skip"), Integer.valueOf(i2)));
            }
            this.qdl = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.mml.ud() && !"open_ad".equals(this.rdp.getRenderRequest().mml()) && this.rdp.getRenderRequest().qdl()) {
            this.aaj = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.exu.to().ud())) {
            ((TextView) this.bjy).setText(charSequence);
            return;
        }
        ((TextView) this.bjy).setText(((Object) charSequence) + "s");
        this.ud = true;
        if (this.qdl) {
            CharSequence text = ((TextView) this.bjy).getText();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.fs.mml() + this.fs.lnr()) + com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud(text != null ? text.toString() : "", this.fs.mzz(), true)[0]), this.jpc);
            layoutParams.gravity = 8388629;
            this.bjy.setLayoutParams(layoutParams);
            this.qdl = false;
            requestLayout();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wd, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        super.tvp();
        if (com.bytedance.sdk.component.adexpress.mml.mo.ud(this.rdp.getRenderRequest().mml())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.exu.to().ud())) {
            ((TextView) this.bjy).setText(String.valueOf((int) Double.parseDouble(this.fs.to())));
            return true;
        }
        ((TextView) this.bjy).setText(((int) Double.parseDouble(this.fs.to())) + "s");
        return true;
    }
}
