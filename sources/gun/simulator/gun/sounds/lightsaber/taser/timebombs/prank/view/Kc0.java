package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Kc0 extends C4016m30 implements Runnable {
    public final long e;

    public Kc0(long j, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj, interfaceC2857Wj.getContext());
        this.e = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3920l, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final String U() {
        return super.U() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2995aW.G(this.c);
        A(new Jc0("Timed out waiting for " + this.e + " ms", this));
    }
}
