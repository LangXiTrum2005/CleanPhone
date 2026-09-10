package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3739iv extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f4527a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f4527a, this.b);
        AbstractC2995aW.p(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        float[] fArr = this.f4527a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            AbstractC2995aW.p(fArrCopyOf, "copyOf(this, newSize)");
            this.f4527a = fArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
