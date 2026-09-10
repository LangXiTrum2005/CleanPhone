package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3707ib extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f4508a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f4508a, this.b);
        AbstractC2995aW.p(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        boolean[] zArr = this.f4508a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            AbstractC2995aW.p(zArrCopyOf, "copyOf(this, newSize)");
            this.f4508a = zArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
