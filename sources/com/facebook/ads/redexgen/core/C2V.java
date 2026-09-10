package com.facebook.ads.redexgen.core;

import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2V implements Serializable {
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public C04042p A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public final C2V A0D(int i) {
        this.A02 = i;
        return this;
    }

    public final C2V A0E(int i) {
        this.A03 = i;
        return this;
    }

    public final C2V A0F(int i) {
        this.A04 = i;
        return this;
    }

    public final C2V A0G(int i) {
        this.A05 = i;
        return this;
    }

    public final C2V A0H(int i) {
        this.A00 = i;
        return this;
    }

    public final C2V A0I(int i) {
        this.A01 = i;
        return this;
    }

    public final C2V A0J(long j) {
        this.A06 = j;
        return this;
    }

    public final C2V A0K(C04042p c04042p) {
        this.A07 = c04042p;
        return this;
    }

    public final C2V A0L(String str) {
        this.A09 = str;
        return this;
    }

    public final C2V A0M(String str) {
        this.A08 = str;
        return this;
    }

    public final C2V A0N(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C2V A0O(boolean z) {
        this.A0B = z;
        return this;
    }

    public final C2V A0P(boolean z) {
        this.A0C = z;
        return this;
    }

    public final C2W A0Q() {
        return new C2W(this);
    }
}
