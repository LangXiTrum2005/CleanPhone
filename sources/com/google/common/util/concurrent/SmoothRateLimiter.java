package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class SmoothRateLimiter extends RateLimiter {

    public static final class SmoothBursty extends SmoothRateLimiter {
    }

    public static final class SmoothWarmingUp extends SmoothRateLimiter {
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final double a() {
        return TimeUnit.SECONDS.toMicros(1L) / 0.0d;
    }
}
