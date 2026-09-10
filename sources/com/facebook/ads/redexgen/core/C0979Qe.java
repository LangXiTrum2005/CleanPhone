package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0979Qe implements InterfaceC1142Wv {
    public final long A00;
    public final OI<C0982Qh> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> */
    public C0979Qe(long j, OI<C0982Qh> oi) {
        this.A00 = j;
        this.A01 = oi;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final List<C0982Qh> A7N(long j) {
        return j >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final long A7t(int i) {
        AbstractC1517es.A07(i == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final int A7u() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final int A8Q(long j) {
        return this.A00 > j ? 0 : -1;
    }
}
