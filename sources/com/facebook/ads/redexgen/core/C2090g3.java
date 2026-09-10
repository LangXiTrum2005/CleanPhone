package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2090g3 {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC2080ft A03;
    public Map<String, String> A04;
    public final int A05;
    public final int A06;

    public C2090g3(int i, int i2, int i3, int i4, int i5, Map<String, String> requestHeaders, InterfaceC2080ft interfaceC2080ft) {
        this.A06 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = i4;
        this.A01 = i5;
        this.A04 = requestHeaders;
        this.A03 = interfaceC2080ft;
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

    public final InterfaceC2080ft A05() {
        return this.A03;
    }

    public final Map<String, String> A06() {
        return this.A04;
    }
}
