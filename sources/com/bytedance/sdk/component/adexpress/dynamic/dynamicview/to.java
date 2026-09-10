package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class to extends mo {
    public to(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            ImageView imageView = new ImageView(context);
            this.bjy = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.wd = this.jpc;
        } else {
            this.bjy = new TextView(context);
        }
        this.bjy.setTag(3);
        addView(this.bjy, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().jpc() && dynamicRootView.getRenderRequest().xmv()) {
                return;
            }
            this.bjy.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        super.tvp();
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            Drawable drawableQdl = com.bytedance.sdk.component.adexpress.mml.lnr.qdl(getContext(), this.fs);
            if (drawableQdl != null) {
                ((ImageView) this.bjy).setBackground(drawableQdl);
            }
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iMml = com.bytedance.sdk.component.utils.ljh.mml(getContext(), "tt_reward_full_feedback");
            if (iMml > 0) {
                ((ImageView) this.bjy).setImageResource(iMml);
            }
        }
        return true;
    }
}
