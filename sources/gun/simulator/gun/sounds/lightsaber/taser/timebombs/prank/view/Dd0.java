package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class Dd0 implements InterfaceC3630hg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ed0 f2979a;
    public final Array b;
    public final C3443fb c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public final Vector2 k = new Vector2();

    /* JADX WARN: Multi-variable type inference failed */
    public Dd0(Ed0 ed0, C4991x70 c4991x70) {
        if (ed0 == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (c4991x70 == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f2979a = ed0;
        Array array = ed0.d;
        this.b = new Array(array.size);
        Array.ArrayIterator it = array.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Array array2 = c4991x70.b;
            if (!zHasNext) {
                this.c = (C3443fb) array2.get(ed0.e.f4458a);
                this.d = ed0.f;
                this.e = ed0.g;
                this.f = ed0.h;
                this.g = ed0.i;
                this.h = ed0.j;
                this.i = ed0.k;
                return;
            }
            this.b.add((C3443fb) array2.get(((C3619hb) it.next()).f4458a));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3630hg0
    public final void a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = this.d;
        int i2 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
        if (i2 == 0 && this.e == 0.0f && this.f == 0.0f && this.g == 0.0f && this.h == 0.0f && this.i == 0.0f) {
            return;
        }
        Ed0 ed0 = this.f2979a;
        boolean z = ed0.s;
        C3443fb c3443fb = this.c;
        Array array = this.b;
        if (z) {
            if (ed0.r) {
                float f9 = this.e;
                float f10 = this.f;
                float f11 = this.g;
                float f12 = this.h;
                float f13 = this.i;
                Object[] objArr = array.items;
                int i3 = array.size;
                int i4 = 0;
                while (i4 < i3) {
                    C3443fb c3443fb2 = (C3443fb) objArr[i4];
                    c3443fb2.d(AbstractC3950lJ.B(c3443fb.l, ed0.m, f9, c3443fb2.l), AbstractC3950lJ.B(c3443fb.m, ed0.n, f10, c3443fb2.m), AbstractC3950lJ.B(c3443fb.n, ed0.l, f8, c3443fb2.n), ((((c3443fb.o - 1.0f) + ed0.o) * f11) + 1.0f) * c3443fb2.o, ((((c3443fb.p - 1.0f) + ed0.p) * f12) + 1.0f) * c3443fb2.p, c3443fb2.q, AbstractC3950lJ.B(c3443fb.r, ed0.q, f13, c3443fb2.r));
                    i4++;
                    f9 = f9;
                }
                return;
            }
            float f14 = this.e;
            float f15 = this.f;
            float f16 = this.g;
            float f17 = this.h;
            float f18 = this.i;
            Object[] objArr2 = array.items;
            int i5 = array.size;
            int i6 = 0;
            while (i6 < i5) {
                C3443fb c3443fb3 = (C3443fb) objArr2[i6];
                float f19 = c3443fb3.n;
                float fB = i2 != 0 ? AbstractC3950lJ.B(c3443fb.n - f19, ed0.l, f8, f19) : f19;
                float f20 = c3443fb3.l;
                float f21 = c3443fb3.m;
                Object[] objArr3 = objArr2;
                float fB2 = AbstractC3950lJ.B(c3443fb.l - f20, ed0.m, f14, f20);
                float fB3 = AbstractC3950lJ.B(c3443fb.m - f21, ed0.n, f15, f21);
                float f22 = c3443fb3.o;
                float f23 = c3443fb3.p;
                float f24 = (f16 == 0.0f || f22 == 0.0f) ? f22 : ((((c3443fb.o - f22) + ed0.o) * f16) + f22) / f22;
                float f25 = (f17 == 0.0f || f23 == 0.0f) ? f23 : ((((c3443fb.p - f23) + ed0.p) * f17) + f23) / f23;
                float fB4 = c3443fb3.r;
                if (f18 != 0.0f) {
                    fB4 = AbstractC3950lJ.B(c3443fb.r - fB4, ed0.q, f18, fB4);
                }
                c3443fb3.d(fB2, fB3, fB, f24, f25, c3443fb3.q, fB4);
                i6++;
                i5 = i5;
                objArr2 = objArr3;
            }
            return;
        }
        boolean z2 = ed0.r;
        Vector2 vector2 = this.k;
        if (z2) {
            float f26 = this.e;
            float f27 = this.f;
            float f28 = this.g;
            float f29 = this.h;
            float f30 = this.i;
            boolean z3 = (f26 == 0.0f && f27 == 0.0f) ? false : true;
            float f31 = c3443fb.s;
            float f32 = c3443fb.t;
            float f33 = c3443fb.v;
            float f34 = c3443fb.w;
            float f35 = (f31 * f34) - (f32 * f33) > 0.0f ? 0.017453292f : -0.017453292f;
            float f36 = ed0.l * f35;
            float f37 = ed0.q * f35;
            Object[] objArr4 = array.items;
            int i7 = array.size;
            float f38 = f34;
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i7;
                C3443fb c3443fb4 = (C3443fb) objArr4[i8];
                if (i2 != 0) {
                    float f39 = c3443fb4.s;
                    float f40 = c3443fb4.t;
                    float f41 = c3443fb4.v;
                    float f42 = c3443fb4.w;
                    float fJ = AbstractC2340Cl.j(f33, f31) + f36;
                    if (fJ > 3.1415927f) {
                        fJ -= 6.2831855f;
                    } else if (fJ < -3.1415927f) {
                        fJ += 6.2831855f;
                    }
                    double d = fJ * f8;
                    float fCos = (float) Math.cos(d);
                    float fSin = (float) Math.sin(d);
                    c3443fb4.s = (fCos * f39) - (fSin * f41);
                    c3443fb4.t = (fCos * f40) - (fSin * f42);
                    c3443fb4.v = (f41 * fCos) + (f39 * fSin);
                    c3443fb4.w = (fCos * f42) + (fSin * f40);
                }
                if (z3) {
                    c3443fb.b(vector2.set(ed0.m, ed0.n));
                    c3443fb4.u = (vector2.x * f26) + c3443fb4.u;
                    c3443fb4.x = (vector2.y * f27) + c3443fb4.x;
                }
                if (f28 != 0.0f) {
                    float fB5 = AbstractC3950lJ.B(((float) Math.sqrt((f33 * f33) + (f31 * f31))) - 1.0f, ed0.o, f28, 1.0f);
                    c3443fb4.s *= fB5;
                    c3443fb4.v *= fB5;
                }
                if (f29 != 0.0f) {
                    f4 = f29;
                    float fB6 = AbstractC3950lJ.B(((float) Math.sqrt((f38 * f38) + (f32 * f32))) - 1.0f, ed0.p, f4, 1.0f);
                    c3443fb4.t *= fB6;
                    c3443fb4.w *= fB6;
                } else {
                    f4 = f29;
                }
                if (f30 > 0.0f) {
                    f5 = f38;
                    f6 = f32;
                    f7 = f33;
                    float fJ2 = AbstractC2340Cl.j(f5, f6) - AbstractC2340Cl.j(f7, f31);
                    if (fJ2 > 3.1415927f) {
                        fJ2 -= 6.2831855f;
                    } else if (fJ2 < -3.1415927f) {
                        fJ2 += 6.2831855f;
                    }
                    float f43 = c3443fb4.t;
                    float f44 = c3443fb4.w;
                    float fJ3 = (((fJ2 - 1.5707964f) + f37) * f30) + AbstractC2340Cl.j(f44, f43);
                    float fSqrt = (float) Math.sqrt((f44 * f44) + (f43 * f43));
                    double d2 = fJ3;
                    c3443fb4.t = ((float) Math.cos(d2)) * fSqrt;
                    c3443fb4.w = ((float) Math.sin(d2)) * fSqrt;
                } else {
                    f5 = f38;
                    f6 = f32;
                    f7 = f33;
                }
                c3443fb4.c();
                f32 = f6;
                f38 = f5;
                f33 = f7;
                f26 = f26;
                i7 = i9;
                objArr4 = objArr4;
                i2 = i2;
                f36 = f36;
                f29 = f4;
                i8++;
                f8 = f8;
            }
            return;
        }
        float f45 = this.e;
        float f46 = this.f;
        float f47 = this.g;
        float f48 = this.h;
        float f49 = this.i;
        boolean z4 = (f45 == 0.0f && f46 == 0.0f) ? false : true;
        float f50 = c3443fb.s;
        float f51 = c3443fb.t;
        float f52 = c3443fb.v;
        float f53 = c3443fb.w;
        float f54 = (f50 * f53) - (f51 * f52) > 0.0f ? 0.017453292f : -0.017453292f;
        float f55 = ed0.l * f54;
        float f56 = ed0.q * f54;
        Object[] objArr5 = array.items;
        int i10 = array.size;
        float f57 = f56;
        int i11 = 0;
        while (i11 < i10) {
            Object[] objArr6 = objArr5;
            C3443fb c3443fb5 = (C3443fb) objArr5[i11];
            if (i2 != 0) {
                float f58 = c3443fb5.s;
                float f59 = c3443fb5.t;
                float f60 = c3443fb5.v;
                float f61 = c3443fb5.w;
                float fJ4 = (AbstractC2340Cl.j(f52, f50) - AbstractC2340Cl.j(f60, f58)) + f55;
                if (fJ4 > 3.1415927f) {
                    fJ4 -= 6.2831855f;
                } else if (fJ4 < -3.1415927f) {
                    fJ4 += 6.2831855f;
                }
                double d3 = fJ4 * f8;
                float fCos2 = (float) Math.cos(d3);
                float fSin2 = (float) Math.sin(d3);
                c3443fb5.s = (fCos2 * f58) - (fSin2 * f60);
                c3443fb5.t = (fCos2 * f59) - (fSin2 * f61);
                c3443fb5.v = (f60 * fCos2) + (f58 * fSin2);
                c3443fb5.w = (fCos2 * f61) + (fSin2 * f59);
            }
            if (z4) {
                c3443fb.b(vector2.set(ed0.m, ed0.n));
                float f62 = c3443fb5.u;
                c3443fb5.u = AbstractC5044xl.w(vector2.x, f62, f45, f62);
                float f63 = c3443fb5.x;
                f = f46;
                c3443fb5.x = AbstractC5044xl.w(vector2.y, f63, f, f63);
            } else {
                f = f46;
            }
            float f64 = 0.0f;
            if (f47 != 0.0f) {
                float f65 = c3443fb5.s;
                float f66 = c3443fb5.v;
                float fSqrt2 = (float) Math.sqrt((f66 * f66) + (f65 * f65));
                if (fSqrt2 != 0.0f) {
                    fSqrt2 = ((((((float) Math.sqrt((f52 * f52) + (f50 * f50))) - fSqrt2) + ed0.o) * f47) + fSqrt2) / fSqrt2;
                }
                c3443fb5.s *= fSqrt2;
                c3443fb5.v *= fSqrt2;
                f64 = 0.0f;
            }
            if (f48 != f64) {
                float f67 = c3443fb5.t;
                float f68 = c3443fb5.w;
                float fSqrt3 = (float) Math.sqrt((f68 * f68) + (f67 * f67));
                if (fSqrt3 != f64) {
                    fSqrt3 = ((((((float) Math.sqrt((f53 * f53) + (f51 * f51))) - fSqrt3) + ed0.p) * f48) + fSqrt3) / fSqrt3;
                }
                c3443fb5.t *= fSqrt3;
                c3443fb5.w *= fSqrt3;
                f64 = 0.0f;
            }
            if (f49 > f64) {
                float f69 = c3443fb5.t;
                float f70 = c3443fb5.w;
                float fJ5 = AbstractC2340Cl.j(f70, f69);
                f2 = f51;
                f3 = f52;
                float fJ6 = (AbstractC2340Cl.j(f53, f2) - AbstractC2340Cl.j(f3, f50)) - (fJ5 - AbstractC2340Cl.j(c3443fb5.v, c3443fb5.s));
                if (fJ6 > 3.1415927f) {
                    f53 = f53;
                    fJ6 -= 6.2831855f;
                } else {
                    if (fJ6 < -3.1415927f) {
                        f53 = f53;
                        fJ6 += 6.2831855f;
                    }
                    f53 = f53;
                }
                float fB7 = AbstractC3950lJ.B(fJ6, f57, f49, fJ5);
                f49 = f49;
                f57 = f57;
                float fSqrt4 = (float) Math.sqrt((f70 * f70) + (f69 * f69));
                double d4 = fB7;
                c3443fb5.t = ((float) Math.cos(d4)) * fSqrt4;
                c3443fb5.w = ((float) Math.sin(d4)) * fSqrt4;
            } else {
                f53 = f53;
                f2 = f51;
                f3 = f52;
            }
            c3443fb5.c();
            f46 = f;
            ed0 = ed0;
            f48 = f48;
            f51 = f2;
            f52 = f3;
            i10 = i10;
            f49 = f49;
            f45 = f45;
            f55 = f55;
            f47 = f47;
            i11++;
            objArr5 = objArr6;
        }
    }

    public final String toString() {
        return this.f2979a.f3179a;
    }
}
