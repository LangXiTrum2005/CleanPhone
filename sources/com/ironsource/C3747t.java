package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3747t {
    private final String a;
    private final EnumC3636m9 b;
    private final boolean c;
    private final String d;
    private final long e;

    public C3747t(String adSourceNameForEvents, EnumC3636m9 instanceType, boolean z, String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.a = adSourceNameForEvents;
        this.b = instanceType;
        this.c = z;
        this.d = providerName;
        this.e = j;
    }

    public final String a() {
        return this.a;
    }

    public final EnumC3636m9 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3747t)) {
            return false;
        }
        C3747t c3747t = (C3747t) obj;
        return Intrinsics.wireman(this.a, c3747t.a) && this.b == c3747t.b && this.c == c3747t.c && Intrinsics.wireman(this.d, c3747t.d) && this.e == c3747t.e;
    }

    public final String f() {
        return this.a;
    }

    public final EnumC3636m9 g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.e);
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.c;
    }

    public String toString() {
        return "AdFormatConfig(adSourceNameForEvents=" + this.a + ", instanceType=" + this.b + ", isOneFlow=" + this.c + ", providerName=" + this.d + ", loadTimeoutInMillis=" + this.e + ")";
    }

    public final C3747t a(String adSourceNameForEvents, EnumC3636m9 instanceType, boolean z, String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return new C3747t(adSourceNameForEvents, instanceType, z, providerName, j);
    }

    public static /* synthetic */ C3747t a(C3747t c3747t, String str, EnumC3636m9 enumC3636m9, boolean z, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3747t.a;
        }
        if ((i & 2) != 0) {
            enumC3636m9 = c3747t.b;
        }
        if ((i & 4) != 0) {
            z = c3747t.c;
        }
        if ((i & 8) != 0) {
            str2 = c3747t.d;
        }
        if ((i & 16) != 0) {
            j = c3747t.e;
        }
        long j2 = j;
        return c3747t.a(str, enumC3636m9, z, str2, j2);
    }
}
