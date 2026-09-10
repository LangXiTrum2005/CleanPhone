package com.bytedance.sdk.openadsdk.ZU.Lxb;

import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
class sLN implements com.bytedance.sdk.openadsdk.STP.lk.LD {
    public static final sLN Lxb = new sLN();

    private sLN() {
    }

    @Override // com.bytedance.sdk.openadsdk.STP.lk.LD
    public void Lxb(com.bytedance.sdk.openadsdk.STP.LD ld) {
        Lxb(ld, false);
    }

    @Override // com.bytedance.sdk.openadsdk.STP.lk.LD
    public void Lxb(final com.bytedance.sdk.openadsdk.STP.LD ld, final boolean z) {
        Lxb(new com.bytedance.sdk.component.OY.OY("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.sLN.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.STP.Lxb.lk logStats = ld.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb lxb = new com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb(eK.Lxb(), logStats.Lxb());
                    lxb.lk((byte) 0);
                    lxb.LD(z ? (byte) 2 : (byte) 3);
                    lxb.Lxb((byte) 1);
                    if (com.bytedance.sdk.component.lc.Lxb.LD.LD()) {
                        ZU.Lxb(kqm.Lxb(), com.bytedance.sdk.openadsdk.multipro.LD.lk());
                    }
                    com.bytedance.sdk.component.lc.Lxb.LD.Lxb(lxb);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void Lxb(com.bytedance.sdk.component.OY.OY oy) {
        if (oy == null) {
            return;
        }
        if (!hg.lc()) {
            hg.LD(oy, 5);
        } else {
            oy.run();
        }
    }
}
