package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0515p9 f25898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25902e;

    public Cb(EnumC0515p9 instanceType, String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(instanceType, "instanceType");
        kotlin.jvm.internal.n.f(adSourceNameForEvents, "adSourceNameForEvents");
        this.f25898a = instanceType;
        this.f25899b = adSourceNameForEvents;
        this.f25900c = j10;
        this.f25901d = z10;
        this.f25902e = z11;
    }

    public final EnumC0515p9 a() {
        return this.f25898a;
    }

    public final String b() {
        return this.f25899b;
    }

    public final long c() {
        return this.f25900c;
    }

    public final boolean d() {
        return this.f25901d;
    }

    public final boolean e() {
        return this.f25902e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cb)) {
            return false;
        }
        Cb cb2 = (Cb) obj;
        return this.f25898a == cb2.f25898a && kotlin.jvm.internal.n.a(this.f25899b, cb2.f25899b) && this.f25900c == cb2.f25900c && this.f25901d == cb2.f25901d && this.f25902e == cb2.f25902e;
    }

    public final String f() {
        return this.f25899b;
    }

    public final EnumC0515p9 g() {
        return this.f25898a;
    }

    public final long h() {
        return this.f25900c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iJ = com.applovin.impl.ca.j(this.f25900c, d5.u.e(this.f25898a.hashCode() * 31, 31, this.f25899b), 31);
        boolean z10 = this.f25901d;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        int i10 = (iJ + r2) * 31;
        boolean z11 = this.f25902e;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean i() {
        return this.f25902e;
    }

    public final boolean j() {
        return this.f25901d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f25898a + ", adSourceNameForEvents=" + this.f25899b + ", loadTimeoutInMills=" + this.f25900c + ", isOneFlow=" + this.f25901d + ", isMultipleAdObjects=" + this.f25902e + ")";
    }

    public final Cb a(EnumC0515p9 instanceType, String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(instanceType, "instanceType");
        kotlin.jvm.internal.n.f(adSourceNameForEvents, "adSourceNameForEvents");
        return new Cb(instanceType, adSourceNameForEvents, j10, z10, z11);
    }

    public static /* synthetic */ Cb a(Cb cb2, EnumC0515p9 enumC0515p9, String str, long j10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC0515p9 = cb2.f25898a;
        }
        if ((i10 & 2) != 0) {
            str = cb2.f25899b;
        }
        if ((i10 & 4) != 0) {
            j10 = cb2.f25900c;
        }
        if ((i10 & 8) != 0) {
            z10 = cb2.f25901d;
        }
        if ((i10 & 16) != 0) {
            z11 = cb2.f25902e;
        }
        long j11 = j10;
        return cb2.a(enumC0515p9, str, j11, z10, z11);
    }

    public /* synthetic */ Cb(EnumC0515p9 enumC0515p9, String str, long j10, boolean z10, boolean z11, int i10, kotlin.jvm.internal.g gVar) {
        this(enumC0515p9, str, j10, z10, (i10 & 16) != 0 ? true : z11);
    }
}
