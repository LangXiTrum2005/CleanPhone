package i1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f42700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f42702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f42703e;

    static {
        l1.y.G(0);
        l1.y.G(1);
        l1.y.G(3);
        l1.y.G(4);
    }

    public u0(q0 q0Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = q0Var.f42659a;
        this.f42699a = i10;
        boolean z11 = false;
        go.k.i(i10 == iArr.length && i10 == zArr.length);
        this.f42700b = q0Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f42701c = z11;
        this.f42702d = (int[]) iArr.clone();
        this.f42703e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f42701c == u0Var.f42701c && this.f42700b.equals(u0Var.f42700b) && Arrays.equals(this.f42702d, u0Var.f42702d) && Arrays.equals(this.f42703e, u0Var.f42703e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42703e) + ((Arrays.hashCode(this.f42702d) + (((this.f42700b.hashCode() * 31) + (this.f42701c ? 1 : 0)) * 31)) * 31);
    }
}
