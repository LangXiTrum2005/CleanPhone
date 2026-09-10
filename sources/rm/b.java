package rm;

import cl.q0;
import cl.y;
import d5.u;
import il.o;
import java.util.Collection;
import kotlin.jvm.internal.n;
import oa.k0;
import zk.j0;
import zk.r;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends q0 {
    @Override // cl.y
    /* JADX INFO: renamed from: J0 */
    public final q0 V(zk.j newOwner, int i10, o visibility) {
        n.f(newOwner, "newOwner");
        u.n(i10, "modality");
        n.f(visibility, "visibility");
        u.n(2, "kind");
        return this;
    }

    @Override // cl.q0, cl.y
    public final y L0(int i10, al.j annotations, yl.f fVar, zk.j newOwner, s sVar, j0 j0Var) {
        n.f(newOwner, "newOwner");
        u.n(i10, "kind");
        n.f(annotations, "annotations");
        return this;
    }

    @Override // cl.y, zk.c
    public final /* bridge */ /* synthetic */ zk.c V(zk.e eVar, int i10, o oVar) {
        V(eVar, i10, oVar);
        return this;
    }

    @Override // cl.y, zk.b
    public final Object d0(zk.a aVar) {
        return null;
    }

    @Override // cl.y, zk.s
    public final boolean isSuspend() {
        return false;
    }

    @Override // cl.y, zk.c
    public final void t0(Collection overriddenDescriptors) {
        n.f(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // cl.q0, cl.y, zk.s
    public final r v0() {
        return new k0(this, 8);
    }
}
