package lm;

import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vl.f f45591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3.i f45592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f45593c;

    public u(vl.f fVar, l3.i iVar, j0 j0Var) {
        this.f45591a = fVar;
        this.f45592b = iVar;
        this.f45593c = j0Var;
    }

    public abstract yl.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
