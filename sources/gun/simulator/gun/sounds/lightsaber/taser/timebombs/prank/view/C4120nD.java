package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4120nD extends C3348eV {
    public final boolean l;

    public C4120nD(String str, C4208oD c4208oD) {
        super(str, c4208oD, 1);
        this.l = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3348eV
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4120nD) {
            D40 d40 = (D40) obj;
            if (AbstractC2995aW.i(this.f4321a, d40.h())) {
                C4120nD c4120nD = (C4120nD) obj;
                if (c4120nD.l && Arrays.equals((D40[]) this.j.getValue(), (D40[]) c4120nD.j.getValue())) {
                    int iD = d40.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (AbstractC2995aW.i(g(i2).h(), d40.g(i2).h()) && AbstractC2995aW.i(g(i2).getKind(), d40.g(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3348eV
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3348eV, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean isInline() {
        return this.l;
    }
}
