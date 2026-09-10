package com.kochava.core.ratelimit.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class RateLimitAttempt implements RateLimitAttemptApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28059c;

    public RateLimitAttempt(long j, boolean z2, boolean z3) {
        this.f28057a = z2;
        this.f28058b = z3;
        this.f28059c = j;
    }
}
