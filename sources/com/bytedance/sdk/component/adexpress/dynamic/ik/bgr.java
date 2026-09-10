package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class bgr implements xha<com.bytedance.sdk.component.adexpress.di.vr> {
    private com.bytedance.sdk.component.adexpress.di.vr ri;

    public bgr(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        this.ri = new com.bytedance.sdk.component.adexpress.di.vr(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 20.0f);
        this.ri.setLayoutParams(layoutParams);
        this.ri.setGuideText(xhaVar.whw());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.di.vr ik() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        this.ri.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        this.ri.ri();
    }
}
