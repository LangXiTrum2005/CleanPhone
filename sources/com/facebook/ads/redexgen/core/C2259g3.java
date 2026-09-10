package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2259g3 {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC2249ft A03;
    public Map<String, String> A04;
    public final int A05;
    public final int A06;

    public C2259g3(int i2, int i3, int i4, int i5, int i6, Map<String, String> requestHeaders, InterfaceC2249ft interfaceC2249ft) {
        this.A06 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A05 = i5;
        this.A01 = i6;
        this.A04 = requestHeaders;
        this.A03 = interfaceC2249ft;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A05;
    }

    public final int A04() {
        return this.A06;
    }

    public final InterfaceC2249ft A05() {
        return this.A03;
    }

    public final Map<String, String> A06() {
        return this.A04;
    }
}
