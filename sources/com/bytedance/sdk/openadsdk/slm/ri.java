package com.bytedance.sdk.openadsdk.slm;

import com.bytedance.sdk.openadsdk.core.su;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    /* JADX INFO: Access modifiers changed from: private */
    public static void ik() {
        su.ri();
    }

    public static void ri() {
        if (dzy.di()) {
            dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.slm.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.ik();
                }
            });
        } else {
            ik();
        }
    }
}
