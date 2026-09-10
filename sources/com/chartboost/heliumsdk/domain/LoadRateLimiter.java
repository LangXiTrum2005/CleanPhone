package com.chartboost.heliumsdk.domain;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/chartboost/heliumsdk/domain/LoadRateLimiter;", "", "()V", "loadRateLimitSecondsMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "uptimeMillisWhenNextLoadIsAllowedMap", "", "getLoadRateLimitSeconds", "placement", "millisUntilNextLoadIsAllowed", "setLoadRateLimit", "", "durationSeconds", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoadRateLimiter {
    private final ConcurrentHashMap<String, Integer> loadRateLimitSecondsMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Long> uptimeMillisWhenNextLoadIsAllowedMap = new ConcurrentHashMap<>();

    public final int getLoadRateLimitSeconds(String placement) {
        Intrinsics.f(placement, "placement");
        Integer num = this.loadRateLimitSecondsMap.get(placement);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long millisUntilNextLoadIsAllowed(String placement) {
        Intrinsics.f(placement, "placement");
        Long l2 = this.uptimeMillisWhenNextLoadIsAllowedMap.get(placement);
        if (l2 == null) {
            l2 = 0L;
        }
        long jLongValue = l2.longValue() - SystemClock.uptimeMillis();
        if (jLongValue <= 0) {
            return 0L;
        }
        return jLongValue;
    }

    public final void setLoadRateLimit(String placement, int durationSeconds) {
        Intrinsics.f(placement, "placement");
        this.loadRateLimitSecondsMap.put(placement, Integer.valueOf(durationSeconds));
        this.uptimeMillisWhenNextLoadIsAllowedMap.put(placement, Long.valueOf(SystemClock.uptimeMillis() + ((long) (durationSeconds * 1000))));
    }
}
