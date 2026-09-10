package il;

import zk.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements bm.f {
    @Override // bm.f
    public final int a(zk.b superDescriptor, zk.b subDescriptor, zk.e eVar) {
        kotlin.jvm.internal.n.f(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.n.f(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof h0) || !(superDescriptor instanceof h0)) {
            return 4;
        }
        h0 h0Var = (h0) subDescriptor;
        h0 h0Var2 = (h0) superDescriptor;
        if (!kotlin.jvm.internal.n.a(h0Var.getName(), h0Var2.getName())) {
            return 4;
        }
        if (x7.a.D(h0Var) && x7.a.D(h0Var2)) {
            return 1;
        }
        return (x7.a.D(h0Var) || x7.a.D(h0Var2)) ? 3 : 4;
    }

    @Override // bm.f
    public final int b() {
        return 3;
    }
}
