package l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f44816c = new r(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44818b;

    static {
        new r(0, 0);
        y.G(0);
        y.G(1);
    }

    public r(int i10, int i11) {
        go.k.i((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f44817a = i10;
        this.f44818b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f44817a == rVar.f44817a && this.f44818b == rVar.f44818b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f44817a;
        int i11 = i10 << 16;
        return this.f44818b ^ ((i10 >>> 16) | i11);
    }

    public final String toString() {
        return this.f44817a + "x" + this.f44818b;
    }
}
