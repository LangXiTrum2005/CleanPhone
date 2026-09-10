package dm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends o {
    public t(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // dm.g
    public final pm.y a(zk.w module) {
        kotlin.jvm.internal.n.f(module, "module");
        wk.h hVarD = module.d();
        hVarD.getClass();
        return hVarD.s(wk.j.LONG);
    }

    @Override // dm.g
    public final String toString() {
        return ((Number) this.f38953a).longValue() + ".toLong()";
    }
}
