package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class Ivz extends lc implements com.bytedance.sdk.component.adexpress.dynamic.lk {
    private boolean Lxb;

    public Ivz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.ebl = this.OY;
        ImageView imageView = new ImageView(context);
        this.IeN = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.IeN, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().CSn()) {
                this.IeN.setVisibility(8);
                setVisibility(8);
            }
            this.Lxb = dynamicRootView.getRenderRequest().NXR();
        }
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
        super.QAg();
        View view = this.IeN;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable drawableLxb = com.bytedance.sdk.component.adexpress.ZU.lk.Lxb(getContext(), this.sLN);
            if (drawableLxb != null) {
                ((ImageView) this.IeN).setBackground(drawableLxb);
            }
            Drawable drawableLk = this.Lxb ? com.bytedance.sdk.component.utils.tD.lk(getContext(), "tt_close_btn") : com.bytedance.sdk.component.utils.tD.lk(getContext(), "tt_skip_btn");
            if (drawableLk != null) {
                drawableLk.setAutoMirrored(true);
                ((ImageView) this.IeN).setImageDrawable(drawableLk);
            }
            int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.LD());
            this.IeN.setPadding(iLxb, iLxb, iLxb, iLxb);
        }
        setVisibility(8);
        return true;
    }
}
