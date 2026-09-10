package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class co implements xha {
    private com.bytedance.sdk.component.adexpress.di.aw ri;

    public co(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        this.ri = new com.bytedance.sdk.component.adexpress.di.aw(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, 180.0f));
        layoutParams.gravity = 17;
        this.ri.setLayoutParams(layoutParams);
        this.ri.setGuideText(xhaVar.whw());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public ViewGroup ik() {
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
