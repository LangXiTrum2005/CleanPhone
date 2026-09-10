package com.bytedance.sdk.openadsdk.ay.ri;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.mj;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static HandlerThread lr;
    private static Handler ri;

    public static Handler ri() {
        try {
            HandlerThread handlerThread = lr;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (ri.class) {
                    try {
                        HandlerThread handlerThread2 = lr;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            lr = mj.ri("pag_ev");
                            ri = new Handler(lr.getLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (ri == null) {
                synchronized (ri.class) {
                    try {
                        if (ri == null) {
                            ri = new Handler(lr.getLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return ri;
    }
}
