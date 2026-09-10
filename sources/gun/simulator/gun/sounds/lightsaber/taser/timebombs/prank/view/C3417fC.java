package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3417fC implements InterfaceC3630hg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3505gC f4359a;
    public final Array b;
    public final C3443fb c;
    public int d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public C3417fC(C3505gC c3505gC, C4991x70 c4991x70) {
        this.g = 1.0f;
        if (c3505gC == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (c4991x70 == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f4359a = c3505gC;
        Array array = c3505gC.d;
        this.b = new Array(array.size);
        Array.ArrayIterator it = array.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Array array2 = c4991x70.b;
            if (!zHasNext) {
                this.c = (C3443fb) array2.get(c3505gC.e.f4458a);
                this.g = c3505gC.j;
                this.h = c3505gC.k;
                this.d = c3505gC.f;
                this.e = c3505gC.g;
                this.f = c3505gC.h;
                return;
            }
            this.b.add((C3443fb) array2.get(((C3619hb) it.next()).f4458a));
        }
    }

    public static void b(C3443fb c3443fb, float f, float f2, boolean z, boolean z2, boolean z3, float f3) {
        float fSignum;
        float fSignum2;
        if (c3443fb == null) {
            throw new IllegalArgumentException("bone cannot be null.");
        }
        C3443fb c3443fb2 = c3443fb.c;
        float f4 = c3443fb2.s;
        float f5 = c3443fb2.t;
        float f6 = c3443fb2.v;
        float f7 = c3443fb2.w;
        float fK = (-c3443fb.q) - c3443fb.n;
        int iOrdinal = c3443fb.y.ordinal();
        C4991x70 c4991x70 = c3443fb.b;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                float fAbs = Math.abs((f7 * f4) - (f5 * f6)) / Math.max(1.0E-4f, (f6 * f6) + (f4 * f4));
                float f8 = c4991x70.m;
                float f9 = f4 / f8;
                float f10 = c4991x70.n;
                float f11 = f6 / f10;
                float f12 = f8 * (-f11) * fAbs;
                fK += AbstractC2340Cl.k(f11, f9);
                f7 = fAbs * f9 * f10;
                f5 = f12;
            }
            float f13 = f - c3443fb2.u;
            float f14 = f2 - c3443fb2.x;
            float f15 = (f4 * f7) - (f5 * f6);
            if (Math.abs(f15) <= 1.0E-4f) {
                fSignum2 = 0.0f;
                fSignum = 0.0f;
            } else {
                fSignum = AbstractC3950lJ.g(f14, f5, f7 * f13, f15) - c3443fb.l;
                fSignum2 = AbstractC3950lJ.g(f13, f6, f14 * f4, f15) - c3443fb.m;
            }
        } else {
            fSignum = Math.signum(c4991x70.m) * (f - c3443fb.u);
            fSignum2 = (f2 - c3443fb.x) * Math.signum(c4991x70.n);
        }
        float fK2 = AbstractC2340Cl.k(fSignum2, fSignum) + fK;
        float f16 = c3443fb.o;
        if (f16 < 0.0f) {
            fK2 += 180.0f;
        }
        if (fK2 > 180.0f) {
            fK2 -= 360.0f;
        } else if (fK2 < -180.0f) {
            fK2 += 360.0f;
        }
        float f17 = c3443fb.p;
        if (z || z2) {
            int iOrdinal2 = c3443fb.y.ordinal();
            if (iOrdinal2 == 3 || iOrdinal2 == 4) {
                fSignum = f - c3443fb.u;
                fSignum2 = f2 - c3443fb.x;
            }
            float f18 = c3443fb.f4371a.d * f16;
            if (f18 > 1.0E-4f) {
                float f19 = (fSignum2 * fSignum2) + (fSignum * fSignum);
                if ((z && f19 < f18 * f18) || (z2 && f19 > f18 * f18)) {
                    float fSqrt = (((((float) Math.sqrt(f19)) / f18) - 1.0f) * f3) + 1.0f;
                    f16 *= fSqrt;
                    if (z3) {
                        f17 *= fSqrt;
                    }
                }
            }
        }
        c3443fb.d(c3443fb.l, c3443fb.m, c3443fb.n + (fK2 * f3), f16, f17, c3443fb.q, c3443fb.r);
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0306  */
    /* JADX WARN: Code duplicated, block: B:98:0x0311  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3630hg0
    public final void a(int i) {
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        float f4;
        float f5;
        float f6;
        float f7;
        float fCos;
        float f8;
        float f9;
        float f10;
        float fJ;
        float fJ2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.g;
        if (f15 == 0.0f) {
            return;
        }
        Array array = this.b;
        Object[] objArr = array.items;
        int i5 = array.size;
        C3443fb c3443fb = this.c;
        C3505gC c3505gC = this.f4359a;
        if (i5 == 1) {
            b((C3443fb) objArr[0], c3443fb.u, c3443fb.x, this.e, this.f, c3505gC.i, f15);
            return;
        }
        if (i5 != 2) {
            return;
        }
        C3443fb c3443fb2 = (C3443fb) objArr[0];
        C3443fb c3443fb3 = (C3443fb) objArr[1];
        float f16 = c3443fb.u;
        float f17 = c3443fb.x;
        int i6 = this.d;
        boolean z = this.f;
        boolean z2 = c3505gC.i;
        float f18 = this.h;
        if (c3443fb2 == null) {
            throw new IllegalArgumentException("parent cannot be null.");
        }
        if (c3443fb3 == null) {
            throw new IllegalArgumentException("child cannot be null.");
        }
        EnumC3531gb enumC3531gb = c3443fb2.y;
        EnumC3531gb enumC3531gb2 = EnumC3531gb.f4419a;
        if (enumC3531gb == enumC3531gb2 && c3443fb3.y == enumC3531gb2) {
            float f19 = c3443fb2.l;
            float f20 = c3443fb2.m;
            float f21 = c3443fb2.o;
            float f22 = c3443fb2.p;
            float f23 = c3443fb3.o;
            if (f21 < 0.0f) {
                f = -f21;
                i2 = -1;
                f2 = 0.0f;
                i3 = 180;
            } else {
                f = f21;
                i2 = 1;
                f2 = 0.0f;
                i3 = 0;
            }
            if (f22 < f2) {
                f3 = -f22;
                i2 = -i2;
            } else {
                f3 = f22;
            }
            if (f23 < f2) {
                f23 = -f23;
                i4 = 180;
            } else {
                i4 = 0;
            }
            float f24 = c3443fb3.l;
            int i7 = i2;
            float f25 = c3443fb2.s;
            float f26 = c3443fb2.t;
            float f27 = f21;
            float f28 = c3443fb2.v;
            float f29 = c3443fb2.w;
            boolean z3 = Math.abs(f - f3) <= 1.0E-4f;
            if (!z3 || z) {
                f4 = (f25 * f24) + c3443fb2.u;
                f5 = (f28 * f24) + c3443fb2.x;
                f6 = 0.0f;
            } else {
                float f30 = c3443fb3.m;
                f4 = (f26 * f30) + (f25 * f24) + c3443fb2.u;
                f5 = (f29 * f30) + (f28 * f24) + c3443fb2.x;
                f6 = f30;
            }
            C3443fb c3443fb4 = c3443fb2.c;
            float f31 = c3443fb4.s;
            float f32 = c3443fb4.t;
            float f33 = f;
            float f34 = c3443fb4.v;
            float f35 = f6;
            float f36 = c3443fb4.w;
            float f37 = (f31 * f36) - (f32 * f34);
            float f38 = f4 - c3443fb4.u;
            float f39 = f5 - c3443fb4.x;
            float f40 = Math.abs(f37) <= 1.0E-4f ? 0.0f : 1.0f / f37;
            float f41 = (((f38 * f36) - (f39 * f32)) * f40) - f19;
            float f42 = (((f39 * f31) - (f38 * f34)) * f40) - f20;
            float f43 = f23;
            float fSqrt = (float) Math.sqrt((f42 * f42) + (f41 * f41));
            float f44 = c3443fb3.f4371a.d * f43;
            if (fSqrt < 1.0E-4f) {
                b(c3443fb2, f16, f17, false, z, false, f15);
                c3443fb3.d(f24, f35, 0.0f, c3443fb3.o, c3443fb3.p, c3443fb3.q, c3443fb3.r);
            } else {
                float f45 = f16 - c3443fb4.u;
                float f46 = f17 - c3443fb4.x;
                float f47 = (((f36 * f45) - (f32 * f46)) * f40) - f19;
                float f48 = (((f46 * f31) - (f45 * f34)) * f40) - f20;
                float f49 = (f48 * f48) + (f47 * f47);
                if (f18 != 0.0f) {
                    float f50 = (f43 + 1.0f) * f33 * 0.5f * f18;
                    float fSqrt2 = (float) Math.sqrt(f49);
                    float f51 = ((fSqrt2 - fSqrt) - (f44 * f33)) + f50;
                    if (f51 > 0.0f) {
                        float fMin = Math.min(1.0f, f51 / (f50 * 2.0f)) - 1.0f;
                        float f52 = (f51 - ((1.0f - (fMin * fMin)) * f50)) / fSqrt2;
                        f47 -= f52 * f47;
                        f48 -= f52 * f48;
                        f49 = (f47 * f47) + (f48 * f48);
                    }
                }
                if (z3) {
                    float f53 = f44 * f33;
                    float f54 = ((f49 - (fSqrt * fSqrt)) - (f53 * f53)) / ((2.0f * fSqrt) * f53);
                    if (f54 < -1.0f) {
                        fJ2 = i6 * 3.1415927f;
                        f13 = f22;
                        f14 = f27;
                        f12 = -1.0f;
                    } else if (f54 > 1.0f) {
                        if (z) {
                            float fSqrt3 = (((((float) Math.sqrt(f49)) / (fSqrt + f53)) - 1.0f) * f15) + 1.0f;
                            f14 = f27 * fSqrt3;
                            f13 = z2 ? f22 * fSqrt3 : f22;
                        } else {
                            f13 = f22;
                            f14 = f27;
                        }
                        fJ2 = 0.0f;
                        f12 = 1.0f;
                    } else {
                        fJ2 = i6 * ((float) Math.acos(f54));
                        f12 = f54;
                        f13 = f22;
                        f14 = f27;
                    }
                    float f55 = (f12 * f53) + fSqrt;
                    float fSin = f53 * ((float) Math.sin(fJ2));
                    fJ = AbstractC2340Cl.j((f48 * f55) - (f47 * fSin), (f48 * fSin) + (f47 * f55));
                    f27 = f14;
                    f11 = f13;
                } else {
                    float f56 = f33 * f44;
                    float f57 = f44 * f3;
                    float f58 = f56 * f56;
                    float f59 = f57 * f57;
                    float fJ3 = AbstractC2340Cl.j(f48, f47);
                    float f60 = ((f58 * f49) + ((f59 * fSqrt) * fSqrt)) - (f58 * f59);
                    float f61 = (-2.0f) * f59 * fSqrt;
                    float f62 = f59 - f58;
                    float fX = AbstractC5044xl.x(f62, 4.0f, f60, f61 * f61);
                    if (fX >= 0.0f) {
                        float fSqrt4 = (float) Math.sqrt(fX);
                        if (f61 < 0.0f) {
                            fSqrt4 = -fSqrt4;
                        }
                        float f63 = (-(f61 + fSqrt4)) * 0.5f;
                        float f64 = f63 / f62;
                        float f65 = f60 / f63;
                        if (Math.abs(f64) >= Math.abs(f65)) {
                            f64 = f65;
                        }
                        float f66 = f49 - (f64 * f64);
                        f7 = 0.0f;
                        if (f66 >= 0.0f) {
                            float fSqrt5 = ((float) Math.sqrt(f66)) * i6;
                            fJ = fJ3 - AbstractC2340Cl.j(fSqrt5, f64);
                            fJ2 = AbstractC2340Cl.j(fSqrt5 / f3, (f64 - fSqrt) / f33);
                        }
                        f11 = f22;
                    } else {
                        f7 = 0.0f;
                    }
                    float f67 = fSqrt - f56;
                    float f68 = f67 * f67;
                    float f69 = fSqrt + f56;
                    float f70 = f69 * f69;
                    float f71 = ((-f56) * fSqrt) / (f58 - f59);
                    if (f71 < -1.0f || f71 > 1.0f) {
                        fCos = f69;
                        f8 = 0.0f;
                        f9 = 3.1415927f;
                    } else {
                        float fAcos = (float) Math.acos(f71);
                        double d = fAcos;
                        f10 = fAcos;
                        fCos = (((float) Math.cos(d)) * f56) + fSqrt;
                        float fSin2 = ((float) Math.sin(d)) * f57;
                        float f72 = (fSin2 * fSin2) + (fCos * fCos);
                        if (f72 < f68) {
                            f8 = fSin2;
                            f68 = f72;
                            f67 = fCos;
                            f9 = f10;
                        } else {
                            f8 = 0.0f;
                            f9 = 3.1415927f;
                        }
                        if (f72 > f70) {
                            f7 = fSin2;
                            f70 = f72;
                        } else {
                            fCos = f69;
                        }
                        if (f49 <= (f68 + f70) * 0.5f) {
                            float f73 = i6;
                            fJ = fJ3 - AbstractC2340Cl.j(f8 * f73, f67);
                            fJ2 = f73 * f9;
                        } else {
                            float f74 = i6;
                            fJ = fJ3 - AbstractC2340Cl.j(f7 * f74, fCos);
                            fJ2 = f74 * f10;
                        }
                        f11 = f22;
                    }
                    f10 = 0.0f;
                    if (f49 <= (f68 + f70) * 0.5f) {
                        float f75 = i6;
                        fJ = fJ3 - AbstractC2340Cl.j(f8 * f75, f67);
                        fJ2 = f75 * f9;
                    } else {
                        float f76 = i6;
                        fJ = fJ3 - AbstractC2340Cl.j(f7 * f76, fCos);
                        fJ2 = f76 * f10;
                    }
                    f11 = f22;
                }
                float f77 = i7;
                float fJ4 = AbstractC2340Cl.j(f35, f24) * f77;
                float f78 = c3443fb2.n;
                float f79 = (((fJ - fJ4) * 57.295776f) + i3) - f78;
                if (f79 > 180.0f) {
                    f79 -= 360.0f;
                } else if (f79 < -180.0f) {
                    f79 += 360.0f;
                }
                c3443fb2.d(f19, f20, (f79 * f15) + f78, f27, f11, 0.0f, 0.0f);
                float f80 = c3443fb3.n;
                float f81 = (fJ2 + fJ4) * 57.295776f;
                float f82 = c3443fb3.q;
                float f83 = (((f81 - f82) * f77) + i4) - f80;
                if (f83 > 180.0f) {
                    f83 -= 360.0f;
                } else if (f83 < -180.0f) {
                    f83 += 360.0f;
                }
                c3443fb3.d(f24, f35, (f83 * f15) + f80, c3443fb3.o, c3443fb3.p, f82, c3443fb3.r);
            }
        }
    }

    public final String toString() {
        return this.f4359a.f3179a;
    }
}
