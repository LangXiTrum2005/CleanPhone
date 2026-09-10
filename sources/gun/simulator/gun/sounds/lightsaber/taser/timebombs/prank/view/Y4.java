package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class Y4 extends AbstractC3405f5 {
    public final int c;

    public Y4(int i, int i2) {
        super(i, AbstractC3950lJ.p("7|", i2));
        this.c = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        C3443fb c3443fb = (C3443fb) c4991x70.b.get(this.c);
        if (c3443fb.A) {
            C3619hb c3619hb = c3443fb.f4371a;
            if (i2 == 2) {
                if (i == 1) {
                    c3443fb.y = c3619hb.l;
                    return;
                }
                return;
            }
            float[] fArr = this.b;
            if (f2 >= fArr[0]) {
                c3443fb.y = EnumC3531gb.d[(int) fArr[AbstractC3405f5.d(f2, fArr, 2) + 1]];
            } else if (i == 1 || i == 2) {
                c3443fb.y = c3619hb.l;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final int c() {
        return 2;
    }
}
