package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.upstream.cache.CacheSpan;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u3 {
    public static final int b(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j = cacheSpan.g0;
        long j2 = cacheSpan2.g0;
        if (j - j2 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return j < j2 ? -1 : 1;
    }
}
