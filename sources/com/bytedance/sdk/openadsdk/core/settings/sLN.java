package com.bytedance.sdk.openadsdk.core.settings;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class sLN {
    private static final AtomicInteger Lxb = new AtomicInteger(1);

    public static boolean Lxb() {
        return Lxb.get() == 1;
    }

    public static void Lxb(int i) {
        boolean z = true;
        if (i != 1 && i != 2) {
            return;
        }
        try {
            AtomicInteger atomicInteger = Lxb;
            if (atomicInteger.get() != i) {
                try {
                    atomicInteger.set(i);
                } catch (Throwable th) {
                    th = th;
                    com.bytedance.sdk.component.utils.sLN.Lxb("SdkSwitch", th.getMessage());
                    if (!z) {
                        return;
                    }
                }
                Lxb();
                if (Lxb()) {
                    com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.LD();
                } else {
                    com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.lk();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }
}
