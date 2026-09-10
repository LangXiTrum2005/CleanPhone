package ads_mobile_sdk;

import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class xi2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public xi2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi2)) {
            return false;
        }
        xi2 xi2Var = (xi2) obj;
        return this.a == xi2Var.a && this.b == xi2Var.b && this.c == xi2Var.c && this.d == xi2Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bonny.attabal(this.c, bonny.attabal(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "RoundedCornerRadii(topLeft=" + this.a + ", topRight=" + this.b + ", bottomRight=" + this.c + ", bottomLeft=" + this.d + ")";
    }
}
