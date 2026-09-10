package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, int i, boolean z) {
        if (lxb == null || lxb.ZU() == null || lxb.ZU().size() <= 0) {
            return;
        }
        if (i >= lxb.ZU().size()) {
            i = 0;
        }
        tD tDVar = lxb.ZU().get(i);
        Context contextLxb = kqm.Lxb();
        Lxb(tDVar, !TextUtils.isEmpty(z ? JVA.Lxb(contextLxb).Lxb(tDVar) : ZU.Lxb(contextLxb).Lxb(tDVar)), z);
    }

    public static void Lxb(final tD tDVar, final boolean z, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                if (tDVar == null) {
                    return;
                }
                try {
                    Context contextLxb = kqm.Lxb();
                    AdSlot adSlotHg = tDVar.hg();
                    if (adSlotHg != null) {
                        int iLD = JXs.LD();
                        if (iLD == 0 || iLD == 2) {
                            if (z2) {
                                sLN.Lxb(contextLxb).Lxb(adSlotHg.getCodeId(), tDVar);
                            } else {
                                JXs.Lxb(contextLxb).Lxb(adSlotHg.getCodeId(), tDVar);
                            }
                        }
                        if (z) {
                            if (z2) {
                                sLN.Lxb(contextLxb).Lxb(adSlotHg);
                            } else {
                                JXs.Lxb(contextLxb).Lxb(adSlotHg);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
