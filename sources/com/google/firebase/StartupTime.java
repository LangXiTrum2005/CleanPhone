package com.google.firebase;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StartupTime {
    public static StartupTime d() {
        return new AutoValue_StartupTime(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long a();

    public abstract long b();

    public abstract long c();
}
