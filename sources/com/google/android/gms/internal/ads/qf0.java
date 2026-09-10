package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19045a;

    public final synchronized boolean a() {
        if (this.f19045a) {
            return false;
        }
        this.f19045a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f19045a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j10) {
        if (j10 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = j10 + jElapsedRealtime;
                if (j11 < jElapsedRealtime) {
                    b();
                } else {
                    boolean z10 = false;
                    while (!this.f19045a && jElapsedRealtime < j11) {
                        try {
                            wait(j11 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f19045a;
    }
}
