package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class JF extends r {
    public final IF e;

    public JF(VE ve, IF r2) {
        super(ve);
        this.e = r2;
        this.f2871a.add("primitive");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r
    public final AbstractC4122nF R(String str) {
        AbstractC2995aW.q(str, "tag");
        if (str == "primitive") {
            return this.e;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r
    public final AbstractC4122nF U() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final int k(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return 0;
    }
}
