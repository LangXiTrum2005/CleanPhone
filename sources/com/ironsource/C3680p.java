package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3680p {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final long e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;

    public C3680p(String auctionData, String auctioneerURL, String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        this.a = auctionData;
        this.b = auctioneerURL;
        this.c = extAuctioneerURL;
        this.d = i;
        this.e = j;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = i3;
        this.j = z3;
        this.k = z4;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.k;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3680p)) {
            return false;
        }
        C3680p c3680p = (C3680p) obj;
        return Intrinsics.wireman(this.a, c3680p.a) && Intrinsics.wireman(this.b, c3680p.b) && Intrinsics.wireman(this.c, c3680p.c) && this.d == c3680p.d && this.e == c3680p.e && this.f == c3680p.f && this.g == c3680p.g && this.h == c3680p.h && this.i == c3680p.i && this.j == c3680p.j && this.k == c3680p.k;
    }

    public final int f() {
        return this.d;
    }

    public final long g() {
        return this.e;
    }

    public final int h() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Integer.hashCode(this.f)) * 31;
        boolean z = this.g;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.h;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode2 = (((i + r2) * 31) + Integer.hashCode(this.i)) * 31;
        boolean z3 = this.j;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i2 = (iHashCode2 + r3) * 31;
        boolean z4 = this.k;
        return i2 + (z4 ? 1 : z4);
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }

    public final int k() {
        return this.i;
    }

    public final String l() {
        return this.a;
    }

    public final int m() {
        return this.f;
    }

    public final long n() {
        return this.e;
    }

    public final int o() {
        return this.d;
    }

    public final String p() {
        return this.b;
    }

    public final boolean q() {
        return this.g;
    }

    public final boolean r() {
        return this.h;
    }

    public final boolean s() {
        return this.k;
    }

    public final int t() {
        return this.i;
    }

    public String toString() {
        return "AdFormatAuctionConfig2(auctionData=" + this.a + ", auctioneerURL=" + this.b + ", extAuctioneerURL=" + this.c + ", auctionTrials=" + this.d + ", auctionTimeout=" + this.e + ", auctionSavedHistoryLimit=" + this.f + ", compressAuctionRequest=" + this.g + ", compressAuctionResponse=" + this.h + ", encryptionVersion=" + this.i + ", tokenPerAdapter=" + this.j + ", enableAuctionFallback=" + this.k + ")";
    }

    public final String u() {
        return this.c;
    }

    public final boolean v() {
        return this.j;
    }

    public final C3680p a(String auctionData, String auctioneerURL, String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        return new C3680p(auctionData, auctioneerURL, extAuctioneerURL, i, j, i2, z, z2, i3, z3, z4);
    }

    public static /* synthetic */ C3680p a(C3680p c3680p, String str, String str2, String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c3680p.a;
        }
        if ((i4 & 2) != 0) {
            str2 = c3680p.b;
        }
        if ((i4 & 4) != 0) {
            str3 = c3680p.c;
        }
        if ((i4 & 8) != 0) {
            i = c3680p.d;
        }
        if ((i4 & 16) != 0) {
            j = c3680p.e;
        }
        if ((i4 & 32) != 0) {
            i2 = c3680p.f;
        }
        if ((i4 & 64) != 0) {
            z = c3680p.g;
        }
        if ((i4 & 128) != 0) {
            z2 = c3680p.h;
        }
        if ((i4 & 256) != 0) {
            i3 = c3680p.i;
        }
        if ((i4 & 512) != 0) {
            z3 = c3680p.j;
        }
        if ((i4 & 1024) != 0) {
            z4 = c3680p.k;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        long j2 = j;
        String str4 = str3;
        int i5 = i;
        return c3680p.a(str, str2, str4, i5, j2, i2, z, z2, i3, z5, z6);
    }
}
