package com.bytedance.sdk.openadsdk.bch.ud;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.aaj;

/* JADX INFO: loaded from: classes3.dex */
public class wd {
    private static qdl qdl;
    private static HandlerThread ud;

    public static class qdl extends Handler {
        public qdl(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ud udVar = (ud) message.obj;
            if (udVar == null) {
                return;
            }
            int iUd = udVar.ud();
            if (iUd == 1) {
                udVar.wd();
            } else {
                if (iUd != 2) {
                    mzz.ud(udVar.rq());
                    return;
                }
                udVar.jpc();
            }
            if (udVar.tvp()) {
                mzz.ud(udVar.rq());
            } else if (udVar.fs()) {
                qdl(udVar);
            }
        }

        public void qdl(ud udVar) {
            if (udVar == null) {
                return;
            }
            int iIntValue = udVar.rq().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = udVar;
            sendMessageDelayed(messageObtain, udVar.mo());
        }
    }

    public static void qdl() {
    }

    public static void ud(ud udVar) {
        if (udVar == null || qdl == null) {
            return;
        }
        try {
            int iIntValue = udVar.rq().intValue();
            if (qdl.hasMessages(iIntValue)) {
                qdl.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void qdl(ud udVar) {
        if (udVar == null) {
            return;
        }
        ud();
        qdl qdlVar = qdl;
        if (qdlVar != null) {
            qdlVar.qdl(udVar);
        }
    }

    public static void ud() {
        if (qdl != null) {
            return;
        }
        try {
            HandlerThread handlerThread = ud;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (wd.class) {
                try {
                    HandlerThread handlerThread2 = ud;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        ud = com.bytedance.sdk.component.utils.jpc.qdl("csj_MRC");
                        qdl = new qdl(ud.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            aaj.lnr("MRC", th2.getMessage());
        }
    }
}
