package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1403Gz {
    public static final C1403Gz A03 = new C1403Gz(-3, -9223372036854775807L, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public C1403Gz(int i2, long j, long j2) {
        this.A00 = i2;
        this.A02 = j;
        this.A01 = j2;
    }

    public static C1403Gz A03(long j) {
        return new C1403Gz(0, -9223372036854775807L, j);
    }

    public static C1403Gz A04(long j, long j2) {
        return new C1403Gz(-1, j, j2);
    }

    public static C1403Gz A05(long j, long j2) {
        return new C1403Gz(-2, j, j2);
    }
}
