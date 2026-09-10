package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends o implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f48429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f48430c;

    public f0(c0 delegate, y enhancement) {
        kotlin.jvm.internal.n.f(delegate, "delegate");
        kotlin.jvm.internal.n.f(enhancement, "enhancement");
        this.f48429b = delegate;
        this.f48430c = enhancement;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        a1 a1VarB = c.B(this.f48429b.m0(newAttributes), this.f48430c);
        kotlin.jvm.internal.n.d(a1VarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (c0) a1VarB;
    }

    @Override // pm.o
    public final c0 B0() {
        return this.f48429b;
    }

    @Override // pm.o
    public final o D0(c0 c0Var) {
        return new f0(c0Var, this.f48430c);
    }

    @Override // pm.o, pm.a1
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final f0 j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 type = this.f48429b;
        kotlin.jvm.internal.n.f(type, "type");
        y type2 = this.f48430c;
        kotlin.jvm.internal.n.f(type2, "type");
        return new f0(type, type2);
    }

    @Override // pm.z0
    public final a1 getOrigin() {
        return this.f48429b;
    }

    @Override // pm.z0
    public final y k() {
        return this.f48430c;
    }

    @Override // pm.c0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f48430c + ")] " + this.f48429b;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        a1 a1VarB = c.B(this.f48429b.i0(z10), this.f48430c.b0().i0(z10));
        kotlin.jvm.internal.n.d(a1VarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (c0) a1VarB;
    }
}
