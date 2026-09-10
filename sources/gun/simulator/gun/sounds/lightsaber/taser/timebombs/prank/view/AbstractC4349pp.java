package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4349pp extends AbstractRunnableC3970lb0 {
    public int c;

    public AbstractC4349pp(int i) {
        super(0L, AbstractC4585sb0.g);
        this.c = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC2857Wj c();

    public Throwable f(Object obj) {
        C3013ah c3013ah = obj instanceof C3013ah ? (C3013ah) obj : null;
        if (c3013ah != null) {
            return c3013ah.f4134a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC2995aW.h(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC2995aW.n(th);
        AbstractC2995aW.Q(c().getContext(), new RR("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objV = C5033xf0.f5238a;
        Qm0 qm0 = this.b;
        try {
            InterfaceC2857Wj interfaceC2857WjC = c();
            AbstractC2995aW.o(interfaceC2857WjC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C4085mp c4085mp = (C4085mp) interfaceC2857WjC;
            InterfaceC2857Wj interfaceC2857Wj = c4085mp.e;
            Object obj = c4085mp.g;
            InterfaceC3549gk context = interfaceC2857Wj.getContext();
            Object objC = AbstractC3181cc0.c(context, obj);
            C4857vf0 c4857vf0W = objC != AbstractC3181cc0.f4230a ? WD.W(interfaceC2857Wj, context, objC) : null;
            try {
                InterfaceC3549gk context2 = interfaceC2857Wj.getContext();
                Object objI = i();
                Throwable thF = f(objI);
                InterfaceC5000xE interfaceC5000xE = (thF == null && WD.y(this.c)) ? (InterfaceC5000xE) context2.get(G7.e) : null;
                if (interfaceC5000xE != null && !interfaceC5000xE.isActive()) {
                    CancellationException cancellationExceptionK = interfaceC5000xE.k();
                    b(objI, cancellationExceptionK);
                    interfaceC2857Wj.resumeWith(AbstractC3375el.v(cancellationExceptionK));
                } else if (thF != null) {
                    interfaceC2857Wj.resumeWith(AbstractC3375el.v(thF));
                } else {
                    interfaceC2857Wj.resumeWith(g(objI));
                }
                if (c4857vf0W == null || c4857vf0W.g0()) {
                    AbstractC3181cc0.a(context, objC);
                }
                try {
                    qm0.getClass();
                } catch (Throwable th) {
                    objV = AbstractC3375el.v(th);
                }
                h(null, IZ.a(objV));
            } catch (Throwable th2) {
                if (c4857vf0W == null || c4857vf0W.g0()) {
                    AbstractC3181cc0.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                qm0.getClass();
            } catch (Throwable th4) {
                objV = AbstractC3375el.v(th4);
            }
            h(th3, IZ.a(objV));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
