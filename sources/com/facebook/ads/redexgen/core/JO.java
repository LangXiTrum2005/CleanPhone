package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class JO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C2860qI A07;
    public final long[] A08;
    public final long[] A09;
    public final JP[] A0A;

    public JO(int i2, int i3, long j, long j2, long j3, C2860qI c2860qI, int i4, JP[] jpArr, int i5, long[] jArr, long[] jArr2) {
        this.A00 = i2;
        this.A03 = i3;
        this.A06 = j;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = c2860qI;
        this.A02 = i4;
        this.A0A = jpArr;
        this.A01 = i5;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final JP A00(int i2) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i2];
    }
}
