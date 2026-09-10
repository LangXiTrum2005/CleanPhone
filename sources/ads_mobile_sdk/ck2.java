package ads_mobile_sdk;

import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class ck2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public /* synthetic */ ck2() {
        this("", "", false, false, adultoid.formularize());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck2)) {
            return false;
        }
        ck2 ck2Var = (ck2) obj;
        return Intrinsics.wireman(this.a, ck2Var.a) && Intrinsics.wireman(this.b, ck2Var.b) && this.c == ck2Var.c && this.d == ck2Var.d && Intrinsics.wireman(this.e, ck2Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int iAttabal = licking.attabal(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iAttabal + r2) * 31;
        boolean z2 = this.d;
        return this.e.hashCode() + ((i + (z2 ? 1 : z2)) * 31);
    }

    public final String toString() {
        return "SafeBrowsingConfig(clickString=" + this.a + ", reportUrl=" + this.b + ", nonMaliciousReportingEnabled=" + this.c + ", autoClickProtectionEnabled=" + this.d + ", allowedHeaders=" + this.e + ")";
    }

    public ck2(String clickString, String reportUrl, boolean z, boolean z2, List allowedHeaders) {
        Intrinsics.checkNotNullParameter(clickString, "clickString");
        Intrinsics.checkNotNullParameter(reportUrl, "reportUrl");
        Intrinsics.checkNotNullParameter(allowedHeaders, "allowedHeaders");
        this.a = clickString;
        this.b = reportUrl;
        this.c = z;
        this.d = z2;
        this.e = allowedHeaders;
    }
}
