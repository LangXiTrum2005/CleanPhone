package com.bytedance.sdk.component.lc.Lxb.ebl;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static volatile Handler LD = null;
    private static volatile HandlerThread Lxb = null;
    private static int lk = 3000;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        Lxb = handlerThread;
        handlerThread.start();
    }

    public static int LD() {
        if (lk <= 0) {
            lk = PathInterpolatorCompat.MAX_NUM_POINTS;
        }
        return lk;
    }

    public static Handler Lxb() {
        if (Lxb == null || !Lxb.isAlive()) {
            synchronized (Lxb.class) {
                try {
                    if (Lxb == null || !Lxb.isAlive()) {
                        HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                        Lxb = handlerThread;
                        handlerThread.start();
                        LD = new Handler(Lxb.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (LD == null) {
            synchronized (Lxb.class) {
                try {
                    if (LD == null) {
                        LD = new Handler(Lxb.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return LD;
    }
}
