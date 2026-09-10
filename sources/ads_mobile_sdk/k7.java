package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.PrecisionType;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k7 {
    public final m7 a;
    public final long b;
    public final PrecisionType c;
    public final String d;

    public k7(m7 type, long j, PrecisionType precisionType, String currencyCode) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(precisionType, "precisionType");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.a = type;
        this.b = j;
        this.c = precisionType;
        this.d = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.a == k7Var.a && this.b == k7Var.b && this.c == k7Var.c && Intrinsics.wireman(this.d, k7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((Long.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdValueParcel(type=" + this.a + ", valueMicros=" + this.b + ", precisionType=" + this.c + ", currencyCode=" + this.d + ")";
    }
}
