package tk;

import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class y0 extends i1 implements qk.t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f51092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f51093n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c0 c0Var, String name, String signature, Object obj) {
        super(c0Var, name, signature, obj);
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(signature, "signature");
        x0 x0Var = new x0(this, 0);
        wj.e eVar = wj.e.f53280a;
        this.f51092m = r9.b.t(eVar, x0Var);
        this.f51093n = r9.b.t(eVar, new x0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.t
    public final Object get(Object obj) {
        return ((w0) this.f51092m.getValue()).call(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wj.d] */
    @Override // qk.t
    public final Object getDelegate(Object obj) {
        return l((Member) this.f51093n.getValue(), obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.w
    public final qk.p getGetter() {
        return (w0) this.f51092m.getValue();
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // tk.i1
    public final e1 n() {
        return (w0) this.f51092m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.w
    public final qk.s getGetter() {
        return (w0) this.f51092m.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c0 c0Var, zk.h0 descriptor) {
        super(c0Var, descriptor);
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        x0 x0Var = new x0(this, 0);
        wj.e eVar = wj.e.f53280a;
        this.f51092m = r9.b.t(eVar, x0Var);
        this.f51093n = r9.b.t(eVar, new x0(this, 1));
    }
}
