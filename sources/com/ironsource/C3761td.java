package com.ironsource;

import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3761td {
    private final Map<String, List<String>> a;
    private final Map<String, List<String>> b;
    private final Map<String, List<String>> c;
    private final Map<String, List<String>> d;

    public C3761td() {
        this(null, null, null, null, 15, null);
    }

    public final Map<String, List<String>> a() {
        return this.a;
    }

    public final Map<String, List<String>> b() {
        return this.b;
    }

    public final Map<String, List<String>> c() {
        return this.c;
    }

    public final Map<String, List<String>> d() {
        return this.d;
    }

    public final Map<String, List<String>> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3761td)) {
            return false;
        }
        C3761td c3761td = (C3761td) obj;
        return Intrinsics.wireman(this.a, c3761td.a) && Intrinsics.wireman(this.b, c3761td.b) && Intrinsics.wireman(this.c, c3761td.c) && Intrinsics.wireman(this.d, c3761td.d);
    }

    public final Map<String, List<String>> f() {
        return this.b;
    }

    public final Map<String, List<String>> g() {
        return this.d;
    }

    public final Map<String, List<String>> h() {
        return this.a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.d;
        return iHashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderOrder2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3761td(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public final C3761td a(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        return new C3761td(map, map2, map3, map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3761td a(C3761td c3761td, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c3761td.a;
        }
        if ((i & 2) != 0) {
            map2 = c3761td.b;
        }
        if ((i & 4) != 0) {
            map3 = c3761td.c;
        }
        if ((i & 8) != 0) {
            map4 = c3761td.d;
        }
        return c3761td.a(map, map2, map3, map4);
    }

    public /* synthetic */ C3761td(Map map, Map map2, Map map3, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4);
    }
}
