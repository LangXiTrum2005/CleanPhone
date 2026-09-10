package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4333ph extends C4157nh {
    public final VE c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4333ph(NF nf, VE ve) {
        super(nf);
        AbstractC2995aW.q(ve, "json");
        this.c = ve;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4157nh
    public final void a() {
        this.b = true;
        this.d++;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4157nh
    public final void b() {
        this.b = false;
        g("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            g(this.c.f3865a.g);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4157nh
    public final void j() {
        d(' ');
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4157nh
    public final void k() {
        this.d--;
    }
}
