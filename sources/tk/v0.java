package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class v0 extends i1 implements qk.r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f51073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f51074n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c0 c0Var, zk.h0 descriptor) {
        super(c0Var, descriptor);
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        u0 u0Var = new u0(this, 0);
        wj.e eVar = wj.e.f53280a;
        this.f51073m = r9.b.t(eVar, u0Var);
        this.f51074n = r9.b.t(eVar, new u0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wj.d] */
    @Override // qk.r
    public final Object get() {
        return ((t0) this.f51073m.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.r
    public final Object getDelegate() {
        return this.f51074n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.w
    public final qk.p getGetter() {
        return (t0) this.f51073m.getValue();
    }

    @Override // jk.a
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // tk.i1
    public final e1 n() {
        return (t0) this.f51073m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.w
    public final qk.q getGetter() {
        return (t0) this.f51073m.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c0 c0Var, String name, String signature, Object obj) {
        super(c0Var, name, signature, obj);
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(signature, "signature");
        u0 u0Var = new u0(this, 0);
        wj.e eVar = wj.e.f53280a;
        this.f51073m = r9.b.t(eVar, u0Var);
        this.f51074n = r9.b.t(eVar, new u0(this, 1));
    }
}
