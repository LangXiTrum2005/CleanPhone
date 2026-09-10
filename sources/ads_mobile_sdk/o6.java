package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class o6 {
    public boolean a;
    public String b;
    public String c;

    public /* synthetic */ o6() {
        this(false, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return this.a == o6Var.a && Intrinsics.wireman(this.b, o6Var.b) && Intrinsics.wireman(this.c, o6Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.c.hashCode() + licking.attabal(this.b, r0 * 31, 31);
    }

    public final String toString() {
        return "AdTraceMeta(impressionEarned=" + this.a + ", adTraceId=" + this.b + ", backendQueryId=" + this.c + ")";
    }

    public o6(boolean z, String adTraceId, String backendQueryId) {
        Intrinsics.checkNotNullParameter(adTraceId, "adTraceId");
        Intrinsics.checkNotNullParameter(backendQueryId, "backendQueryId");
        this.a = z;
        this.b = adTraceId;
        this.c = backendQueryId;
    }
}
