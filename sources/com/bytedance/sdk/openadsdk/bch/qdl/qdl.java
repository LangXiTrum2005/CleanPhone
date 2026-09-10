package com.bytedance.sdk.openadsdk.bch.qdl;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.jpc;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static Handler qdl;
    private static HandlerThread ud;

    public static Handler qdl() {
        try {
            HandlerThread handlerThread = ud;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (qdl.class) {
                    try {
                        HandlerThread handlerThread2 = ud;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            ud = jpc.qdl("csj_ev");
                            qdl = new Handler(ud.getLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (qdl == null) {
                synchronized (qdl.class) {
                    try {
                        if (qdl == null) {
                            qdl = new Handler(ud.getLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return qdl;
    }
}
