package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1116Cj implements InterfaceC2118gV {
    @Override // com.facebook.ads.redexgen.core.InterfaceC2118gV
    public final long A5m() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2118gV
    public final void AK4(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
