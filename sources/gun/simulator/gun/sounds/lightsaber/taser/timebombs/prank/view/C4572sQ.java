package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4572sQ implements InterfaceC2772Tc, InterfaceC5129yj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2798Uc f4979a;
    public final Object b;
    public final /* synthetic */ C4660tQ c;

    public C4572sQ(C4660tQ c4660tQ, C2798Uc c2798Uc, Object obj) {
        this.c = c4660tQ;
        this.f4979a = c2798Uc;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5129yj0
    public final void a(W30 w30, int i) {
        this.f4979a.a(w30, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final SE d(Throwable th) {
        return this.f4979a.d(th);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final boolean e(Throwable th) {
        return this.f4979a.e(th);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final InterfaceC3549gk getContext() {
        return this.f4979a.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final boolean isActive() {
        return this.f4979a.isActive();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final SE j(Object obj, InterfaceC2766Sw interfaceC2766Sw) {
        C4660tQ c4660tQ = this.c;
        C4484rQ c4484rQ = new C4484rQ(c4660tQ, this, 1);
        SE seF = this.f4979a.F((C5033xf0) obj, c4484rQ);
        if (seF != null) {
            C4660tQ.h.set(c4660tQ, this.b);
        }
        return seF;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final void n(InterfaceC2766Sw interfaceC2766Sw) {
        this.f4979a.n(interfaceC2766Sw);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final void r(AbstractC3899kk abstractC3899kk) throws IllegalAccessException, InvocationTargetException {
        this.f4979a.r(abstractC3899kk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        this.f4979a.resumeWith(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final void v(Object obj) {
        this.f4979a.v(obj);
    }
}
