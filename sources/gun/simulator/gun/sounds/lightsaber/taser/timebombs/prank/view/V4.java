package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class V4 extends AbstractC3405f5 {
    public static final String[] d = {Integer.toString(14)};
    public final int[][] c;

    public V4(int i) {
        super(i, d);
        this.c = new int[i][];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        if (i2 == 2) {
            if (i == 1) {
                Array array2 = c4991x70.c;
                AbstractC2340Cl.i(0, array2.size, array2.items, c4991x70.d.items);
                return;
            }
            return;
        }
        float[] fArr = this.b;
        if (f2 < fArr[0]) {
            if (i == 1 || i == 2) {
                Array array3 = c4991x70.c;
                AbstractC2340Cl.i(0, array3.size, array3.items, c4991x70.d.items);
                return;
            }
            return;
        }
        int[] iArr = this.c[AbstractC3405f5.e(fArr, f2)];
        if (iArr == null) {
            Array array4 = c4991x70.c;
            AbstractC2340Cl.i(0, array4.size, array4.items, c4991x70.d.items);
            return;
        }
        Object[] objArr = c4991x70.c.items;
        T[] tArr = c4991x70.d.items;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            tArr[i3] = objArr[iArr[i3]];
        }
    }
}
