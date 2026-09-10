package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3229d5 extends S4 {
    public final /* synthetic */ int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3229d5(int i, int i2, int i3, int i4) {
        super(i, i2, AbstractC3950lJ.p("3|", i3), AbstractC3950lJ.p("4|", i3));
        this.e = i4;
        if (i4 == 1) {
            super(i, i2, AbstractC3950lJ.p("5|", i3), AbstractC3950lJ.p("6|", i3));
            this.f = i3;
        } else if (i4 != 2) {
            this.f = i3;
        } else {
            super(i, i2, AbstractC3950lJ.p("1|", i3), AbstractC3950lJ.p("2|", i3));
            this.f = i3;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        float fW;
        float f4;
        float fW2;
        float f5;
        float fW3;
        float f6;
        int i3 = this.e;
        float[] fArr = this.b;
        int i4 = this.f;
        switch (i3) {
            case 0:
                C3443fb c3443fb = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb.A) {
                    float f7 = fArr[0];
                    C3619hb c3619hb = c3443fb.f4371a;
                    if (f2 >= f7) {
                        int iD = AbstractC3405f5.d(f2, fArr, 3);
                        int i5 = (int) this.c[iD / 3];
                        if (i5 == 0) {
                            float f8 = fArr[iD];
                            float f9 = fArr[iD + 1];
                            float f10 = fArr[iD + 2];
                            float f11 = (f2 - f8) / (fArr[iD + 3] - f8);
                            float fW4 = AbstractC5044xl.w(fArr[iD + 4], f9, f11, f9);
                            fW = AbstractC5044xl.w(fArr[iD + 5], f10, f11, f10);
                            f4 = fW4;
                        } else if (i5 != 1) {
                            f4 = f(iD, f2, 1, i5 - 2);
                            fW = f(iD, f2, 2, i5 + 16);
                        } else {
                            float f12 = fArr[iD + 1];
                            fW = fArr[iD + 2];
                            f4 = f12;
                        }
                        float f13 = c3619hb.h;
                        float f14 = f4 * f13;
                        float f15 = c3619hb.i;
                        float f16 = fW * f15;
                        if (f3 == 1.0f) {
                            if (i != 4) {
                                c3443fb.h = f14;
                                c3443fb.i = f16;
                            } else {
                                c3443fb.h = (f14 - f13) + c3443fb.h;
                                c3443fb.i = (f16 - f15) + c3443fb.i;
                            }
                            break;
                        } else if (i2 == 2) {
                            int iD2 = DM.D(i);
                            if (iD2 != 0) {
                                if (iD2 == 1 || iD2 == 2) {
                                    float f17 = c3443fb.h;
                                    float f18 = c3443fb.i;
                                    c3443fb.h = (((Math.signum(f17) * Math.abs(f14)) - f17) * f3) + f17;
                                    c3443fb.i = (((Math.signum(f18) * Math.abs(f16)) - f18) * f3) + f18;
                                    break;
                                } else if (iD2 == 3) {
                                    c3443fb.h = AbstractC5044xl.w(f14, c3619hb.h, f3, c3443fb.h);
                                    c3443fb.i = AbstractC5044xl.w(f16, c3619hb.i, f3, c3443fb.i);
                                    break;
                                }
                            } else {
                                float f19 = c3619hb.h;
                                float f20 = c3619hb.i;
                                c3443fb.h = (((Math.signum(f19) * Math.abs(f14)) - f19) * f3) + f19;
                                c3443fb.i = (((Math.signum(f20) * Math.abs(f16)) - f20) * f3) + f20;
                                break;
                            }
                        } else {
                            int iD3 = DM.D(i);
                            if (iD3 != 0) {
                                if (iD3 == 1 || iD3 == 2) {
                                    float fSignum = Math.signum(f14) * Math.abs(c3443fb.h);
                                    float fSignum2 = Math.signum(f16) * Math.abs(c3443fb.i);
                                    c3443fb.h = AbstractC5044xl.w(f14, fSignum, f3, fSignum);
                                    c3443fb.i = AbstractC5044xl.w(f16, fSignum2, f3, fSignum2);
                                    break;
                                } else if (iD3 == 3) {
                                    c3443fb.h = AbstractC5044xl.w(f14, c3619hb.h, f3, c3443fb.h);
                                    c3443fb.i = AbstractC5044xl.w(f16, c3619hb.i, f3, c3443fb.i);
                                    break;
                                }
                            } else {
                                float fSignum3 = Math.signum(f14) * Math.abs(c3619hb.h);
                                float fSignum4 = Math.signum(f16) * Math.abs(c3619hb.i);
                                c3443fb.h = AbstractC5044xl.w(f14, fSignum3, f3, fSignum3);
                                c3443fb.i = AbstractC5044xl.w(f16, fSignum4, f3, fSignum4);
                                break;
                            }
                        }
                    } else {
                        int iD4 = DM.D(i);
                        if (iD4 == 0) {
                            c3443fb.h = c3619hb.h;
                            c3443fb.i = c3619hb.i;
                            break;
                        } else if (iD4 == 1) {
                            float f21 = c3443fb.h;
                            c3443fb.h = AbstractC5044xl.w(c3619hb.h, f21, f3, f21);
                            float f22 = c3443fb.i;
                            c3443fb.i = AbstractC5044xl.w(c3619hb.i, f22, f3, f22);
                            break;
                        }
                    }
                }
                break;
            case 1:
                C3443fb c3443fb2 = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb2.A) {
                    float f23 = fArr[0];
                    C3619hb c3619hb2 = c3443fb2.f4371a;
                    if (f2 >= f23) {
                        int iD5 = AbstractC3405f5.d(f2, fArr, 3);
                        int i6 = (int) this.c[iD5 / 3];
                        if (i6 == 0) {
                            float f24 = fArr[iD5];
                            float f25 = fArr[iD5 + 1];
                            float f26 = fArr[iD5 + 2];
                            float f27 = (f2 - f24) / (fArr[iD5 + 3] - f24);
                            float fW5 = AbstractC5044xl.w(fArr[iD5 + 4], f25, f27, f25);
                            fW2 = AbstractC5044xl.w(fArr[iD5 + 5], f26, f27, f26);
                            f5 = fW5;
                        } else if (i6 != 1) {
                            f5 = f(iD5, f2, 1, i6 - 2);
                            fW2 = f(iD5, f2, 2, i6 + 16);
                        } else {
                            float f28 = fArr[iD5 + 1];
                            fW2 = fArr[iD5 + 2];
                            f5 = f28;
                        }
                        int iD6 = DM.D(i);
                        if (iD6 != 0) {
                            if (iD6 == 1 || iD6 == 2) {
                                float f29 = c3443fb2.j;
                                c3443fb2.j = (((c3619hb2.j + f5) - f29) * f3) + f29;
                                float f30 = c3443fb2.k;
                                c3443fb2.k = (((c3619hb2.k + fW2) - f30) * f3) + f30;
                                break;
                            } else if (iD6 == 3) {
                                c3443fb2.j = (f5 * f3) + c3443fb2.j;
                                c3443fb2.k = (fW2 * f3) + c3443fb2.k;
                                break;
                            }
                        } else {
                            c3443fb2.j = (f5 * f3) + c3619hb2.j;
                            c3443fb2.k = (fW2 * f3) + c3619hb2.k;
                            break;
                        }
                    } else {
                        int iD7 = DM.D(i);
                        if (iD7 == 0) {
                            c3443fb2.j = c3619hb2.j;
                            c3443fb2.k = c3619hb2.k;
                            break;
                        } else if (iD7 == 1) {
                            float f31 = c3443fb2.j;
                            c3443fb2.j = AbstractC5044xl.w(c3619hb2.j, f31, f3, f31);
                            float f32 = c3443fb2.k;
                            c3443fb2.k = AbstractC5044xl.w(c3619hb2.k, f32, f3, f32);
                            break;
                        }
                    }
                }
                break;
            default:
                C3443fb c3443fb3 = (C3443fb) c4991x70.b.get(i4);
                if (c3443fb3.A) {
                    float f33 = fArr[0];
                    C3619hb c3619hb3 = c3443fb3.f4371a;
                    if (f2 >= f33) {
                        int iD8 = AbstractC3405f5.d(f2, fArr, 3);
                        int i7 = (int) this.c[iD8 / 3];
                        if (i7 == 0) {
                            float f34 = fArr[iD8];
                            float f35 = fArr[iD8 + 1];
                            float f36 = fArr[iD8 + 2];
                            float f37 = (f2 - f34) / (fArr[iD8 + 3] - f34);
                            float fW6 = AbstractC5044xl.w(fArr[iD8 + 4], f35, f37, f35);
                            fW3 = AbstractC5044xl.w(fArr[iD8 + 5], f36, f37, f36);
                            f6 = fW6;
                        } else if (i7 != 1) {
                            f6 = f(iD8, f2, 1, i7 - 2);
                            fW3 = f(iD8, f2, 2, i7 + 16);
                        } else {
                            float f38 = fArr[iD8 + 1];
                            fW3 = fArr[iD8 + 2];
                            f6 = f38;
                        }
                        int iD9 = DM.D(i);
                        if (iD9 != 0) {
                            if (iD9 == 1 || iD9 == 2) {
                                float f39 = c3443fb3.e;
                                c3443fb3.e = (((c3619hb3.e + f6) - f39) * f3) + f39;
                                float f40 = c3443fb3.f;
                                c3443fb3.f = (((c3619hb3.f + fW3) - f40) * f3) + f40;
                                break;
                            } else if (iD9 == 3) {
                                c3443fb3.e = (f6 * f3) + c3443fb3.e;
                                c3443fb3.f = (fW3 * f3) + c3443fb3.f;
                                break;
                            }
                        } else {
                            c3443fb3.e = (f6 * f3) + c3619hb3.e;
                            c3443fb3.f = (fW3 * f3) + c3619hb3.f;
                            break;
                        }
                    } else {
                        int iD10 = DM.D(i);
                        if (iD10 == 0) {
                            c3443fb3.e = c3619hb3.e;
                            c3443fb3.f = c3619hb3.f;
                            break;
                        } else if (iD10 == 1) {
                            float f41 = c3443fb3.e;
                            c3443fb3.e = AbstractC5044xl.w(c3619hb3.e, f41, f3, f41);
                            float f42 = c3443fb3.f;
                            c3443fb3.f = AbstractC5044xl.w(c3619hb3.f, f42, f3, f42);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
