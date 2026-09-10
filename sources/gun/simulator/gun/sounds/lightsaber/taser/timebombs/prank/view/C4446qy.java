package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4446qy implements InterfaceC2837Vp, InterfaceC4818v9, InterfaceC4914wG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4909a;
    public final boolean b;
    public final B9 c;
    public final LongSparseArray d = new LongSparseArray();
    public final LongSparseArray e = new LongSparseArray();
    public final Path f;
    public final VG g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final AbstractC5170z9 k;
    public final AbstractC5170z9 l;
    public final AbstractC5170z9 m;
    public final AbstractC5170z9 n;
    public C3103bh0 o;
    public C3103bh0 p;
    public final C3160cK q;
    public final int r;
    public AbstractC5170z9 s;
    public float t;
    public final C3910kq u;

    public C4446qy(C3160cK c3160cK, MJ mj, B9 b9, C4358py c4358py) {
        Path path = new Path();
        this.f = path;
        this.g = new VG(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = b9;
        this.f4909a = c4358py.g;
        this.b = c4358py.h;
        this.q = c3160cK;
        this.j = c4358py.f4859a;
        path.setFillType(c4358py.b);
        this.r = (int) (mj.b() / 32.0f);
        AbstractC5170z9 abstractC5170z9D = c4358py.c.d();
        this.k = abstractC5170z9D;
        abstractC5170z9D.a(this);
        b9.e(abstractC5170z9D);
        AbstractC5170z9 abstractC5170z9D2 = c4358py.d.d();
        this.l = abstractC5170z9D2;
        abstractC5170z9D2.a(this);
        b9.e(abstractC5170z9D2);
        AbstractC5170z9 abstractC5170z9D3 = c4358py.e.d();
        this.m = abstractC5170z9D3;
        abstractC5170z9D3.a(this);
        b9.e(abstractC5170z9D3);
        AbstractC5170z9 abstractC5170z9D4 = c4358py.f.d();
        this.n = abstractC5170z9D4;
        abstractC5170z9D4.a(this);
        b9.e(abstractC5170z9D4);
        if (b9.k() != null) {
            C3915kv c3915kvD = ((G4) b9.k().b).d();
            this.s = c3915kvD;
            c3915kvD.a(this);
            b9.e(this.s);
        }
        if (b9.l() != null) {
            this.u = new C3910kq(this, b9, b9.l());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) list2.get(i);
            if (interfaceC2546Kj instanceof UT) {
                this.i.add((UT) interfaceC2546Kj);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void c(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        AbstractC5187zP.f(c4738uG, i, arrayList, c4738uG2, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((UT) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        C3103bh0 c3103bh0 = this.p;
        if (c3103bh0 != null) {
            Integer[] numArr = (Integer[]) c3103bh0.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void f(Canvas canvas, Matrix matrix, int i) {
        Shader linearGradient;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((UT) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        AbstractC5170z9 abstractC5170z9 = this.k;
        AbstractC5170z9 abstractC5170z10 = this.n;
        AbstractC5170z9 abstractC5170z11 = this.m;
        if (i3 == 1) {
            long jH = h();
            LongSparseArray longSparseArray = this.d;
            linearGradient = (LinearGradient) longSparseArray.get(jH);
            if (linearGradient == null) {
                PointF pointF = (PointF) abstractC5170z11.e();
                PointF pointF2 = (PointF) abstractC5170z10.e();
                C4182ny c4182ny = (C4182ny) abstractC5170z9.e();
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(c4182ny.b), c4182ny.f4768a, Shader.TileMode.CLAMP);
                longSparseArray.put(jH, linearGradient);
            }
        } else {
            long jH2 = h();
            LongSparseArray longSparseArray2 = this.e;
            linearGradient = (RadialGradient) longSparseArray2.get(jH2);
            if (linearGradient == null) {
                PointF pointF3 = (PointF) abstractC5170z11.e();
                PointF pointF4 = (PointF) abstractC5170z10.e();
                C4182ny c4182ny2 = (C4182ny) abstractC5170z9.e();
                int[] iArrE = e(c4182ny2.b);
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                RadialGradient radialGradient = new RadialGradient(f, f2, fHypot <= 0.0f ? 0.001f : fHypot, iArrE, c4182ny2.f4768a, Shader.TileMode.CLAMP);
                longSparseArray2.put(jH2, radialGradient);
                linearGradient = radialGradient;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        VG vg = this.g;
        vg.setShader(linearGradient);
        C3103bh0 c3103bh0 = this.o;
        if (c3103bh0 != null) {
            vg.setColorFilter((ColorFilter) c3103bh0.e());
        }
        AbstractC5170z9 abstractC5170z12 = this.s;
        if (abstractC5170z12 != null) {
            float fFloatValue = ((Float) abstractC5170z12.e()).floatValue();
            if (fFloatValue == 0.0f) {
                vg.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                vg.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float f3 = i / 255.0f;
        int iIntValue = (int) (((((Integer) this.l.e()).intValue() * f3) / 100.0f) * 255.0f);
        PointF pointF5 = AbstractC5187zP.f5324a;
        vg.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        C3910kq c3910kq = this.u;
        if (c3910kq != null) {
            Xg0 xg0 = AbstractC3014ah0.f4135a;
            c3910kq.b(vg, matrix, (int) (((f3 * iIntValue) / 255.0f) * 255.0f));
        }
        canvas.drawPath(path, vg);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        PointF pointF = InterfaceC3689iK.f4497a;
        if (obj == 4) {
            this.l.j(c4215oK);
            return;
        }
        ColorFilter colorFilter = InterfaceC3689iK.F;
        B9 b9 = this.c;
        if (obj == colorFilter) {
            C3103bh0 c3103bh0 = this.o;
            if (c3103bh0 != null) {
                b9.o(c3103bh0);
            }
            if (c4215oK == null) {
                this.o = null;
                return;
            }
            C3103bh0 c3103bh1 = new C3103bh0(c4215oK, null);
            this.o = c3103bh1;
            c3103bh1.a(this);
            b9.e(this.o);
            return;
        }
        if (obj == InterfaceC3689iK.G) {
            C3103bh0 c3103bh2 = this.p;
            if (c3103bh2 != null) {
                b9.o(c3103bh2);
            }
            if (c4215oK == null) {
                this.p = null;
                return;
            }
            this.d.clear();
            this.e.clear();
            C3103bh0 c3103bh3 = new C3103bh0(c4215oK, null);
            this.p = c3103bh3;
            c3103bh3.a(this);
            b9.e(this.p);
            return;
        }
        if (obj == InterfaceC3689iK.e) {
            AbstractC5170z9 abstractC5170z9 = this.s;
            if (abstractC5170z9 != null) {
                abstractC5170z9.j(c4215oK);
                return;
            }
            C3103bh0 c3103bh4 = new C3103bh0(c4215oK, null);
            this.s = c3103bh4;
            c3103bh4.a(this);
            b9.e(this.s);
            return;
        }
        C3910kq c3910kq = this.u;
        if (obj == 5 && c3910kq != null) {
            c3910kq.c.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.B && c3910kq != null) {
            c3910kq.c(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.C && c3910kq != null) {
            c3910kq.e.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.D && c3910kq != null) {
            c3910kq.f.j(c4215oK);
        } else {
            if (obj != InterfaceC3689iK.E || c3910kq == null) {
                return;
            }
            c3910kq.g.j(c4215oK);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.f4909a;
    }

    public final int h() {
        float f = this.m.d;
        int i = this.r;
        int iRound = Math.round(f * i);
        int iRound2 = Math.round(this.n.d * i);
        int iRound3 = Math.round(this.k.d * i);
        int i2 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }
}
