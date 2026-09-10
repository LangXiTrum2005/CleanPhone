package nd;

import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends GeneratedMessageLite.Builder implements g0 {
    @Override // nd.g0
    public final boolean a() {
        return ((f0) this.instance).a();
    }

    @Override // nd.g0
    public final boolean b() {
        return ((f0) this.instance).b();
    }

    @Override // nd.g0
    public final c0 c() {
        return ((f0) this.instance).c();
    }

    public final void d(h hVar) {
        copyOnWrite();
        f0.h((f0) this.instance, (j) hVar.build());
    }

    @Override // nd.g0
    public final boolean e() {
        return ((f0) this.instance).e();
    }

    @Override // nd.g0
    public final r0 f() {
        return ((f0) this.instance).f();
    }

    @Override // nd.g0
    public final u g() {
        return ((f0) this.instance).g();
    }

    public final void h(u uVar) {
        copyOnWrite();
        f0.i((f0) this.instance, uVar);
    }

    public final void i(c0 c0Var) {
        copyOnWrite();
        f0.k((f0) this.instance, c0Var);
    }

    public final void j(r0 r0Var) {
        copyOnWrite();
        f0.j((f0) this.instance, r0Var);
    }
}
