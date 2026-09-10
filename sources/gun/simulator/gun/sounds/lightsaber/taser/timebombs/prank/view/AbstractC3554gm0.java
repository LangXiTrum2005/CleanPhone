package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3554gm0 extends AbstractC4860vh {
    public final G9 k;

    public AbstractC3554gm0(G9 g9) {
        this.k = g9;
    }

    public abstract void B(Gc0 gc0);

    public void C() {
        z(null, this.k);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final Gc0 j() {
        return this.k.j();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        return this.k.k();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final boolean l() {
        return this.k.l();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void o(Bd0 bd0) {
        this.j = bd0;
        this.i = Ug0.m(null);
        C();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final C5186zO v(Object obj, C5186zO c5186zO) {
        return A(c5186zO);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final long w(Object obj, long j) {
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final int x(Object obj, int i) {
        return i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final void y(Object obj, G9 g9, Gc0 gc0) {
        B(gc0);
    }

    public C5186zO A(C5186zO c5186zO) {
        return c5186zO;
    }
}
