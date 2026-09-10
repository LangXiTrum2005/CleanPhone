package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f48408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f48409c;

    public a(c0 delegate, c0 abbreviation) {
        kotlin.jvm.internal.n.f(delegate, "delegate");
        kotlin.jvm.internal.n.f(abbreviation, "abbreviation");
        this.f48408b = delegate;
        this.f48409c = abbreviation;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return new a(this.f48408b.m0(newAttributes), this.f48409c);
    }

    @Override // pm.o
    public final c0 B0() {
        return this.f48408b;
    }

    @Override // pm.o
    public final o D0(c0 c0Var) {
        return new a(c0Var, this.f48409c);
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final a i0(boolean z10) {
        return new a(this.f48408b.i0(z10), this.f48409c.i0(z10));
    }

    @Override // pm.o, pm.a1
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final a j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 type = this.f48408b;
        kotlin.jvm.internal.n.f(type, "type");
        c0 type2 = this.f48409c;
        kotlin.jvm.internal.n.f(type2, "type");
        return new a(type, type2);
    }
}
