package com.facebook.ads.redexgen.core;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1218Zw implements L3 {
    public static final C1218Zw A00 = new C1218Zw();

    public static C1218Zw A00() {
        return A00;
    }

    @Override // com.facebook.ads.redexgen.core.L3
    public final long AC0() {
        return SystemClock.elapsedRealtime();
    }
}
