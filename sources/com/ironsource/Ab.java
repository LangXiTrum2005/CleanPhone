package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ab {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25639c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f25640d = "revenue";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f25641e = "precision";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f25642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25643b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Ab a(JSONObject json) {
            kotlin.jvm.internal.n.f(json, "json");
            try {
                double d10 = json.getDouble("revenue");
                String precision = json.getString("precision");
                kotlin.jvm.internal.n.e(precision, "precision");
                return new Ab(d10, precision);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                If.a(e10);
                return null;
            }
        }

        private a() {
        }
    }

    public Ab(double d10, String precision) {
        kotlin.jvm.internal.n.f(precision, "precision");
        this.f25642a = d10;
        this.f25643b = precision;
    }

    public final double a() {
        return this.f25642a;
    }

    public final String b() {
        return this.f25643b;
    }

    public final String c() {
        return this.f25643b;
    }

    public final double d() {
        return this.f25642a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ab)) {
            return false;
        }
        Ab ab2 = (Ab) obj;
        return Double.compare(this.f25642a, ab2.f25642a) == 0 && kotlin.jvm.internal.n.a(this.f25643b, ab2.f25643b);
    }

    public int hashCode() {
        return this.f25643b.hashCode() + (Double.hashCode(this.f25642a) * 31);
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.f25642a + ", precision=" + this.f25643b + ")";
    }

    public final Ab a(double d10, String precision) {
        kotlin.jvm.internal.n.f(precision, "precision");
        return new Ab(d10, precision);
    }

    public static /* synthetic */ Ab a(Ab ab2, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = ab2.f25642a;
        }
        if ((i10 & 2) != 0) {
            str = ab2.f25643b;
        }
        return ab2.a(d10, str);
    }

    public static final Ab a(JSONObject jSONObject) {
        return f25639c.a(jSONObject);
    }
}
