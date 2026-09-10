package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2450Gr extends C3348eV {
    public final K40 l;
    public final Ma0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2450Gr(String str, int i) {
        super(str, null, i);
        AbstractC2995aW.q(str, "name");
        this.l = K40.f3299a;
        this.m = AbstractC2340Cl.I(new C2424Fr(i, str, this));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3348eV
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D40)) {
            return false;
        }
        D40 d40 = (D40) obj;
        if (d40.getKind() != K40.f3299a) {
            return false;
        }
        return AbstractC2995aW.i(this.f4321a, d40.h()) && AbstractC2995aW.i(AbstractC2871Wx.Q(this), AbstractC2871Wx.Q(d40));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3348eV, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final D40 g(int i) {
        return ((D40[]) this.m.getValue())[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3348eV, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final L40 getKind() {
        return this.l;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3348eV
    public final int hashCode() {
        int iHashCode = this.f4321a.hashCode();
        int iHashCode2 = 1;
        G40 g40 = new G40(this, 1);
        while (g40.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) g40.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3348eV
    public final String toString() {
        return AbstractC2853Wf.l0(new H40(this, 1), ", ", DM.l(new StringBuilder(), this.f4321a, '('), ")", null, 56);
    }
}
