package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3140c5 extends S4 {
    public final int e;

    public C3140c5(int i, int i2, int i3) {
        super(i, i2, AbstractC3950lJ.p("0|", i3));
        this.e = i3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        C3443fb c3443fb = (C3443fb) c4991x70.b.get(this.e);
        if (c3443fb.A) {
            c3443fb.g = l(f2, f3, i, c3443fb.g, c3443fb.f4371a.g);
        }
    }
}
