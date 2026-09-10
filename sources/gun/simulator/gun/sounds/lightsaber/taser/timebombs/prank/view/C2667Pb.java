package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2667Pb extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f3558a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f3558a, this.b);
        AbstractC2995aW.p(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        byte[] bArr = this.f3558a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            AbstractC2995aW.p(bArrCopyOf, "copyOf(this, newSize)");
            this.f3558a = bArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
