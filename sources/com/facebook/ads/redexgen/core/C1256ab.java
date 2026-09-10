package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1256ab implements K1 {
    @Override // com.facebook.ads.redexgen.core.K1
    public final long A5c() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.K1
    public final void AJA(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
