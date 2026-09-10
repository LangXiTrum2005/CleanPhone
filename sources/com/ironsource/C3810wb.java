package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3810wb {
    public static final a c = new a(null);
    public static final String d = "revenue";
    public static final String e = "precision";
    private final double a;
    private final String b;

    /* JADX INFO: renamed from: com.ironsource.wb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3810wb a(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new C3810wb(d, precision);
            } catch (Exception e) {
                C3631m4.d().a(e);
                C3746sf.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public C3810wb(double d2, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.a = d2;
        this.b = precision;
    }

    public final double a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final double d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3810wb)) {
            return false;
        }
        C3810wb c3810wb = (C3810wb) obj;
        return Double.compare(this.a, c3810wb.a) == 0 && Intrinsics.wireman(this.b, c3810wb.b);
    }

    public int hashCode() {
        return (Double.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.a + ", precision=" + this.b + ")";
    }

    public final C3810wb a(double d2, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new C3810wb(d2, precision);
    }

    public static /* synthetic */ C3810wb a(C3810wb c3810wb, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = c3810wb.a;
        }
        if ((i & 2) != 0) {
            str = c3810wb.b;
        }
        return c3810wb.a(d2, str);
    }

    public static final C3810wb a(JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
