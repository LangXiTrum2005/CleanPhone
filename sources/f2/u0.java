package f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40466b;

    public u0(int i10, boolean z10) {
        this.f40465a = i10;
        this.f40466b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f40465a == u0Var.f40465a && this.f40466b == u0Var.f40466b;
    }

    public final int hashCode() {
        return (this.f40465a * 31) + (this.f40466b ? 1 : 0);
    }
}
