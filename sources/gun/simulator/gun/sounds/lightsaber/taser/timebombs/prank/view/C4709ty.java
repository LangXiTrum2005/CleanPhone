package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4709ty extends R9 {
    public final AbstractC5170z9 A;
    public C3103bh0 B;
    public final String r;
    public final boolean s;
    public final LongSparseArray t;
    public final LongSparseArray u;
    public final RectF v;
    public final int w;
    public final int x;
    public final AbstractC5170z9 y;
    public final AbstractC5170z9 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4709ty(C3160cK c3160cK, B9 b9, C4621sy c4621sy) {
        int iD = DM.D(c4621sy.h);
        Paint.Cap cap = iD != 0 ? iD != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iD2 = DM.D(c4621sy.i);
        super(c3160cK, b9, cap, iD2 != 0 ? iD2 != 1 ? iD2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, c4621sy.j, c4621sy.d, c4621sy.g, c4621sy.k, c4621sy.l);
        this.t = new LongSparseArray();
        this.u = new LongSparseArray();
        this.v = new RectF();
        this.r = c4621sy.f5006a;
        this.w = c4621sy.b;
        this.s = c4621sy.m;
        this.x = (int) (c3160cK.f4216a.b() / 32.0f);
        AbstractC5170z9 abstractC5170z9D = c4621sy.c.d();
        this.y = abstractC5170z9D;
        abstractC5170z9D.a(this);
        b9.e(abstractC5170z9D);
        AbstractC5170z9 abstractC5170z9D2 = c4621sy.e.d();
        this.z = abstractC5170z9D2;
        abstractC5170z9D2.a(this);
        b9.e(abstractC5170z9D2);
        AbstractC5170z9 abstractC5170z9D3 = c4621sy.f.d();
        this.A = abstractC5170z9D3;
        abstractC5170z9D3.a(this);
        b9.e(abstractC5170z9D3);
    }

    public final int[] e(int[] iArr) {
        C3103bh0 c3103bh0 = this.B;
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void f(Canvas canvas, Matrix matrix, int i) {
        Shader linearGradient;
        if (this.s) {
            return;
        }
        d(this.v, matrix, false);
        int i2 = this.w;
        AbstractC5170z9 abstractC5170z9 = this.y;
        AbstractC5170z9 abstractC5170z10 = this.A;
        AbstractC5170z9 abstractC5170z11 = this.z;
        if (i2 == 1) {
            long jH = h();
            LongSparseArray longSparseArray = this.t;
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
            LongSparseArray longSparseArray2 = this.u;
            linearGradient = (RadialGradient) longSparseArray2.get(jH2);
            if (linearGradient == null) {
                PointF pointF3 = (PointF) abstractC5170z11.e();
                PointF pointF4 = (PointF) abstractC5170z10.e();
                C4182ny c4182ny2 = (C4182ny) abstractC5170z9.e();
                int[] iArrE = e(c4182ny2.b);
                float f = pointF3.x;
                float f2 = pointF3.y;
                RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrE, c4182ny2.f4768a, Shader.TileMode.CLAMP);
                longSparseArray2.put(jH2, radialGradient);
                linearGradient = radialGradient;
            }
        }
        this.i.setShader(linearGradient);
        super.f(canvas, matrix, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        super.g(c4215oK, obj);
        if (obj == InterfaceC3689iK.G) {
            C3103bh0 c3103bh0 = this.B;
            B9 b9 = this.f;
            if (c3103bh0 != null) {
                b9.o(c3103bh0);
            }
            if (c4215oK == null) {
                this.B = null;
                return;
            }
            C3103bh0 c3103bh1 = new C3103bh0(c4215oK, null);
            this.B = c3103bh1;
            c3103bh1.a(this);
            b9.e(this.B);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.r;
    }

    public final int h() {
        float f = this.z.d;
        int i = this.x;
        int iRound = Math.round(f * i);
        int iRound2 = Math.round(this.A.d * i);
        int iRound3 = Math.round(this.y.d * i);
        int i2 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }
}
