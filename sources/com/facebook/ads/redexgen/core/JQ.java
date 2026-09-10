package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class JQ {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public J1 A06;
    public JP A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public long[] A0E = new long[0];
    public int[] A0C = new int[0];
    public int[] A0B = new int[0];
    public long[] A0D = new long[0];
    public boolean[] A0G = new boolean[0];
    public boolean[] A0F = new boolean[0];
    public final C11074v A0H = new C11074v();

    public final long A00(int i2) {
        return this.A0D[i2];
    }

    public final void A01() {
        this.A01 = 0;
        this.A05 = 0L;
        this.A09 = false;
        this.A08 = false;
        this.A0A = false;
        this.A07 = null;
    }

    public final void A02(int i2) {
        this.A0H.A0d(i2);
        this.A08 = true;
        this.A0A = true;
    }

    public final void A03(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        if (this.A0C.length < i2) {
            this.A0E = new long[i2];
            this.A0C = new int[i2];
        }
        if (this.A0B.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.A0B = new int[i4];
            this.A0D = new long[i4];
            this.A0G = new boolean[i4];
            this.A0F = new boolean[i4];
        }
    }

    public final void A04(C11074v c11074v) {
        c11074v.A0k(this.A0H.A0l(), 0, this.A0H.A0A());
        this.A0H.A0f(0);
        this.A0A = false;
    }

    public final void A05(InterfaceC2651ms interfaceC2651ms) throws IOException {
        interfaceC2651ms.readFully(this.A0H.A0l(), 0, this.A0H.A0A());
        this.A0H.A0f(0);
        this.A0A = false;
    }

    public final boolean A06(int i2) {
        return this.A08 && this.A0F[i2];
    }
}
