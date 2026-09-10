package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7T {
    public final long A00;
    public final C7S A01;
    public final String A02;
    public final boolean A03;

    public C7T(String str, boolean z, C7S c7s) {
        this(str, z, c7s, System.currentTimeMillis());
    }

    public C7T(String str, boolean z, C7S c7s, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = c7s;
        this.A00 = j;
    }

    public static C7T A00() {
        return new C7T("", true, C7S.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final C7S A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
