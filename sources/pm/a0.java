package pm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final om.o f48410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.internal.o f48411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.i f48412d;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(om.o storageManager, jk.a aVar) {
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        this.f48410b = storageManager;
        this.f48411c = (kotlin.jvm.internal.o) aVar;
        this.f48412d = new om.i((om.l) storageManager, aVar);
    }

    @Override // pm.y
    public final im.n A() {
        return i0().A();
    }

    @Override // pm.y
    public final j0 M() {
        return i0().M();
    }

    @Override // pm.y
    public final n0 P() {
        return i0().P();
    }

    @Override // pm.y
    public final boolean Q() {
        return i0().Q();
    }

    @Override // pm.y
    /* JADX INFO: renamed from: U */
    public final y j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a0(this.f48410b, new cl.t0(8, kotlinTypeRefiner, this));
    }

    @Override // pm.y
    public final a1 b0() {
        y yVarI0 = i0();
        while (yVarI0 instanceof a0) {
            yVarI0 = ((a0) yVarI0).i0();
        }
        kotlin.jvm.internal.n.d(yVarI0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (a1) yVarI0;
    }

    public final y i0() {
        return (y) this.f48412d.invoke();
    }

    @Override // pm.y
    public final List t() {
        return i0().t();
    }

    public final String toString() {
        om.i iVar = this.f48412d;
        return (iVar.f47573c == om.k.f47577a || iVar.f47573c == om.k.f47578b) ? "<Not computed yet>" : i0().toString();
    }
}
