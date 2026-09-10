package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3414f90 implements InterfaceC2857Wj, InterfaceC4690tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2857Wj f4357a;
    public final InterfaceC3549gk b;

    public C3414f90(InterfaceC2857Wj interfaceC2857Wj, InterfaceC3549gk interfaceC3549gk) {
        this.f4357a = interfaceC2857Wj;
        this.b = interfaceC3549gk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4690tk
    public final InterfaceC4690tk getCallerFrame() {
        InterfaceC2857Wj interfaceC2857Wj = this.f4357a;
        if (interfaceC2857Wj instanceof InterfaceC4690tk) {
            return (InterfaceC4690tk) interfaceC2857Wj;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final InterfaceC3549gk getContext() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final void resumeWith(Object obj) {
        this.f4357a.resumeWith(obj);
    }
}
