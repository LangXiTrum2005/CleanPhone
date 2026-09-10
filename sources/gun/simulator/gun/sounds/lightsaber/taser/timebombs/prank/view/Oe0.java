package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Oe0 extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f3512a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f3512a, this.b);
        AbstractC2995aW.p(bArrCopyOf, "copyOf(this, newSize)");
        return new Ne0(bArrCopyOf);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        byte[] bArr = this.f3512a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            AbstractC2995aW.p(bArrCopyOf, "copyOf(this, newSize)");
            this.f3512a = bArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
