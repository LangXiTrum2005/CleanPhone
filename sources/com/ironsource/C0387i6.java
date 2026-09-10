package com.ironsource;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.i6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0387i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f28889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f28892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<C0465md> f28893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0505p f28894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f28896h;

    /* JADX WARN: Multi-variable type inference failed */
    public C0387i6(Map<String, ? extends List<String>> providerOrder, int i10, boolean z10, long j10, List<C0465md> placements, C0505p auction, int i11, Integer num) {
        kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
        kotlin.jvm.internal.n.f(placements, "placements");
        kotlin.jvm.internal.n.f(auction, "auction");
        this.f28889a = providerOrder;
        this.f28890b = i10;
        this.f28891c = z10;
        this.f28892d = j10;
        this.f28893e = placements;
        this.f28894f = auction;
        this.f28895g = i11;
        this.f28896h = num;
    }

    public final Map<String, List<String>> a() {
        return this.f28889a;
    }

    public final int b() {
        return this.f28890b;
    }

    public final boolean c() {
        return this.f28891c;
    }

    public final long d() {
        return this.f28892d;
    }

    public final List<C0465md> e() {
        return this.f28893e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0387i6)) {
            return false;
        }
        C0387i6 c0387i6 = (C0387i6) obj;
        return kotlin.jvm.internal.n.a(this.f28889a, c0387i6.f28889a) && this.f28890b == c0387i6.f28890b && this.f28891c == c0387i6.f28891c && this.f28892d == c0387i6.f28892d && kotlin.jvm.internal.n.a(this.f28893e, c0387i6.f28893e) && kotlin.jvm.internal.n.a(this.f28894f, c0387i6.f28894f) && this.f28895g == c0387i6.f28895g && kotlin.jvm.internal.n.a(this.f28896h, c0387i6.f28896h);
    }

    public final C0505p f() {
        return this.f28894f;
    }

    public final int g() {
        return this.f28895g;
    }

    public final Integer h() {
        return this.f28896h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        int iF = wi.d.f(this.f28890b, this.f28889a.hashCode() * 31, 31);
        boolean z10 = this.f28891c;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        int iF2 = wi.d.f(this.f28895g, (this.f28894f.hashCode() + q4.a.g(com.applovin.impl.ca.j(this.f28892d, (iF + r2) * 31, 31), 31, this.f28893e)) * 31, 31);
        Integer num = this.f28896h;
        return iF2 + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.f28895g;
    }

    public final boolean j() {
        return this.f28891c;
    }

    public final C0505p k() {
        return this.f28894f;
    }

    public final long l() {
        return this.f28892d;
    }

    public final Integer m() {
        return this.f28896h;
    }

    public final int n() {
        return this.f28890b;
    }

    public final List<C0465md> o() {
        return this.f28893e;
    }

    public final Map<String, List<String>> p() {
        return this.f28889a;
    }

    public String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.f28889a + ", parallelLoad=" + this.f28890b + ", advancedLoading=" + this.f28891c + ", collectBiddingDataTimeout=" + this.f28892d + ", placements=" + this.f28893e + ", auction=" + this.f28894f + ", adapterTimeoutSecs=" + this.f28895g + ", expiredDurationMins=" + this.f28896h + ")";
    }

    public final C0387i6 a(Map<String, ? extends List<String>> providerOrder, int i10, boolean z10, long j10, List<C0465md> placements, C0505p auction, int i11, Integer num) {
        kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
        kotlin.jvm.internal.n.f(placements, "placements");
        kotlin.jvm.internal.n.f(auction, "auction");
        return new C0387i6(providerOrder, i10, z10, j10, placements, auction, i11, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0387i6 a(C0387i6 c0387i6, Map map, int i10, boolean z10, long j10, List list, C0505p c0505p, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = c0387i6.f28889a;
        }
        if ((i12 & 2) != 0) {
            i10 = c0387i6.f28890b;
        }
        if ((i12 & 4) != 0) {
            z10 = c0387i6.f28891c;
        }
        if ((i12 & 8) != 0) {
            j10 = c0387i6.f28892d;
        }
        if ((i12 & 16) != 0) {
            list = c0387i6.f28893e;
        }
        if ((i12 & 32) != 0) {
            c0505p = c0387i6.f28894f;
        }
        if ((i12 & 64) != 0) {
            i11 = c0387i6.f28895g;
        }
        if ((i12 & 128) != 0) {
            num = c0387i6.f28896h;
        }
        long j11 = j10;
        boolean z11 = z10;
        return c0387i6.a(map, i10, z11, j11, list, c0505p, i11, num);
    }
}
