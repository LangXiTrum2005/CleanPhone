package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1806jf implements AnonymousClass88 {
    public final AnonymousClass85 A00;

    public AbstractC1806jf(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass88
    public final Map<String, String> A5Q() {
        return AnonymousClass95.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass88
    public final Map<String, String> A6m() {
        return C05518k.A02();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass88
    public final String A8B() {
        return C05518k.A00();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass88
    public final String A8D() {
        return C7V.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass88
    public final boolean AAJ() {
        return C0622Bw.A00().A03();
    }
}
