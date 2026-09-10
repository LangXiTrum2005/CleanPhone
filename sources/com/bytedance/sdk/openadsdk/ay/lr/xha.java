package com.bytedance.sdk.openadsdk.ay.lr;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.ac;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private static HandlerThread lr;
    private static ri ri;

    public static class ri extends Handler {
        public ri(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            lr lrVar = (lr) message.obj;
            if (lrVar == null) {
                return;
            }
            int iLr = lrVar.lr();
            if (iLr == 1) {
                lrVar.xha();
            } else {
                if (iLr != 2) {
                    fi.lr(lrVar.sf());
                    return;
                }
                lrVar.mj();
            }
            if (lrVar.jbs()) {
                fi.lr(lrVar.sf());
            } else if (lrVar.co()) {
                ri(lrVar);
            }
        }

        public void ri(lr lrVar) {
            if (lrVar == null) {
                return;
            }
            int iIntValue = lrVar.sf().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = lrVar;
            sendMessageDelayed(messageObtain, lrVar.di());
        }
    }

    public static void lr(lr lrVar) {
        if (lrVar == null || ri == null) {
            return;
        }
        try {
            int iIntValue = lrVar.sf().intValue();
            if (ri.hasMessages(iIntValue)) {
                ri.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void ri() {
    }

    public static void ri(lr lrVar) {
        if (lrVar == null) {
            return;
        }
        lr();
        ri riVar = ri;
        if (riVar != null) {
            riVar.ri(lrVar);
        }
    }

    public static void lr() {
        if (ri != null) {
            return;
        }
        try {
            HandlerThread handlerThread = lr;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (xha.class) {
                try {
                    HandlerThread handlerThread2 = lr;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        lr = com.bytedance.sdk.component.utils.mj.ri("pag_MRC");
                        ri = new ri(lr.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            ac.ik("MRC", th2.getMessage());
        }
    }
}
