package com.bytedance.sdk.openadsdk.core.lk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends ZU {
    public lc(Context context, tD tDVar, AdSlot adSlot) {
        super(context, tDVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lk.ZU
    public void Lxb(Context context, tD tDVar, AdSlot adSlot) {
        LD ld = new LD(context, tDVar, adSlot);
        this.Lxb = ld;
        ld.addOnAttachStateChangeListener(this.lc);
    }

    public com.bytedance.sdk.openadsdk.multipro.LD.Lxb lk() {
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            return ((LD) lkVar).getVideoModel();
        }
        return null;
    }
}
