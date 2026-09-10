package com.ironsource;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f26200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<String>> f26201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<String>> f26202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, List<String>> f26203d;

    public Gd() {
        this(null, null, null, null, 15, null);
    }

    public final Map<String, List<String>> a() {
        return this.f26200a;
    }

    public final Map<String, List<String>> b() {
        return this.f26201b;
    }

    public final Map<String, List<String>> c() {
        return this.f26202c;
    }

    public final Map<String, List<String>> d() {
        return this.f26203d;
    }

    public final Map<String, List<String>> e() {
        return this.f26202c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gd)) {
            return false;
        }
        Gd gd2 = (Gd) obj;
        return kotlin.jvm.internal.n.a(this.f26200a, gd2.f26200a) && kotlin.jvm.internal.n.a(this.f26201b, gd2.f26201b) && kotlin.jvm.internal.n.a(this.f26202c, gd2.f26202c) && kotlin.jvm.internal.n.a(this.f26203d, gd2.f26203d);
    }

    public final Map<String, List<String>> f() {
        return this.f26201b;
    }

    public final Map<String, List<String>> g() {
        return this.f26203d;
    }

    public final Map<String, List<String>> h() {
        return this.f26200a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.f26200a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.f26201b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.f26202c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.f26203d;
        return iHashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderOrder2(rewarded=" + this.f26200a + ", interstitial=" + this.f26201b + ", banner=" + this.f26202c + ", nativeAd=" + this.f26203d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Gd(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        this.f26200a = map;
        this.f26201b = map2;
        this.f26202c = map3;
        this.f26203d = map4;
    }

    public final Gd a(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        return new Gd(map, map2, map3, map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Gd a(Gd gd2, Map map, Map map2, Map map3, Map map4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = gd2.f26200a;
        }
        if ((i10 & 2) != 0) {
            map2 = gd2.f26201b;
        }
        if ((i10 & 4) != 0) {
            map3 = gd2.f26202c;
        }
        if ((i10 & 8) != 0) {
            map4 = gd2.f26203d;
        }
        return gd2.a(map, map2, map3, map4);
    }

    public /* synthetic */ Gd(Map map, Map map2, Map map3, Map map4, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2, (i10 & 4) != 0 ? null : map3, (i10 & 8) != 0 ? null : map4);
    }
}
