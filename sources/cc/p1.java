package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f6221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f6222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f6223c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f6221a = q1Var;
        this.f6222b = s1Var;
        this.f6223c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f6221a.equals(p1Var.f6221a) && this.f6222b.equals(p1Var.f6222b) && this.f6223c.equals(p1Var.f6223c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6223c.hashCode() ^ ((((this.f6221a.hashCode() ^ 1000003) * 1000003) ^ this.f6222b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f6221a + ", osData=" + this.f6222b + ", deviceData=" + this.f6223c + "}";
    }
}
