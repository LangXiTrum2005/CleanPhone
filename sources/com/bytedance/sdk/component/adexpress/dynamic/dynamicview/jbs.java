package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends di {
    public jbs(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            this.vr = new ImageView(context);
        } else {
            this.vr = new com.bytedance.sdk.component.adexpress.di.jbs(context);
        }
        this.vr.setTag(3);
        addView(this.vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            Drawable drawableRi = com.bytedance.sdk.component.adexpress.ka.ik.ri(getContext(), this.f18035co);
            if (drawableRi != null) {
                this.vr.setBackground(drawableRi);
            }
            int iKa = com.bytedance.sdk.component.utils.uq.ka(getContext(), "tt_close_btn");
            if (iKa > 0) {
                ((ImageView) this.vr).setImageResource(iKa);
            }
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.bu());
        View view = this.vr;
        if (view instanceof com.bytedance.sdk.component.adexpress.di.jbs) {
            ((com.bytedance.sdk.component.adexpress.di.jbs) view).setRadius((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.vr()));
            ((com.bytedance.sdk.component.adexpress.di.jbs) this.vr).setStrokeWidth(iRi);
            ((com.bytedance.sdk.component.adexpress.di.jbs) this.vr).setStrokeColor(this.f18035co.slm());
            ((com.bytedance.sdk.component.adexpress.di.jbs) this.vr).setBgColor(this.f18035co.zf());
            ((com.bytedance.sdk.component.adexpress.di.jbs) this.vr).setDislikeColor(this.f18035co.xha());
            ((com.bytedance.sdk.component.adexpress.di.jbs) this.vr).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, 1.0f));
        }
        return true;
    }
}
