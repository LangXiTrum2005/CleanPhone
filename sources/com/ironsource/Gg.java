package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26206c;

    public Gg(boolean z10, boolean z11, boolean z12) {
        this.f26204a = z10;
        this.f26205b = z11;
        this.f26206c = z12;
    }

    public final boolean a() {
        return this.f26204a;
    }

    public final boolean b() {
        return this.f26205b;
    }

    public final boolean c() {
        return this.f26206c;
    }

    public final boolean d() {
        return this.f26206c;
    }

    public final boolean e() {
        return this.f26204a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gg)) {
            return false;
        }
        Gg gg2 = (Gg) obj;
        return this.f26204a == gg2.f26204a && this.f26205b == gg2.f26205b && this.f26206c == gg2.f26206c;
    }

    public final boolean f() {
        return this.f26205b;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C0335f8.f28653k, this.f26204a).put(C0335f8.l, this.f26205b).put(C0335f8.f28654m, this.f26206c);
        kotlin.jvm.internal.n.e(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
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
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        boolean z10 = this.f26204a;
        ?? r0 = z10;
        if (z10) {
            r0 = 1;
        }
        int i10 = r0 * 31;
        boolean z11 = this.f26205b;
        ?? r2 = z11;
        if (z11) {
            r2 = 1;
        }
        int i11 = (i10 + r2) * 31;
        boolean z12 = this.f26206c;
        return i11 + (z12 ? 1 : z12);
    }

    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f26204a + ", isWindowVisible=" + this.f26205b + ", isShown=" + this.f26206c + ")";
    }

    public final Gg a(boolean z10, boolean z11, boolean z12) {
        return new Gg(z10, z11, z12);
    }

    public static /* synthetic */ Gg a(Gg gg2, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = gg2.f26204a;
        }
        if ((i10 & 2) != 0) {
            z11 = gg2.f26205b;
        }
        if ((i10 & 4) != 0) {
            z12 = gg2.f26206c;
        }
        return gg2.a(z10, z11, z12);
    }
}
