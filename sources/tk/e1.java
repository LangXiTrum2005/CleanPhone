package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e1 extends c1 implements qk.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f50969h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o1 f50970f = q1.g(null, new d1(this, 1));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f50971g = r9.b.t(wj.e.f53280a, new d1(this, 0));

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f50969h = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(e1.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // tk.r
    public final uk.f c() {
        return (uk.f) this.f50971g.getValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e1) && kotlin.jvm.internal.n.a(l(), ((e1) obj).l());
    }

    @Override // qk.c
    public final String getName() {
        return wi.d.k(new StringBuilder("<get-"), l().f50989g, '>');
    }

    @Override // tk.r
    public final zk.c h() {
        qk.w wVar = f50969h[0];
        Object objInvoke = this.f50970f.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-descriptor>(...)");
        return (cl.o0) objInvoke;
    }

    public final int hashCode() {
        return l().hashCode();
    }

    @Override // tk.c1
    public final zk.g0 k() {
        qk.w wVar = f50969h[0];
        Object objInvoke = this.f50970f.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-descriptor>(...)");
        return (cl.o0) objInvoke;
    }

    public final String toString() {
        return "getter of " + l();
    }
}
