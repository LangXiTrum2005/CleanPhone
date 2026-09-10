package com.adjust.sdk;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum BackoffStrategy {
    LONG_WAIT(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, 86400000, 0.5d, 1.0d),
    SHORT_WAIT(1, 200, 3600000, 0.5d, 1.0d),
    TEST_WAIT(1, 200, 1000, 0.5d, 1.0d),
    NO_WAIT(100, 1, 1000, 1.0d, 1.0d);

    double maxRange;
    long maxWait;
    long milliSecondMultiplier;
    double minRange;
    int minRetries;

    BackoffStrategy(int i10, long j10, long j11, double d10, double d11) {
        this.minRetries = i10;
        this.milliSecondMultiplier = j10;
        this.maxWait = j11;
        this.minRange = d10;
        this.maxRange = d11;
    }
}
