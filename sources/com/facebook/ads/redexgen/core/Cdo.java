package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C1570Nm A07;
    public final C2300gi A08;
    public C1558Na A01 = C1558Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C2300gi c2300gi, NY ny, C1570Nm c1570Nm) {
        this.A08 = c2300gi;
        this.A06 = ny;
        this.A07 = c1570Nm;
    }

    public final Cdo A09(int i2) {
        this.A00 = i2;
        return this;
    }

    public final Cdo A0A(C1558Na c1558Na) {
        this.A01 = c1558Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z2) {
        this.A05 = z2;
        return this;
    }

    public final C2123dq A0F() {
        return new C2123dq(this, null);
    }
}
