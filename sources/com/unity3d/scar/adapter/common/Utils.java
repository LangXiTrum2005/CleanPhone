package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class Utils {
    public static void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
    }
}
