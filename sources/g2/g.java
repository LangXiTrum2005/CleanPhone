package g2;

import f2.b1;
import f2.c1;
import f2.i0;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f41375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f41376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f41379e;

    public g(i iVar, i iVar2, b1 b1Var, int i10) {
        this.f41379e = iVar;
        this.f41375a = iVar2;
        this.f41376b = b1Var;
        this.f41377c = i10;
    }

    public final void a() {
        if (this.f41378d) {
            return;
        }
        i iVar = this.f41379e;
        i0 i0Var = iVar.f41386g;
        int[] iArr = iVar.f41381b;
        int i10 = this.f41377c;
        i0Var.b(iArr[i10], iVar.f41382c[i10], 0, null, iVar.f41398t);
        this.f41378d = true;
    }

    @Override // f2.c1
    public final int h(s1 s1Var, o1.d dVar, int i10) {
        i iVar = this.f41379e;
        if (iVar.m()) {
            return -3;
        }
        a aVar = iVar.f41400v;
        b1 b1Var = this.f41376b;
        if (aVar != null && aVar.c(this.f41377c + 1) <= b1Var.t()) {
            return -3;
        }
        a();
        return b1Var.C(s1Var, dVar, i10, iVar.f41403y);
    }

    @Override // f2.c1
    public final boolean isReady() {
        i iVar = this.f41379e;
        return !iVar.m() && this.f41376b.x(iVar.f41403y);
    }

    @Override // f2.c1
    public final int skipData(long j10) {
        i iVar = this.f41379e;
        if (iVar.m()) {
            return 0;
        }
        boolean z10 = iVar.f41403y;
        b1 b1Var = this.f41376b;
        int iV = b1Var.v(j10, z10);
        a aVar = iVar.f41400v;
        if (aVar != null) {
            iV = Math.min(iV, aVar.c(this.f41377c + 1) - b1Var.t());
        }
        b1Var.H(iV);
        if (iV > 0) {
            a();
        }
        return iV;
    }

    @Override // f2.c1
    public final void maybeThrowError() {
    }
}
