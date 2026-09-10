package q8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f48890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f48891b;

    public v(h0 h0Var, g0 g0Var) {
        this.f48890a = h0Var;
        this.f48891b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f48890a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f48890a) : ((v) i0Var).f48890a == null) {
                g0 g0Var = this.f48891b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f48891b) : ((v) i0Var).f48891b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.f48890a;
        int iHashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.f48891b;
        return iHashCode ^ (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f48890a + ", mobileSubtype=" + this.f48891b + "}";
    }
}
