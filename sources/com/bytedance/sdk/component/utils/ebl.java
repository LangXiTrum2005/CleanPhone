package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private static volatile Handler Lxb;

    public static Handler LD() {
        if (Lxb == null) {
            synchronized (ebl.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public static Handler Lxb() {
        return com.bytedance.sdk.component.OY.Lxb.Lxb.Lxb().LD();
    }
}
