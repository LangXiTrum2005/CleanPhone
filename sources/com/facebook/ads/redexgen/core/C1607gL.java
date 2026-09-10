package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1607gL implements FA {
    public final WeakReference<LU> A00;

    public C1607gL(LU lu) {
        this.A00 = new WeakReference<>(lu);
    }

    public /* synthetic */ C1607gL(LU lu, LZ lz) {
        this(lu);
    }

    @Override // com.facebook.ads.redexgen.core.FA
    public final void ADM(boolean z) {
        LU cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A02();
        }
    }
}
