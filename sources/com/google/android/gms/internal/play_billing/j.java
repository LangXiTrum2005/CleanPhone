package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r9.b f24297a;

    static {
        i iVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            iVar = new i(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            iVar = new i(1);
        }
        f24297a = iVar;
    }
}
