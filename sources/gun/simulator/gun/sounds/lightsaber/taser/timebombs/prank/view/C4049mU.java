package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4049mU implements InterfaceC3630hg0 {
    public float A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4137nU f4695a;
    public final C3443fb b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j = true;
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
    public boolean y;
    public final C4991x70 z;

    public C4049mU(C4137nU c4137nU, C4991x70 c4991x70) {
        if (c4137nU == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (c4991x70 == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f4695a = c4137nU;
        this.z = c4991x70;
        this.b = (C3443fb) c4991x70.b.get(c4137nU.d.f4458a);
        this.c = c4137nU.l;
        this.d = c4137nU.m;
        this.e = c4137nU.n;
        this.f = c4137nU.o;
        this.g = c4137nU.p;
        this.h = c4137nU.q;
        this.i = c4137nU.r;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:129:0x0309  */
    /* JADX WARN: Code duplicated, block: B:131:0x030f  */
    /* JADX WARN: Code duplicated, block: B:132:0x032f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0353  */
    /* JADX WARN: Code duplicated, block: B:135:0x0387  */
    /* JADX WARN: Code duplicated, block: B:137:0x038b  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5 A[PHI: r13
  0x01a5: PHI (r13v31 float) = (r13v13 float), (r13v5 float) binds: [B:107:0x026e, B:79:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3630hg0
    public final void a(int i) {
        float f;
        boolean z;
        boolean z2;
        C3443fb c3443fb;
        float fPow;
        C4137nU c4137nU;
        C3443fb c3443fb2;
        float fCos;
        float fSin;
        float f2;
        C4137nU c4137nU2;
        float f3;
        float f4;
        float f5;
        float f6 = this.i;
        if (f6 == 0.0f) {
            return;
        }
        C4137nU c4137nU3 = this.f4695a;
        boolean z3 = c4137nU3.e > 0.0f;
        boolean z4 = c4137nU3.f > 0.0f;
        boolean z5 = c4137nU3.g > 0.0f || c4137nU3.i > 0.0f;
        boolean z6 = c4137nU3.h > 0.0f;
        C3443fb c3443fb3 = this.b;
        float f7 = c3443fb3.f4371a.d;
        int iD = DM.D(i);
        if (iD != 0) {
            if (iD != 1) {
                if (iD != 2) {
                    if (iD == 3) {
                        if (z3) {
                            c3443fb3.u = (this.q * f6 * c4137nU3.e) + c3443fb3.u;
                        }
                        if (z4) {
                            c3443fb3.x = (this.s * f6 * c4137nU3.f) + c3443fb3.x;
                        }
                    }
                    f6 = f6;
                    c4137nU = c4137nU3;
                    z2 = z5;
                    z = z6;
                    c3443fb2 = c3443fb3;
                    f = f7;
                }
                if (z2) {
                    f3 = this.u * f6;
                    c4137nU2 = c4137nU;
                    if (c4137nU2.i > 0.0f) {
                        f4 = c4137nU2.g;
                        if (f4 > 0.0f) {
                            f5 = f4 * f3;
                            double d = f5;
                            float fSin2 = (float) Math.sin(d);
                            float fCos2 = (float) Math.cos(d);
                            float f8 = c3443fb2.t;
                            float f9 = c3443fb2.w;
                            c3443fb2.t = (fCos2 * f8) - (fSin2 * f9);
                            c3443fb2.w = (fCos2 * f9) + (fSin2 * f8);
                        } else {
                            f5 = 0.0f;
                        }
                        double d2 = (f3 * c4137nU2.i) + f5;
                        float fSin3 = (float) Math.sin(d2);
                        float fCos3 = (float) Math.cos(d2);
                        float f10 = c3443fb2.s;
                        float f11 = c3443fb2.v;
                        c3443fb2.s = (fCos3 * f10) - (fSin3 * f11);
                        c3443fb2.v = (fCos3 * f11) + (fSin3 * f10);
                    } else {
                        double d3 = f3 * c4137nU2.g;
                        float fSin4 = (float) Math.sin(d3);
                        float fCos4 = (float) Math.cos(d3);
                        float f12 = c3443fb2.s;
                        float f13 = c3443fb2.v;
                        c3443fb2.s = (fCos4 * f12) - (fSin4 * f13);
                        c3443fb2.v = (f13 * fCos4) + (f12 * fSin4);
                        float f14 = c3443fb2.t;
                        float f15 = c3443fb2.w;
                        c3443fb2.t = (fCos4 * f14) - (fSin4 * f15);
                        c3443fb2.w = (fCos4 * f15) + (fSin4 * f14);
                    }
                } else {
                    c4137nU2 = c4137nU;
                }
                if (z) {
                    float f16 = (this.w * f6 * c4137nU2.h) + 1.0f;
                    c3443fb2.s *= f16;
                    c3443fb2.v *= f16;
                }
                if (i != 4) {
                    this.o = f * c3443fb2.s;
                    this.p = f * c3443fb2.v;
                }
                c3443fb2.c();
            }
            b();
            C4991x70 c4991x70 = this.z;
            c4991x70.getClass();
            float fMax = Math.max(0.0f, 0.0f);
            float f17 = this.A + fMax;
            this.A = f17;
            float f18 = c3443fb3.u;
            float f19 = c3443fb3.x;
            if (this.j) {
                this.j = false;
                this.k = f18;
                this.l = f19;
                f6 = f6;
                c4137nU = c4137nU3;
                z2 = z5;
                z = z6;
                c3443fb2 = c3443fb3;
                f = f7;
            } else {
                float f20 = this.c;
                float f21 = c4137nU3.k;
                f = f7;
                float f22 = c4991x70.f5208a.l;
                z = z6;
                float f23 = c4137nU3.j * fMax;
                float f24 = c4991x70.n;
                z2 = z5;
                float fAbs = Math.abs(f24) * f23;
                float f25 = c4991x70.m;
                float fAbs2 = f23 * Math.abs(f25);
                if (z3 || z4) {
                    if (z3) {
                        float f26 = (this.k - f18) * f20;
                        float f27 = this.q;
                        if (f26 > fAbs2) {
                            f26 = fAbs2;
                            c3443fb = c3443fb3;
                        } else {
                            c3443fb = c3443fb3;
                            float f28 = -fAbs2;
                            if (f26 < f28) {
                                f26 = f28;
                            }
                        }
                        this.q = f27 + f26;
                        this.k = f18;
                    } else {
                        c3443fb = c3443fb3;
                    }
                    if (z4) {
                        float f29 = (this.l - f19) * f20;
                        float f30 = this.s;
                        if (f29 > fAbs) {
                            f29 = fAbs;
                        } else {
                            float f31 = -fAbs;
                            if (f29 < f31) {
                                f29 = f31;
                            }
                        }
                        this.s = f30 + f29;
                        this.l = f19;
                    }
                    if (f17 >= f21) {
                        fPow = (float) Math.pow(this.e, f21 * 60.0f);
                        float f32 = this.f * f21;
                        float f33 = this.d;
                        float f34 = this.g * f22 * f25;
                        float f35 = this.h * f22 * f24;
                        do {
                            if (z3) {
                                float f36 = this.r;
                                float f37 = this.q;
                                float f38 = ((f34 - (f37 * f33)) * f32) + f36;
                                this.q = (f38 * f21) + f37;
                                this.r = f38 * fPow;
                            }
                            if (z4) {
                                float f39 = this.t;
                                float f40 = this.s;
                                float f41 = f39 - (((f40 * f33) + f35) * f32);
                                this.s = (f41 * f21) + f40;
                                this.t = f41 * fPow;
                            }
                            f17 -= f21;
                        } while (f17 >= f21);
                    } else {
                        fPow = -1.0f;
                    }
                    if (z3) {
                        c3443fb2 = c3443fb;
                        c4137nU = c4137nU3;
                        c3443fb2.u = (this.q * f6 * c4137nU.e) + c3443fb2.u;
                    } else {
                        c4137nU = c4137nU3;
                        c3443fb2 = c3443fb;
                    }
                    if (z4) {
                        c3443fb2.x = (this.s * f6 * c4137nU.f) + c3443fb2.x;
                    }
                } else {
                    f6 = f6;
                    fPow = -1.0f;
                    f20 = f20;
                    c3443fb2 = c3443fb3;
                    c4137nU = c4137nU3;
                }
                if (z2 || z) {
                    float fJ = AbstractC2340Cl.j(c3443fb2.v, c3443fb2.s);
                    float f42 = this.m - c3443fb2.u;
                    float f43 = this.n - c3443fb2.x;
                    if (f42 <= fAbs2) {
                        fAbs2 = -fAbs2;
                        if (f42 >= fAbs2) {
                            fAbs2 = f42;
                        }
                    }
                    if (f43 <= fAbs) {
                        fAbs = -fAbs;
                        if (f43 >= fAbs) {
                            fAbs = f43;
                        }
                    }
                    if (z2) {
                        f2 = (c4137nU.g + c4137nU.i) * f6;
                        float fJ2 = AbstractC2340Cl.j(this.p + fAbs, this.o + fAbs2) - fJ;
                        float f44 = this.u;
                        float f45 = fJ2 - (f44 * f2);
                        float fCeil = ((f45 - (((float) Math.ceil((0.15915494f * f45) - 0.5f)) * 6.2831855f)) * f20) + f44;
                        this.u = fCeil;
                        double d4 = (fCeil * f2) + fJ;
                        fCos = (float) Math.cos(d4);
                        fSin = (float) Math.sin(d4);
                        if (z) {
                            float f46 = c3443fb2.s;
                            float f47 = c3443fb2.v;
                            float fSqrt = ((float) Math.sqrt((f47 * f47) + (f46 * f46))) * f;
                            if (fSqrt > 0.0f) {
                                this.w = ((((fAbs * fSin) + (fAbs2 * fCos)) * f20) / fSqrt) + this.w;
                            }
                        }
                    } else {
                        double d5 = fJ;
                        float fCos5 = (float) Math.cos(d5);
                        float fSin5 = (float) Math.sin(d5);
                        float f48 = c3443fb2.s;
                        float f49 = c3443fb2.v;
                        float fSqrt2 = ((float) Math.sqrt((f49 * f49) + (f48 * f48))) * f;
                        if (fSqrt2 > 0.0f) {
                            this.w = ((((fAbs * fSin5) + (fAbs2 * fCos5)) * f20) / fSqrt2) + this.w;
                        }
                        fCos = fCos5;
                        fSin = fSin5;
                        f2 = 0.0f;
                    }
                    f17 = this.A;
                    if (f17 >= f21) {
                        if (fPow == -1.0f) {
                            fPow = (float) Math.pow(this.e, f21 * 60.0f);
                        }
                        float f50 = this.f * f21;
                        float f51 = this.d;
                        float f52 = this.g;
                        float f53 = this.h;
                        float f54 = f / f22;
                        while (true) {
                            f17 -= f21;
                            if (z) {
                                float f55 = this.x;
                                float f56 = this.w;
                                float f57 = ((((f52 * fCos) - (f53 * fSin)) - (f56 * f51)) * f50) + f55;
                                this.w = (f57 * f21) + f56;
                                this.x = f57 * fPow;
                            }
                            if (z2) {
                                float f58 = this.v;
                                float f59 = ((fCos * f53) + (fSin * f52)) * f54;
                                float f60 = this.u;
                                float f61 = f58 - (((f60 * f51) + f59) * f50);
                                float f62 = (f61 * f21) + f60;
                                this.u = f62;
                                this.v = f61 * fPow;
                                if (f17 < f21) {
                                    break;
                                }
                                double d6 = (f62 * f2) + fJ;
                                fCos = (float) Math.cos(d6);
                                fSin = (float) Math.sin(d6);
                                fJ = fJ;
                                f50 = f50;
                                f2 = f2;
                                c4137nU = c4137nU;
                            } else {
                                if (f17 < f21) {
                                    break;
                                }
                                fJ = fJ;
                                f50 = f50;
                                f2 = f2;
                                c4137nU = c4137nU;
                            }
                        }
                    } else {
                        c4137nU = c4137nU;
                    }
                } else {
                    c4137nU = c4137nU;
                }
                this.A = f17;
            }
            this.m = c3443fb2.u;
            this.n = c3443fb2.x;
            if (z2) {
                f3 = this.u * f6;
                c4137nU2 = c4137nU;
                if (c4137nU2.i > 0.0f) {
                    f4 = c4137nU2.g;
                    if (f4 > 0.0f) {
                        f5 = f4 * f3;
                        double d7 = f5;
                        float fSin6 = (float) Math.sin(d7);
                        float fCos6 = (float) Math.cos(d7);
                        float f63 = c3443fb2.t;
                        float f64 = c3443fb2.w;
                        c3443fb2.t = (fCos6 * f63) - (fSin6 * f64);
                        c3443fb2.w = (fCos6 * f64) + (fSin6 * f63);
                    } else {
                        f5 = 0.0f;
                    }
                    double d8 = (f3 * c4137nU2.i) + f5;
                    float fSin7 = (float) Math.sin(d8);
                    float fCos7 = (float) Math.cos(d8);
                    float f110 = c3443fb2.s;
                    float f111 = c3443fb2.v;
                    c3443fb2.s = (fCos7 * f110) - (fSin7 * f111);
                    c3443fb2.v = (fCos7 * f111) + (fSin7 * f110);
                } else {
                    double d9 = f3 * c4137nU2.g;
                    float fSin8 = (float) Math.sin(d9);
                    float fCos8 = (float) Math.cos(d9);
                    float f112 = c3443fb2.s;
                    float f113 = c3443fb2.v;
                    c3443fb2.s = (fCos8 * f112) - (fSin8 * f113);
                    c3443fb2.v = (f113 * fCos8) + (f112 * fSin8);
                    float f114 = c3443fb2.t;
                    float f115 = c3443fb2.w;
                    c3443fb2.t = (fCos8 * f114) - (fSin8 * f115);
                    c3443fb2.w = (fCos8 * f115) + (fSin8 * f114);
                }
            } else {
                c4137nU2 = c4137nU;
            }
            if (z) {
                float f116 = (this.w * f6 * c4137nU2.h) + 1.0f;
                c3443fb2.s *= f116;
                c3443fb2.v *= f116;
            }
            if (i != 4) {
                this.o = f * c3443fb2.s;
                this.p = f * c3443fb2.v;
            }
            c3443fb2.c();
        }
    }

    public final void b() {
        this.A = 0.0f;
        this.z.getClass();
        this.j = true;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
    }

    public final String toString() {
        return this.f4695a.f3179a;
    }
}
