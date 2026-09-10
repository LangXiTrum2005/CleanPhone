package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 {
    public static final a d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c6 f14062e;
    public static final c6 f;
    public static final c6 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h2 f14063h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6 f14064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6 f14065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c6 f14066c;

    public static final class a {
        public a() {
        }

        public final h2 a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            c6.a aVar = c6.f13584c;
            c6 c6VarA = aVar.a(jSONObject.optJSONObject("margin"));
            if (c6VarA == null) {
                c6VarA = h2.f14062e;
            }
            c6 c6VarA2 = aVar.a(jSONObject.optJSONObject("padding"));
            if (c6VarA2 == null) {
                c6VarA2 = h2.f;
            }
            c6 c6VarA3 = aVar.a(jSONObject.optJSONObject("size"));
            if (c6VarA3 == null) {
                c6VarA3 = h2.g;
            }
            return new h2(c6VarA, c6VarA2, c6VarA3);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h2 a() {
            return h2.f14063h;
        }
    }

    static {
        c6 c6Var = new c6(0, 0);
        f14062e = c6Var;
        c6 c6Var2 = new c6(8, 8);
        f = c6Var2;
        c6 c6Var3 = new c6(28, 28);
        g = c6Var3;
        f14063h = new h2(c6Var, c6Var2, c6Var3);
    }

    public h2(c6 margin, c6 padding, c6 size) {
        Intrinsics.f(margin, "margin");
        Intrinsics.f(padding, "padding");
        Intrinsics.f(size, "size");
        this.f14064a = margin;
        this.f14065b = padding;
        this.f14066c = size;
    }

    public final c6 e() {
        return this.f14064a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return Intrinsics.a(this.f14064a, h2Var.f14064a) && Intrinsics.a(this.f14065b, h2Var.f14065b) && Intrinsics.a(this.f14066c, h2Var.f14066c);
    }

    public final c6 f() {
        return this.f14065b;
    }

    public final c6 g() {
        return this.f14066c;
    }

    public int hashCode() {
        return this.f14066c.hashCode() + ((this.f14065b.hashCode() + (this.f14064a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ButtonAttributes(margin=" + this.f14064a + ", padding=" + this.f14065b + ", size=" + this.f14066c + ")";
    }
}
