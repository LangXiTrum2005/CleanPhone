package com.yolo.networklibrary.common.util;

import android.os.Looper;

/* JADX INFO: compiled from: ThreadUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class triweekly {
    public static boolean attabal() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void saneness(Runnable runnable) {
        if (attabal()) {
            runnable.run();
        } else {
            saneness.attabal().post(runnable);
        }
    }
}
