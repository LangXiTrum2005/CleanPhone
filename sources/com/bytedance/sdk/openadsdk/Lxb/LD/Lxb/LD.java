package com.bytedance.sdk.openadsdk.Lxb.LD.Lxb;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.OY.brP;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends lk {
    public LD(@NonNull Context context, tD tDVar, AdSlot adSlot) {
        super(context, tDVar, adSlot);
    }

    public com.bytedance.sdk.openadsdk.multipro.LD.Lxb LD() {
        com.bytedance.sdk.openadsdk.core.OY.tD tDVar = this.nBu;
        if (tDVar != null) {
            return ((brP) tDVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk
    public void Lxb() {
        brP brp = new brP(((lk) this).OY, this.LD, ((lk) this).QAg, this.JVA);
        this.nBu = brp;
        this.Lxb.Lxb(brp.getVideoController());
        lk();
    }
}
