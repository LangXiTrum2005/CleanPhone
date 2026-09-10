package com.facebook.ads.redexgen.core;

import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2256g0 {
    public C2259g3 A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04;

    public C2256g0(C2259g3 c2259g3, boolean z2, Set<String> pinnedPublicKeys, Set<String> pinnedCertificates, boolean z3) {
        this.A00 = c2259g3;
        this.A04 = z2;
        this.A02 = pinnedPublicKeys;
        this.A01 = pinnedCertificates;
        this.A03 = z3;
    }

    public final C2259g3 A00() {
        return this.A00;
    }

    public final Set<String> A01() {
        return this.A01;
    }

    public final Set<String> A02() {
        return this.A02;
    }

    public final boolean A03() {
        return this.A04;
    }

    public final boolean A04() {
        return this.A03;
    }
}
