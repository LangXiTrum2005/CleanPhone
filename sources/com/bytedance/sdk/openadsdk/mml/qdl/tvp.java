package com.bytedance.sdk.openadsdk.mml.qdl;

import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.uw;

/* JADX INFO: loaded from: classes3.dex */
class tvp implements com.bytedance.sdk.openadsdk.bjy.lnr.lnr {
    public static final tvp qdl = new tvp();

    private tvp() {
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.lnr
    public void qdl(com.bytedance.sdk.openadsdk.bjy.ud udVar) {
        qdl(udVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.lnr
    public void qdl(final com.bytedance.sdk.openadsdk.bjy.ud udVar, final boolean z2) {
        qdl(new com.bytedance.sdk.component.jpc.jpc("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.mml.qdl.tvp.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.bjy.qdl.lnr logStats = udVar.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl qdlVar = new com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl(uw.qdl(), logStats.qdl());
                    qdlVar.lnr((byte) 0);
                    qdlVar.ud(z2 ? (byte) 2 : (byte) 3);
                    qdlVar.qdl((byte) 1);
                    if (com.bytedance.sdk.component.mo.qdl.ud.ud()) {
                        ud.qdl(yt.qdl(), com.bytedance.sdk.openadsdk.multipro.ud.lnr());
                    }
                    com.bytedance.sdk.component.mo.qdl.ud.qdl(qdlVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void qdl(com.bytedance.sdk.component.jpc.jpc jpcVar) {
        if (jpcVar == null) {
            return;
        }
        if (!fco.wd()) {
            fco.ud(jpcVar, 5);
        } else {
            jpcVar.run();
        }
    }
}
