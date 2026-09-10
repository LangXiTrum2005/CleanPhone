package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class W4 extends AbstractC3405f5 {
    public static final String[] d = {Integer.toString(13)};
    public final C2683Pr[] c;

    public W4(int i) {
        super(i, d);
        this.c = new C2683Pr[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        float f4;
        if (array == null) {
            return;
        }
        float[] fArr = this.b;
        int length = fArr.length;
        if (f > f2) {
            a(c4991x70, f, 2.1474836E9f, array, f3, i, i2);
            f4 = -1.0f;
        } else if (f >= fArr[length - 1]) {
            return;
        } else {
            f4 = f;
        }
        int i3 = 0;
        float f5 = fArr[0];
        if (f2 < f5) {
            return;
        }
        if (f4 >= f5) {
            int iE = AbstractC3405f5.e(fArr, f4) + 1;
            float f6 = fArr[iE];
            while (iE > 0 && fArr[iE - 1] == f6) {
                iE--;
            }
            i3 = iE;
        }
        while (i3 < length && f2 >= fArr[i3]) {
            array.add(this.c[i3]);
            i3++;
        }
    }
}
