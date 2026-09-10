package com.bytedance.sdk.openadsdk.bjy;

import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.openadsdk.core.uw;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static void lnr() {
        uw.qdl();
    }

    public static void qdl() {
        if (fco.mo()) {
            fco.qdl(new jpc("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.bjy.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.lnr();
                }
            });
        } else {
            lnr();
        }
    }
}
