package com.ironsource;

import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.bb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0266bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0387i6 f28296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0387i6 f28297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A2 f28298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Bd> f28299d;

    public C0266bb(C0387i6 c0387i6, C0387i6 c0387i7, A2 a8, Map<String, Bd> providerConfig) {
        kotlin.jvm.internal.n.f(providerConfig, "providerConfig");
        this.f28296a = c0387i6;
        this.f28297b = c0387i7;
        this.f28298c = a8;
        this.f28299d = providerConfig;
    }

    public final C0387i6 a() {
        return this.f28296a;
    }

    public final C0387i6 b() {
        return this.f28297b;
    }

    public final A2 c() {
        return this.f28298c;
    }

    public final Map<String, Bd> d() {
        return this.f28299d;
    }

    public final A2 e() {
        return this.f28298c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0266bb)) {
            return false;
        }
        C0266bb c0266bb = (C0266bb) obj;
        return kotlin.jvm.internal.n.a(this.f28296a, c0266bb.f28296a) && kotlin.jvm.internal.n.a(this.f28297b, c0266bb.f28297b) && kotlin.jvm.internal.n.a(this.f28298c, c0266bb.f28298c) && kotlin.jvm.internal.n.a(this.f28299d, c0266bb.f28299d);
    }

    public final C0387i6 f() {
        return this.f28297b;
    }

    public final Map<String, Bd> g() {
        return this.f28299d;
    }

    public final C0387i6 h() {
        return this.f28296a;
    }

    public int hashCode() {
        C0387i6 c0387i6 = this.f28296a;
        int iHashCode = (c0387i6 == null ? 0 : c0387i6.hashCode()) * 31;
        C0387i6 c0387i7 = this.f28297b;
        int iHashCode2 = (iHashCode + (c0387i7 == null ? 0 : c0387i7.hashCode())) * 31;
        A2 a8 = this.f28298c;
        return this.f28299d.hashCode() + ((iHashCode2 + (a8 != null ? a8.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "LevelPlayInitConfig2(rewarded=" + this.f28296a + ", interstitial=" + this.f28297b + ", banner=" + this.f28298c + ", providerConfig=" + this.f28299d + ")";
    }

    public final C0266bb a(C0387i6 c0387i6, C0387i6 c0387i7, A2 a8, Map<String, Bd> providerConfig) {
        kotlin.jvm.internal.n.f(providerConfig, "providerConfig");
        return new C0266bb(c0387i6, c0387i7, a8, providerConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0266bb a(C0266bb c0266bb, C0387i6 c0387i6, C0387i6 c0387i7, A2 a8, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0387i6 = c0266bb.f28296a;
        }
        if ((i10 & 2) != 0) {
            c0387i7 = c0266bb.f28297b;
        }
        if ((i10 & 4) != 0) {
            a8 = c0266bb.f28298c;
        }
        if ((i10 & 8) != 0) {
            map = c0266bb.f28299d;
        }
        return c0266bb.a(c0387i6, c0387i7, a8, map);
    }
}
