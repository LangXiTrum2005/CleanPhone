package ql;

import pm.a1;
import pm.c0;
import pm.j0;
import pm.r;
import pm.y;
import pm.y0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends pm.o implements pm.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f49142b;

    public f(c0 delegate) {
        kotlin.jvm.internal.n.f(delegate, "delegate");
        this.f49142b = delegate;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return new f(this.f49142b.m0(newAttributes));
    }

    @Override // pm.o
    public final c0 B0() {
        return this.f49142b;
    }

    @Override // pm.o
    public final pm.o D0(c0 c0Var) {
        return new f(c0Var);
    }

    @Override // pm.o, pm.y
    public final boolean Q() {
        return false;
    }

    @Override // pm.c0, pm.a1
    public final a1 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return new f(this.f49142b.m0(newAttributes));
    }

    @Override // pm.l
    public final a1 o(y replacement) {
        kotlin.jvm.internal.n.f(replacement, "replacement");
        a1 a1VarB0 = replacement.b0();
        if (!y0.f(a1VarB0) && !y0.e(a1VarB0)) {
            return a1VarB0;
        }
        if (a1VarB0 instanceof c0) {
            c0 c0Var = (c0) a1VarB0;
            c0 c0VarI0 = c0Var.i0(false);
            return !y0.f(c0Var) ? c0VarI0 : new f(c0VarI0);
        }
        if (!(a1VarB0 instanceof r)) {
            throw new IllegalStateException(("Incorrect type: " + a1VarB0).toString());
        }
        r rVar = (r) a1VarB0;
        c0 c0Var2 = rVar.f48470b;
        c0 c0VarI1 = c0Var2.i0(false);
        if (y0.f(c0Var2)) {
            c0VarI1 = new f(c0VarI1);
        }
        c0 c0Var3 = rVar.f48471c;
        c0 c0VarI2 = c0Var3.i0(false);
        if (y0.f(c0Var3)) {
            c0VarI2 = new f(c0VarI2);
        }
        return pm.c.B(pm.f.j(c0VarI1, c0VarI2), pm.c.f(a1VarB0));
    }

    @Override // pm.l
    public final boolean s() {
        return true;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        return z10 ? this.f49142b.i0(true) : this;
    }
}
