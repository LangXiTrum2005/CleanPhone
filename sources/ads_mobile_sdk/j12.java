package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j12 {
    public final ir0 a;
    public final boolean b;
    public final boolean c;

    public j12(ir0 paidV2Info, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(paidV2Info, "paidV2Info");
        this.a = paidV2Info;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j12)) {
            return false;
        }
        j12 j12Var = (j12) obj;
        return Intrinsics.wireman(this.a, j12Var.a) && this.b == j12Var.b && this.c == j12Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.c;
        return i + (z2 ? 1 : z2);
    }

    public final String toString() {
        return "PerAppIdV2(paidV2Info=" + this.a + ", pubOption=" + this.b + ", userOption=" + this.c + ")";
    }
}
