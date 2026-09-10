package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class X4 extends T4 {
    public final /* synthetic */ int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X4(int i, int i2, int i3, int i4) {
        super(i, new String[]{AbstractC3950lJ.p("15|", i3)}, i2);
        this.d = i4;
        switch (i4) {
            case 1:
                super(i, new String[]{AbstractC3950lJ.p("19|", i3)}, i2);
                this.e = i3;
                break;
            case 2:
                super(i, new String[]{AbstractC3950lJ.p("8|", i3), AbstractC3950lJ.p("10|", i3)}, i2);
                this.e = i3;
                break;
            case 3:
                super(i, new String[]{AbstractC3950lJ.p("8|", i3), AbstractC3950lJ.p("9|", i3), AbstractC3950lJ.p("10|", i3)}, i2);
                this.e = i3;
                break;
            case 4:
                super(i, new String[]{AbstractC3950lJ.p("8|", i3), AbstractC3950lJ.p("9|", i3)}, i2);
                this.e = i3;
                break;
            case 5:
                super(i, new String[]{AbstractC3950lJ.p("8|", i3)}, i2);
                this.e = i3;
                break;
            case 6:
                super(i, new String[]{AbstractC3950lJ.p("16|", i3)}, i2);
                this.e = i3;
                break;
            default:
                this.e = i3;
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        float fW;
        float f4;
        float fW2;
        float fW3;
        float f5;
        float fW4;
        float fW5;
        float fW6;
        float fW7;
        float f6;
        float f7;
        float fW8;
        float fW9;
        float fW10;
        float fW11;
        float fW12;
        float f8;
        float f9;
        float fW13;
        float fW14;
        float f10;
        float f11;
        float fW15;
        float fW16;
        float f12;
        float fW17;
        float fW18;
        float fW19;
        float fW20;
        float f13;
        float f14;
        int i3 = this.d;
        float[] fArr = this.b;
        int i4 = this.e;
        switch (i3) {
            case 0:
                C3417fC c3417fC = (C3417fC) c4991x70.e.get(i4);
                if (c3417fC.i) {
                    float f15 = fArr[0];
                    C3505gC c3505gC = c3417fC.f4359a;
                    if (f2 >= f15) {
                        int iD = AbstractC3405f5.d(f2, fArr, 6);
                        int i5 = (int) this.c[iD / 6];
                        if (i5 == 0) {
                            float f16 = fArr[iD];
                            float f17 = fArr[iD + 1];
                            float f18 = fArr[iD + 2];
                            float f19 = (f2 - f16) / (fArr[iD + 6] - f16);
                            float fW21 = AbstractC5044xl.w(fArr[iD + 7], f17, f19, f17);
                            fW = AbstractC5044xl.w(fArr[iD + 8], f18, f19, f18);
                            f4 = fW21;
                        } else if (i5 != 1) {
                            f4 = f(iD, f2, 1, i5 - 2);
                            fW = f(iD, f2, 2, i5 + 16);
                        } else {
                            f4 = fArr[iD + 1];
                            fW = fArr[iD + 2];
                        }
                        if (i != 1) {
                            float f20 = c3417fC.g;
                            c3417fC.g = AbstractC5044xl.w(f4, f20, f3, f20);
                            float f21 = c3417fC.h;
                            c3417fC.h = AbstractC5044xl.w(fW, f21, f3, f21);
                            if (i2 == 1) {
                                c3417fC.d = (int) fArr[iD + 3];
                                c3417fC.e = fArr[iD + 4] != 0.0f;
                                c3417fC.f = fArr[iD + 5] != 0.0f;
                            }
                        } else {
                            float f22 = c3505gC.j;
                            c3417fC.g = AbstractC5044xl.w(f4, f22, f3, f22);
                            float f23 = c3505gC.k;
                            c3417fC.h = AbstractC5044xl.w(fW, f23, f3, f23);
                            if (i2 != 2) {
                                c3417fC.d = (int) fArr[iD + 3];
                                c3417fC.e = fArr[iD + 4] != 0.0f;
                                c3417fC.f = fArr[iD + 5] != 0.0f;
                            } else {
                                c3417fC.d = c3505gC.f;
                                c3417fC.e = c3505gC.g;
                                c3417fC.f = c3505gC.h;
                            }
                        }
                        break;
                    } else {
                        int iD2 = DM.D(i);
                        if (iD2 == 0) {
                            c3417fC.g = c3505gC.j;
                            c3417fC.h = c3505gC.k;
                            c3417fC.d = c3505gC.f;
                            c3417fC.e = c3505gC.g;
                            c3417fC.f = c3505gC.h;
                            break;
                        } else if (iD2 == 1) {
                            float f24 = c3417fC.g;
                            c3417fC.g = AbstractC5044xl.w(c3505gC.j, f24, f3, f24);
                            float f25 = c3417fC.h;
                            c3417fC.h = AbstractC5044xl.w(c3505gC.k, f25, f3, f25);
                            c3417fC.d = c3505gC.f;
                            c3417fC.e = c3505gC.g;
                            c3417fC.f = c3505gC.h;
                            break;
                        }
                    }
                }
                break;
            case 1:
                PT pt = (PT) c4991x70.g.get(i4);
                if (pt.i) {
                    float f26 = fArr[0];
                    TT tt = pt.f3553a;
                    if (f2 >= f26) {
                        int iD3 = AbstractC3405f5.d(f2, fArr, 4);
                        int i6 = (int) this.c[iD3 >> 2];
                        if (i6 == 0) {
                            float f27 = fArr[iD3];
                            float f28 = fArr[iD3 + 1];
                            float f29 = fArr[iD3 + 2];
                            float f30 = fArr[iD3 + 3];
                            float f31 = (f2 - f27) / (fArr[iD3 + 4] - f27);
                            float fW22 = AbstractC5044xl.w(fArr[iD3 + 5], f28, f31, f28);
                            fW2 = AbstractC5044xl.w(fArr[iD3 + 6], f29, f31, f29);
                            fW3 = AbstractC5044xl.w(fArr[iD3 + 7], f30, f31, f30);
                            f5 = fW22;
                        } else if (i6 != 1) {
                            f5 = f(iD3, f2, 1, i6 - 2);
                            fW2 = f(iD3, f2, 2, i6 + 16);
                            fW3 = f(iD3, f2, 3, i6 + 34);
                        } else {
                            float f32 = fArr[iD3 + 1];
                            fW2 = fArr[iD3 + 2];
                            fW3 = fArr[iD3 + 3];
                            f5 = f32;
                        }
                        if (i != 1) {
                            float f33 = pt.f;
                            pt.f = AbstractC5044xl.w(f5, f33, f3, f33);
                            float f34 = pt.g;
                            pt.g = AbstractC5044xl.w(fW2, f34, f3, f34);
                            float f35 = pt.h;
                            pt.h = AbstractC5044xl.w(fW3, f35, f3, f35);
                        } else {
                            float f36 = tt.l;
                            pt.f = AbstractC5044xl.w(f5, f36, f3, f36);
                            float f37 = tt.m;
                            pt.g = AbstractC5044xl.w(fW2, f37, f3, f37);
                            float f38 = tt.n;
                            pt.h = AbstractC5044xl.w(fW3, f38, f3, f38);
                        }
                        break;
                    } else {
                        int iD4 = DM.D(i);
                        if (iD4 == 0) {
                            pt.f = tt.l;
                            pt.g = tt.m;
                            pt.h = tt.n;
                            break;
                        } else if (iD4 == 1) {
                            float f39 = pt.f;
                            pt.f = AbstractC5044xl.w(tt.l, f39, f3, f39);
                            float f40 = pt.g;
                            pt.g = AbstractC5044xl.w(tt.m, f40, f3, f40);
                            float f41 = pt.h;
                            pt.h = AbstractC5044xl.w(tt.n, f41, f3, f41);
                            break;
                        }
                    }
                }
                break;
            case 2:
                N70 n70 = (N70) c4991x70.c.get(i4);
                if (n70.b.A) {
                    Color color = n70.c;
                    float f42 = fArr[0];
                    O70 o70 = n70.f3442a;
                    Color color2 = n70.d;
                    if (f2 >= f42) {
                        int iD5 = AbstractC3405f5.d(f2, fArr, 7);
                        int i7 = (int) this.c[iD5 / 7];
                        if (i7 == 0) {
                            float f43 = fArr[iD5];
                            float f44 = fArr[iD5 + 1];
                            float f45 = fArr[iD5 + 2];
                            float f46 = fArr[iD5 + 3];
                            float f47 = fArr[iD5 + 4];
                            float f48 = fArr[iD5 + 5];
                            float f49 = fArr[iD5 + 6];
                            float f50 = (f2 - f43) / (fArr[iD5 + 7] - f43);
                            float fW23 = AbstractC5044xl.w(fArr[iD5 + 8], f44, f50, f44);
                            fW4 = AbstractC5044xl.w(fArr[iD5 + 9], f45, f50, f45);
                            float fW24 = AbstractC5044xl.w(fArr[iD5 + 10], f46, f50, f46);
                            fW5 = AbstractC5044xl.w(fArr[iD5 + 11], f47, f50, f47);
                            fW6 = AbstractC5044xl.w(fArr[iD5 + 12], f48, f50, f48);
                            fW7 = AbstractC5044xl.w(fArr[iD5 + 13], f49, f50, f49);
                            f6 = fW23;
                            f7 = fW24;
                        } else if (i7 != 1) {
                            f6 = f(iD5, f2, 1, i7 - 2);
                            fW4 = f(iD5, f2, 2, i7 + 16);
                            f7 = f(iD5, f2, 3, i7 + 34);
                            fW5 = f(iD5, f2, 4, i7 + 52);
                            fW6 = f(iD5, f2, 5, i7 + 70);
                            fW7 = f(iD5, f2, 6, i7 + 88);
                        } else {
                            float f51 = fArr[iD5 + 1];
                            fW4 = fArr[iD5 + 2];
                            f7 = fArr[iD5 + 3];
                            fW5 = fArr[iD5 + 4];
                            fW6 = fArr[iD5 + 5];
                            float f52 = fArr[iD5 + 6];
                            f6 = f51;
                            fW7 = f52;
                        }
                        if (f3 != 1.0f) {
                            if (i == 1) {
                                Color color3 = o70.d;
                                Color color4 = o70.e;
                                color.r = color3.r;
                                color.g = color3.g;
                                color.b = color3.b;
                                color2.r = color4.r;
                                color2.g = color4.g;
                                color2.b = color4.b;
                            }
                            float f53 = color.r;
                            color.r = AbstractC5044xl.w(f6, f53, f3, f53);
                            float f54 = color.g;
                            color.g = AbstractC5044xl.w(fW4, f54, f3, f54);
                            float f55 = color.b;
                            color.b = AbstractC5044xl.w(f7, f55, f3, f55);
                            float f56 = color2.r;
                            color2.r = AbstractC5044xl.w(fW5, f56, f3, f56);
                            float f57 = color2.g;
                            color2.g = AbstractC5044xl.w(fW6, f57, f3, f57);
                            float f58 = color2.b;
                            color2.b = AbstractC5044xl.w(fW7, f58, f3, f58);
                        } else {
                            color.r = f6;
                            color.g = fW4;
                            color.b = f7;
                            color2.r = fW5;
                            color2.g = fW6;
                            color2.b = fW7;
                        }
                        break;
                    } else {
                        Color color5 = o70.d;
                        Color color6 = o70.e;
                        int iD6 = DM.D(i);
                        if (iD6 == 0) {
                            color.r = color5.r;
                            color.g = color5.g;
                            color.b = color5.b;
                            color2.r = color6.r;
                            color2.g = color6.g;
                            color2.b = color6.b;
                        } else if (iD6 == 1) {
                            float f59 = color.r;
                            color.r = AbstractC5044xl.w(color5.r, f59, f3, f59);
                            float f60 = color.g;
                            color.g = AbstractC5044xl.w(color5.g, f60, f3, f60);
                            float f61 = color.b;
                            color.b = AbstractC5044xl.w(color5.b, f61, f3, f61);
                            float f62 = color2.r;
                            color2.r = AbstractC5044xl.w(color6.r, f62, f3, f62);
                            float f63 = color2.g;
                            color2.g = AbstractC5044xl.w(color6.g, f63, f3, f63);
                            float f64 = color2.b;
                            color2.b = AbstractC5044xl.w(color6.b, f64, f3, f64);
                        }
                    }
                }
                break;
            case 3:
                N70 n71 = (N70) c4991x70.c.get(i4);
                if (n71.b.A) {
                    Color color7 = n71.c;
                    float f65 = fArr[0];
                    O70 o71 = n71.f3442a;
                    Color color8 = n71.d;
                    if (f2 >= f65) {
                        int iD7 = AbstractC3405f5.d(f2, fArr, 8);
                        int i8 = (int) this.c[iD7 >> 3];
                        if (i8 == 0) {
                            float f66 = fArr[iD7];
                            float f67 = fArr[iD7 + 1];
                            float f68 = fArr[iD7 + 2];
                            float f69 = fArr[iD7 + 3];
                            float f70 = fArr[iD7 + 4];
                            float f71 = fArr[iD7 + 5];
                            float f72 = fArr[iD7 + 6];
                            float f73 = fArr[iD7 + 7];
                            float f74 = (f2 - f66) / (fArr[iD7 + 8] - f66);
                            float fW25 = AbstractC5044xl.w(fArr[iD7 + 9], f67, f74, f67);
                            fW8 = AbstractC5044xl.w(fArr[iD7 + 10], f68, f74, f68);
                            float fW26 = AbstractC5044xl.w(fArr[iD7 + 11], f69, f74, f69);
                            fW9 = AbstractC5044xl.w(fArr[iD7 + 12], f70, f74, f70);
                            fW10 = AbstractC5044xl.w(fArr[iD7 + 13], f71, f74, f71);
                            fW11 = AbstractC5044xl.w(fArr[iD7 + 14], f72, f74, f72);
                            fW12 = AbstractC5044xl.w(fArr[iD7 + 15], f73, f74, f73);
                            f8 = fW25;
                            f9 = fW26;
                        } else if (i8 != 1) {
                            f8 = f(iD7, f2, 1, i8 - 2);
                            fW8 = f(iD7, f2, 2, i8 + 16);
                            f9 = f(iD7, f2, 3, i8 + 34);
                            fW9 = f(iD7, f2, 4, i8 + 52);
                            fW10 = f(iD7, f2, 5, i8 + 70);
                            fW11 = f(iD7, f2, 6, i8 + 88);
                            fW12 = f(iD7, f2, 7, i8 + 106);
                        } else {
                            float f75 = fArr[iD7 + 1];
                            fW8 = fArr[iD7 + 2];
                            f9 = fArr[iD7 + 3];
                            fW9 = fArr[iD7 + 4];
                            fW10 = fArr[iD7 + 5];
                            fW11 = fArr[iD7 + 6];
                            float f76 = fArr[iD7 + 7];
                            f8 = f75;
                            fW12 = f76;
                        }
                        if (f3 != 1.0f) {
                            if (i == 1) {
                                color7.set(o71.d);
                                Color color9 = o71.e;
                                color8.r = color9.r;
                                color8.g = color9.g;
                                color8.b = color9.b;
                            }
                            color7.add((f8 - color7.r) * f3, (fW8 - color7.g) * f3, (f9 - color7.b) * f3, (fW9 - color7.f202a) * f3);
                            float f77 = color8.r;
                            color8.r = AbstractC5044xl.w(fW10, f77, f3, f77);
                            float f78 = color8.g;
                            color8.g = AbstractC5044xl.w(fW11, f78, f3, f78);
                            float f79 = color8.b;
                            color8.b = AbstractC5044xl.w(fW12, f79, f3, f79);
                        } else {
                            color7.set(f8, fW8, f9, fW9);
                            color8.r = fW10;
                            color8.g = fW11;
                            color8.b = fW12;
                        }
                        break;
                    } else {
                        Color color10 = o71.d;
                        Color color11 = o71.e;
                        int iD8 = DM.D(i);
                        if (iD8 == 0) {
                            color7.set(color10);
                            color8.r = color11.r;
                            color8.g = color11.g;
                            color8.b = color11.b;
                            break;
                        } else if (iD8 == 1) {
                            color7.add((color10.r - color7.r) * f3, (color10.g - color7.g) * f3, (color10.b - color7.b) * f3, (color10.f202a - color7.f202a) * f3);
                            float f80 = color8.r;
                            color8.r = AbstractC5044xl.w(color11.r, f80, f3, f80);
                            float f81 = color8.g;
                            color8.g = AbstractC5044xl.w(color11.g, f81, f3, f81);
                            float f82 = color8.b;
                            color8.b = AbstractC5044xl.w(color11.b, f82, f3, f82);
                            break;
                        }
                    }
                }
                break;
            case 4:
                N70 n72 = (N70) c4991x70.c.get(i4);
                if (n72.b.A) {
                    Color color12 = n72.c;
                    float f83 = fArr[0];
                    O70 o72 = n72.f3442a;
                    if (f2 >= f83) {
                        int iD9 = AbstractC3405f5.d(f2, fArr, 5);
                        int i9 = (int) this.c[iD9 / 5];
                        if (i9 == 0) {
                            float f84 = fArr[iD9];
                            float f85 = fArr[iD9 + 1];
                            float f86 = fArr[iD9 + 2];
                            float f87 = fArr[iD9 + 3];
                            float f88 = fArr[iD9 + 4];
                            float f89 = (f2 - f84) / (fArr[iD9 + 5] - f84);
                            float fW27 = AbstractC5044xl.w(fArr[iD9 + 6], f85, f89, f85);
                            fW13 = AbstractC5044xl.w(fArr[iD9 + 7], f86, f89, f86);
                            float fW28 = AbstractC5044xl.w(fArr[iD9 + 8], f87, f89, f87);
                            fW14 = AbstractC5044xl.w(fArr[iD9 + 9], f88, f89, f88);
                            f10 = fW27;
                            f11 = fW28;
                        } else if (i9 != 1) {
                            f10 = f(iD9, f2, 1, i9 - 2);
                            fW13 = f(iD9, f2, 2, i9 + 16);
                            f11 = f(iD9, f2, 3, i9 + 34);
                            fW14 = f(iD9, f2, 4, i9 + 52);
                        } else {
                            float f90 = fArr[iD9 + 1];
                            fW13 = fArr[iD9 + 2];
                            f11 = fArr[iD9 + 3];
                            float f91 = fArr[iD9 + 4];
                            f10 = f90;
                            fW14 = f91;
                        }
                        if (f3 != 1.0f) {
                            if (i == 1) {
                                color12.set(o72.d);
                            }
                            color12.add((f10 - color12.r) * f3, (fW13 - color12.g) * f3, (f11 - color12.b) * f3, (fW14 - color12.f202a) * f3);
                        } else {
                            color12.set(f10, fW13, f11, fW14);
                        }
                        break;
                    } else {
                        Color color13 = o72.d;
                        int iD10 = DM.D(i);
                        if (iD10 == 0) {
                            color12.set(color13);
                            break;
                        } else if (iD10 == 1) {
                            color12.add((color13.r - color12.r) * f3, (color13.g - color12.g) * f3, (color13.b - color12.b) * f3, (color13.f202a - color12.f202a) * f3);
                            break;
                        }
                    }
                }
                break;
            case 5:
                N70 n73 = (N70) c4991x70.c.get(i4);
                if (n73.b.A) {
                    Color color14 = n73.c;
                    float f92 = fArr[0];
                    O70 o73 = n73.f3442a;
                    if (f2 >= f92) {
                        int iD11 = AbstractC3405f5.d(f2, fArr, 4);
                        int i10 = (int) this.c[iD11 >> 2];
                        if (i10 == 0) {
                            float f93 = fArr[iD11];
                            float f94 = fArr[iD11 + 1];
                            float f95 = fArr[iD11 + 2];
                            float f96 = fArr[iD11 + 3];
                            float f97 = (f2 - f93) / (fArr[iD11 + 4] - f93);
                            float fW29 = AbstractC5044xl.w(fArr[iD11 + 5], f94, f97, f94);
                            fW15 = AbstractC5044xl.w(fArr[iD11 + 6], f95, f97, f95);
                            fW16 = AbstractC5044xl.w(fArr[iD11 + 7], f96, f97, f96);
                            f12 = fW29;
                        } else if (i10 != 1) {
                            f12 = f(iD11, f2, 1, i10 - 2);
                            fW15 = f(iD11, f2, 2, i10 + 16);
                            fW16 = f(iD11, f2, 3, i10 + 34);
                        } else {
                            float f98 = fArr[iD11 + 1];
                            fW15 = fArr[iD11 + 2];
                            float f99 = fArr[iD11 + 3];
                            f12 = f98;
                            fW16 = f99;
                        }
                        if (f3 != 1.0f) {
                            if (i == 1) {
                                Color color15 = o73.d;
                                color14.r = color15.r;
                                color14.g = color15.g;
                                color14.b = color15.b;
                            }
                            float f100 = color14.r;
                            color14.r = AbstractC5044xl.w(f12, f100, f3, f100);
                            float f101 = color14.g;
                            color14.g = AbstractC5044xl.w(fW15, f101, f3, f101);
                            float f102 = color14.b;
                            color14.b = AbstractC5044xl.w(fW16, f102, f3, f102);
                        } else {
                            color14.r = f12;
                            color14.g = fW15;
                            color14.b = fW16;
                        }
                        break;
                    } else {
                        Color color16 = o73.d;
                        int iD12 = DM.D(i);
                        if (iD12 == 0) {
                            color14.r = color16.r;
                            color14.g = color16.g;
                            color14.b = color16.b;
                            break;
                        } else if (iD12 == 1) {
                            float f103 = color14.r;
                            color14.r = AbstractC5044xl.w(color16.r, f103, f3, f103);
                            float f104 = color14.g;
                            color14.g = AbstractC5044xl.w(color16.g, f104, f3, f104);
                            float f105 = color14.b;
                            color14.b = AbstractC5044xl.w(color16.b, f105, f3, f105);
                            break;
                        }
                    }
                }
                break;
            default:
                Dd0 dd0 = (Dd0) c4991x70.f.get(i4);
                if (dd0.j) {
                    float f106 = fArr[0];
                    Ed0 ed0 = dd0.f2979a;
                    if (f2 >= f106) {
                        int iD13 = AbstractC3405f5.d(f2, fArr, 7);
                        int i11 = (int) this.c[iD13 / 7];
                        if (i11 == 0) {
                            float f107 = fArr[iD13];
                            float f108 = fArr[iD13 + 1];
                            float f109 = fArr[iD13 + 2];
                            float f110 = fArr[iD13 + 3];
                            float f111 = fArr[iD13 + 4];
                            float f112 = fArr[iD13 + 5];
                            float f113 = fArr[iD13 + 6];
                            float f114 = (f2 - f107) / (fArr[iD13 + 7] - f107);
                            float fW30 = AbstractC5044xl.w(fArr[iD13 + 8], f108, f114, f108);
                            fW17 = AbstractC5044xl.w(fArr[iD13 + 9], f109, f114, f109);
                            float fW31 = AbstractC5044xl.w(fArr[iD13 + 10], f110, f114, f110);
                            fW18 = AbstractC5044xl.w(fArr[iD13 + 11], f111, f114, f111);
                            fW19 = AbstractC5044xl.w(fArr[iD13 + 12], f112, f114, f112);
                            fW20 = AbstractC5044xl.w(fArr[iD13 + 13], f113, f114, f113);
                            f13 = fW30;
                            f14 = fW31;
                        } else if (i11 != 1) {
                            f13 = f(iD13, f2, 1, i11 - 2);
                            fW17 = f(iD13, f2, 2, i11 + 16);
                            f14 = f(iD13, f2, 3, i11 + 34);
                            fW18 = f(iD13, f2, 4, i11 + 52);
                            fW19 = f(iD13, f2, 5, i11 + 70);
                            fW20 = f(iD13, f2, 6, i11 + 88);
                        } else {
                            float f115 = fArr[iD13 + 1];
                            fW17 = fArr[iD13 + 2];
                            f14 = fArr[iD13 + 3];
                            fW18 = fArr[iD13 + 4];
                            fW19 = fArr[iD13 + 5];
                            float f116 = fArr[iD13 + 6];
                            f13 = f115;
                            fW20 = f116;
                        }
                        if (i != 1) {
                            float f117 = dd0.d;
                            dd0.d = AbstractC5044xl.w(f13, f117, f3, f117);
                            float f118 = dd0.e;
                            dd0.e = AbstractC5044xl.w(fW17, f118, f3, f118);
                            float f119 = dd0.f;
                            dd0.f = AbstractC5044xl.w(f14, f119, f3, f119);
                            float f120 = dd0.g;
                            dd0.g = AbstractC5044xl.w(fW18, f120, f3, f120);
                            float f121 = dd0.h;
                            dd0.h = AbstractC5044xl.w(fW19, f121, f3, f121);
                            float f122 = dd0.i;
                            dd0.i = AbstractC5044xl.w(fW20, f122, f3, f122);
                        } else {
                            float f123 = ed0.f;
                            dd0.d = AbstractC5044xl.w(f13, f123, f3, f123);
                            float f124 = ed0.g;
                            dd0.e = AbstractC5044xl.w(fW17, f124, f3, f124);
                            float f125 = ed0.h;
                            dd0.f = AbstractC5044xl.w(f14, f125, f3, f125);
                            float f126 = ed0.i;
                            dd0.g = AbstractC5044xl.w(fW18, f126, f3, f126);
                            float f127 = ed0.j;
                            dd0.h = AbstractC5044xl.w(fW19, f127, f3, f127);
                            float f128 = ed0.k;
                            dd0.i = AbstractC5044xl.w(fW20, f128, f3, f128);
                        }
                        break;
                    } else {
                        int iD14 = DM.D(i);
                        if (iD14 == 0) {
                            dd0.d = ed0.f;
                            dd0.e = ed0.g;
                            dd0.f = ed0.h;
                            dd0.g = ed0.i;
                            dd0.h = ed0.j;
                            dd0.i = ed0.k;
                            break;
                        } else if (iD14 == 1) {
                            float f129 = dd0.d;
                            dd0.d = AbstractC5044xl.w(ed0.f, f129, f3, f129);
                            float f130 = dd0.e;
                            dd0.e = AbstractC5044xl.w(ed0.g, f130, f3, f130);
                            float f131 = dd0.f;
                            dd0.f = AbstractC5044xl.w(ed0.h, f131, f3, f131);
                            float f132 = dd0.g;
                            dd0.g = AbstractC5044xl.w(ed0.i, f132, f3, f132);
                            float f133 = dd0.h;
                            dd0.h = AbstractC5044xl.w(ed0.j, f133, f3, f133);
                            float f134 = dd0.i;
                            dd0.i = AbstractC5044xl.w(ed0.k, f134, f3, f134);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final int c() {
        switch (this.d) {
            case 0:
                return 6;
            case 1:
                return 4;
            case 2:
            default:
                return 7;
            case 3:
                return 8;
            case 4:
                return 5;
            case 5:
                return 4;
        }
    }

    public final void j(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        int i2 = i << 3;
        float[] fArr = this.b;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        fArr[i2 + 2] = f3;
        fArr[i2 + 3] = f4;
        fArr[i2 + 4] = f5;
        fArr[i2 + 5] = f6;
        fArr[i2 + 6] = f7;
        fArr[i2 + 7] = f8;
    }

    public final void k(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        int i2 = this.d;
        float[] fArr = this.b;
        switch (i2) {
            case 2:
                int i3 = i * 7;
                fArr[i3] = f;
                fArr[i3 + 1] = f2;
                fArr[i3 + 2] = f3;
                fArr[i3 + 3] = f4;
                fArr[i3 + 4] = f5;
                fArr[i3 + 5] = f6;
                fArr[i3 + 6] = f7;
                break;
            default:
                int i4 = i * 7;
                fArr[i4] = f;
                fArr[i4 + 1] = f2;
                fArr[i4 + 2] = f3;
                fArr[i4 + 3] = f4;
                fArr[i4 + 4] = f5;
                fArr[i4 + 5] = f6;
                fArr[i4 + 6] = f7;
                break;
        }
    }

    public final void l(int i, float f, float f2, float f3, float f4) {
        int i2 = this.d;
        float[] fArr = this.b;
        switch (i2) {
            case 1:
                int i3 = i << 2;
                fArr[i3] = f;
                fArr[i3 + 1] = f2;
                fArr[i3 + 2] = f3;
                fArr[i3 + 3] = f4;
                break;
            default:
                int i4 = i << 2;
                fArr[i4] = f;
                fArr[i4 + 1] = f2;
                fArr[i4 + 2] = f3;
                fArr[i4 + 3] = f4;
                break;
        }
    }

    public final void m(int i, float f, float f2, float f3, int i2, boolean z, boolean z2) {
        int i3 = i * 6;
        float[] fArr = this.b;
        fArr[i3] = f;
        fArr[i3 + 1] = f2;
        fArr[i3 + 2] = f3;
        fArr[i3 + 3] = i2;
        fArr[i3 + 4] = z ? 1.0f : 0.0f;
        fArr[i3 + 5] = z2 ? 1.0f : 0.0f;
    }
}
