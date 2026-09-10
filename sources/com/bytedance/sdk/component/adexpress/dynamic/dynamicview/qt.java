package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends di {
    public qt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            ImageView imageView = new ImageView(context);
            this.vr = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.xha = this.mj;
        } else {
            this.vr = new TextView(context);
        }
        this.vr.setTag(3);
        addView(this.vr, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().mj() && dynamicRootView.getRenderRequest().su()) {
                return;
            }
            this.vr.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            Drawable drawableRi = com.bytedance.sdk.component.adexpress.ka.ik.ri(getContext(), this.f18035co);
            if (drawableRi != null) {
                ((ImageView) this.vr).setBackground(drawableRi);
            }
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iKa = com.bytedance.sdk.component.utils.uq.ka(getContext(), "tt_reward_full_feedback");
            if (iKa > 0) {
                ((ImageView) this.vr).setImageResource(iKa);
            }
        }
        return true;
    }
}
