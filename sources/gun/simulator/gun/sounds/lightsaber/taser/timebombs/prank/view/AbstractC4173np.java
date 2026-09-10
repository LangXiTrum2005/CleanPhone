package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4173np {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SE f4762a = new SE("UNDEFINED", 1);
    public static final SE b = new SE("REUSABLE_CLAIMED", 1);

    public static final void a(Object obj, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
        Object c3013ah;
        if (!(interfaceC2857Wj instanceof C4085mp)) {
            interfaceC2857Wj.resumeWith(obj);
            return;
        }
        C4085mp c4085mp = (C4085mp) interfaceC2857Wj;
        Throwable thA = IZ.a(obj);
        if (thA == null) {
            c3013ah = interfaceC2766Sw != null ? new C3102bh(interfaceC2766Sw, obj) : obj;
        } else {
            c3013ah = new C3013ah(false, thA);
        }
        InterfaceC2857Wj interfaceC2857Wj2 = c4085mp.e;
        InterfaceC3549gk context = interfaceC2857Wj2.getContext();
        AbstractC3899kk abstractC3899kk = c4085mp.d;
        if (abstractC3899kk.isDispatchNeeded(context)) {
            c4085mp.f = c3013ah;
            c4085mp.c = 1;
            abstractC3899kk.dispatch(interfaceC2857Wj2.getContext(), c4085mp);
            return;
        }
        AbstractC3210cs abstractC3210csA = AbstractC3270dc0.a();
        if (abstractC3210csA.q()) {
            c4085mp.f = c3013ah;
            c4085mp.c = 1;
            abstractC3210csA.i(c4085mp);
            return;
        }
        abstractC3210csA.o(true);
        try {
            InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) interfaceC2857Wj2.getContext().get(G7.e);
            if (interfaceC5000xE == null || interfaceC5000xE.isActive()) {
                Object obj2 = c4085mp.g;
                InterfaceC3549gk context2 = interfaceC2857Wj2.getContext();
                Object objC = AbstractC3181cc0.c(context2, obj2);
                C4857vf0 c4857vf0W = objC != AbstractC3181cc0.f4230a ? WD.W(interfaceC2857Wj2, context2, objC) : null;
                try {
                    interfaceC2857Wj2.resumeWith(obj);
                    if (c4857vf0W == null || c4857vf0W.g0()) {
                        AbstractC3181cc0.a(context2, objC);
                    }
                } catch (Throwable th) {
                    if (c4857vf0W == null || c4857vf0W.g0()) {
                        AbstractC3181cc0.a(context2, objC);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionK = interfaceC5000xE.k();
                c4085mp.b(c3013ah, cancellationExceptionK);
                c4085mp.resumeWith(AbstractC3375el.v(cancellationExceptionK));
            }
            while (abstractC3210csA.t()) {
            }
        } catch (Throwable th2) {
            try {
                c4085mp.h(th2, null);
            } finally {
                abstractC3210csA.g(true);
            }
        }
    }
}
