package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class STP extends lc {
    public STP(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        ImageView imageView = new ImageView(context);
        this.IeN = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            this.OY = Math.max(dynamicRootView.getLogoUnionHeight(), this.OY);
        }
        addView(this.IeN, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        super.QAg();
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        ((ImageView) this.IeN).setImageResource(com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_ad_logo"));
        ((ImageView) this.IeN).setColorFilter(this.sLN.ebl(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
