package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class lk {

    @GuardedBy("sLock")
    private static volatile Handler LD;
    private static final Object Lxb = new Object();

    @GuardedBy("sLock")
    private static final LinkedList<Runnable> lk = new LinkedList<>();
    private static Object ZU = new Object();

    public static class Lxb extends Handler {
        public Lxb(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    lk.lk();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    private static Handler LD() {
        Handler handler;
        if (LD != null) {
            return LD;
        }
        synchronized (Lxb) {
            try {
                if (LD == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    LD = new Lxb(handlerThread.getLooper());
                }
                handler = LD;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lk() {
        LinkedList linkedList;
        synchronized (ZU) {
            try {
                synchronized (Lxb) {
                    LinkedList<Runnable> linkedList2 = lk;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    LD().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void Lxb(Runnable runnable, boolean z) {
        try {
            Handler handlerLD = LD();
            synchronized (Lxb) {
                try {
                    lk.add(runnable);
                    if (z) {
                        handlerLD.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerLD.sendEmptyMessage(1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
