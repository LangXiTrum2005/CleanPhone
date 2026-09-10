package i2;

import i1.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f42797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1.p f42799d;

    public n(int i10, q0 q0Var, int i11) {
        this.f42796a = i10;
        this.f42797b = q0Var;
        this.f42798c = i11;
        this.f42799d = q0Var.f42662d[i11];
    }

    public abstract int a();

    public abstract boolean b(n nVar);
}
