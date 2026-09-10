package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends mo {
    public tvp(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            this.bjy = new ImageView(context);
        } else {
            this.bjy = new com.bytedance.sdk.component.adexpress.mo.tvp(context);
        }
        this.bjy.setTag(3);
        addView(this.bjy, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        super.tvp();
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            Drawable drawableQdl = com.bytedance.sdk.component.adexpress.mml.lnr.qdl(getContext(), this.fs);
            if (drawableQdl != null) {
                this.bjy.setBackground(drawableQdl);
            }
            int iMml = com.bytedance.sdk.component.utils.ljh.mml(getContext(), "tt_close_btn");
            if (iMml > 0) {
                ((ImageView) this.bjy).setImageResource(iMml);
            }
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iQdl = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.yt());
        View view = this.bjy;
        if (view instanceof com.bytedance.sdk.component.adexpress.mo.tvp) {
            ((com.bytedance.sdk.component.adexpress.mo.tvp) view).setRadius((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.bjy()));
            ((com.bytedance.sdk.component.adexpress.mo.tvp) this.bjy).setStrokeWidth(iQdl);
            ((com.bytedance.sdk.component.adexpress.mo.tvp) this.bjy).setStrokeColor(this.fs.jtx());
            ((com.bytedance.sdk.component.adexpress.mo.tvp) this.bjy).setBgColor(this.fs.koa());
            ((com.bytedance.sdk.component.adexpress.mo.tvp) this.bjy).setDislikeColor(this.fs.wd());
            ((com.bytedance.sdk.component.adexpress.mo.tvp) this.bjy).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, 1.0f));
        }
        return true;
    }
}
