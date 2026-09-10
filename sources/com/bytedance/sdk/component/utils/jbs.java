package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    private static volatile Handler ri;

    public static Handler lr() {
        if (ri == null) {
            synchronized (jbs.class) {
                try {
                    if (ri == null) {
                        ri = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public static Handler ri() {
        return com.bytedance.sdk.component.mj.ri.ri.ri().lr();
    }
}
