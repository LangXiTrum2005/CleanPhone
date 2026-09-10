package com.bytedance.sdk.openadsdk.STP;

import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.openadsdk.STP.Lxb.JXs;
import com.bytedance.sdk.openadsdk.ZU.Lxb.lc;
import com.bytedance.sdk.openadsdk.core.HD;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static void Lxb() {
        if (hg.JXs()) {
            hg.Lxb(new OY("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.STP.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    Lxb.lk();
                }
            });
        } else {
            lk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lk() {
        com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.LD();
        JXs.lk();
        lc.Lxb();
        HD.Lxb();
    }
}
