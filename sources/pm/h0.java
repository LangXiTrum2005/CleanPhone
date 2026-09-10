package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk.m0 f48436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48437b;

    public h0(zk.m0 typeParameter) {
        kotlin.jvm.internal.n.f(typeParameter, "typeParameter");
        this.f48436a = typeParameter;
        this.f48437b = r9.b.t(wj.e.f53280a, new al.l(this, 19));
    }

    @Override // pm.q0
    public final int a() {
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // pm.q0
    public final y b() {
        return (y) this.f48437b.getValue();
    }

    @Override // pm.q0
    public final boolean c() {
        return true;
    }

    @Override // pm.q0
    public final q0 d(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
