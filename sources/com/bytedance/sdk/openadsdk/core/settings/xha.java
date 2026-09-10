package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.ac;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private static final AtomicInteger ri = new AtomicInteger(1);

    public static boolean ri() {
        return ri.get() == 1;
    }

    public static void ri(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            try {
                AtomicInteger atomicInteger = ri;
                if (atomicInteger.get() != i) {
                    try {
                        atomicInteger.set(i);
                    } catch (Throwable th) {
                        th = th;
                        ac.ik("SdkSwitch", th.getMessage());
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (z) {
                ri();
                if (ri()) {
                    com.bytedance.sdk.openadsdk.ka.ri.lr.lr();
                } else {
                    com.bytedance.sdk.openadsdk.ka.ri.lr.ik();
                }
            }
        }
    }
}
