package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class KPU extends lc implements com.bytedance.sdk.component.adexpress.dynamic.lk {
    private boolean Lxb;

    public KPU(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        if (dynamicRootView.getRenderRequest() != null) {
            this.Lxb = dynamicRootView.getRenderRequest().NXR();
        }
        this.ebl = this.OY;
        ImageView imageView = new ImageView(context);
        this.IeN = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.IeN, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().CSn()) {
            return;
        }
        this.IeN.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk
    public void Lxb(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        setVisibility(i2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        Drawable drawableLk;
        super.QAg();
        ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableLxb = com.bytedance.sdk.component.adexpress.ZU.lk.Lxb(getContext(), this.sLN);
        if (drawableLxb != null) {
            ((ImageView) this.IeN).setBackground(drawableLxb);
        }
        if (this.Lxb) {
            drawableLk = com.bytedance.sdk.component.utils.tD.lk(getContext(), "tt_close_btn");
        } else {
            drawableLk = com.bytedance.sdk.component.utils.tD.lk(getContext(), "tt_skip_btn");
            if (drawableLk != null) {
                drawableLk.setAutoMirrored(true);
            }
        }
        if (drawableLk != null) {
            ((ImageView) this.IeN).setImageDrawable(drawableLk);
        }
        setVisibility(8);
        return true;
    }
}
