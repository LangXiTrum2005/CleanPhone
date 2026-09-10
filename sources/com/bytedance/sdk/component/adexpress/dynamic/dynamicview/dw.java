package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class dw extends di implements com.bytedance.sdk.component.adexpress.dynamic.ik {
    private boolean ri;

    public dw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.xha = this.mj;
        ImageView imageView = new ImageView(context);
        this.vr = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.vr, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().su()) {
                this.vr.setVisibility(8);
                setVisibility(8);
            }
            this.ri = dynamicRootView.getRenderRequest().aw();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        View view = this.vr;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable drawableRi = com.bytedance.sdk.component.adexpress.ka.ik.ri(getContext(), this.f18035co);
            if (drawableRi != null) {
                ((ImageView) this.vr).setBackground(drawableRi);
            }
            Drawable drawableIk = this.ri ? com.bytedance.sdk.component.utils.uq.ik(getContext(), "tt_close_btn") : com.bytedance.sdk.component.utils.uq.ik(getContext(), "tt_skip_btn");
            if (drawableIk != null) {
                drawableIk.setAutoMirrored(true);
                ((ImageView) this.vr).setImageDrawable(drawableIk);
            }
            int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.lr());
            this.vr.setPadding(iRi, iRi, iRi, iRi);
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
