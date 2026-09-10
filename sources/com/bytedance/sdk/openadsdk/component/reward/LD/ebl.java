package com.bytedance.sdk.openadsdk.component.reward.LD;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.DY;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    @NonNull
    public static LD Lxb(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        tD tDVar = lxb.LD;
        if ((tDVar instanceof DY) && ((DY) tDVar).JW()) {
            return new lc(lxb);
        }
        if (eK.brP(tDVar)) {
            return new nBu(lxb);
        }
        if (OY.Lxb(tDVar) && !lk.Lxb(tDVar)) {
            return new OY(lxb);
        }
        if (QAg.Lxb(tDVar)) {
            return new QAg(lxb);
        }
        if (nBu.Lxb(tDVar)) {
            return new nBu(lxb);
        }
        if (ZU.Lxb(tDVar)) {
            return new ZU(lxb);
        }
        return lk.Lxb(tDVar) ? new lk(lxb) : new JXs(lxb);
    }
}
