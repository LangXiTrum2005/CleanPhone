package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3844yb {
    private final EnumC3636m9 a;
    private final String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public C3844yb(EnumC3636m9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.a = instanceType;
        this.b = adSourceNameForEvents;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public final EnumC3636m9 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3844yb)) {
            return false;
        }
        C3844yb c3844yb = (C3844yb) obj;
        return this.a == c3844yb.a && Intrinsics.wireman(this.b, c3844yb.b) && this.c == c3844yb.c && this.d == c3844yb.d && this.e == c3844yb.e;
    }

    public final String f() {
        return this.b;
    }

    public final EnumC3636m9 g() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31;
        boolean z = this.d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.e;
        return i + (z2 ? 1 : z2);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    public final C3844yb a(EnumC3636m9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new C3844yb(instanceType, adSourceNameForEvents, j, z, z2);
    }

    public static /* synthetic */ C3844yb a(C3844yb c3844yb, EnumC3636m9 enumC3636m9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC3636m9 = c3844yb.a;
        }
        if ((i & 2) != 0) {
            str = c3844yb.b;
        }
        if ((i & 4) != 0) {
            j = c3844yb.c;
        }
        if ((i & 8) != 0) {
            z = c3844yb.d;
        }
        if ((i & 16) != 0) {
            z2 = c3844yb.e;
        }
        long j2 = j;
        return c3844yb.a(enumC3636m9, str, j2, z, z2);
    }

    public /* synthetic */ C3844yb(EnumC3636m9 enumC3636m9, String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC3636m9, str, j, z, (i & 16) != 0 ? true : z2);
    }
}
