package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2552Kp extends AbstractC2578Lp {
    public final /* synthetic */ int h;

    public C2552Kp(int i) {
        this.h = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2578Lp
    public final int a(int i, int i2, int i3, int i4) {
        switch (this.h) {
            case 2:
                if (b(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return AbstractC2578Lp.f3375a.a(i, i2, i3, i4);
            case 3:
            default:
                return 2;
            case 4:
                return AbstractC2578Lp.g ? 2 : 1;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2578Lp
    public final float b(int i, int i2, int i3, int i4) {
        switch (this.h) {
            case 2:
                return Math.min(1.0f, AbstractC2578Lp.f3375a.b(i, i2, i3, i4));
            case 3:
                return Math.max(i3 / i, i4 / i2);
            case 4:
                if (AbstractC2578Lp.g) {
                    return Math.min(i3 / i, i4 / i2);
                }
                int iMax = Math.max(i2 / i4, i / i3);
                return iMax != 0 ? 1.0f / Integer.highestOneBit(iMax) : 1.0f;
            default:
                return 1.0f;
        }
    }
}
