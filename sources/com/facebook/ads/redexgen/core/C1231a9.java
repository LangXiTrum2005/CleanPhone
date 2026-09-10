package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/common/clock/IntervalClock;", "Lcom/facebook/common/time/MonotonicClock;", "<init>", "()V", "nowNanos", "", "now", "fbandroid.java.com.facebook.common.clock.clock"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C1231a9 implements L3 {
    public static final C1231a9 A00 = new C1231a9();

    @Override // com.facebook.ads.redexgen.core.L3
    public final long AC0() {
        return SystemClock.elapsedRealtime();
    }
}
