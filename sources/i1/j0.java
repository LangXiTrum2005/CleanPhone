package i1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f42561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f42562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f42564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f42565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f42567i;

    static {
        d5.u.m(0, 1, 2, 3, 4);
        l1.y.G(5);
        l1.y.G(6);
    }

    public j0(Object obj, int i10, y yVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        go.k.i(i10 >= 0);
        go.k.i(i11 >= 0);
        this.f42559a = obj;
        this.f42560b = i10;
        this.f42561c = yVar;
        this.f42562d = obj2;
        this.f42563e = i11;
        this.f42564f = j10;
        this.f42565g = j11;
        this.f42566h = i12;
        this.f42567i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (this.f42560b == j0Var.f42560b && this.f42563e == j0Var.f42563e && this.f42564f == j0Var.f42564f && this.f42565g == j0Var.f42565g && this.f42566h == j0Var.f42566h && this.f42567i == j0Var.f42567i && Objects.equals(this.f42561c, j0Var.f42561c) && Objects.equals(this.f42559a, j0Var.f42559a) && Objects.equals(this.f42562d, j0Var.f42562d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42559a, Integer.valueOf(this.f42560b), this.f42561c, this.f42562d, Integer.valueOf(this.f42563e), Long.valueOf(this.f42564f), Long.valueOf(this.f42565g), Integer.valueOf(this.f42566h), Integer.valueOf(this.f42567i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f42560b + ", period=" + this.f42563e + ", pos=" + this.f42564f;
        int i10 = this.f42566h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder sbJ = d5.u.j(str, ", contentPos=");
        sbJ.append(this.f42565g);
        sbJ.append(", adGroup=");
        sbJ.append(i10);
        sbJ.append(", ad=");
        sbJ.append(this.f42567i);
        return sbJ.toString();
    }
}
