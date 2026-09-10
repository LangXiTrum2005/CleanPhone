package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class UV extends AbstractC3920l implements VV, InterfaceC2851Wd {
    public final InterfaceC2851Wd d;

    public UV(InterfaceC3549gk interfaceC3549gk, C2330Cb c2330Cb) {
        super(interfaceC3549gk, true);
        this.d = c2330Cb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final void B(CancellationException cancellationException) {
        this.d.a(cancellationException);
        A(cancellationException);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C5176zE(D(), null, this);
        }
        B(cancellationException);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3920l
    public final void d0(boolean z, Throwable th) throws IllegalAccessException, InvocationTargetException {
        if (this.d.q(th) || z) {
            return;
        }
        AbstractC2995aW.Q(this.c, th);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3920l
    public final void e0(Object obj) {
        this.d.q(null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final Object f(Object obj) {
        return this.d.f(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final Object g(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return this.d.g(obj, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final Object i(InterfaceC2857Wj interfaceC2857Wj) {
        return this.d.i(interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3920l, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final C5112yb iterator() {
        return this.d.iterator();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final void l(C4140nX c4140nX) {
        this.d.l(c4140nX);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final Object o() {
        return this.d.o();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final boolean q(Throwable th) {
        return this.d.q(th);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final Object t(InterfaceC2857Wj interfaceC2857Wj) {
        return this.d.t(interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final boolean u() {
        return this.d.u();
    }
}
