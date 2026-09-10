package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4948wh extends B9 {
    public AbstractC5170z9 D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final Paint H;
    public float I;
    public boolean J;

    public C4948wh(C3160cK c3160cK, ZG zg, List list, MJ mj) {
        int i;
        B9 b9;
        B9 c4948wh;
        super(c3160cK, zg);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.J = true;
        G4 g4 = zg.s;
        if (g4 != null) {
            C3915kv c3915kvD = g4.d();
            this.D = c3915kvD;
            e(c3915kvD);
            this.D.a(this);
        } else {
            this.D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(mj.j.size());
        int size = list.size() - 1;
        B9 b10 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            ZG zg2 = (ZG) list.get(size);
            int iD = DM.D(zg2.e);
            if (iD == 0) {
                c4948wh = new C4948wh(c3160cK, zg2, (List) mj.c.get(zg2.g), mj);
            } else if (iD == 1) {
                c4948wh = new C4295pC(c3160cK, zg2, 1);
            } else if (iD == 2) {
                c4948wh = new C4295pC(c3160cK, zg2, 0);
            } else if (iD == 3) {
                c4948wh = new WR(c3160cK, zg2);
            } else if (iD == 4) {
                c4948wh = new C3672i60(mj, c3160cK, this, zg2);
            } else if (iD != 5) {
                AbstractC5005xJ.b("Unknown layer type ".concat(AbstractC5044xl.C(zg2.e)));
                c4948wh = null;
            } else {
                c4948wh = new Vb0(c3160cK, zg2);
            }
            if (c4948wh != null) {
                longSparseArray.put(c4948wh.p.d, c4948wh);
                if (b10 != null) {
                    b10.s = c4948wh;
                    b10 = null;
                } else {
                    this.E.add(0, c4948wh);
                    int iD2 = DM.D(zg2.u);
                    if (iD2 == 1 || iD2 == 2) {
                        b10 = c4948wh;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            B9 b11 = (B9) longSparseArray.get(longSparseArray.keyAt(i));
            if (b11 != null && (b9 = (B9) longSparseArray.get(b11.p.f)) != null) {
                b11.t = b9;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((B9) arrayList.get(size)).d(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        super.g(c4215oK, obj);
        if (obj == InterfaceC3689iK.z) {
            if (c4215oK == null) {
                AbstractC5170z9 abstractC5170z9 = this.D;
                if (abstractC5170z9 != null) {
                    abstractC5170z9.j(null);
                    return;
                }
                return;
            }
            C3103bh0 c3103bh0 = new C3103bh0(c4215oK, null);
            this.D = c3103bh0;
            c3103bh0.a(this);
            e(this.D);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final void j(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.G;
        ZG zg = this.p;
        rectF.set(0.0f, 0.0f, zg.o, zg.p);
        matrix.mapRect(rectF);
        boolean z = this.o.s;
        ArrayList arrayList = this.E;
        boolean z2 = z && arrayList.size() > 1 && i != 255;
        if (z2) {
            Paint paint = this.H;
            paint.setAlpha(i);
            AbstractC3014ah0.e(canvas, rectF, paint);
        } else {
            canvas.save();
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if ((!this.J && "__container".equals(zg.c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((B9) arrayList.get(size)).f(canvas, matrix, i);
            }
        }
        canvas.restore();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final void p(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((B9) arrayList2.get(i2)).c(c4738uG, i, arrayList, c4738uG2);
            i2++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final void q(boolean z) {
        super.q(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((B9) it.next()).q(z);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final void r(float f) {
        this.I = f;
        super.r(f);
        AbstractC5170z9 abstractC5170z9 = this.D;
        ZG zg = this.p;
        if (abstractC5170z9 != null) {
            MJ mj = this.o.f4216a;
            f = ((((Float) abstractC5170z9.e()).floatValue() * zg.b.n) - zg.b.l) / ((mj.m - mj.l) + 0.01f);
        }
        if (this.D == null) {
            MJ mj2 = zg.b;
            f -= zg.n / (mj2.m - mj2.l);
        }
        if (zg.m != 0.0f && !"__container".equals(zg.c)) {
            f /= zg.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((B9) arrayList.get(size)).r(f);
        }
    }
}
