package cn;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends q1 implements ak.f, a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ak.k f6670c;

    public a(ak.k kVar, boolean z10) {
        super(z10);
        J((f1) kVar.get(e1.f6705a));
        this.f6670c = kVar.plus(this);
    }

    @Override // cn.q1
    public final void I(aa.b bVar) throws IllegalAccessException, InvocationTargetException {
        d0.t(this.f6670c, bVar);
    }

    @Override // cn.q1
    public final void T(Object obj) {
        if (!(obj instanceof u)) {
            c0(obj);
        } else {
            u uVar = (u) obj;
            b0(uVar.f6771a, u.f6770b.get(uVar) == 1);
        }
    }

    public final void d0(b0 b0Var, a aVar, jk.c cVar) {
        Object objInvoke;
        int iOrdinal = b0Var.ordinal();
        wj.r rVar = wj.r.f53297a;
        if (iOrdinal == 0) {
            try {
                hn.b.h(com.google.android.gms.internal.play_billing.q1.t(com.google.android.gms.internal.play_billing.q1.j(aVar, this, cVar)), rVar);
                return;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof j0) {
                    th = ((j0) th).f6722a;
                }
                resumeWith(t9.e.c(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.n.f(cVar, "<this>");
                com.google.android.gms.internal.play_billing.q1.t(com.google.android.gms.internal.play_billing.q1.j(aVar, this, cVar)).resumeWith(rVar);
                return;
            }
            if (iOrdinal != 3) {
                throw new aa.b((byte) 0, 20);
            }
            try {
                ak.k kVar = this.f6670c;
                Object objN = hn.b.n(kVar, null);
                try {
                    if (cVar instanceof ck.a) {
                        kotlin.jvm.internal.h0.d(2, cVar);
                        objInvoke = cVar.invoke(aVar, this);
                    } else {
                        objInvoke = com.google.android.gms.internal.play_billing.q1.I(cVar, aVar, this);
                    }
                    hn.b.g(kVar, objN);
                    if (objInvoke != bk.a.f5708a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th3) {
                    hn.b.g(kVar, objN);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                if (th instanceof j0) {
                    th = ((j0) th).f6722a;
                }
                resumeWith(t9.e.c(th));
            }
        }
    }

    @Override // ak.f
    public final ak.k getContext() {
        return this.f6670c;
    }

    @Override // cn.a0
    public final ak.k getCoroutineContext() {
        return this.f6670c;
    }

    @Override // ak.f
    public final void resumeWith(Object obj) {
        Throwable thA = wj.h.a(obj);
        if (thA != null) {
            obj = new u(thA, false);
        }
        Object objP = P(obj);
        if (objP == d0.f6692e) {
            return;
        }
        r(objP);
    }

    @Override // cn.q1
    public final String w() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void c0(Object obj) {
    }

    public void b0(Throwable th2, boolean z10) {
    }
}
