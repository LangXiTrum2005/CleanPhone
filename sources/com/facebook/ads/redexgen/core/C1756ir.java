package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1756ir implements AP {
    public WeakReference<C1744ie> A00;

    public C1756ir(C1744ie c1744ie) {
        this.A00 = new WeakReference<>(c1744ie);
    }

    @Override // com.facebook.ads.redexgen.core.AP
    public final void AEQ(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z, false);
        }
    }
}
