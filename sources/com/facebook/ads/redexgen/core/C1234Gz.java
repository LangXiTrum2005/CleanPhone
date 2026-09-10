package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1234Gz {
    public static final C1234Gz A03 = new C1234Gz(-3, C.TIME_UNSET, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public C1234Gz(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public static C1234Gz A03(long j) {
        return new C1234Gz(0, C.TIME_UNSET, j);
    }

    public static C1234Gz A04(long j, long j2) {
        return new C1234Gz(-1, j, j2);
    }

    public static C1234Gz A05(long j, long j2) {
        return new C1234Gz(-2, j, j2);
    }
}
