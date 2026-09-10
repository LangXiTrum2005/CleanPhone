package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class slm extends di implements com.bytedance.sdk.component.adexpress.dynamic.lr {
    public slm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        ImageView imageView = new ImageView(context);
        this.vr = imageView;
        imageView.setTag(5);
        addView(this.vr, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().su()) {
            return;
        }
        this.vr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public boolean fi() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.bgr.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.ka.lr()) {
            ((ImageView) this.vr).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.ka.mj.ri(0, Integer.valueOf(this.f18035co.zf()), new int[]{this.mj / 2}, null, null, null));
            return true;
        }
        Drawable drawableRi = com.bytedance.sdk.component.adexpress.ka.ik.ri(getContext(), this.f18035co);
        if (drawableRi == null) {
            return true;
        }
        ((ImageView) this.vr).setBackground(drawableRi);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lr
    public void setSoundMute(boolean z) {
        ((ImageView) this.vr).setImageResource(z ? com.bytedance.sdk.component.utils.uq.ka(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.uq.ka(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.vr).getDrawable() != null) {
            ((ImageView) this.vr).getDrawable().setAutoMirrored(true);
        }
    }
}
