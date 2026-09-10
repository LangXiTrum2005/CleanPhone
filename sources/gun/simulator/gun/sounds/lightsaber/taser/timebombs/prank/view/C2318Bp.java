package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2318Bp extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f2894a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f2894a, this.b);
        AbstractC2995aW.p(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        double[] dArr = this.f2894a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            AbstractC2995aW.p(dArrCopyOf, "copyOf(this, newSize)");
            this.f2894a = dArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
