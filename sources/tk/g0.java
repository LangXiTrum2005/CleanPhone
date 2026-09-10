package tk;

import com.google.android.gms.internal.ads.zs;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends v0 implements qk.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f50977o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c0 c0Var, zk.h0 descriptor) {
        super(c0Var, descriptor);
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        this.f50977o = r9.b.t(wj.e.f53280a, new al.l(this, 25));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.m
    public final qk.h getSetter() {
        return (f0) this.f50977o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.j
    public final void set(Object obj) throws zs {
        ((f0) this.f50977o.getValue()).call(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // qk.j, qk.m
    public final qk.i getSetter() {
        return (f0) this.f50977o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c0 c0Var, String name, String signature, Object obj) {
        super(c0Var, name, signature, obj);
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(signature, "signature");
        this.f50977o = r9.b.t(wj.e.f53280a, new al.l(this, 25));
    }
}
