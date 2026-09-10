package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0998Qy implements InterfaceC1423dL {
    public static String[] A04 = {"HJiG08VABV4bgPvBuIHmB0QgcQcpsXWu", "rPSLKKx", "s30Qb", "", "jZ8LcPBJeju31135gHiS3ruOtpsz6ca1", "Wk6RdB9", "nl0Ip", "e6TFxM3GpawCuoBue5hU0ga7A8aqYwlk"};
    public long A00;
    public long A01;
    public C0998Qy A02;
    public C1422dK A03;

    public C0998Qy(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C0998Qy A01() {
        this.A03 = null;
        C0998Qy c0998Qy = this.A02;
        this.A02 = null;
        return c0998Qy;
    }

    public final void A02(long j, int i) {
        AbstractC1517es.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = ((long) i) + j;
    }

    public final void A03(C1422dK c1422dK, C0998Qy c0998Qy) {
        this.A03 = c1422dK;
        this.A02 = c0998Qy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1423dL
    public final C1422dK A6k() {
        return (C1422dK) AbstractC1517es.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1423dL
    public final C0998Qy ABx() {
        if (this.A02 == null) {
            return null;
        }
        C0998Qy c0998Qy = this.A02;
        String[] strArr = A04;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A04[0] = "s3hOhS6JRVZGOWqbEiZVryq1r0alsn39";
        if (c0998Qy.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
