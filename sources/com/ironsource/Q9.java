package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27091b;

    public Q9(String advId, String advIdType) {
        kotlin.jvm.internal.n.f(advId, "advId");
        kotlin.jvm.internal.n.f(advIdType, "advIdType");
        this.f27090a = advId;
        this.f27091b = advIdType;
    }

    public final String a() {
        return this.f27090a;
    }

    public final String b() {
        return this.f27091b;
    }

    public final String c() {
        return this.f27090a;
    }

    public final String d() {
        return this.f27091b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q9)) {
            return false;
        }
        Q9 q10 = (Q9) obj;
        return kotlin.jvm.internal.n.a(this.f27090a, q10.f27090a) && kotlin.jvm.internal.n.a(this.f27091b, q10.f27091b);
    }

    public int hashCode() {
        return this.f27091b.hashCode() + (this.f27090a.hashCode() * 31);
    }

    public String toString() {
        return l1.d.h("IronSourceAdvId(advId=", this.f27090a, ", advIdType=", this.f27091b, ")");
    }

    public final Q9 a(String advId, String advIdType) {
        kotlin.jvm.internal.n.f(advId, "advId");
        kotlin.jvm.internal.n.f(advIdType, "advIdType");
        return new Q9(advId, advIdType);
    }

    public static /* synthetic */ Q9 a(Q9 q10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = q10.f27090a;
        }
        if ((i10 & 2) != 0) {
            str2 = q10.f27091b;
        }
        return q10.a(str, str2);
    }
}
