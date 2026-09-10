package com.bytedance.sdk.component.di.ri.xha;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.di.ri.fi;
import com.bytedance.sdk.component.di.ri.xha;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static int ik = 3000;
    private static volatile Handler lr;
    private static volatile HandlerThread ri;

    static {
        ik();
    }

    private static void ik() {
        HandlerThread handlerThreadRi;
        fi fiVarVr = xha.di().vr();
        if (fiVarVr != null && (handlerThreadRi = fiVarVr.ri("csj_ad_log", 10)) != null) {
            ri = handlerThreadRi;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        ri = handlerThread;
        handlerThread.start();
    }

    public static int lr() {
        if (ik <= 0) {
            ik = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        }
        return ik;
    }

    public static Handler ri() {
        if (ri == null || !ri.isAlive()) {
            synchronized (ri.class) {
                try {
                    if (ri == null || !ri.isAlive()) {
                        ik();
                        lr = new Handler(ri.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (lr == null) {
            synchronized (ri.class) {
                try {
                    if (lr == null) {
                        lr = new Handler(ri.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return lr;
    }
}
