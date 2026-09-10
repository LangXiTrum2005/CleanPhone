package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qk.i0 f24100a;

    static {
        ug ugVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            ugVar = new ug(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ugVar = new ug(1);
        }
        f24100a = ugVar;
    }
}
