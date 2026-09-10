package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0726Fw {
    public boolean A00;
    public View A03;
    public AF A04;
    public C1744ie A05;
    public CZ A06;
    public DQ A07;
    public DQ A08;
    public C1283b5 A09;
    public final View A0A;
    public final AbstractC1984md A0B;
    public final C1828k1 A0C;
    public final A7 A0D;
    public final C0647Cv A0E;
    public final DR A0F;
    public final JL A0G;
    public int A02 = 0;
    public int A01 = 1;

    public C0726Fw(C1828k1 c1828k1, A7 a7, DR dr, AbstractC1984md abstractC1984md, View view, JL jl, C0647Cv c0647Cv) {
        this.A0C = c1828k1;
        this.A0D = a7;
        this.A0F = dr;
        this.A0B = abstractC1984md;
        this.A0A = view;
        this.A0G = jl;
        this.A0E = c0647Cv;
    }

    public final C0726Fw A0G(int i) {
        this.A01 = i;
        return this;
    }

    public final C0726Fw A0H(int i) {
        this.A02 = i;
        return this;
    }

    public final C0726Fw A0I(View view) {
        this.A03 = view;
        return this;
    }

    public final C0726Fw A0J(AF af) {
        this.A04 = af;
        return this;
    }

    public final C0726Fw A0K(C1744ie c1744ie) {
        this.A05 = c1744ie;
        return this;
    }

    public final C0726Fw A0L(CZ cz) {
        this.A06 = cz;
        return this;
    }

    public final C0726Fw A0M(DQ dq) {
        this.A07 = dq;
        return this;
    }

    public final C0726Fw A0N(DQ dq) {
        this.A08 = dq;
        return this;
    }

    public final C0726Fw A0O(C1283b5 c1283b5) {
        this.A09 = c1283b5;
        return this;
    }

    public final C0726Fw A0P(boolean z) {
        this.A00 = z;
        return this;
    }

    public final C0727Fx A0Q() {
        return new C0727Fx(this);
    }
}
