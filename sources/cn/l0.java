package cn;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 extends jn.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6735c;

    public l0(int i10) {
        super(0L, false);
        this.f6735c = i10;
    }

    public abstract ak.f c();

    public Throwable d(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f6771a;
        }
        return null;
    }

    public final void i(Throwable th2) throws IllegalAccessException, InvocationTargetException {
        d0.t(c().getContext(), new c0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        try {
            ak.f fVarC = c();
            kotlin.jvm.internal.n.d(fVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            hn.g gVar = (hn.g) fVarC;
            ck.c cVar = gVar.f42429e;
            Object obj = gVar.f42431g;
            ak.k context = cVar.getContext();
            Object objN = hn.b.n(context, obj);
            f1 f1Var = null;
            h2 h2VarI = objN != hn.b.f42418d ? d0.I(cVar, context, objN) : null;
            try {
                ak.k context2 = cVar.getContext();
                Object objJ = j();
                Throwable thD = d(objJ);
                if (thD == null) {
                    int i10 = this.f6735c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        f1Var = (f1) context2.get(e1.f6705a);
                    }
                }
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationExceptionH = f1Var.h();
                    a(cancellationExceptionH);
                    cVar.resumeWith(t9.e.c(cancellationExceptionH));
                } else if (thD != null) {
                    cVar.resumeWith(t9.e.c(thD));
                } else {
                    cVar.resumeWith(h(objJ));
                }
            } finally {
                if (h2VarI == null || h2VarI.f0()) {
                    hn.b.g(context, objN);
                }
            }
        } catch (j0 e10) {
            d0.t(c().getContext(), e10.f6722a);
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public void a(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
