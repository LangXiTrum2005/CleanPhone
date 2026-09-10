package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 implements eliminate {
    public final String a;
    public final boolean b;

    public ra0(String creativePreviewToken, boolean z) {
        Intrinsics.checkNotNullParameter(creativePreviewToken, "creativePreviewToken");
        this.a = creativePreviewToken;
        this.b = z;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        if (this.a.length() > 0) {
            signals.creativeToken = this.a;
        }
        if (this.b) {
            signals.debugSignalsEnabled = "1";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0Var = (ra0) obj;
        return Intrinsics.wireman(this.a, ra0Var.a) && this.b == ra0Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "DebugSignal(creativePreviewToken=" + this.a + ", isTroubleshooting=" + this.b + ")";
    }
}
