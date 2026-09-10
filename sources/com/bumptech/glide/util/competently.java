package com.bumptech.glide.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: LogTime.java */
/* JADX INFO: loaded from: classes2.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final double f17926attabal = 1.0d / Math.pow(10.0d, 6.0d);

    public static double attabal(long j) {
        return (saneness() - j) * f17926attabal;
    }

    public static long saneness() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
