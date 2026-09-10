package cn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class h1 extends q1 implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f1 f1Var) {
        super(true);
        boolean z10 = true;
        J(f1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q1.f6758b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null) {
            z10 = false;
            break;
        }
        q1 q1VarH = pVar.h();
        while (!q1VarH.D()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(q1VarH);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null) {
                z10 = false;
                break;
            }
            q1VarH = pVar2.h();
        }
        this.f6718c = z10;
    }

    @Override // cn.q1
    public final boolean D() {
        return this.f6718c;
    }

    @Override // cn.q1
    public final boolean F() {
        return true;
    }
}
