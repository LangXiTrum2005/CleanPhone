package ads_mobile_sdk;

import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    public final int a;
    public final int b;
    public final boolean c;

    public n1(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.a == n1Var.a && this.b == n1Var.b && this.c == n1Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iAttabal = bonny.attabal(this.b, Integer.hashCode(this.a) * 31, 31);
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iAttabal + r1;
    }

    public final String toString() {
        return "AdDimensions(width=" + this.a + ", height=" + this.b + ", isFluidHeight=" + this.c + ")";
    }
}
