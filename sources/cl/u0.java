package cl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends y implements s0 {
    public static final i0 G;
    public final om.o D;
    public final nm.s E;
    public l F;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        e0Var.g(new kotlin.jvm.internal.v(e0Var.b(u0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        G = new i0();
    }

    public u0(om.o oVar, nm.s sVar, l lVar, s0 s0Var, al.j jVar, int i10, zk.j0 j0Var) {
        super(i10, jVar, yl.h.f54521e, sVar, s0Var, j0Var);
        this.D = oVar;
        this.E = sVar;
        t0 t0Var = new t0(0, this, lVar);
        om.l lVar2 = (om.l) oVar;
        lVar2.getClass();
        new om.h(lVar2, t0Var);
        this.F = lVar;
    }

    @Override // cl.y
    public final y L0(int i10, al.j annotations, yl.f fVar, zk.j newOwner, zk.s sVar, zk.j0 j0Var) {
        kotlin.jvm.internal.n.f(newOwner, "newOwner");
        d5.u.n(i10, "kind");
        kotlin.jvm.internal.n.f(annotations, "annotations");
        if (i10 != 1) {
        }
        return new u0(this.D, this.E, this.F, this, annotations, 1, j0Var);
    }

    @Override // cl.y, cl.q, cl.p, zk.j, zk.g
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final s0 a() {
        zk.s sVarA = super.a();
        kotlin.jvm.internal.n.d(sVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (s0) sVarA;
    }

    @Override // cl.y, zk.c
    public final zk.c V(zk.e newOwner, int i10, il.o visibility) {
        kotlin.jvm.internal.n.f(newOwner, "newOwner");
        d5.u.n(i10, "modality");
        kotlin.jvm.internal.n.f(visibility, "visibility");
        d5.u.n(2, "kind");
        x xVarP0 = P0(pm.w0.f48482b);
        xVarP0.f6609b = newOwner;
        xVarP0.f6610c = i10;
        xVarP0.f6611d = visibility;
        xVarP0.f6613f = 2;
        xVarP0.f6619m = false;
        zk.v vVarM0 = xVarP0.f6630x.M0(xVarP0);
        kotlin.jvm.internal.n.d(vVarM0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (s0) vVarM0;
    }

    @Override // cl.y, zk.s, zk.l0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final u0 b(pm.w0 substitutor) {
        kotlin.jvm.internal.n.f(substitutor, "substitutor");
        zk.s sVarB = super.b(substitutor);
        kotlin.jvm.internal.n.d(sVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        u0 u0Var = (u0) sVarB;
        pm.y yVar = u0Var.f6639g;
        kotlin.jvm.internal.n.c(yVar);
        l lVarB = this.F.I0().b(pm.w0.d(yVar));
        if (lVarB == null) {
            return null;
        }
        u0Var.F = lVarB;
        return u0Var;
    }

    @Override // zk.i
    public final zk.e X() {
        zk.e eVarX = this.F.X();
        kotlin.jvm.internal.n.e(eVarX, "underlyingConstructorDescriptor.constructedClass");
        return eVarX;
    }

    @Override // cl.q, zk.j
    public final zk.h e() {
        return this.E;
    }

    @Override // cl.y, zk.b
    public final pm.y getReturnType() {
        pm.y yVar = this.f6639g;
        kotlin.jvm.internal.n.c(yVar);
        return yVar;
    }

    @Override // cl.q, zk.j
    public final zk.j e() {
        return this.E;
    }
}
