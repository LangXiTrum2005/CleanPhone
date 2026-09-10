package cg;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f6413d;

    @Override // cg.a
    public final c d() {
        c cVar = this.f6413d;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.n.l("channel");
        throw null;
    }

    @Override // cg.a
    public final void f(c next) {
        kotlin.jvm.internal.n.f(next, "next");
        this.f6382c = next;
        this.f6413d = next;
    }
}
