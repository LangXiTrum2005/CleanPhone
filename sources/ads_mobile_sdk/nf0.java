package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class nf0 {
    public final Throwable a;
    public final String b;
    public final l13 c;
    public final boolean d;
    public final long e;

    public nf0(Throwable exception, String label, l13 l13Var, boolean z, long j) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(label, "label");
        this.a = exception;
        this.b = label;
        this.c = l13Var;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf0)) {
            return false;
        }
        nf0 nf0Var = (nf0) obj;
        return Intrinsics.wireman(this.a, nf0Var.a) && Intrinsics.wireman(this.b, nf0Var.b) && Intrinsics.wireman(this.c, nf0Var.c) && this.d == nf0Var.d && this.e == nf0Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        int iAttabal = licking.attabal(this.b, this.a.hashCode() * 31, 31);
        l13 l13Var = this.c;
        int iHashCode = (iAttabal + (l13Var == null ? 0 : l13Var.hashCode())) * 31;
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return Long.hashCode(this.e) + ((iHashCode + r2) * 31);
    }

    public final String toString() {
        return "ExceptionSnapshot(exception=" + this.a + ", label=" + this.b + ", activeTraceMeta=" + this.c + ", trapped=" + this.d + ", timeMilliseconds=" + this.e + ")";
    }
}
