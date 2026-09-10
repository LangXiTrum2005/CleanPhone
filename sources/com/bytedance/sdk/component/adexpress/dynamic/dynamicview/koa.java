package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class koa extends mo implements com.bytedance.sdk.component.adexpress.dynamic.lnr {
    private boolean qdl;

    public koa(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.qdl = dynamicRootView.getRenderRequest().exu();
        }
        this.wd = this.jpc;
        ImageView imageView = new ImageView(context);
        this.bjy = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.bjy, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().xmv()) {
            return;
        }
        this.bjy.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr
    public void qdl(CharSequence charSequence, boolean z2, int i2, boolean z3) {
        int i3 = 0;
        if (!z2 && !z3) {
            i3 = 8;
        }
        setVisibility(i3);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        Drawable drawableLnr;
        super.tvp();
        ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableQdl = com.bytedance.sdk.component.adexpress.mml.lnr.qdl(getContext(), this.fs);
        if (drawableQdl != null) {
            ((ImageView) this.bjy).setBackground(drawableQdl);
        }
        if (this.qdl) {
            drawableLnr = com.bytedance.sdk.component.utils.ljh.lnr(getContext(), "tt_close_btn");
        } else {
            drawableLnr = com.bytedance.sdk.component.utils.ljh.lnr(getContext(), "tt_skip_btn");
            if (drawableLnr != null) {
                drawableLnr.setAutoMirrored(true);
            }
        }
        if (drawableLnr != null) {
            ((ImageView) this.bjy).setImageDrawable(drawableLnr);
        }
        setVisibility(8);
        return true;
    }
}
