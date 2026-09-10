package qk;

import tk.k1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f49102c = new a0(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f49103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f49104b;

    public a0(b0 b0Var, k1 k1Var) {
        String str;
        this.f49103a = b0Var;
        this.f49104b = k1Var;
        if ((b0Var == null) == (k1Var == null)) {
            return;
        }
        if (b0Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + b0Var + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f49103a == a0Var.f49103a && kotlin.jvm.internal.n.a(this.f49104b, a0Var.f49104b);
    }

    public final int hashCode() {
        b0 b0Var = this.f49103a;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        x xVar = this.f49104b;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        b0 b0Var = this.f49103a;
        int i10 = b0Var == null ? -1 : z.f49129a[b0Var.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        x xVar = this.f49104b;
        if (i10 == 1) {
            return String.valueOf(xVar);
        }
        if (i10 == 2) {
            return "in " + xVar;
        }
        if (i10 != 3) {
            throw new aa.b((byte) 0, 20);
        }
        return "out " + xVar;
    }
}
