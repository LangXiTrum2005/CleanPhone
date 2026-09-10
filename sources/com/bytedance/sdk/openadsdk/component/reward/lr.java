package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.ig;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static void ri(final wjv wjvVar, final boolean z, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.lr.1
            @Override // java.lang.Runnable
            public void run() {
                wjv wjvVar2 = wjvVar;
                if (wjvVar2 == null || wjvVar2.bl()) {
                    return;
                }
                try {
                    Context contextRi = com.bytedance.sdk.openadsdk.core.nr.ri();
                    AdSlot adSlotEb = wjvVar.eb();
                    if (adSlotEb != null) {
                        boolean zLr = com.bytedance.sdk.openadsdk.utils.lr.lr();
                        if (zLr) {
                            if (z2) {
                                bu.ri(contextRi).ri(adSlotEb.getCodeId(), wjvVar);
                            } else {
                                xha.ri(contextRi).ri(adSlotEb.getCodeId(), wjvVar);
                            }
                        } else if (z2) {
                            slm.ri(contextRi).ri(adSlotEb.getCodeId(), wjvVar);
                        } else {
                            di.ri(contextRi).ri(adSlotEb.getCodeId(), wjvVar);
                        }
                        if (z) {
                            if (zLr) {
                                if (z2) {
                                    bu.ri(contextRi).ri(adSlotEb);
                                    return;
                                } else {
                                    xha.ri(contextRi).ri(adSlotEb);
                                    return;
                                }
                            }
                            if (z2) {
                                slm.ri(contextRi).ri(adSlotEb);
                            } else {
                                di.ri(contextRi).ri(adSlotEb);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean ri(final com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        com.bytedance.sdk.openadsdk.activity.single.lr lrVarJc;
        int iOh = 0;
        if (riVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar.ajz;
        if (mjVar == null || mjVar.jc() == null) {
            lrVarJc = null;
        } else {
            lrVarJc = riVar.ajz.jc();
            if (lrVarJc != null) {
                iOh = lrVarJc.oh();
            }
        }
        boolean zRi = ig.ri(riVar.ig, riVar.lr, riVar.fi, riVar.ka ? 7 : 5, iOh);
        if (zRi) {
            if (riVar.lr != null) {
                dw.ri().ri(riVar.lr, new dw.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.lr.2
                    @Override // com.bytedance.sdk.openadsdk.core.dw.lr
                    public void ri() {
                        com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar;
                        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = riVar;
                        if (riVar2 == null || (lrVar = riVar2.qd) == null) {
                            return;
                        }
                        lrVar.gcp();
                    }
                });
            }
            if (lrVarJc != null && lrVarJc.su()) {
                lrVarJc.dw();
            }
        }
        return zRi;
    }
}
