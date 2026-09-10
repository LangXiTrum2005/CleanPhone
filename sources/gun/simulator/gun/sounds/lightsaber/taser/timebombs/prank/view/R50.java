package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class R50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3643a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.f3643a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(R50 r50) {
        AbstractC2995aW.q(r50, "other");
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            if (((1 << i) & r50.f3643a) != 0) {
                c(i, r50.b[i]);
            }
            i = i2;
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.f3643a = (1 << i) | this.f3643a;
            iArr[i] = i2;
        }
    }
}
