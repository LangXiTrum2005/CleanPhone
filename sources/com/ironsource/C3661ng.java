package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3661ng {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public C3661ng(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3661ng)) {
            return false;
        }
        C3661ng c3661ng = (C3661ng) obj;
        return this.a == c3661ng.a && this.b == c3661ng.b && this.c == c3661ng.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C3474d8.k, this.a).put(C3474d8.l, this.b).put(C3474d8.m, this.c);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.b;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.c;
        return i2 + (z3 ? 1 : z3);
    }

    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.a + ", isWindowVisible=" + this.b + ", isShown=" + this.c + ")";
    }

    public final C3661ng a(boolean z, boolean z2, boolean z3) {
        return new C3661ng(z, z2, z3);
    }

    public static /* synthetic */ C3661ng a(C3661ng c3661ng, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c3661ng.a;
        }
        if ((i & 2) != 0) {
            z2 = c3661ng.b;
        }
        if ((i & 4) != 0) {
            z3 = c3661ng.c;
        }
        return c3661ng.a(z, z2, z3);
    }
}
