package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class zf extends di implements com.bytedance.sdk.component.adexpress.dynamic.ik {
    private boolean ri;

    public zf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.ri = dynamicRootView.getRenderRequest().aw();
        }
        this.xha = this.mj;
        ImageView imageView = new ImageView(context);
        this.vr = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.vr, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().su()) {
            return;
        }
        this.vr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        Drawable drawableIk;
        super.jbs();
        ((ImageView) this.vr).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableRi = com.bytedance.sdk.component.adexpress.ka.ik.ri(getContext(), this.f18035co);
        if (drawableRi != null) {
            ((ImageView) this.vr).setBackground(drawableRi);
        }
        if (this.ri) {
            drawableIk = com.bytedance.sdk.component.utils.uq.ik(getContext(), "tt_close_btn");
        } else {
            drawableIk = com.bytedance.sdk.component.utils.uq.ik(getContext(), "tt_skip_btn");
            if (drawableIk != null) {
                drawableIk.setAutoMirrored(true);
            }
        }
        if (drawableIk != null) {
            ((ImageView) this.vr).setImageDrawable(drawableIk);
        }
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik
    public void ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        setVisibility(i2);
    }
}
