package com.bytedance.sdk.openadsdk.eK.Lxb;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static HandlerThread LD;
    private static Handler Lxb;

    public static Handler Lxb() {
        try {
            HandlerThread handlerThread = LD;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (Lxb.class) {
                    try {
                        HandlerThread handlerThread2 = LD;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            HandlerThread handlerThread3 = new HandlerThread("csj_ev");
                            LD = handlerThread3;
                            handlerThread3.start();
                            Lxb = new Handler(LD.getLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (Lxb == null) {
                synchronized (Lxb.class) {
                    try {
                        if (Lxb == null) {
                            Lxb = new Handler(LD.getLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return Lxb;
    }
}
