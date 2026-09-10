package i2;

import i1.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f42827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f42828b;

    public q(int i10, q0 q0Var, int[] iArr) {
        if (iArr.length == 0) {
            l1.a.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f42827a = q0Var;
        this.f42828b = iArr;
    }
}
