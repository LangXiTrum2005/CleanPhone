package cn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6701b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0[] f6702a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(g0[] g0VarArr) {
        this.f6702a = g0VarArr;
        this.notCompletedCount$volatile = g0VarArr.length;
    }

    public final Object a(ck.c cVar) {
        l lVar = new l(1, com.google.android.gms.internal.play_billing.q1.t(cVar));
        lVar.t();
        f1[] f1VarArr = this.f6702a;
        int length = f1VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            f1 f1Var = f1VarArr[i10];
            ((q1) f1Var).start();
            c cVar2 = new c(this, lVar);
            cVar2.f6681f = d0.u(f1Var, true, cVar2);
            cVarArr[i10] = cVar2;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar3 = cVarArr[i11];
            cVar3.getClass();
            c.f6679h.set(cVar3, dVar);
        }
        if (l.f6731g.get(lVar) instanceof w1) {
            lVar.w(dVar);
        } else {
            dVar.b();
        }
        return lVar.s();
    }
}
