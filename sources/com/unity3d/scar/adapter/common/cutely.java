package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes4.dex */
public class cutely {
    public static void attabal(Runnable runnable) {
        saneness(runnable, 0L);
    }

    public static void saneness(Runnable runnable, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }
}
