package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class F9 implements InterfaceC2592Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f3055a;
    public final V20[] b;

    public F9(int[] iArr, V20[] v20Arr) {
        this.f3055a = iArr;
        this.b = v20Arr;
    }

    public final InterfaceC4326pd0 a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f3055a;
            if (i2 >= iArr.length) {
                AbstractC4038mJ.c();
                return new C4262oq();
            }
            if (i == iArr[i2]) {
                return this.b[i2];
            }
            i2++;
        }
    }
}
