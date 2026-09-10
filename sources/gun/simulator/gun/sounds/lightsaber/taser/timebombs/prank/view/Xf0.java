package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Xf0 extends AbstractC3899kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Xf0 f3986a = new Xf0();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatch(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        C2627Nn c2627Nn = C2627Nn.b;
        c2627Nn.f4347a.i(runnable, AbstractC4585sb0.h, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatchYield(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        C2627Nn c2627Nn = C2627Nn.b;
        c2627Nn.f4347a.i(runnable, AbstractC4585sb0.h, true);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final AbstractC3899kk limitedParallelism(int i) {
        WD.j(i);
        return i >= AbstractC4585sb0.d ? this : super.limitedParallelism(i);
    }
}
