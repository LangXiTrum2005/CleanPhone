package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1860Za {
    public int A00;
    public YM A01;
    public InterfaceC1865Zf A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C2300gi A0B;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A08 = true;
    public boolean A07 = true;
    public final boolean A0C = true;

    public C1860Za(C2300gi c2300gi, InterfaceC1865Zf interfaceC1865Zf) {
        this.A0B = c2300gi;
        this.A02 = interfaceC1865Zf;
    }

    public final C1860Za A0C(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C1860Za A0D(YM ym) {
        this.A01 = ym;
        return this;
    }

    public final C1860Za A0E(String str) {
        this.A03 = str;
        return this;
    }

    public final C1860Za A0F(String str) {
        this.A04 = str;
        return this;
    }

    public final C1860Za A0G(String str) {
        this.A05 = str;
        return this;
    }

    public final C1860Za A0H(String str) {
        this.A06 = str;
        return this;
    }

    public final C1860Za A0I(boolean z2) {
        this.A08 = z2;
        return this;
    }

    public final C1860Za A0J(boolean z2) {
        this.A09 = z2;
        return this;
    }

    public final C1860Za A0K(boolean z2) {
        this.A0A = z2;
        return this;
    }

    public final C1861Zb A0L() {
        return new C1861Zb(this, null);
    }
}
