package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static volatile Handler lr;
    private static final Object ri = new Object();
    private static final LinkedList<Runnable> ik = new LinkedList<>();
    private static Object ka = new Object();

    public static class ri extends Handler {
        public ri(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    ik.ik();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ik() {
        LinkedList linkedList;
        synchronized (ka) {
            try {
                synchronized (ri) {
                    LinkedList<Runnable> linkedList2 = ik;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    lr().removeMessages(1);
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

    private static Handler lr() {
        Handler handler;
        if (lr != null) {
            return lr;
        }
        synchronized (ri) {
            try {
                if (lr == null) {
                    lr.ri riVar = lr.ri;
                    HandlerThread handlerThreadRi = riVar != null ? riVar.ri("queued-work-looper", -2) : null;
                    if (handlerThreadRi == null) {
                        handlerThreadRi = new HandlerThread("queued-work-looper", -2);
                        handlerThreadRi.start();
                    }
                    lr = new ri(handlerThreadRi.getLooper());
                }
                handler = lr;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static void ri(Runnable runnable, boolean z) {
        try {
            Handler handlerLr = lr();
            synchronized (ri) {
                try {
                    ik.add(runnable);
                    if (z) {
                        handlerLr.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerLr.sendEmptyMessage(1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
