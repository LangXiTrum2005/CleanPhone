package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/cn;", "", "", "a", "", "b", "revenue", "precision", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "D", "d", "()D", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(DLjava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class cn {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String d = "revenue";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24556e = "precision";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double revenue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String precision;

    /* JADX INFO: renamed from: com.ironsource.cn$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/cn$a;", "", "Lorg/json/JSONObject;", "json", "Lcom/ironsource/cn;", "a", "", "LOAD_ARM_DATA_KEY_PRECISION", "Ljava/lang/String;", "LOAD_ARM_DATA_KEY_REVENUE", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final cn a(JSONObject json) {
            Intrinsics.f(json, "json");
            try {
                double d = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.e(precision, "precision");
                return new cn(d, precision);
            } catch (Exception e2) {
                q9.d().a(e2);
                av.a(e2);
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public cn(double d2, String precision) {
        Intrinsics.f(precision, "precision");
        this.revenue = d2;
        this.precision = precision;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getRevenue() {
        return this.revenue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPrecision() {
        return this.precision;
    }

    public final String c() {
        return this.precision;
    }

    public final double d() {
        return this.revenue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) other;
        return Double.compare(this.revenue, cnVar.revenue) == 0 && Intrinsics.a(this.precision, cnVar.precision);
    }

    public int hashCode() {
        return this.precision.hashCode() + (Double.hashCode(this.revenue) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadArmData(revenue=");
        sb.append(this.revenue);
        sb.append(", precision=");
        return a.p(sb, this.precision, ')');
    }

    public final cn a(double revenue, String precision) {
        Intrinsics.f(precision, "precision");
        return new cn(revenue, precision);
    }

    public static /* synthetic */ cn a(cn cnVar, double d2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = cnVar.revenue;
        }
        if ((i2 & 2) != 0) {
            str = cnVar.precision;
        }
        return cnVar.a(d2, str);
    }

    @JvmStatic
    public static final cn a(JSONObject jSONObject) {
        return INSTANCE.a(jSONObject);
    }
}
