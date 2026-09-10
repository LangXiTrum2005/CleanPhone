package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class R4 extends AbstractC3405f5 {
    public final int c;
    public final String[] d;

    public R4(int i, int i2) {
        super(i, AbstractC3950lJ.p("11|", i2));
        this.c = i2;
        this.d = new String[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        Array array2 = c4991x70.c;
        int i3 = this.c;
        N70 n70 = (N70) array2.get(i3);
        if (n70.b.A) {
            O70 o70 = n70.f3442a;
            if (i2 == 2) {
                if (i == 1) {
                    String str = o70.f;
                    n70.a(str != null ? c4991x70.c(i3, str) : null);
                    return;
                }
                return;
            }
            float[] fArr = this.b;
            if (f2 >= fArr[0]) {
                String str2 = this.d[AbstractC3405f5.e(fArr, f2)];
                n70.a(str2 != null ? c4991x70.c(i3, str2) : null);
            } else if (i == 1 || i == 2) {
                String str3 = o70.f;
                n70.a(str3 != null ? c4991x70.c(i3, str3) : null);
            }
        }
    }
}
