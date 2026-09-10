package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b1 extends i1 implements qk.v {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f50954m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c0 c0Var, String name, String signature) {
        super(c0Var, name, signature, kotlin.jvm.internal.d.NO_RECEIVER);
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(signature, "signature");
        a1 a1Var = new a1(this, 0);
        wj.e eVar = wj.e.f53280a;
        this.f50954m = r9.b.t(eVar, a1Var);
        r9.b.t(eVar, new a1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.w
    public final qk.p getGetter() {
        return (z0) this.f50954m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) this.f50954m.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // tk.i1
    public final e1 n() {
        return (z0) this.f50954m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.w
    public final qk.u getGetter() {
        return (z0) this.f50954m.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c0 c0Var, zk.h0 descriptor) {
        super(c0Var, descriptor);
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        a1 a1Var = new a1(this, 0);
        wj.e eVar = wj.e.f53280a;
        this.f50954m = r9.b.t(eVar, a1Var);
        r9.b.t(eVar, new a1(this, 1));
    }
}
