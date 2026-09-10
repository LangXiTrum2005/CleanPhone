package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static void qdl(final ljh ljhVar, final boolean z2, final boolean z3) {
        com.bytedance.sdk.openadsdk.core.rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                ljh ljhVar2 = ljhVar;
                if (ljhVar2 == null || ljhVar2.ilu()) {
                    return;
                }
                try {
                    Context contextQdl = yt.qdl();
                    AdSlot adSlotJi = ljhVar.ji();
                    if (adSlotJi != null) {
                        int iUd = mzz.ud();
                        if (iUd == 0 || iUd == 2) {
                            if (z3) {
                                exu.qdl(contextQdl).qdl(adSlotJi.getCodeId(), ljhVar);
                            } else {
                                mzz.qdl(contextQdl).qdl(adSlotJi.getCodeId(), ljhVar);
                            }
                        }
                        if (z2) {
                            if (z3) {
                                exu.qdl(contextQdl).qdl(adSlotJi);
                            } else {
                                mzz.qdl(contextQdl).qdl(adSlotJi);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean qdl(final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.activity.ud udVarCx;
        int iRc = 0;
        if (qdlVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = qdlVar.lq;
        if (jpcVar == null || jpcVar.cx() == null) {
            udVarCx = null;
        } else {
            udVarCx = qdlVar.lq.cx();
            if (udVarCx != null) {
                iRc = udVarCx.rc();
            }
        }
        boolean zQdl = fco.qdl(qdlVar.ag, qdlVar.ud, qdlVar.mzz, qdlVar.mml ? 7 : 5, iRc);
        if (zQdl) {
            if (qdlVar.ud != null) {
                koa.qdl().qdl(qdlVar.ud, new koa.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.2
                    @Override // com.bytedance.sdk.openadsdk.core.koa.ud
                    public void qdl() {
                        com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar;
                        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = qdlVar;
                        if (qdlVar2 == null || (udVar = qdlVar2.wc) == null) {
                            return;
                        }
                        udVar.car();
                    }
                });
            }
            if (udVarCx != null && udVarCx.bch()) {
                udVarCx.bqt();
            }
        }
        return zQdl;
    }
}
