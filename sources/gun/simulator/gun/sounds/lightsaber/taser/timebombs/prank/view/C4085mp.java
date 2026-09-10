package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4085mp extends AbstractC4349pp implements InterfaceC4690tk, InterfaceC2857Wj {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C4085mp.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final AbstractC3899kk d;
    public final InterfaceC2857Wj e;
    public Object f;
    public final Object g;

    public C4085mp(AbstractC3899kk abstractC3899kk, InterfaceC2857Wj interfaceC2857Wj) {
        super(-1);
        this.d = abstractC3899kk;
        this.e = interfaceC2857Wj;
        this.f = AbstractC4173np.f4762a;
        this.g = AbstractC3181cc0.b(interfaceC2857Wj.getContext());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4349pp
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C3102bh) {
            ((C3102bh) obj).b.invoke(cancellationException);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4690tk
    public final InterfaceC4690tk getCallerFrame() {
        InterfaceC2857Wj interfaceC2857Wj = this.e;
        if (interfaceC2857Wj instanceof InterfaceC4690tk) {
            return (InterfaceC4690tk) interfaceC2857Wj;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final InterfaceC3549gk getContext() {
        return this.e.getContext();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4349pp
    public final Object i() {
        Object obj = this.f;
        this.f = AbstractC4173np.f4762a;
        return obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final void resumeWith(Object obj) {
        InterfaceC2857Wj interfaceC2857Wj = this.e;
        InterfaceC3549gk context = interfaceC2857Wj.getContext();
        Throwable thA = IZ.a(obj);
        Object c3013ah = thA == null ? obj : new C3013ah(false, thA);
        AbstractC3899kk abstractC3899kk = this.d;
        if (abstractC3899kk.isDispatchNeeded(context)) {
            this.f = c3013ah;
            this.c = 0;
            abstractC3899kk.dispatch(context, this);
            return;
        }
        AbstractC3210cs abstractC3210csA = AbstractC3270dc0.a();
        if (abstractC3210csA.q()) {
            this.f = c3013ah;
            this.c = 0;
            abstractC3210csA.i(this);
            return;
        }
        abstractC3210csA.o(true);
        try {
            InterfaceC3549gk context2 = interfaceC2857Wj.getContext();
            Object objC = AbstractC3181cc0.c(context2, this.g);
            try {
                interfaceC2857Wj.resumeWith(obj);
                AbstractC3181cc0.a(context2, objC);
                while (abstractC3210csA.t()) {
                }
            } catch (Throwable th) {
                AbstractC3181cc0.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2, null);
            } finally {
                abstractC3210csA.g(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + AbstractC2340Cl.U(this.e) + ']';
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4349pp
    public final InterfaceC2857Wj c() {
        return this;
    }
}
