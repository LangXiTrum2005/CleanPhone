package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.aaj;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wd {
    private static final AtomicInteger qdl = new AtomicInteger(1);

    public static boolean qdl() {
        return qdl.get() == 1;
    }

    public static void qdl(int i2) {
        boolean z2 = true;
        if (i2 == 1 || i2 == 2) {
            try {
                AtomicInteger atomicInteger = qdl;
                if (atomicInteger.get() != i2) {
                    try {
                        atomicInteger.set(i2);
                    } catch (Throwable th) {
                        th = th;
                        aaj.lnr("SdkSwitch", th.getMessage());
                    }
                } else {
                    z2 = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
            }
            if (z2) {
                Log.e("SdkSwitch", "switch status changed: " + qdl());
                if (qdl()) {
                    com.bytedance.sdk.openadsdk.mml.qdl.ud.ud();
                } else {
                    com.bytedance.sdk.openadsdk.mml.qdl.ud.lnr();
                }
            }
        }
    }
}
