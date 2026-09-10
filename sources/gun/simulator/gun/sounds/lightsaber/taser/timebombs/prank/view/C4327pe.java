package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4327pe extends AbstractC5193zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f4842a;
    public int b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f4842a, this.b);
        AbstractC2995aW.p(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final void b(int i) {
        char[] cArr = this.f4842a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            AbstractC2995aW.p(cArrCopyOf, "copyOf(this, newSize)");
            this.f4842a = cArrCopyOf;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5193zV
    public final int d() {
        return this.b;
    }
}
