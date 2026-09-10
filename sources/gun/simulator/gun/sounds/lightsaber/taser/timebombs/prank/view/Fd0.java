package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class Fd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f3076a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public AbstractC5170z9 f;
    public AbstractC5170z9 g;
    public AbstractC5170z9 h;
    public AbstractC5170z9 i;
    public AbstractC5170z9 j;
    public C3915kv k;
    public C3915kv l;
    public AbstractC5170z9 m;
    public AbstractC5170z9 n;
    public final boolean o;

    public Fd0(M4 m4) {
        H4 h4 = m4.f3390a;
        this.f = h4 == null ? null : h4.d();
        O4 o4 = m4.b;
        this.g = o4 == null ? null : o4.d();
        F4 f4 = m4.c;
        this.h = f4 == null ? null : f4.d();
        G4 g4 = m4.d;
        this.i = g4 == null ? null : g4.d();
        G4 g5 = m4.f;
        C3915kv c3915kvD = g5 == null ? null : g5.d();
        this.k = c3915kvD;
        this.o = m4.j;
        if (c3915kvD != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        G4 g6 = m4.g;
        this.l = g6 == null ? null : g6.d();
        F4 f5 = m4.e;
        if (f5 != null) {
            this.j = f5.d();
        }
        G4 g7 = m4.h;
        if (g7 != null) {
            this.m = g7.d();
        } else {
            this.m = null;
        }
        G4 g8 = m4.i;
        if (g8 != null) {
            this.n = g8.d();
        } else {
            this.n = null;
        }
    }

    public final void a(B9 b9) {
        b9.e(this.j);
        b9.e(this.m);
        b9.e(this.n);
        b9.e(this.f);
        b9.e(this.g);
        b9.e(this.h);
        b9.e(this.i);
        b9.e(this.k);
        b9.e(this.l);
    }

    public final void b(InterfaceC4818v9 interfaceC4818v9) {
        AbstractC5170z9 abstractC5170z9 = this.j;
        if (abstractC5170z9 != null) {
            abstractC5170z9.a(interfaceC4818v9);
        }
        AbstractC5170z9 abstractC5170z10 = this.m;
        if (abstractC5170z10 != null) {
            abstractC5170z10.a(interfaceC4818v9);
        }
        AbstractC5170z9 abstractC5170z11 = this.n;
        if (abstractC5170z11 != null) {
            abstractC5170z11.a(interfaceC4818v9);
        }
        AbstractC5170z9 abstractC5170z12 = this.f;
        if (abstractC5170z12 != null) {
            abstractC5170z12.a(interfaceC4818v9);
        }
        AbstractC5170z9 abstractC5170z13 = this.g;
        if (abstractC5170z13 != null) {
            abstractC5170z13.a(interfaceC4818v9);
        }
        AbstractC5170z9 abstractC5170z14 = this.h;
        if (abstractC5170z14 != null) {
            abstractC5170z14.a(interfaceC4818v9);
        }
        AbstractC5170z9 abstractC5170z15 = this.i;
        if (abstractC5170z15 != null) {
            abstractC5170z15.a(interfaceC4818v9);
        }
        C3915kv c3915kv = this.k;
        if (c3915kv != null) {
            c3915kv.a(interfaceC4818v9);
        }
        C3915kv c3915kv2 = this.l;
        if (c3915kv2 != null) {
            c3915kv2.a(interfaceC4818v9);
        }
    }

    public final boolean c(C4215oK c4215oK, Object obj) {
        if (obj == InterfaceC3689iK.f4497a) {
            AbstractC5170z9 abstractC5170z9 = this.f;
            if (abstractC5170z9 == null) {
                this.f = new C3103bh0(c4215oK, new PointF());
                return true;
            }
            abstractC5170z9.j(c4215oK);
            return true;
        }
        if (obj == InterfaceC3689iK.b) {
            AbstractC5170z9 abstractC5170z10 = this.g;
            if (abstractC5170z10 == null) {
                this.g = new C3103bh0(c4215oK, new PointF());
                return true;
            }
            abstractC5170z10.j(c4215oK);
            return true;
        }
        if (obj == InterfaceC3689iK.c) {
            AbstractC5170z9 abstractC5170z11 = this.g;
            if (abstractC5170z11 instanceof L80) {
                L80 l80 = (L80) abstractC5170z11;
                C4215oK c4215oK2 = l80.m;
                l80.m = c4215oK;
                return true;
            }
        }
        if (obj == InterfaceC3689iK.d) {
            AbstractC5170z9 abstractC5170z12 = this.g;
            if (abstractC5170z12 instanceof L80) {
                L80 l81 = (L80) abstractC5170z12;
                C4215oK c4215oK3 = l81.n;
                l81.n = c4215oK;
                return true;
            }
        }
        if (obj == InterfaceC3689iK.j) {
            AbstractC5170z9 abstractC5170z13 = this.h;
            if (abstractC5170z13 == null) {
                this.h = new C3103bh0(c4215oK, new Z20());
                return true;
            }
            abstractC5170z13.j(c4215oK);
            return true;
        }
        if (obj == InterfaceC3689iK.k) {
            AbstractC5170z9 abstractC5170z14 = this.i;
            if (abstractC5170z14 == null) {
                this.i = new C3103bh0(c4215oK, Float.valueOf(0.0f));
                return true;
            }
            abstractC5170z14.j(c4215oK);
            return true;
        }
        if (obj == 3) {
            AbstractC5170z9 abstractC5170z15 = this.j;
            if (abstractC5170z15 == null) {
                this.j = new C3103bh0(c4215oK, 100);
                return true;
            }
            abstractC5170z15.j(c4215oK);
            return true;
        }
        if (obj == InterfaceC3689iK.x) {
            AbstractC5170z9 abstractC5170z16 = this.m;
            if (abstractC5170z16 == null) {
                this.m = new C3103bh0(c4215oK, Float.valueOf(100.0f));
                return true;
            }
            abstractC5170z16.j(c4215oK);
            return true;
        }
        if (obj == InterfaceC3689iK.y) {
            AbstractC5170z9 abstractC5170z17 = this.n;
            if (abstractC5170z17 == null) {
                this.n = new C3103bh0(c4215oK, Float.valueOf(100.0f));
                return true;
            }
            abstractC5170z17.j(c4215oK);
            return true;
        }
        if (obj == InterfaceC3689iK.l) {
            if (this.k == null) {
                this.k = new C3915kv(Collections.singletonList(new C5090yG(Float.valueOf(0.0f))));
            }
            this.k.j(c4215oK);
            return true;
        }
        if (obj != InterfaceC3689iK.m) {
            return false;
        }
        if (this.l == null) {
            this.l = new C3915kv(Collections.singletonList(new C5090yG(Float.valueOf(0.0f))));
        }
        this.l.j(c4215oK);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        Z20 z20;
        PointF pointF2;
        Matrix matrix = this.f3076a;
        matrix.reset();
        AbstractC5170z9 abstractC5170z9 = this.g;
        if (abstractC5170z9 != null && (pointF2 = (PointF) abstractC5170z9.e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.o) {
            AbstractC5170z9 abstractC5170z10 = this.i;
            if (abstractC5170z10 != null) {
                float fFloatValue = abstractC5170z10 instanceof C3103bh0 ? ((Float) abstractC5170z10.e()).floatValue() : ((C3915kv) abstractC5170z10).k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (abstractC5170z9 != null) {
            float f2 = abstractC5170z9.d;
            PointF pointF3 = (PointF) abstractC5170z9.e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            abstractC5170z9.i(1.0E-4f + f2);
            PointF pointF4 = (PointF) abstractC5170z9.e();
            abstractC5170z9.i(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        C3915kv c3915kv = this.k;
        if (c3915kv != null) {
            C3915kv c3915kv2 = this.l;
            float fCos = c3915kv2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c3915kv2.k()) + 90.0f));
            C3915kv c3915kv3 = this.l;
            float fSin = c3915kv3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c3915kv3.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(c3915kv.k()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC5170z9 abstractC5170z11 = this.h;
        if (abstractC5170z11 != null && (z20 = (Z20) abstractC5170z11.e()) != null) {
            float f6 = z20.f4054a;
            if (f6 != 1.0f || z20.b != 1.0f) {
                matrix.preScale(f6, z20.b);
            }
        }
        AbstractC5170z9 abstractC5170z12 = this.f;
        if (abstractC5170z12 != null && (pointF = (PointF) abstractC5170z12.e()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        AbstractC5170z9 abstractC5170z9 = this.g;
        PointF pointF = abstractC5170z9 == null ? null : (PointF) abstractC5170z9.e();
        AbstractC5170z9 abstractC5170z10 = this.h;
        Z20 z20 = abstractC5170z10 == null ? null : (Z20) abstractC5170z10.e();
        Matrix matrix = this.f3076a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (z20 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(z20.f4054a, d), (float) Math.pow(z20.b, d));
        }
        AbstractC5170z9 abstractC5170z11 = this.i;
        if (abstractC5170z11 != null) {
            float fFloatValue = ((Float) abstractC5170z11.e()).floatValue();
            AbstractC5170z9 abstractC5170z12 = this.f;
            PointF pointF2 = abstractC5170z12 != null ? (PointF) abstractC5170z12.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
