package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class nr implements xha<com.bytedance.sdk.component.adexpress.di.sf> {
    private final com.bytedance.sdk.component.adexpress.di.sf ri;

    public nr(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        com.bytedance.sdk.component.adexpress.di.sf sfVar = new com.bytedance.sdk.component.adexpress.di.sf(context);
        this.ri = sfVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, xhaVar.fe() > 0 ? xhaVar.fe() : com.bytedance.sdk.component.adexpress.ka.lr() ? 0 : 120);
        sfVar.setLayoutParams(layoutParams);
        sfVar.setClipChildren(false);
        sfVar.setText(xhaVar.whw());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.di.sf ik() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        com.bytedance.sdk.component.adexpress.di.sf sfVar = this.ri;
        if (sfVar != null) {
            sfVar.lr();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        com.bytedance.sdk.component.adexpress.di.sf sfVar = this.ri;
        if (sfVar != null) {
            sfVar.ri();
        }
    }
}
