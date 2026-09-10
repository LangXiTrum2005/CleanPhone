package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2679Pn extends E9 {
    public final Q80 d;

    public C2679Pn(Q80 q80, int i) {
        super(i, q80.k - 1);
        this.d = q80;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3954lN
    public final long g() {
        a();
        return this.d.o[(int) this.c];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3954lN
    public final long i() {
        return this.d.b((int) this.c) + g();
    }
}
