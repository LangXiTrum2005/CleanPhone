package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5093yJ extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f5271a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f5271a, this.b);
        AbstractC2995aW.p(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        long[] jArr = this.f5271a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            AbstractC2995aW.p(jArrCopyOf, "copyOf(this, newSize)");
            this.f5271a = jArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
