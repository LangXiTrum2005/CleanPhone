package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends r implements z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f48474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f48475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r origin, y enhancement) {
        super(origin.f48470b, origin.f48471c);
        kotlin.jvm.internal.n.f(origin, "origin");
        kotlin.jvm.internal.n.f(enhancement, "enhancement");
        this.f48474d = origin;
        this.f48475e = enhancement;
    }

    @Override // pm.r
    public final String A0(am.h hVar, am.h hVar2) {
        am.k kVar = hVar2.f3709a;
        return ((Boolean) kVar.f3739m.getValue(kVar, am.k.W[11])).booleanValue() ? hVar.Y(this.f48475e) : this.f48474d.A0(hVar, hVar2);
    }

    @Override // pm.y
    /* JADX INFO: renamed from: U */
    public final y j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        r type = this.f48474d;
        kotlin.jvm.internal.n.f(type, "type");
        y type2 = this.f48475e;
        kotlin.jvm.internal.n.f(type2, "type");
        return new t(type, type2);
    }

    @Override // pm.z0
    public final a1 getOrigin() {
        return this.f48474d;
    }

    @Override // pm.a1
    public final a1 i0(boolean z10) {
        return c.B(this.f48474d.i0(z10), this.f48475e.b0().i0(z10));
    }

    @Override // pm.a1
    public final a1 j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        r type = this.f48474d;
        kotlin.jvm.internal.n.f(type, "type");
        y type2 = this.f48475e;
        kotlin.jvm.internal.n.f(type2, "type");
        return new t(type, type2);
    }

    @Override // pm.z0
    public final y k() {
        return this.f48475e;
    }

    @Override // pm.a1
    public final a1 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return c.B(this.f48474d.m0(newAttributes), this.f48475e);
    }

    @Override // pm.r
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f48475e + ")] " + this.f48474d;
    }

    @Override // pm.r
    public final c0 z0() {
        return this.f48474d.z0();
    }
}
