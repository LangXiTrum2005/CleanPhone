package com.ironsource;

import androidx.core.app.NotificationCompat;

/* JADX INFO: renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0505p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f29959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f29960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f29961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f29962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f29963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f29964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f29965k;

    public C0505p(String auctionData, String auctioneerURL, String extAuctioneerURL, int i10, long j10, int i11, boolean z10, boolean z11, int i12, boolean z12, boolean z13) {
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        kotlin.jvm.internal.n.f(auctioneerURL, "auctioneerURL");
        kotlin.jvm.internal.n.f(extAuctioneerURL, "extAuctioneerURL");
        this.f29955a = auctionData;
        this.f29956b = auctioneerURL;
        this.f29957c = extAuctioneerURL;
        this.f29958d = i10;
        this.f29959e = j10;
        this.f29960f = i11;
        this.f29961g = z10;
        this.f29962h = z11;
        this.f29963i = i12;
        this.f29964j = z12;
        this.f29965k = z13;
    }

    public final String a() {
        return this.f29955a;
    }

    public final boolean b() {
        return this.f29964j;
    }

    public final boolean c() {
        return this.f29965k;
    }

    public final String d() {
        return this.f29956b;
    }

    public final String e() {
        return this.f29957c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0505p)) {
            return false;
        }
        C0505p c0505p = (C0505p) obj;
        return kotlin.jvm.internal.n.a(this.f29955a, c0505p.f29955a) && kotlin.jvm.internal.n.a(this.f29956b, c0505p.f29956b) && kotlin.jvm.internal.n.a(this.f29957c, c0505p.f29957c) && this.f29958d == c0505p.f29958d && this.f29959e == c0505p.f29959e && this.f29960f == c0505p.f29960f && this.f29961g == c0505p.f29961g && this.f29962h == c0505p.f29962h && this.f29963i == c0505p.f29963i && this.f29964j == c0505p.f29964j && this.f29965k == c0505p.f29965k;
    }

    public final int f() {
        return this.f29958d;
    }

    public final long g() {
        return this.f29959e;
    }

    public final int h() {
        return this.f29960f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iF = wi.d.f(this.f29960f, com.applovin.impl.ca.j(this.f29959e, wi.d.f(this.f29958d, d5.u.e(d5.u.e(this.f29955a.hashCode() * 31, 31, this.f29956b), 31, this.f29957c), 31), 31), 31);
        boolean z10 = this.f29961g;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        int i10 = (iF + r2) * 31;
        boolean z11 = this.f29962h;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int iF2 = wi.d.f(this.f29963i, (i10 + r3) * 31, 31);
        boolean z12 = this.f29964j;
        ?? r10 = z12;
        if (z12) {
            r10 = 1;
        }
        int i11 = (iF2 + r10) * 31;
        boolean z13 = this.f29965k;
        return i11 + (z13 ? 1 : z13);
    }

    public final boolean i() {
        return this.f29961g;
    }

    public final boolean j() {
        return this.f29962h;
    }

    public final int k() {
        return this.f29963i;
    }

    public final String l() {
        return this.f29955a;
    }

    public final int m() {
        return this.f29960f;
    }

    public final long n() {
        return this.f29959e;
    }

    public final int o() {
        return this.f29958d;
    }

    public final String p() {
        return this.f29956b;
    }

    public final boolean q() {
        return this.f29961g;
    }

    public final boolean r() {
        return this.f29962h;
    }

    public final boolean s() {
        return this.f29965k;
    }

    public final int t() {
        return this.f29963i;
    }

    public String toString() {
        String str = this.f29955a;
        String str2 = this.f29956b;
        String str3 = this.f29957c;
        int i10 = this.f29958d;
        long j10 = this.f29959e;
        int i11 = this.f29960f;
        boolean z10 = this.f29961g;
        boolean z11 = this.f29962h;
        int i12 = this.f29963i;
        boolean z12 = this.f29964j;
        boolean z13 = this.f29965k;
        StringBuilder sbV = defpackage.e.v("AdFormatAuctionConfig2(auctionData=", str, ", auctioneerURL=", str2, ", extAuctioneerURL=");
        sbV.append(str3);
        sbV.append(", auctionTrials=");
        sbV.append(i10);
        sbV.append(", auctionTimeout=");
        sbV.append(j10);
        sbV.append(", auctionSavedHistoryLimit=");
        sbV.append(i11);
        sbV.append(", compressAuctionRequest=");
        sbV.append(z10);
        sbV.append(", compressAuctionResponse=");
        sbV.append(z11);
        sbV.append(", encryptionVersion=");
        sbV.append(i12);
        sbV.append(", tokenPerAdapter=");
        sbV.append(z12);
        sbV.append(", enableAuctionFallback=");
        sbV.append(z13);
        sbV.append(")");
        return sbV.toString();
    }

    public final String u() {
        return this.f29957c;
    }

    public final boolean v() {
        return this.f29964j;
    }

    public final C0505p a(String auctionData, String auctioneerURL, String extAuctioneerURL, int i10, long j10, int i11, boolean z10, boolean z11, int i12, boolean z12, boolean z13) {
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        kotlin.jvm.internal.n.f(auctioneerURL, "auctioneerURL");
        kotlin.jvm.internal.n.f(extAuctioneerURL, "extAuctioneerURL");
        return new C0505p(auctionData, auctioneerURL, extAuctioneerURL, i10, j10, i11, z10, z11, i12, z12, z13);
    }

    public static /* synthetic */ C0505p a(C0505p c0505p, String str, String str2, String str3, int i10, long j10, int i11, boolean z10, boolean z11, int i12, boolean z12, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c0505p.f29955a;
        }
        if ((i13 & 2) != 0) {
            str2 = c0505p.f29956b;
        }
        if ((i13 & 4) != 0) {
            str3 = c0505p.f29957c;
        }
        if ((i13 & 8) != 0) {
            i10 = c0505p.f29958d;
        }
        if ((i13 & 16) != 0) {
            j10 = c0505p.f29959e;
        }
        if ((i13 & 32) != 0) {
            i11 = c0505p.f29960f;
        }
        if ((i13 & 64) != 0) {
            z10 = c0505p.f29961g;
        }
        if ((i13 & 128) != 0) {
            z11 = c0505p.f29962h;
        }
        if ((i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i12 = c0505p.f29963i;
        }
        if ((i13 & 512) != 0) {
            z12 = c0505p.f29964j;
        }
        if ((i13 & 1024) != 0) {
            z13 = c0505p.f29965k;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        long j11 = j10;
        String str4 = str3;
        int i14 = i10;
        return c0505p.a(str, str2, str4, i14, j11, i11, z10, z11, i12, z14, z15);
    }
}
