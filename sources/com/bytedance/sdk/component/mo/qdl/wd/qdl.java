package com.bytedance.sdk.component.mo.qdl.wd;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.mzz;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private static int lnr = 3000;
    private static volatile HandlerThread qdl;
    private static volatile Handler ud;

    static {
        lnr();
    }

    private static void lnr() {
        HandlerThread handlerThreadQdl;
        mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx != null && (handlerThreadQdl = mzzVarJtx.qdl("csj_ad_log", 10)) != null) {
            qdl = handlerThreadQdl;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        qdl = handlerThread;
        handlerThread.start();
    }

    public static Handler qdl() {
        if (qdl == null || !qdl.isAlive()) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null || !qdl.isAlive()) {
                        lnr();
                        ud = new Handler(qdl.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (ud == null) {
            synchronized (qdl.class) {
                try {
                    if (ud == null) {
                        ud = new Handler(qdl.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ud;
    }

    public static int ud() {
        if (lnr <= 0) {
            lnr = 3000;
        }
        return lnr;
    }
}
