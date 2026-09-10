package com.bytedance.sdk.openadsdk.ka.ri;

import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.su;

/* JADX INFO: loaded from: classes2.dex */
class mj implements com.bytedance.sdk.openadsdk.slm.lr.ik {
    public static final mj ri = new mj();

    private mj() {
    }

    @Override // com.bytedance.sdk.openadsdk.slm.lr.ik
    public void ri(com.bytedance.sdk.openadsdk.slm.lr lrVar) {
        ri(lrVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.slm.lr.ik
    public void ri(final com.bytedance.sdk.openadsdk.slm.lr lrVar, final boolean z) {
        ri(new com.bytedance.sdk.component.mj.lr.ik("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.ka.ri.mj.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.slm.ri.ik ikVarRi = lrVar.ri();
                    if (ikVarRi == null) {
                        return;
                    }
                    com.bytedance.sdk.component.di.ri.ka.ri.ri riVar = new com.bytedance.sdk.component.di.ri.ka.ri.ri(su.ri(), ikVarRi.ri());
                    riVar.ri((byte) 0);
                    riVar.ik(z ? (byte) 2 : (byte) 3);
                    riVar.lr((byte) 1);
                    if (com.bytedance.sdk.component.di.ri.lr.lr()) {
                        lr.ri(nr.ri());
                    }
                    com.bytedance.sdk.component.di.ri.lr.ri(riVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void ri(com.bytedance.sdk.component.mj.lr.ik ikVar) {
        if (ikVar == null) {
            return;
        }
        if (!dzy.xha()) {
            dzy.lr(ikVar, 5);
        } else {
            ikVar.run();
        }
    }
}
