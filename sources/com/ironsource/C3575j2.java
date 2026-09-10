package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3575j2 {
    private final String a;
    private final boolean b;
    private boolean c;
    private String d;
    private Map<String, ? extends Object> e;
    private C3432b2 f;
    private Map<String, Object> g;

    public C3575j2(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = z;
        this.d = "";
        this.e = p002kotlin.collections.seminary.taiyuan();
        this.g = new HashMap();
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return this.g;
    }

    public final C3432b2 d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3575j2)) {
            return false;
        }
        C3575j2 c3575j2 = (C3575j2) obj;
        return Intrinsics.wireman(this.a, c3575j2.a) && this.b == c3575j2.b;
    }

    public final Map<String, Object> f() {
        return this.e;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean i() {
        return this.c;
    }

    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.a + ", bidder=" + this.b + ")";
    }

    public final C3575j2 a(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C3575j2(name, z);
    }

    public final void b(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.e = map;
    }

    public static /* synthetic */ C3575j2 a(C3575j2 c3575j2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3575j2.a;
        }
        if ((i & 2) != 0) {
            z = c3575j2.b;
        }
        return c3575j2.a(str, z);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void a(C3432b2 c3432b2) {
        this.f = c3432b2;
    }

    public final void a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.g = map;
    }
}
