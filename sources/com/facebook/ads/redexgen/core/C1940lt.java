package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1940lt implements C3R {
    public final /* synthetic */ C1941lu A00;
    public final /* synthetic */ C1939ls A01;

    public C1940lt(C1939ls c1939ls, C1941lu c1941lu) {
        this.A01 = c1939ls;
        this.A00 = c1941lu;
    }

    @Override // com.facebook.ads.redexgen.core.C3R
    public final C3Q A5I(C3E c3e, AbstractC1951m5 abstractC1951m5, C3L c3l) {
        return new C1938lr(this.A00.A05(), this.A00, c3e, abstractC1951m5, c3l);
    }
}
