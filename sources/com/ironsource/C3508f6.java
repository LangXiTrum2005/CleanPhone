package com.ironsource;

import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3508f6 {
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;
    private final List<C3569id> e;
    private final C3680p f;
    private final int g;
    private final Integer h;

    /* JADX WARN: Multi-variable type inference failed */
    public C3508f6(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C3569id> placements, C3680p auction, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = i2;
        this.h = num;
    }

    public final Map<String, List<String>> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final List<C3569id> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3508f6)) {
            return false;
        }
        C3508f6 c3508f6 = (C3508f6) obj;
        return Intrinsics.wireman(this.a, c3508f6.a) && this.b == c3508f6.b && this.c == c3508f6.c && this.d == c3508f6.d && Intrinsics.wireman(this.e, c3508f6.e) && Intrinsics.wireman(this.f, c3508f6.f) && this.g == c3508f6.g && Intrinsics.wireman(this.h, c3508f6.h);
    }

    public final C3680p f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final Integer h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((iHashCode + r1) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.g)) * 31;
        Integer num = this.h;
        return iHashCode2 + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.g;
    }

    public final boolean j() {
        return this.c;
    }

    public final C3680p k() {
        return this.f;
    }

    public final long l() {
        return this.d;
    }

    public final Integer m() {
        return this.h;
    }

    public final int n() {
        return this.b;
    }

    public final List<C3569id> o() {
        return this.e;
    }

    public final Map<String, List<String>> p() {
        return this.a;
    }

    public String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutSecs=" + this.g + ", expiredDurationMins=" + this.h + ")";
    }

    public final C3508f6 a(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C3569id> placements, C3680p auction, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new C3508f6(providerOrder, i, z, j, placements, auction, i2, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3508f6 a(C3508f6 c3508f6, Map map, int i, boolean z, long j, List list, C3680p c3680p, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c3508f6.a;
        }
        if ((i3 & 2) != 0) {
            i = c3508f6.b;
        }
        if ((i3 & 4) != 0) {
            z = c3508f6.c;
        }
        if ((i3 & 8) != 0) {
            j = c3508f6.d;
        }
        if ((i3 & 16) != 0) {
            list = c3508f6.e;
        }
        if ((i3 & 32) != 0) {
            c3680p = c3508f6.f;
        }
        if ((i3 & 64) != 0) {
            i2 = c3508f6.g;
        }
        if ((i3 & 128) != 0) {
            num = c3508f6.h;
        }
        long j2 = j;
        boolean z2 = z;
        return c3508f6.a(map, i, z2, j2, list, c3680p, i2, num);
    }
}
