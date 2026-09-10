package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.da0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3266da0 extends R9 {
    public final B9 r;
    public final String s;
    public final boolean t;
    public final AbstractC5170z9 u;
    public C3103bh0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3266da0(C3160cK c3160cK, B9 b9, C3934l60 c3934l60) {
        int iD = DM.D(c3934l60.g);
        Paint.Cap cap = iD != 0 ? iD != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iD2 = DM.D(c3934l60.h);
        super(c3160cK, b9, cap, iD2 != 0 ? iD2 != 1 ? iD2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, c3934l60.i, c3934l60.e, c3934l60.f, c3934l60.c, c3934l60.b);
        this.r = b9;
        this.s = c3934l60.f4631a;
        this.t = c3934l60.j;
        AbstractC5170z9 abstractC5170z9D = c3934l60.d.d();
        this.u = abstractC5170z9D;
        abstractC5170z9D.a(this);
        b9.e(abstractC5170z9D);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void f(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        C2905Yf c2905Yf = (C2905Yf) this.u;
        int iK = c2905Yf.k(c2905Yf.c.f(), c2905Yf.c());
        VG vg = this.i;
        vg.setColor(iK);
        C3103bh0 c3103bh0 = this.v;
        if (c3103bh0 != null) {
            vg.setColorFilter((ColorFilter) c3103bh0.e());
        }
        super.f(canvas, matrix, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        super.g(c4215oK, obj);
        PointF pointF = InterfaceC3689iK.f4497a;
        AbstractC5170z9 abstractC5170z9 = this.u;
        if (obj == 2) {
            abstractC5170z9.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.F) {
            C3103bh0 c3103bh0 = this.v;
            B9 b9 = this.r;
            if (c3103bh0 != null) {
                b9.o(c3103bh0);
            }
            if (c4215oK == null) {
                this.v = null;
                return;
            }
            C3103bh0 c3103bh1 = new C3103bh0(c4215oK, null);
            this.v = c3103bh1;
            c3103bh1.a(this);
            b9.e(abstractC5170z9);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.s;
    }
}
