package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0576t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0515p9 f30710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30713e;

    public C0576t(String adSourceNameForEvents, EnumC0515p9 instanceType, boolean z10, String providerName, long j10) {
        kotlin.jvm.internal.n.f(adSourceNameForEvents, "adSourceNameForEvents");
        kotlin.jvm.internal.n.f(instanceType, "instanceType");
        kotlin.jvm.internal.n.f(providerName, "providerName");
        this.f30709a = adSourceNameForEvents;
        this.f30710b = instanceType;
        this.f30711c = z10;
        this.f30712d = providerName;
        this.f30713e = j10;
    }

    public final String a() {
        return this.f30709a;
    }

    public final EnumC0515p9 b() {
        return this.f30710b;
    }

    public final boolean c() {
        return this.f30711c;
    }

    public final String d() {
        return this.f30712d;
    }

    public final long e() {
        return this.f30713e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0576t)) {
            return false;
        }
        C0576t c0576t = (C0576t) obj;
        return kotlin.jvm.internal.n.a(this.f30709a, c0576t.f30709a) && this.f30710b == c0576t.f30710b && this.f30711c == c0576t.f30711c && kotlin.jvm.internal.n.a(this.f30712d, c0576t.f30712d) && this.f30713e == c0576t.f30713e;
    }

    public final String f() {
        return this.f30709a;
    }

    public final EnumC0515p9 g() {
        return this.f30710b;
    }

    public final long h() {
        return this.f30713e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public int hashCode() {
        int iHashCode = (this.f30710b.hashCode() + (this.f30709a.hashCode() * 31)) * 31;
        boolean z10 = this.f30711c;
        ?? r0 = z10;
        if (z10) {
            r0 = 1;
        }
        return Long.hashCode(this.f30713e) + d5.u.e((iHashCode + r0) * 31, 31, this.f30712d);
    }

    public final String i() {
        return this.f30712d;
    }

    public final boolean j() {
        return this.f30711c;
    }

    public String toString() {
        String str = this.f30709a;
        EnumC0515p9 enumC0515p9 = this.f30710b;
        boolean z10 = this.f30711c;
        String str2 = this.f30712d;
        long j10 = this.f30713e;
        StringBuilder sb2 = new StringBuilder("AdFormatConfig(adSourceNameForEvents=");
        sb2.append(str);
        sb2.append(", instanceType=");
        sb2.append(enumC0515p9);
        sb2.append(", isOneFlow=");
        sb2.append(z10);
        sb2.append(", providerName=");
        sb2.append(str2);
        sb2.append(", loadTimeoutInMillis=");
        return defpackage.e.r(sb2, j10, ")");
    }

    public final C0576t a(String adSourceNameForEvents, EnumC0515p9 instanceType, boolean z10, String providerName, long j10) {
        kotlin.jvm.internal.n.f(adSourceNameForEvents, "adSourceNameForEvents");
        kotlin.jvm.internal.n.f(instanceType, "instanceType");
        kotlin.jvm.internal.n.f(providerName, "providerName");
        return new C0576t(adSourceNameForEvents, instanceType, z10, providerName, j10);
    }

    public static /* synthetic */ C0576t a(C0576t c0576t, String str, EnumC0515p9 enumC0515p9, boolean z10, String str2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0576t.f30709a;
        }
        if ((i10 & 2) != 0) {
            enumC0515p9 = c0576t.f30710b;
        }
        if ((i10 & 4) != 0) {
            z10 = c0576t.f30711c;
        }
        if ((i10 & 8) != 0) {
            str2 = c0576t.f30712d;
        }
        if ((i10 & 16) != 0) {
            j10 = c0576t.f30713e;
        }
        long j11 = j10;
        return c0576t.a(str, enumC0515p9, z10, str2, j11);
    }
}
