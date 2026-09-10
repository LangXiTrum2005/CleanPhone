package com.bytedance.sdk.component.OY.Lxb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.aH;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private Handler LD;
    private final ZU<LD> Lxb;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.OY.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0050Lxb {
        private static final Lxb Lxb = new Lxb();
    }

    public Handler LD() {
        if (this.LD == null) {
            synchronized (Lxb.class) {
                try {
                    if (this.LD == null) {
                        this.LD = Lxb("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.LD;
    }

    private Lxb() {
        this.Lxb = ZU.Lxb(2);
    }

    public static Lxb Lxb() {
        return C0050Lxb.Lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final Handler handler, final Handler handler2) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (handler.getLooper().getQueue().isIdle()) {
                handler.removeCallbacksAndMessages(null);
                handler.getLooper().quit();
            } else {
                handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.OY.Lxb.Lxb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Lxb.this.Lxb(handler, handler2);
                    }
                }, 1000L);
            }
        }
    }

    private LD LD(aH.Lxb lxb, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new LD(handlerThread, lxb);
    }

    public aH Lxb(aH.Lxb lxb, final String str) {
        LD ld = (LD) this.Lxb.Lxb();
        if (ld != null) {
            ld.Lxb(lxb);
            ld.post(new Runnable() { // from class: com.bytedance.sdk.component.OY.Lxb.Lxb.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return ld;
        }
        return LD(lxb, str);
    }

    public aH Lxb(String str) {
        return Lxb((aH.Lxb) null, str);
    }

    public boolean Lxb(aH aHVar) {
        if (!(aHVar instanceof LD)) {
            return false;
        }
        LD ld = (LD) aHVar;
        if (this.Lxb.Lxb(ld)) {
            return true;
        }
        ld.LD();
        return true;
    }
}
