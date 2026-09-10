package f2;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements j0, u1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f40376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f40377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f40378d;

    public j(l lVar, Object obj) {
        this.f40378d = lVar;
        this.f40376b = lVar.a(null);
        this.f40377c = new i0(lVar.f40275d.f40371c, 0, null);
        this.f40375a = obj;
    }

    @Override // f2.j0
    public final void A(int i10, c0 c0Var, u uVar, c2.g gVar, IOException iOException, boolean z10) {
        if (a(i10, c0Var)) {
            i0 i0Var = this.f40376b;
            c2.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new g0(i0Var, uVar, gVarB, iOException, z10));
        }
    }

    @Override // f2.j0
    public final void B(int i10, c0 c0Var, c2.g gVar) {
        if (a(i10, c0Var)) {
            i0 i0Var = this.f40376b;
            c2.g gVarB = b(gVar, c0Var);
            c0 c0Var2 = i0Var.f40370b;
            c0Var2.getClass();
            i0Var.a(new ac.a(i0Var, c0Var2, gVarB, 7));
        }
    }

    public final boolean a(int i10, c0 c0Var) {
        c0 c0VarX;
        Object obj = this.f40375a;
        l lVar = this.f40378d;
        if (c0Var != null) {
            c0VarX = lVar.x(obj, c0Var);
            if (c0VarX == null) {
                return false;
            }
        } else {
            c0VarX = null;
        }
        int iZ = lVar.z(obj, i10);
        i0 i0Var = this.f40376b;
        if (i0Var.f40369a != iZ || !Objects.equals(i0Var.f40370b, c0VarX)) {
            this.f40376b = new i0(lVar.f40274c.f40371c, iZ, c0VarX);
        }
        i0 i0Var2 = this.f40377c;
        if (i0Var2.f40369a == iZ && Objects.equals(i0Var2.f40370b, c0VarX)) {
            return true;
        }
        this.f40377c = new i0(lVar.f40275d.f40371c, iZ, c0VarX);
        return true;
    }

    public final c2.g b(c2.g gVar, c0 c0Var) {
        long j10 = gVar.f5893d;
        l lVar = this.f40378d;
        Object obj = this.f40375a;
        long jY = lVar.y(obj, j10);
        long j11 = gVar.f5894e;
        long jY2 = lVar.y(obj, j11);
        return (jY == j10 && jY2 == j11) ? gVar : new c2.g(gVar.f5890a, gVar.f5891b, (i1.p) gVar.f5895f, gVar.f5892c, gVar.f5896g, jY, jY2);
    }

    @Override // f2.j0
    public final void l(int i10, c0 c0Var, u uVar, c2.g gVar) {
        if (a(i10, c0Var)) {
            i0 i0Var = this.f40376b;
            c2.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new f0(i0Var, uVar, gVarB, 0));
        }
    }

    @Override // f2.j0
    public final void v(int i10, c0 c0Var, c2.g gVar) {
        if (a(i10, c0Var)) {
            i0 i0Var = this.f40376b;
            c2.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new cj.h(18, i0Var, gVarB));
        }
    }

    @Override // f2.j0
    public final void y(int i10, c0 c0Var, u uVar, c2.g gVar) {
        if (a(i10, c0Var)) {
            i0 i0Var = this.f40376b;
            c2.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new f0(i0Var, uVar, gVarB, 1));
        }
    }

    @Override // f2.j0
    public final void z(int i10, c0 c0Var, u uVar, c2.g gVar, int i11) {
        if (a(i10, c0Var)) {
            i0 i0Var = this.f40376b;
            c2.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new e0(i0Var, uVar, gVarB, i11));
        }
    }
}
