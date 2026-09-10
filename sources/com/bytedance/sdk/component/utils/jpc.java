package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class jpc {
    private static HandlerThread qdl;

    public static void qdl(HandlerThread handlerThread) {
        qdl = handlerThread;
    }

    public static HandlerThread qdl(String str) {
        return qdl(str, 0);
    }

    public static HandlerThread qdl(String str, int i2) {
        if (com.bytedance.sdk.component.jpc.tvp.sCrashHappened) {
            return qdl;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i2) { // from class: com.bytedance.sdk.component.utils.jpc.1
                boolean qdl = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.qdl) {
                        return;
                    }
                    this.qdl = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            aaj.qdl("HandlerThreadUtils", "new handlerThread error", th);
            return qdl;
        }
    }
}
