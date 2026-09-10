package p1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f47978c = new c1(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47980b;

    public c1(int i10, boolean z10) {
        this.f47979a = i10;
        this.f47980b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f47979a == c1Var.f47979a && this.f47980b == c1Var.f47980b;
    }

    public final int hashCode() {
        return (this.f47979a << 1) + (this.f47980b ? 1 : 0);
    }
}
