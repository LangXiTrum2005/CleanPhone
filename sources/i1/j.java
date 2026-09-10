package i1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f42556c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42557a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42558b = 0;

    static {
        l1.y.G(0);
        l1.y.G(1);
        l1.y.G(2);
        l1.y.G(3);
    }

    public j(w0 w0Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f42557a == jVar.f42557a && this.f42558b == jVar.f42558b;
    }

    public final int hashCode() {
        return (((16337 + this.f42557a) * 31) + this.f42558b) * 31;
    }
}
