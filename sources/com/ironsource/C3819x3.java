package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3819x3 {
    private String a;
    private String b;
    private String c;

    public C3819x3(String cachedAppKey, String cachedUserId, String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.a = cachedAppKey;
        this.b = cachedUserId;
        this.c = cachedSettings;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3819x3)) {
            return false;
        }
        C3819x3 c3819x3 = (C3819x3) obj;
        return Intrinsics.wireman(this.a, c3819x3.a) && Intrinsics.wireman(this.b, c3819x3.b) && Intrinsics.wireman(this.c, c3819x3.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.a + ", cachedUserId=" + this.b + ", cachedSettings=" + this.c + ")";
    }

    public final C3819x3 a(String cachedAppKey, String cachedUserId, String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new C3819x3(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public static /* synthetic */ C3819x3 a(C3819x3 c3819x3, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3819x3.a;
        }
        if ((i & 2) != 0) {
            str2 = c3819x3.b;
        }
        if ((i & 4) != 0) {
            str3 = c3819x3.c;
        }
        return c3819x3.a(str, str2, str3);
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a = str;
    }
}
