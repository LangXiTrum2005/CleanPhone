package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private static HandlerThread lr;
    public static volatile boolean ri;

    public static void ri(HandlerThread handlerThread) {
        lr = handlerThread;
    }

    public static HandlerThread ri(String str) {
        return ri(str, 0);
    }

    public static HandlerThread ri(String str, int i) {
        if (ri) {
            return lr;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i) { // from class: com.bytedance.sdk.component.utils.mj.1
                boolean ri = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.ri) {
                        return;
                    }
                    this.ri = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            ac.ri("HandlerThreadUtils", "new handlerThread error", th);
            return lr;
        }
    }
}
