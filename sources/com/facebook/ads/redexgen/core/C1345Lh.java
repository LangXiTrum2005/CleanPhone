package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1345Lh extends AbstractRunnableC1618Wc {
    public final WeakReference<C2076fp> A00;

    public C1345Lh(C2076fp c2076fp) {
        this.A00 = new WeakReference<>(c2076fp);
    }

    public C1345Lh(WeakReference<C2076fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1618Wc
    public final void A07() {
        C2076fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
