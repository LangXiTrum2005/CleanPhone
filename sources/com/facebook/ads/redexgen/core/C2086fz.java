package com.facebook.ads.redexgen.core;

import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2086fz {
    public C2090g3 A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C2086fz A00(C2090g3 c2090g3) {
        this.A00 = c2090g3;
        return this;
    }

    public final C2086fz A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C2086fz A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C2086fz A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C2086fz A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C2087g0 A05() {
        return new C2087g0(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
