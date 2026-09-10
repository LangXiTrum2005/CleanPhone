package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2963a5 extends AbstractC3405f5 {
    public static final String[] d = {Integer.toString(27)};
    public final int c;

    public C2963a5(int i, int i2) {
        super(i, d);
        this.c = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        C4049mU c4049mU;
        float f4;
        int i3 = this.c;
        if (i3 != -1) {
            c4049mU = (C4049mU) c4991x70.h.get(i3);
            if (!c4049mU.y) {
                return;
            }
        } else {
            c4049mU = null;
        }
        C4049mU c4049mU2 = c4049mU;
        float[] fArr = this.b;
        if (f > f2) {
            a(c4991x70, f, 2.1474836E9f, null, f3, i, i2);
            f4 = -1.0f;
        } else if (f >= fArr[fArr.length - 1]) {
            return;
        } else {
            f4 = f;
        }
        float f5 = fArr[0];
        if (f2 < f5) {
            return;
        }
        if (f4 < f5 || f2 >= fArr[AbstractC3405f5.e(fArr, f4) + 1]) {
            if (c4049mU2 != null) {
                c4049mU2.b();
                return;
            }
            Array array2 = c4991x70.h;
            Object[] objArr = array2.items;
            int i4 = array2.size;
            for (int i5 = 0; i5 < i4; i5++) {
                C4049mU c4049mU3 = (C4049mU) objArr[i5];
                if (c4049mU3.y) {
                    c4049mU3.b();
                }
            }
        }
    }
}
