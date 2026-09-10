package com.bumptech.glide.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class LogTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f12841a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12842b = 0;

    public static double a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f12841a;
    }
}
