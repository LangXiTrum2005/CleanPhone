package f2;

import java.io.IOException;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f40462b;

    public t0(v0 v0Var, int i10) {
        this.f40462b = v0Var;
        this.f40461a = i10;
    }

    @Override // f2.c1
    public final int h(s1 s1Var, o1.d dVar, int i10) {
        v0 v0Var = this.f40462b;
        if (v0Var.v()) {
            return -3;
        }
        int i11 = this.f40461a;
        v0Var.p(i11);
        int iC = v0Var.f40493u[i11].C(s1Var, dVar, i10, v0Var.O);
        if (iC == -3) {
            v0Var.q(i11);
        }
        return iC;
    }

    @Override // f2.c1
    public final boolean isReady() {
        v0 v0Var = this.f40462b;
        return !v0Var.v() && v0Var.f40493u[this.f40461a].x(v0Var.O);
    }

    @Override // f2.c1
    public final void maybeThrowError() throws IOException {
        int i10 = this.f40461a;
        v0 v0Var = this.f40462b;
        v0Var.f40493u[i10].z();
        j2.m mVar = v0Var.l;
        int iJ = v0Var.f40477d.j(v0Var.E);
        IOException iOException = mVar.f43676c;
        if (iOException != null) {
            throw iOException;
        }
        j2.i iVar = mVar.f43675b;
        if (iVar != null) {
            if (iJ == Integer.MIN_VALUE) {
                iJ = iVar.f43661a;
            }
            IOException iOException2 = iVar.f43665e;
            if (iOException2 != null && iVar.f43666f > iJ) {
                throw iOException2;
            }
        }
    }

    @Override // f2.c1
    public final int skipData(long j10) {
        v0 v0Var = this.f40462b;
        if (v0Var.v()) {
            return 0;
        }
        int i10 = this.f40461a;
        v0Var.p(i10);
        b1 b1Var = v0Var.f40493u[i10];
        int iV = b1Var.v(j10, v0Var.O);
        b1Var.H(iV);
        if (iV == 0) {
            v0Var.q(i10);
        }
        return iV;
    }
}
