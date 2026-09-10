package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0407j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC0443l9 f28991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f28992d;

    public C0407j9(String url, String storePackage, EnumC0443l9 strategy, JSONObject jSONObject) {
        kotlin.jvm.internal.n.f(url, "url");
        kotlin.jvm.internal.n.f(storePackage, "storePackage");
        kotlin.jvm.internal.n.f(strategy, "strategy");
        this.f28989a = url;
        this.f28990b = storePackage;
        this.f28991c = strategy;
        this.f28992d = jSONObject;
    }

    public final String a() {
        return this.f28989a;
    }

    public final String b() {
        return this.f28990b;
    }

    public final EnumC0443l9 c() {
        return this.f28991c;
    }

    public final JSONObject d() {
        return this.f28992d;
    }

    public final JSONObject e() {
        return this.f28992d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0407j9)) {
            return false;
        }
        C0407j9 c0407j9 = (C0407j9) obj;
        return kotlin.jvm.internal.n.a(this.f28989a, c0407j9.f28989a) && kotlin.jvm.internal.n.a(this.f28990b, c0407j9.f28990b) && this.f28991c == c0407j9.f28991c && kotlin.jvm.internal.n.a(this.f28992d, c0407j9.f28992d);
    }

    public final String f() {
        return this.f28990b;
    }

    public final EnumC0443l9 g() {
        return this.f28991c;
    }

    public final String h() {
        return this.f28989a;
    }

    public int hashCode() {
        int iHashCode = (this.f28991c.hashCode() + d5.u.e(this.f28989a.hashCode() * 31, 31, this.f28990b)) * 31;
        JSONObject jSONObject = this.f28992d;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        String str = this.f28989a;
        String str2 = this.f28990b;
        EnumC0443l9 enumC0443l9 = this.f28991c;
        JSONObject jSONObject = this.f28992d;
        StringBuilder sbV = defpackage.e.v("InlineStoreRequest(url=", str, ", storePackage=", str2, ", strategy=");
        sbV.append(enumC0443l9);
        sbV.append(", extras=");
        sbV.append(jSONObject);
        sbV.append(")");
        return sbV.toString();
    }

    public final C0407j9 a(String url, String storePackage, EnumC0443l9 strategy, JSONObject jSONObject) {
        kotlin.jvm.internal.n.f(url, "url");
        kotlin.jvm.internal.n.f(storePackage, "storePackage");
        kotlin.jvm.internal.n.f(strategy, "strategy");
        return new C0407j9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ C0407j9 a(C0407j9 c0407j9, String str, String str2, EnumC0443l9 enumC0443l9, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0407j9.f28989a;
        }
        if ((i10 & 2) != 0) {
            str2 = c0407j9.f28990b;
        }
        if ((i10 & 4) != 0) {
            enumC0443l9 = c0407j9.f28991c;
        }
        if ((i10 & 8) != 0) {
            jSONObject = c0407j9.f28992d;
        }
        return c0407j9.a(str, str2, enumC0443l9, jSONObject);
    }

    public /* synthetic */ C0407j9(String str, String str2, EnumC0443l9 enumC0443l9, JSONObject jSONObject, int i10, kotlin.jvm.internal.g gVar) {
        this(str, str2, (i10 & 4) != 0 ? EnumC0443l9.APP_ACTIVITY : enumC0443l9, (i10 & 8) != 0 ? null : jSONObject);
    }
}
