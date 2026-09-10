package com.ironsource;

import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f25599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<C0465md> f25603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0505p f25604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f25605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f25606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f25607i;

    /* JADX WARN: Multi-variable type inference failed */
    public A2(Map<String, ? extends List<String>> providerOrder, int i10, boolean z10, long j10, List<C0465md> placements, C0505p auction, long j11, int i11, long j12) {
        kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
        kotlin.jvm.internal.n.f(placements, "placements");
        kotlin.jvm.internal.n.f(auction, "auction");
        this.f25599a = providerOrder;
        this.f25600b = i10;
        this.f25601c = z10;
        this.f25602d = j10;
        this.f25603e = placements;
        this.f25604f = auction;
        this.f25605g = j11;
        this.f25606h = i11;
        this.f25607i = j12;
    }

    public final Map<String, List<String>> a() {
        return this.f25599a;
    }

    public final int b() {
        return this.f25600b;
    }

    public final boolean c() {
        return this.f25601c;
    }

    public final long d() {
        return this.f25602d;
    }

    public final List<C0465md> e() {
        return this.f25603e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A2)) {
            return false;
        }
        A2 a8 = (A2) obj;
        return kotlin.jvm.internal.n.a(this.f25599a, a8.f25599a) && this.f25600b == a8.f25600b && this.f25601c == a8.f25601c && this.f25602d == a8.f25602d && kotlin.jvm.internal.n.a(this.f25603e, a8.f25603e) && kotlin.jvm.internal.n.a(this.f25604f, a8.f25604f) && this.f25605g == a8.f25605g && this.f25606h == a8.f25606h && this.f25607i == a8.f25607i;
    }

    public final C0505p f() {
        return this.f25604f;
    }

    public final long g() {
        return this.f25605g;
    }

    public final int h() {
        return this.f25606h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public int hashCode() {
        int iF = wi.d.f(this.f25600b, this.f25599a.hashCode() * 31, 31);
        boolean z10 = this.f25601c;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        return Long.hashCode(this.f25607i) + wi.d.f(this.f25606h, com.applovin.impl.ca.j(this.f25605g, (this.f25604f.hashCode() + q4.a.g(com.applovin.impl.ca.j(this.f25602d, (iF + r2) * 31, 31), 31, this.f25603e)) * 31, 31), 31);
    }

    public final long i() {
        return this.f25607i;
    }

    public final long j() {
        return this.f25605g;
    }

    public final boolean k() {
        return this.f25601c;
    }

    public final C0505p l() {
        return this.f25604f;
    }

    public final int m() {
        return this.f25606h;
    }

    public final long n() {
        return this.f25602d;
    }

    public final long o() {
        return this.f25607i;
    }

    public final int p() {
        return this.f25600b;
    }

    public final List<C0465md> q() {
        return this.f25603e;
    }

    public final Map<String, List<String>> r() {
        return this.f25599a;
    }

    public String toString() {
        Map<String, List<String>> map = this.f25599a;
        int i10 = this.f25600b;
        boolean z10 = this.f25601c;
        long j10 = this.f25602d;
        List<C0465md> list = this.f25603e;
        C0505p c0505p = this.f25604f;
        long j11 = this.f25605g;
        int i11 = this.f25606h;
        long j12 = this.f25607i;
        StringBuilder sb2 = new StringBuilder("BannerAdFormatConfig2(providerOrder=");
        sb2.append(map);
        sb2.append(", parallelLoad=");
        sb2.append(i10);
        sb2.append(", advancedLoading=");
        sb2.append(z10);
        sb2.append(", collectBiddingDataTimeout=");
        sb2.append(j10);
        sb2.append(", placements=");
        sb2.append(list);
        sb2.append(", auction=");
        sb2.append(c0505p);
        q4.a.r(sb2, ", adapterTimeoutMillis=", j11, ", bannerInterval=");
        sb2.append(i11);
        sb2.append(", impressionTimeout=");
        sb2.append(j12);
        sb2.append(")");
        return sb2.toString();
    }

    public final A2 a(Map<String, ? extends List<String>> providerOrder, int i10, boolean z10, long j10, List<C0465md> placements, C0505p auction, long j11, int i11, long j12) {
        kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
        kotlin.jvm.internal.n.f(placements, "placements");
        kotlin.jvm.internal.n.f(auction, "auction");
        return new A2(providerOrder, i10, z10, j10, placements, auction, j11, i11, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ A2 a(A2 a8, Map map, int i10, boolean z10, long j10, List list, C0505p c0505p, long j11, int i11, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = a8.f25599a;
        }
        if ((i12 & 2) != 0) {
            i10 = a8.f25600b;
        }
        if ((i12 & 4) != 0) {
            z10 = a8.f25601c;
        }
        if ((i12 & 8) != 0) {
            j10 = a8.f25602d;
        }
        if ((i12 & 16) != 0) {
            list = a8.f25603e;
        }
        if ((i12 & 32) != 0) {
            c0505p = a8.f25604f;
        }
        if ((i12 & 64) != 0) {
            j11 = a8.f25605g;
        }
        if ((i12 & 128) != 0) {
            i11 = a8.f25606h;
        }
        if ((i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            j12 = a8.f25607i;
        }
        int i13 = i11;
        long j13 = j11;
        List list2 = list;
        long j14 = j10;
        boolean z11 = z10;
        return a8.a(map, i10, z11, j14, list2, c0505p, j13, i13, j12);
    }
}
