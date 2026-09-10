package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1573fn implements FA {
    public final WeakReference<LK> A00;

    public C1573fn(LK lk) {
        this.A00 = new WeakReference<>(lk);
    }

    public /* synthetic */ C1573fn(LK lk, LP lp) {
        this(lk);
    }

    @Override // com.facebook.ads.redexgen.core.FA
    public final void ADM(boolean z) {
        LK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z;
            cardLayout.A02();
        }
    }
}
