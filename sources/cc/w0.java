package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f6321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f6322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1 f6323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0 f6324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6325f;

    public w0(List list, e2 e2Var, u1 u1Var, z1 z1Var, z0 z0Var, List list2) {
        this.f6320a = list;
        this.f6321b = e2Var;
        this.f6322c = u1Var;
        this.f6323d = z1Var;
        this.f6324e = z0Var;
        this.f6325f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        List list = this.f6320a;
        if (list == null) {
            if (((w0) i2Var).f6320a != null) {
                return false;
            }
        } else if (!list.equals(((w0) i2Var).f6320a)) {
            return false;
        }
        e2 e2Var = this.f6321b;
        if (e2Var == null) {
            if (((w0) i2Var).f6321b != null) {
                return false;
            }
        } else if (!e2Var.equals(((w0) i2Var).f6321b)) {
            return false;
        }
        u1 u1Var = this.f6322c;
        if (u1Var == null) {
            if (((w0) i2Var).f6322c != null) {
                return false;
            }
        } else if (!u1Var.equals(((w0) i2Var).f6322c)) {
            return false;
        }
        z1 z1Var = this.f6323d;
        if (z1Var == null) {
            if (((w0) i2Var).f6323d != null) {
                return false;
            }
        } else if (!z1Var.equals(((w0) i2Var).f6323d)) {
            return false;
        }
        w0 w0Var = (w0) i2Var;
        return this.f6324e.equals(w0Var.f6324e) && this.f6325f.equals(w0Var.f6325f);
    }

    public final int hashCode() {
        List list = this.f6320a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        e2 e2Var = this.f6321b;
        int iHashCode2 = (iHashCode ^ (e2Var == null ? 0 : e2Var.hashCode())) * 1000003;
        u1 u1Var = this.f6322c;
        int iHashCode3 = (iHashCode2 ^ (u1Var == null ? 0 : u1Var.hashCode())) * 1000003;
        z1 z1Var = this.f6323d;
        return this.f6325f.hashCode() ^ (((((z1Var != null ? z1Var.hashCode() : 0) ^ iHashCode3) * 1000003) ^ this.f6324e.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.f6320a + ", exception=" + this.f6321b + ", appExitInfo=" + this.f6322c + ", profilingManagerInfo=" + this.f6323d + ", signal=" + this.f6324e + ", binaries=" + this.f6325f + "}";
    }
}
