package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends b1 implements qk.m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f51000n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(c0 c0Var, zk.h0 descriptor) {
        super(c0Var, descriptor);
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        this.f51000n = r9.b.t(wj.e.f53280a, new al.l(this, 27));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.m
    public final qk.h getSetter() {
        return (j0) this.f51000n.getValue();
    }
}
