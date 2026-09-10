package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3443fb implements InterfaceC3630hg0 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3619hb f4371a;
    public final C4991x70 b;
    public final C3443fb c;
    public final Array d = new Array();
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public EnumC3531gb y;
    public boolean z;

    public C3443fb(C3619hb c3619hb, C4991x70 c4991x70, C3443fb c3443fb) {
        if (c4991x70 == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f4371a = c3619hb;
        this.b = c4991x70;
        this.c = c3443fb;
        this.e = c3619hb.e;
        this.f = c3619hb.f;
        this.g = c3619hb.g;
        this.h = c3619hb.h;
        this.i = c3619hb.i;
        this.j = c3619hb.j;
        this.k = c3619hb.k;
        this.y = c3619hb.l;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3630hg0
    public final void a(int i) {
        d(this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final void b(Vector2 vector2) {
        if (vector2 == null) {
            throw new IllegalArgumentException("local cannot be null.");
        }
        float f = vector2.x;
        float f2 = vector2.y;
        vector2.x = (this.t * f2) + (this.s * f) + this.u;
        vector2.y = (f2 * this.w) + (f * this.v) + this.x;
    }

    public final void c() {
        float f;
        float f2;
        float f3;
        float f4;
        C4991x70 c4991x70 = this.b;
        C3443fb c3443fb = this.c;
        if (c3443fb == null) {
            this.l = this.u - c4991x70.k;
            this.m = this.x - c4991x70.l;
            float f5 = this.s;
            float f6 = this.t;
            float f7 = this.v;
            float f8 = this.w;
            this.n = AbstractC2340Cl.k(f7, f5);
            this.o = (float) Math.sqrt((f7 * f7) + (f5 * f5));
            this.p = (float) Math.sqrt((f8 * f8) + (f6 * f6));
            this.q = 0.0f;
            this.r = AbstractC2340Cl.k((f7 * f8) + (f5 * f6), (f5 * f8) - (f6 * f7));
            return;
        }
        float f9 = c3443fb.s;
        float f10 = c3443fb.t;
        float f11 = c3443fb.v;
        float f12 = c3443fb.w;
        float f13 = (f9 * f12) - (f10 * f11);
        float f14 = 1.0f / f13;
        float f15 = f12 * f14;
        float f16 = f10 * f14;
        float f17 = f11 * f14;
        float f18 = f9 * f14;
        float f19 = this.u - c3443fb.u;
        float f20 = this.x - c3443fb.x;
        this.l = (f19 * f15) - (f20 * f16);
        this.m = (f20 * f18) - (f19 * f17);
        EnumC3531gb enumC3531gb = this.y;
        if (enumC3531gb == EnumC3531gb.b) {
            f3 = this.s;
            f4 = this.t;
            f = this.v;
            f2 = this.w;
        } else {
            int iOrdinal = enumC3531gb.ordinal();
            if (iOrdinal == 2) {
                float fAbs = Math.abs(f13) / ((f11 * f11) + (f9 * f9));
                float f21 = c4991x70.m;
                float f22 = c4991x70.n;
                float f23 = (((-f11) * f21) * fAbs) / f22;
                float f24 = ((f22 * f9) * fAbs) / f21;
                float f25 = 1.0f / ((f9 * f24) - (f11 * f23));
                f15 = f24 * f25;
                f16 = f23 * f25;
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                double d = this.g * 0.017453292f;
                float fCos = (float) Math.cos(d);
                float fSin = (float) Math.sin(d);
                float f26 = ((f10 * fSin) + (f9 * fCos)) / c4991x70.m;
                float f27 = ((f12 * fSin) + (f11 * fCos)) / c4991x70.n;
                float fSqrt = (float) Math.sqrt((f27 * f27) + (f26 * f26));
                if (fSqrt > 1.0E-5f) {
                    fSqrt = 1.0f / fSqrt;
                }
                float f28 = f26 * fSqrt;
                float f29 = f27 * fSqrt;
                float fSqrt2 = (float) Math.sqrt((f29 * f29) + (f28 * f28));
                if (this.y == EnumC3531gb.c) {
                    if ((f14 < 0.0f) != (((c4991x70.m > 0.0f ? 1 : (c4991x70.m == 0.0f ? 0 : -1)) < 0) != ((c4991x70.n > 0.0f ? 1 : (c4991x70.n == 0.0f ? 0 : -1)) < 0))) {
                        fSqrt2 = -fSqrt2;
                    }
                }
                double dJ = AbstractC2340Cl.j(f29, f28) + 1.5707964f;
                float fCos2 = ((float) Math.cos(dJ)) * fSqrt2;
                float fSin2 = ((float) Math.sin(dJ)) * fSqrt2;
                float f30 = 1.0f / ((f28 * fSin2) - (fCos2 * f29));
                f15 = fSin2 * f30;
                f16 = fCos2 * f30;
                f17 = f29 * f30;
                f18 = f28 * f30;
            }
            float f31 = this.s;
            float f32 = this.v;
            float f33 = (f15 * f31) - (f16 * f32);
            float f34 = this.t;
            float f35 = this.w;
            float f36 = (f15 * f34) - (f16 * f35);
            f = (f32 * f18) - (f31 * f17);
            f2 = (f18 * f35) - (f17 * f34);
            f3 = f33;
            f4 = f36;
        }
        this.q = 0.0f;
        float fSqrt3 = (float) Math.sqrt((f * f) + (f3 * f3));
        this.o = fSqrt3;
        if (fSqrt3 > 1.0E-4f) {
            float f37 = (f3 * f2) - (f4 * f);
            this.p = f37 / fSqrt3;
            this.r = -AbstractC2340Cl.k((f2 * f) + (f4 * f3), f37);
            this.n = AbstractC2340Cl.k(f, f3);
            return;
        }
        this.o = 0.0f;
        this.p = (float) Math.sqrt((f2 * f2) + (f4 * f4));
        this.r = 0.0f;
        this.n = 90.0f - AbstractC2340Cl.k(f2, f4);
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float fK;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = f5;
        this.q = f6;
        this.r = f7;
        C4991x70 c4991x70 = this.b;
        C3443fb c3443fb = this.c;
        if (c3443fb == null) {
            float f9 = c4991x70.m;
            double d = (f6 + f3) * 0.017453292f;
            this.s = ((float) Math.cos(d)) * f4 * f9;
            double d2 = (f3 + 90.0f + f7) * 0.017453292f;
            this.t = ((float) Math.cos(d2)) * f5 * f9;
            float fSin = ((float) Math.sin(d)) * f4;
            float f10 = c4991x70.n;
            this.v = fSin * f10;
            this.w = ((float) Math.sin(d2)) * f5 * f10;
            this.u = (f * f9) + c4991x70.k;
            this.x = (f2 * f10) + c4991x70.l;
            return;
        }
        float f11 = c3443fb.s;
        float f12 = c3443fb.t;
        float f13 = c3443fb.v;
        float f14 = c3443fb.w;
        this.u = (f12 * f2) + (f11 * f) + c3443fb.u;
        this.x = (f2 * f14) + (f * f13) + c3443fb.x;
        int iOrdinal = this.y.ordinal();
        if (iOrdinal == 0) {
            double d3 = (f3 + f6) * 0.017453292f;
            float fCos = ((float) Math.cos(d3)) * f4;
            double d4 = (f3 + 90.0f + f7) * 0.017453292f;
            float fCos2 = ((float) Math.cos(d4)) * f5;
            float fSin2 = ((float) Math.sin(d3)) * f4;
            float fSin3 = ((float) Math.sin(d4)) * f5;
            this.s = (f12 * fSin2) + (f11 * fCos);
            this.t = (f12 * fSin3) + (f11 * fCos2);
            this.v = (fSin2 * f14) + (fCos * f13);
            this.w = (f14 * fSin3) + (f13 * fCos2);
            return;
        }
        if (iOrdinal != 1) {
            float f15 = 0.0f;
            if (iOrdinal == 2) {
                float f16 = 1.0f / c4991x70.m;
                float f17 = 1.0f / c4991x70.n;
                float f18 = f11 * f16;
                float f19 = f13 * f17;
                float f20 = (f19 * f19) + (f18 * f18);
                if (f20 > 1.0E-4f) {
                    float fAbs = Math.abs(((f14 * f18) * f17) - ((f12 * f16) * f19)) / f20;
                    f12 = f19 * fAbs;
                    f14 = f18 * fAbs;
                    fK = AbstractC2340Cl.k(f19, f18);
                    f15 = f18;
                    f8 = 90.0f;
                } else {
                    f8 = 90.0f;
                    fK = 90.0f - AbstractC2340Cl.k(f14, f12);
                    f19 = 0.0f;
                }
                float f21 = (((f3 + f7) - fK) + f8) * 0.017453292f;
                double d5 = ((f6 + f3) - fK) * 0.017453292f;
                float fCos3 = ((float) Math.cos(d5)) * f4;
                double d6 = f21;
                float fCos4 = ((float) Math.cos(d6)) * f5;
                float fSin4 = ((float) Math.sin(d5)) * f4;
                float fSin5 = ((float) Math.sin(d6)) * f5;
                this.s = (f15 * fCos3) - (f12 * fSin4);
                this.t = (f15 * fCos4) - (f12 * fSin5);
                this.v = (fSin4 * f14) + (fCos3 * f19);
                this.w = (f14 * fSin5) + (f19 * fCos4);
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                double d7 = f3 * 0.017453292f;
                float fCos5 = (float) Math.cos(d7);
                float fSin6 = (float) Math.sin(d7);
                float f22 = ((f12 * fSin6) + (f11 * fCos5)) / c4991x70.m;
                float f23 = ((fSin6 * f14) + (fCos5 * f13)) / c4991x70.n;
                float fSqrt = (float) Math.sqrt((f23 * f23) + (f22 * f22));
                if (fSqrt > 1.0E-5f) {
                    fSqrt = 1.0f / fSqrt;
                }
                float f24 = f22 * fSqrt;
                float f25 = f23 * fSqrt;
                float fSqrt2 = (float) Math.sqrt((f25 * f25) + (f24 * f24));
                if (this.y == EnumC3531gb.c) {
                    if (((f11 * f14) - (f12 * f13) < 0.0f) != (((c4991x70.m > 0.0f ? 1 : (c4991x70.m == 0.0f ? 0 : -1)) < 0) != ((c4991x70.n > 0.0f ? 1 : (c4991x70.n == 0.0f ? 0 : -1)) < 0))) {
                        fSqrt2 = -fSqrt2;
                    }
                }
                double dJ = AbstractC2340Cl.j(f25, f24) + 1.5707964f;
                float fCos6 = ((float) Math.cos(dJ)) * fSqrt2;
                float fSin7 = ((float) Math.sin(dJ)) * fSqrt2;
                double d8 = f6 * 0.017453292f;
                float fCos7 = ((float) Math.cos(d8)) * f4;
                double d9 = (90.0f + f7) * 0.017453292f;
                float fCos8 = ((float) Math.cos(d9)) * f5;
                float fSin8 = ((float) Math.sin(d8)) * f4;
                float fSin9 = ((float) Math.sin(d9)) * f5;
                this.s = (fCos6 * fSin8) + (f24 * fCos7);
                this.t = (fCos6 * fSin9) + (f24 * fCos8);
                this.v = (fSin8 * fSin7) + (fCos7 * f25);
                this.w = (fSin7 * fSin9) + (f25 * fCos8);
            }
        } else {
            double d10 = (f3 + f6) * 0.017453292f;
            this.s = ((float) Math.cos(d10)) * f4;
            double d11 = (f3 + 90.0f + f7) * 0.017453292f;
            this.t = ((float) Math.cos(d11)) * f5;
            this.v = ((float) Math.sin(d10)) * f4;
            this.w = ((float) Math.sin(d11)) * f5;
        }
        float f26 = this.s;
        float f27 = c4991x70.m;
        this.s = f26 * f27;
        this.t *= f27;
        float f28 = this.v;
        float f29 = c4991x70.n;
        this.v = f28 * f29;
        this.w *= f29;
    }

    public final String toString() {
        return this.f4371a.b;
    }
}
