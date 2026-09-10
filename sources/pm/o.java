package pm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends c0 {
    @Override // pm.y
    public final im.n A() {
        return B0().A();
    }

    public abstract c0 B0();

    @Override // pm.a1
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c0 j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 type = B0();
        kotlin.jvm.internal.n.f(type, "type");
        return D0(type);
    }

    public abstract o D0(c0 c0Var);

    @Override // pm.y
    public j0 M() {
        return B0().M();
    }

    @Override // pm.y
    public final n0 P() {
        return B0().P();
    }

    @Override // pm.y
    public boolean Q() {
        return B0().Q();
    }

    @Override // pm.y
    public final List t() {
        return B0().t();
    }
}
