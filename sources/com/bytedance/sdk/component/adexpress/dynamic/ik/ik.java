package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements xha {
    com.bytedance.sdk.component.adexpress.di.fi ri;

    public ik(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        this.ri = new com.bytedance.sdk.component.adexpress.di.fi(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fiVar.getDynamicHeight(), fiVar.getDynamicHeight());
        layoutParams.gravity = 17;
        this.ri.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.di.fi ik() {
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
