package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.df0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3276df0 extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f4283a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f4283a, this.b);
        AbstractC2995aW.p(sArrCopyOf, "copyOf(this, newSize)");
        return new C3187cf0(sArrCopyOf);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        short[] sArr = this.f4283a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            AbstractC2995aW.p(sArrCopyOf, "copyOf(this, newSize)");
            this.f4283a = sArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
