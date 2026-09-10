package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class jtx extends mo implements com.bytedance.sdk.component.adexpress.dynamic.ud {
    public jtx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        ImageView imageView = new ImageView(context);
        this.bjy = imageView;
        imageView.setTag(5);
        addView(this.bjy, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().xmv()) {
            return;
        }
        this.bjy.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public boolean mzz() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ud
    public void setSoundMute(boolean z2) {
        ((ImageView) this.bjy).setImageResource(z2 ? com.bytedance.sdk.component.utils.ljh.mml(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.ljh.mml(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.bjy).getDrawable() != null) {
            ((ImageView) this.bjy).getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        super.tvp();
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.rdp.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.mml.ud()) {
            ((ImageView) this.bjy).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.mml.jpc.qdl(0, Integer.valueOf(this.fs.koa()), new int[]{this.jpc / 2}, null, null, null));
            return true;
        }
        Drawable drawableQdl = com.bytedance.sdk.component.adexpress.mml.lnr.qdl(getContext(), this.fs);
        if (drawableQdl == null) {
            return true;
        }
        ((ImageView) this.bjy).setBackground(drawableQdl);
        return true;
    }
}
