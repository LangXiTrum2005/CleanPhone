package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class bgr extends di {
    public bgr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        ImageView imageView = new ImageView(context);
        this.vr = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            this.mj = Math.max(dynamicRootView.getLogoUnionHeight(), this.mj);
        }
        addView(this.vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.bgr;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.bgr.getRenderRequest().igq())) {
            setVisibility(8);
        } else {
            String strIgq = this.bgr.getRenderRequest().igq();
            if (strIgq.equals("logo")) {
                ((ImageView) this.vr).setImageResource(com.bytedance.sdk.component.utils.uq.ka(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.fi.qt qtVarFi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().fi().ri(strIgq).ri(this.xha).lr(this.mj).ka(this.xha).fi(this.mj);
                String strBgr = this.bgr.getRenderRequest().bgr();
                if (!TextUtils.isEmpty(strBgr)) {
                    qtVarFi.lr(strBgr);
                }
                qtVarFi.ri((ImageView) this.vr);
            }
        }
        ((ImageView) this.vr).setColorFilter(this.f18035co.xha(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
