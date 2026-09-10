package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class VVE extends lc implements com.bytedance.sdk.component.adexpress.dynamic.LD {
    public VVE(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        ImageView imageView = new ImageView(context);
        this.IeN = imageView;
        imageView.setTag(5);
        addView(this.IeN, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().CSn()) {
            return;
        }
        this.IeN.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public boolean JXs() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.STP.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.ZU.LD()) {
            ((ImageView) this.IeN).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.ZU.QAg.Lxb(0, Integer.valueOf(this.sLN.KPU()), new int[]{this.OY / 2}, null, null, null));
            return true;
        }
        Drawable drawableLxb = com.bytedance.sdk.component.adexpress.ZU.lk.Lxb(getContext(), this.sLN);
        if (drawableLxb == null) {
            return true;
        }
        ((ImageView) this.IeN).setBackground(drawableLxb);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.LD
    public void setSoundMute(boolean z) {
        int iZU;
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            iZU = z ? com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_reward_full_unmute");
        } else {
            iZU = z ? com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_mute") : com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_unmute");
        }
        ((ImageView) this.IeN).setImageResource(iZU);
        if (((ImageView) this.IeN).getDrawable() != null) {
            ((ImageView) this.IeN).getDrawable().setAutoMirrored(true);
        }
    }
}
