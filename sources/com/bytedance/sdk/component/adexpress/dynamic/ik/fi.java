package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.di.ihz;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends bu<com.bytedance.sdk.component.adexpress.di.xha> {
    public fi(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        super(context, fiVar, xhaVar);
        ri(xhaVar);
    }

    private void ri(com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        this.ri = new com.bytedance.sdk.component.adexpress.di.mj(this.lr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.ri.setLayoutParams(layoutParams);
        ihz ihzVar = this.ri;
        if (ihzVar instanceof com.bytedance.sdk.component.adexpress.di.mj) {
            ((com.bytedance.sdk.component.adexpress.di.mj) ihzVar).setButtonText(this.ka.whw());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.bu, com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        this.ri.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.bu, com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        this.ri.ri();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.bu
    public void ka() {
    }
}
