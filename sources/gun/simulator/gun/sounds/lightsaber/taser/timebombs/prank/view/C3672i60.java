package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3672i60 extends B9 {
    public final C2623Nj D;
    public final C4948wh E;

    public C3672i60(MJ mj, C3160cK c3160cK, C4948wh c4948wh, ZG zg) {
        super(c3160cK, zg);
        this.E = c4948wh;
        C2623Nj c2623Nj = new C2623Nj(c3160cK, this, new C3408f60("__container", zg.f4062a, false), mj);
        this.D = c2623Nj;
        c2623Nj.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.d(rectF, this.n, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.D.f(canvas, matrix, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final NN k() {
        NN nn = this.p.w;
        return nn != null ? nn : this.E.p.w;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final L4 l() {
        L4 l4 = this.p.x;
        return l4 != null ? l4 : this.E.p.x;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final void p(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        this.D.c(c4738uG, i, arrayList, c4738uG2);
    }
}
