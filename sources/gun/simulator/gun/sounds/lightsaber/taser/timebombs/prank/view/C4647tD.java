package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4647tD extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f5025a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f5025a, this.b);
        AbstractC2995aW.p(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        int[] iArr = this.f5025a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            AbstractC2995aW.p(iArrCopyOf, "copyOf(this, newSize)");
            this.f5025a = iArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
