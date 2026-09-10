package cn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o1 extends kotlin.jvm.internal.k implements jk.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f6752b = new o1(3, q1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // jk.d
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objH;
        q1 q1Var = (q1) obj;
        kn.e eVar = (kn.e) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q1.f6757a;
        q1Var.getClass();
        do {
            objH = q1.f6757a.get(q1Var);
            if (!(objH instanceof b1)) {
                if (!(objH instanceof u)) {
                    objH = d0.H(objH);
                }
                ((kn.d) eVar).f44741e = objH;
            }
            return wj.r.f53297a;
        } while (q1Var.X(objH) < 0);
        ((kn.d) eVar).f44739c = d0.u(q1Var, true, new n1(q1Var, eVar));
        return wj.r.f53297a;
    }
}
