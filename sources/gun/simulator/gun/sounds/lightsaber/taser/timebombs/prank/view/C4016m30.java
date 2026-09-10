package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4016m30 extends AbstractC3920l implements InterfaceC4690tk {
    public final InterfaceC2857Wj d;

    public C4016m30(InterfaceC2857Wj interfaceC2857Wj, InterfaceC3549gk interfaceC3549gk) {
        super(interfaceC3549gk, true);
        this.d = interfaceC2857Wj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final boolean R() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4690tk
    public final InterfaceC4690tk getCallerFrame() {
        InterfaceC2857Wj interfaceC2857Wj = this.d;
        if (interfaceC2857Wj instanceof InterfaceC4690tk) {
            return (InterfaceC4690tk) interfaceC2857Wj;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public void x(Object obj) {
        AbstractC4173np.a(AbstractC2995aW.j0(obj), null, WD.w(this.d));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public void y(Object obj) {
        this.d.resumeWith(AbstractC2995aW.j0(obj));
    }
}
