package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0652x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31025c;

    public C0652x3(String cachedAppKey, String cachedUserId, String cachedSettings) {
        kotlin.jvm.internal.n.f(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.n.f(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.n.f(cachedSettings, "cachedSettings");
        this.f31023a = cachedAppKey;
        this.f31024b = cachedUserId;
        this.f31025c = cachedSettings;
    }

    public final String a() {
        return this.f31023a;
    }

    public final String b() {
        return this.f31024b;
    }

    public final String c() {
        return this.f31025c;
    }

    public final String d() {
        return this.f31023a;
    }

    public final String e() {
        return this.f31025c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0652x3)) {
            return false;
        }
        C0652x3 c0652x3 = (C0652x3) obj;
        return kotlin.jvm.internal.n.a(this.f31023a, c0652x3.f31023a) && kotlin.jvm.internal.n.a(this.f31024b, c0652x3.f31024b) && kotlin.jvm.internal.n.a(this.f31025c, c0652x3.f31025c);
    }

    public final String f() {
        return this.f31024b;
    }

    public int hashCode() {
        return this.f31025c.hashCode() + d5.u.e(this.f31023a.hashCode() * 31, 31, this.f31024b);
    }

    public String toString() {
        return defpackage.e.q(this.f31025c, ")", defpackage.e.v("CachedResponse(cachedAppKey=", this.f31023a, ", cachedUserId=", this.f31024b, ", cachedSettings="));
    }

    public final C0652x3 a(String cachedAppKey, String cachedUserId, String cachedSettings) {
        kotlin.jvm.internal.n.f(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.n.f(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.n.f(cachedSettings, "cachedSettings");
        return new C0652x3(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f31025c = str;
    }

    public final void c(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f31024b = str;
    }

    public static /* synthetic */ C0652x3 a(C0652x3 c0652x3, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0652x3.f31023a;
        }
        if ((i10 & 2) != 0) {
            str2 = c0652x3.f31024b;
        }
        if ((i10 & 4) != 0) {
            str3 = c0652x3.f31025c;
        }
        return c0652x3.a(str, str2, str3);
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f31023a = str;
    }
}
