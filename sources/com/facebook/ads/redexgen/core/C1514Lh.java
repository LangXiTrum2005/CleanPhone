package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1514Lh extends AbstractRunnableC1787Wc {
    public final WeakReference<C2245fp> A00;

    public C1514Lh(C2245fp c2245fp) {
        this.A00 = new WeakReference<>(c2245fp);
    }

    public C1514Lh(WeakReference<C2245fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        C2245fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
