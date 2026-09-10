package i1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z0 f42722d = new z0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f42725c;

    static {
        l1.y.G(0);
        l1.y.G(1);
        l1.y.G(3);
    }

    public z0(int i10, int i11) {
        this(1.0f, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f42723a == z0Var.f42723a && this.f42724b == z0Var.f42724b && this.f42725c == z0Var.f42725c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f42725c) + ((((217 + this.f42723a) * 31) + this.f42724b) * 31);
    }

    public z0(float f10, int i10, int i11) {
        this.f42723a = i10;
        this.f42724b = i11;
        this.f42725c = f10;
    }
}
