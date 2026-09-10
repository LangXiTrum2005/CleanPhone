package cg;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends a {
    @Override // cg.a
    public final p c(n state) {
        kotlin.jvm.internal.n.f(state, "state");
        if (state instanceof l) {
            j(((l) state).f6411a);
        } else {
            i(state.f6411a);
        }
        p pVarH = h();
        return pVarH instanceof o ? new k(((o) pVarH).f6412a) : pVarH;
    }

    public abstract p h();

    public abstract void i(Object obj);

    public abstract void j(Object obj);
}
