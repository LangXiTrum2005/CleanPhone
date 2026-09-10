package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1691Za {
    public int A00;
    public YM A01;
    public InterfaceC1696Zf A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C2131gi A0B;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A08 = true;
    public boolean A07 = true;
    public final boolean A0C = true;

    public C1691Za(C2131gi c2131gi, InterfaceC1696Zf interfaceC1696Zf) {
        this.A0B = c2131gi;
        this.A02 = interfaceC1696Zf;
    }

    public final C1691Za A0C(int i) {
        this.A00 = i;
        return this;
    }

    public final C1691Za A0D(YM ym) {
        this.A01 = ym;
        return this;
    }

    public final C1691Za A0E(String str) {
        this.A03 = str;
        return this;
    }

    public final C1691Za A0F(String str) {
        this.A04 = str;
        return this;
    }

    public final C1691Za A0G(String str) {
        this.A05 = str;
        return this;
    }

    public final C1691Za A0H(String str) {
        this.A06 = str;
        return this;
    }

    public final C1691Za A0I(boolean z) {
        this.A08 = z;
        return this;
    }

    public final C1691Za A0J(boolean z) {
        this.A09 = z;
        return this;
    }

    public final C1691Za A0K(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C1692Zb A0L() {
        return new C1692Zb(this, null);
    }
}
