package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends r implements l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(c0 lowerBound, c0 upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.n.f(lowerBound, "lowerBound");
        kotlin.jvm.internal.n.f(upperBound, "upperBound");
    }

    @Override // pm.r
    public final String A0(am.h hVar, am.h hVar2) {
        boolean zN = hVar2.f3709a.n();
        c0 c0Var = this.f48471c;
        c0 c0Var2 = this.f48470b;
        if (!zN) {
            return hVar.F(hVar.Y(c0Var2), hVar.Y(c0Var), qk.i0.H(this));
        }
        return "(" + hVar.Y(c0Var2) + ".." + hVar.Y(c0Var) + ')';
    }

    @Override // pm.y
    /* JADX INFO: renamed from: U */
    public final y j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 type = this.f48470b;
        kotlin.jvm.internal.n.f(type, "type");
        c0 type2 = this.f48471c;
        kotlin.jvm.internal.n.f(type2, "type");
        return new s(type, type2);
    }

    @Override // pm.a1
    public final a1 i0(boolean z10) {
        return f.j(this.f48470b.i0(z10), this.f48471c.i0(z10));
    }

    @Override // pm.a1
    public final a1 j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 type = this.f48470b;
        kotlin.jvm.internal.n.f(type, "type");
        c0 type2 = this.f48471c;
        kotlin.jvm.internal.n.f(type2, "type");
        return new s(type, type2);
    }

    @Override // pm.a1
    public final a1 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return f.j(this.f48470b.m0(newAttributes), this.f48471c.m0(newAttributes));
    }

    @Override // pm.l
    public final a1 o(y replacement) {
        a1 a1VarJ;
        kotlin.jvm.internal.n.f(replacement, "replacement");
        a1 a1VarB0 = replacement.b0();
        if (a1VarB0 instanceof r) {
            a1VarJ = a1VarB0;
        } else {
            if (!(a1VarB0 instanceof c0)) {
                throw new aa.b((byte) 0, 20);
            }
            c0 c0Var = (c0) a1VarB0;
            a1VarJ = f.j(c0Var, c0Var.i0(true));
        }
        return c.h(a1VarJ, a1VarB0);
    }

    @Override // pm.l
    public final boolean s() {
        c0 c0Var = this.f48470b;
        return (c0Var.P().e() instanceof zk.m0) && kotlin.jvm.internal.n.a(c0Var.P(), this.f48471c.P());
    }

    @Override // pm.r
    public final String toString() {
        return "(" + this.f48470b + ".." + this.f48471c + ')';
    }

    @Override // pm.r
    public final c0 z0() {
        return this.f48470b;
    }
}
