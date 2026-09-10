package com.kochava.core.ratelimit.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public final class RateLimit implements RateLimitApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f28054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28056c;

    public final synchronized RateLimitAttempt a() {
        synchronized (this) {
        }
        if (this.f28054a < 0) {
            return new RateLimitAttempt(0L, false, false);
        }
        synchronized (this) {
            boolean z2 = this.f28054a == 0;
            if (z2) {
                return new RateLimitAttempt(0L, true, true);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f28055b;
            long j2 = this.f28054a;
            if (jElapsedRealtime >= j + j2) {
                this.f28055b = jElapsedRealtime;
                this.f28056c = false;
            }
            if (this.f28056c) {
                return new RateLimitAttempt(Math.max(0L, (this.f28055b + j2) - SystemClock.elapsedRealtime()), false, true);
            }
            this.f28056c = true;
            return new RateLimitAttempt(0L, true, true);
        }
    }

    public final synchronized void b(long j) {
        this.f28054a = j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime >= this.f28055b + this.f28054a) {
            this.f28055b = jElapsedRealtime;
            this.f28056c = false;
        }
    }
}
