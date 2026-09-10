package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class brP implements ebl<com.bytedance.sdk.component.adexpress.lc.JVA> {
    private final com.bytedance.sdk.component.adexpress.lc.JVA Lxb;

    public brP(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        com.bytedance.sdk.component.adexpress.lc.JVA jva = new com.bytedance.sdk.component.adexpress.lc.JVA(context);
        this.Lxb = jva;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, eblVar.Of() > 0 ? eblVar.Of() : com.bytedance.sdk.component.adexpress.ZU.LD() ? 0 : 120);
        jva.setLayoutParams(layoutParams);
        jva.setClipChildren(false);
        jva.setText(eblVar.Ns());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void LD() {
        com.bytedance.sdk.component.adexpress.lc.JVA jva = this.Lxb;
        if (jva != null) {
            jva.LD();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void Lxb() {
        com.bytedance.sdk.component.adexpress.lc.JVA jva = this.Lxb;
        if (jva != null) {
            jva.Lxb();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    /* JADX INFO: renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.lc.JVA lk() {
        return this.Lxb;
    }
}
