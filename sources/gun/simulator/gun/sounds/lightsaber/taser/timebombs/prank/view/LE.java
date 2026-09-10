package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class LE extends C2798Uc {
    public final PE i;

    public LE(InterfaceC2857Wj interfaceC2857Wj, PE pe) {
        super(1, interfaceC2857Wj);
        this.i = pe;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc
    public final Throwable q(PE pe) {
        Throwable thC;
        Object objN = this.i.N();
        if (!(objN instanceof NE) || (thC = ((NE) objN).c()) == null) {
            return objN instanceof C3013ah ? ((C3013ah) objN).f4134a : pe.k();
        }
        return thC;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc
    public final String z() {
        return "AwaitContinuation";
    }
}
