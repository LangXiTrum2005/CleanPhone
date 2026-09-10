package ads_mobile_sdk;

import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class os1 {
    public final int a;
    public final int b;
    public final boolean c;
    public final double d;

    public os1(int i, int i2, boolean z, double d) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os1)) {
            return false;
        }
        os1 os1Var = (os1) obj;
        return this.a == os1Var.a && this.b == os1Var.b && this.c == os1Var.c && Double.compare(this.d, os1Var.d) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iAttabal = bonny.attabal(this.b, Integer.hashCode(this.a) * 31, 31);
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return Double.hashCode(this.d) + ((iAttabal + r2) * 31);
    }

    public final String toString() {
        return "NetworkPingStrategy(maxAttempts=" + this.a + ", initialBackoffMs=" + this.b + ", bufferAfterMaxAttempts=" + this.c + ", backoffMultiplier=" + this.d + ")";
    }
}
