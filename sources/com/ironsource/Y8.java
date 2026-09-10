package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private X f27998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28001f;

    public Y8(String appKey, String userId) {
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(userId, "userId");
        this.f27996a = appKey;
        this.f27997b = userId;
    }

    public final String a() {
        return this.f27996a;
    }

    public final String b() {
        return this.f27997b;
    }

    public final boolean c() {
        return this.f27999d;
    }

    public final String d() {
        return this.f27996a;
    }

    public final X e() {
        return this.f27998c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y8)) {
            return false;
        }
        Y8 y10 = (Y8) obj;
        return kotlin.jvm.internal.n.a(this.f27996a, y10.f27996a) && kotlin.jvm.internal.n.a(this.f27997b, y10.f27997b);
    }

    public final String f() {
        return this.f28001f;
    }

    public final String g() {
        return this.f28000e;
    }

    public final String h() {
        return this.f27997b;
    }

    public int hashCode() {
        return this.f27997b.hashCode() + (this.f27996a.hashCode() * 31);
    }

    public String toString() {
        return l1.d.h("InitConfig(appKey=", this.f27996a, ", userId=", this.f27997b, ")");
    }

    public final Y8 a(String appKey, String userId) {
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(userId, "userId");
        return new Y8(appKey, userId);
    }

    public final void b(String str) {
        this.f28000e = str;
    }

    public static /* synthetic */ Y8 a(Y8 y10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = y10.f27996a;
        }
        if ((i10 & 2) != 0) {
            str2 = y10.f27997b;
        }
        return y10.a(str, str2);
    }

    public final void a(X x10) {
        this.f27998c = x10;
    }

    public final void a(boolean z10) {
        this.f27999d = z10;
    }

    public final void a(String str) {
        this.f28001f = str;
    }

    public final <T> T a(Jb<Y8, T> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }
}
