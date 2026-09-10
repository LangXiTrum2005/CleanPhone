package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0275c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, ? extends Object> f28338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0257b2 f28339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f28340g;

    public C0275c2(String name, boolean z10) {
        kotlin.jvm.internal.n.f(name, "name");
        this.f28334a = name;
        this.f28335b = z10;
        this.f28337d = "";
        this.f28338e = xj.w.f53867a;
        this.f28340g = new HashMap();
    }

    public final String a() {
        return this.f28334a;
    }

    public final boolean b() {
        return this.f28335b;
    }

    public final Map<String, Object> c() {
        return this.f28340g;
    }

    public final C0257b2 d() {
        return this.f28339f;
    }

    public final boolean e() {
        return this.f28335b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0275c2)) {
            return false;
        }
        C0275c2 c0275c2 = (C0275c2) obj;
        return kotlin.jvm.internal.n.a(this.f28334a, c0275c2.f28334a) && this.f28335b == c0275c2.f28335b;
    }

    public final Map<String, Object> f() {
        return this.f28338e;
    }

    public final String g() {
        return this.f28334a;
    }

    public final String h() {
        return this.f28337d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.f28334a.hashCode() * 31;
        boolean z10 = this.f28335b;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final boolean i() {
        return this.f28336c;
    }

    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f28334a + ", bidder=" + this.f28335b + ")";
    }

    public final C0275c2 a(String name, boolean z10) {
        kotlin.jvm.internal.n.f(name, "name");
        return new C0275c2(name, z10);
    }

    public final void b(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.n.f(map, "<set-?>");
        this.f28338e = map;
    }

    public static /* synthetic */ C0275c2 a(C0275c2 c0275c2, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0275c2.f28334a;
        }
        if ((i10 & 2) != 0) {
            z10 = c0275c2.f28335b;
        }
        return c0275c2.a(str, z10);
    }

    public final void a(boolean z10) {
        this.f28336c = z10;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f28337d = str;
    }

    public final void a(C0257b2 c0257b2) {
        this.f28339f = c0257b2;
    }

    public final void a(Map<String, Object> map) {
        kotlin.jvm.internal.n.f(map, "<set-?>");
        this.f28340g = map;
    }
}
