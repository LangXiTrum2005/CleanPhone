package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ay extends di {
    private int ri;

    public ay(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.ri = 0;
        com.bytedance.sdk.component.adexpress.di.wjv wjvVar = new com.bytedance.sdk.component.adexpress.di.wjv(context, null);
        this.vr = wjvVar;
        wjvVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public void di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.mj);
        layoutParams.topMargin = this.qt;
        int i = this.jbs + this.ri;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iRi = (int) ((com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.fi()) * 5.0f) + com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ik() + com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ka())));
        if (this.xha > iRi && 4 == this.f18035co.mj()) {
            this.ri = (this.xha - iRi) / 2;
        }
        this.xha = iRi;
        return new FrameLayout.LayoutParams(this.xha, this.mj);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        DynamicRootView dynamicRootView;
        super.jbs();
        double dAw = this.f18035co.aw();
        if (com.bytedance.sdk.component.adexpress.ka.lr() && (dAw < 0.0d || dAw > 5.0d || ((dynamicRootView = this.bgr) != null && dynamicRootView.getRenderRequest() != null && this.bgr.getRenderRequest().qt() != 4))) {
            this.vr.setVisibility(8);
            return true;
        }
        double d = (dAw < 0.0d || dAw > 5.0d) ? 5.0d : dAw;
        this.vr.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.di.wjv) this.vr).ri(d, this.f18035co.xha(), (int) this.f18035co.fi(), ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.lr())) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.ri())) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.fi())));
        return true;
    }
}
