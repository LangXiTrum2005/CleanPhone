package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3547h9 {
    private final String a;
    private final String b;
    private final EnumC3582j9 c;
    private final JSONObject d;

    public C3547h9(String url, String storePackage, EnumC3582j9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = url;
        this.b = storePackage;
        this.c = strategy;
        this.d = jSONObject;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final EnumC3582j9 c() {
        return this.c;
    }

    public final JSONObject d() {
        return this.d;
    }

    public final JSONObject e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3547h9)) {
            return false;
        }
        C3547h9 c3547h9 = (C3547h9) obj;
        return Intrinsics.wireman(this.a, c3547h9.a) && Intrinsics.wireman(this.b, c3547h9.b) && this.c == c3547h9.c && Intrinsics.wireman(this.d, c3547h9.d);
    }

    public final String f() {
        return this.b;
    }

    public final EnumC3582j9 g() {
        return this.c;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        JSONObject jSONObject = this.d;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "InlineStoreRequest(url=" + this.a + ", storePackage=" + this.b + ", strategy=" + this.c + ", extras=" + this.d + ")";
    }

    public final C3547h9 a(String url, String storePackage, EnumC3582j9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new C3547h9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ C3547h9 a(C3547h9 c3547h9, String str, String str2, EnumC3582j9 enumC3582j9, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3547h9.a;
        }
        if ((i & 2) != 0) {
            str2 = c3547h9.b;
        }
        if ((i & 4) != 0) {
            enumC3582j9 = c3547h9.c;
        }
        if ((i & 8) != 0) {
            jSONObject = c3547h9.d;
        }
        return c3547h9.a(str, str2, enumC3582j9, jSONObject);
    }

    public /* synthetic */ C3547h9(String str, String str2, EnumC3582j9 enumC3582j9, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EnumC3582j9.APP_ACTIVITY : enumC3582j9, (i & 8) != 0 ? null : jSONObject);
    }
}
