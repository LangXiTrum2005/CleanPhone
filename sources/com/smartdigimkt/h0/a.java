package com.smartdigimkt.h0;

import android.net.TrafficStats;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f35558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f35559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f35560c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f35561a = new a();

        private b() {
        }
    }

    public static a c() {
        return b.f35561a;
    }

    public synchronized void a() {
        try {
            if (f35558a != 0 && f35560c != 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - f35558a;
                if (jElapsedRealtime != 0) {
                    try {
                        if (TrafficStats.getTotalRxBytes() != -1) {
                            long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f35560c) * 1000) / jElapsedRealtime;
                            if (totalRxBytes == 0) {
                                f35559b = 1L;
                            } else {
                                f35559b = totalRxBytes;
                            }
                        } else {
                            f35559b = 0L;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public long b() {
        return f35559b;
    }

    public synchronized void d() {
        f35560c = 0L;
        f35558a = 0L;
    }

    public synchronized void e() {
        if (f35558a == 0) {
            f35558a = SystemClock.elapsedRealtime();
            f35560c = TrafficStats.getTotalRxBytes();
        }
    }

    private a() {
    }
}
