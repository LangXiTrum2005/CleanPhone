package com.bytedance.sdk.openadsdk.eK.LD;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.sLN;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private static HandlerThread LD;
    private static Lxb Lxb;

    public static class Lxb extends Handler {
        public Lxb(Looper looper) {
            super(looper);
        }

        public void Lxb(LD ld) {
            if (ld == null) {
                return;
            }
            int iIntValue = ld.JVA().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = ld;
            sendMessageDelayed(messageObtain, ld.lc());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            LD ld = (LD) message.obj;
            if (ld == null) {
                return;
            }
            int iLD = ld.LD();
            if (iLD == 1) {
                ld.ebl();
            } else {
                if (iLD != 2) {
                    JXs.LD(ld.JVA());
                    return;
                }
                ld.OY();
            }
            if (ld.QAg()) {
                JXs.LD(ld.JVA());
            } else if (ld.sLN()) {
                Lxb(ld);
            }
        }
    }

    public static void LD(LD ld) {
        if (ld == null || Lxb == null) {
            return;
        }
        try {
            int iIntValue = ld.JVA().intValue();
            if (Lxb.hasMessages(iIntValue)) {
                Lxb.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void Lxb() {
    }

    public static void Lxb(LD ld) {
        if (ld == null) {
            return;
        }
        LD();
        Lxb lxb = Lxb;
        if (lxb != null) {
            lxb.Lxb(ld);
        }
    }

    public static void LD() {
        if (Lxb != null) {
            return;
        }
        try {
            HandlerThread handlerThread = LD;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (ebl.class) {
                try {
                    HandlerThread handlerThread2 = LD;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        HandlerThread handlerThread3 = new HandlerThread("csj_MRC");
                        LD = handlerThread3;
                        handlerThread3.start();
                        Lxb = new Lxb(LD.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            sLN.Lxb("MRC", th2.getMessage());
        }
    }
}
