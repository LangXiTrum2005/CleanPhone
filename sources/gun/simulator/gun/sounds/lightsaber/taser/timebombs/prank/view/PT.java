package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class PT implements InterfaceC3630hg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TT f3553a;
    public final Array b;
    public final N70 c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public final FloatArray j = new FloatArray();
    public final FloatArray k = new FloatArray();
    public final FloatArray l = new FloatArray();
    public final FloatArray m = new FloatArray();
    public final FloatArray n = new FloatArray();
    public final float[] o = new float[10];

    /* JADX WARN: Multi-variable type inference failed */
    public PT(TT tt, C4991x70 c4991x70) {
        if (tt == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (c4991x70 == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f3553a = tt;
        Array array = tt.d;
        this.b = new Array(array.size);
        Array.ArrayIterator it = array.iterator();
        while (it.hasNext()) {
            this.b.add((C3443fb) c4991x70.b.get(((C3619hb) it.next()).f4458a));
        }
        this.c = (N70) c4991x70.c.get(tt.e.f3494a);
        this.d = tt.j;
        this.e = tt.k;
        this.f = tt.l;
        this.g = tt.m;
        this.h = tt.n;
    }

    public static void b(float[] fArr, int i, float[] fArr2, int i2, float f) {
        float f2 = fArr[i + 2];
        float f3 = fArr[i + 3];
        float fJ = AbstractC2340Cl.j(f3 - fArr[i + 1], f2 - fArr[i]);
        double d = fJ;
        fArr2[i2] = (((float) Math.cos(d)) * f) + f2;
        fArr2[i2 + 1] = (f * ((float) Math.sin(d))) + f3;
        fArr2[i2 + 2] = fJ;
    }

    public static void c(float[] fArr, float[] fArr2, int i, float f) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float fJ = AbstractC2340Cl.j(fArr[3] - f3, fArr[2] - f2);
        double d = fJ;
        fArr2[i] = (((float) Math.cos(d)) * f) + f2;
        fArr2[i + 1] = (f * ((float) Math.sin(d))) + f3;
        fArr2[i + 2] = fJ;
    }

    public static void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float[] fArr, int i, boolean z) {
        if (f < 1.0E-5f || Float.isNaN(f)) {
            fArr[i] = f2;
            fArr[i + 1] = f3;
            fArr[i + 2] = AbstractC2340Cl.j(f5 - f3, f4 - f2);
            return;
        }
        float f10 = f * f;
        float f11 = f10 * f;
        float f12 = 1.0f - f;
        float f13 = f12 * f12;
        float f14 = f13 * f12;
        float f15 = f12 * f;
        float f16 = 3.0f * f15;
        float f17 = f12 * f16;
        float f18 = f16 * f;
        float f19 = (f8 * f11) + (f6 * f18) + (f4 * f17) + (f2 * f14);
        float f20 = f11 * f9;
        float f21 = f20 + (f7 * f18) + (f17 * f5) + (f14 * f3);
        fArr[i] = f19;
        fArr[i + 1] = f21;
        if (z) {
            if (f < 0.001f) {
                fArr[i + 2] = AbstractC2340Cl.j(f5 - f3, f4 - f2);
                return;
            }
            fArr[i + 2] = AbstractC2340Cl.j(f21 - ((f7 * f10) + DM.A(f5, f15, 2.0f, f3 * f13)), f19 - ((f6 * f10) + DM.A(f4, f15, 2.0f, f2 * f13)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:215:0x061c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0640  */
    /* JADX WARN: Code duplicated, block: B:219:0x0646  */
    /* JADX WARN: Code duplicated, block: B:221:0x0666  */
    /* JADX WARN: Code duplicated, block: B:223:0x0670  */
    /* JADX WARN: Code duplicated, block: B:224:0x0675  */
    /* JADX WARN: Code duplicated, block: B:226:0x067d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0682  */
    /* JADX WARN: Code duplicated, block: B:230:0x0690  */
    /* JADX WARN: Code duplicated, block: B:231:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:234:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:235:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:237:0x06db  */
    /* JADX WARN: Code duplicated, block: B:240:0x0708  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3630hg0
    public final void a(int i) {
        N70 n70;
        boolean z;
        FloatArray floatArray;
        int i2;
        int i3;
        float[] size;
        boolean z2;
        TT tt;
        float f;
        float f2;
        int i4;
        float f3;
        int i5;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        boolean z3;
        int i6;
        int i7;
        int i8;
        C3443fb c3443fb;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float fJ;
        float fJ2;
        float f17;
        float[] fArr;
        int i9;
        float f18;
        float f19;
        N70 n71 = this.c;
        AbstractC3413f9 abstractC3413f9 = n71.e;
        if (abstractC3413f9 instanceof OT) {
            float f20 = this.f;
            float f21 = this.g;
            float f22 = this.h;
            if (f20 == 0.0f && f21 == 0.0f && f22 == 0.0f) {
                return;
            }
            TT tt2 = this.f3553a;
            RT rt = tt2.h;
            boolean z4 = rt == RT.f3658a;
            boolean z5 = rt == RT.c;
            Array array = this.b;
            int i10 = array.size;
            int i11 = z4 ? i10 : i10 + 1;
            T[] tArr = array.items;
            FloatArray floatArray2 = this.j;
            float[] size2 = floatArray2.setSize(i11);
            float[] size3 = z5 ? this.n.setSize(i10) : null;
            float f23 = this.e;
            int iOrdinal = tt2.g.ordinal();
            float f24 = f22;
            float f25 = f21;
            if (iOrdinal == 2) {
                n70 = n71;
                z = z4;
                floatArray = floatArray2;
                i2 = i10;
                if (z5) {
                    int i12 = i11 - 1;
                    for (int i13 = 0; i13 < i12; i13++) {
                        C3443fb c3443fb2 = (C3443fb) tArr[i13];
                        float f26 = c3443fb2.f4371a.d;
                        float f27 = c3443fb2.s * f26;
                        float f28 = f26 * c3443fb2.v;
                        size3[i13] = (float) Math.sqrt((f28 * f28) + (f27 * f27));
                    }
                }
                Arrays.fill(size2, 1, i11, f23);
            } else if (iOrdinal != 3) {
                boolean z6 = tt2.g == ST.f3715a;
                int i14 = i11 - 1;
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = i14;
                    C3443fb c3443fb3 = (C3443fb) tArr[i15];
                    int i17 = i10;
                    float f29 = c3443fb3.f4371a.d;
                    if (f29 < 1.0E-5f) {
                        if (z5) {
                            size3[i15] = 0.0f;
                        }
                        i15++;
                        size2[i15] = f23;
                    } else {
                        float f30 = c3443fb3.s * f29;
                        float f31 = c3443fb3.v * f29;
                        float fSqrt = (float) Math.sqrt((f31 * f31) + (f30 * f30));
                        if (z5) {
                            size3[i15] = fSqrt;
                        }
                        i15++;
                        size2[i15] = ((z6 ? f29 + f23 : f23) * fSqrt) / f29;
                    }
                    z4 = z4;
                    i10 = i17;
                    i14 = i16;
                    n71 = n71;
                    floatArray2 = floatArray2;
                }
                n70 = n71;
                z = z4;
                floatArray = floatArray2;
                i2 = i10;
            } else {
                n70 = n71;
                z = z4;
                floatArray = floatArray2;
                i2 = i10;
                int i18 = i11 - 1;
                int i19 = 0;
                float f32 = 0.0f;
                while (i19 < i18) {
                    C3443fb c3443fb4 = (C3443fb) tArr[i19];
                    float f33 = c3443fb4.f4371a.d;
                    if (f33 < 1.0E-5f) {
                        if (z5) {
                            size3[i19] = 0.0f;
                        }
                        i19++;
                        size2[i19] = f23;
                    } else {
                        float f34 = c3443fb4.s * f33;
                        float f35 = f33 * c3443fb4.v;
                        float fSqrt2 = (float) Math.sqrt((f35 * f35) + (f34 * f34));
                        if (z5) {
                            size3[i19] = fSqrt2;
                        }
                        i19++;
                        size2[i19] = fSqrt2;
                        f32 += fSqrt2;
                    }
                }
                if (f32 > 0.0f) {
                    float f36 = (i11 / f32) * f23;
                    for (int i20 = 1; i20 < i11; i20++) {
                        size2[i20] = size2[i20] * f36;
                    }
                }
            }
            OT ot = (OT) abstractC3413f9;
            float f37 = this.d;
            float[] fArr2 = floatArray.items;
            float[] size4 = this.k.setSize((i11 * 3) + 2);
            boolean z7 = ot.j;
            int i21 = ot.g;
            int i22 = i21 / 6;
            boolean z8 = ot.k;
            N70 n72 = this.c;
            float[] fArr3 = size3;
            FloatArray floatArray3 = this.l;
            if (z8) {
                if (z7) {
                    i3 = i21 + 2;
                    size = floatArray3.setSize(i3);
                    int i23 = i21 - 2;
                    ot.i(n72, 2, i23, size, 0, 2);
                    ot.i(n72, 0, 2, size, i23, 2);
                    size[i21] = size[0];
                    size[i21 + 1] = size[1];
                } else {
                    i22--;
                    i3 = i21 - 4;
                    size = floatArray3.setSize(i3);
                    ot.i(n72, 2, i3, size, 0, 2);
                }
                float[] size5 = this.m.setSize(i22);
                float f38 = size[0];
                float f39 = size[1];
                int i24 = 0;
                float fSqrt3 = 0.0f;
                float f40 = 0.0f;
                float f41 = 0.0f;
                float f42 = 0.0f;
                float f43 = 0.0f;
                float f44 = 0.0f;
                float f45 = 0.0f;
                float f46 = f38;
                int i25 = 2;
                while (i24 < i22) {
                    f40 = size[i25];
                    int i26 = i22;
                    float f47 = size[i25 + 1];
                    f42 = size[i25 + 2];
                    f43 = size[i25 + 3];
                    f44 = size[i25 + 4];
                    f45 = size[i25 + 5];
                    boolean z9 = z;
                    float f48 = ((f46 - (f40 * 2.0f)) + f42) * 0.1875f;
                    float f49 = ((f39 - (f47 * 2.0f)) + f43) * 0.1875f;
                    float f50 = ((((f40 - f42) * 3.0f) - f46) + f44) * 0.09375f;
                    float f51 = ((((f47 - f43) * 3.0f) - f39) + f45) * 0.09375f;
                    float f52 = (f48 * 2.0f) + f50;
                    float f53 = (2.0f * f49) + f51;
                    float fW = (f50 * 0.16666667f) + AbstractC5044xl.w(f40, f46, 0.75f, f48);
                    float fW2 = (0.16666667f * f51) + AbstractC5044xl.w(f47, f39, 0.75f, f49);
                    float fSqrt4 = fSqrt3 + ((float) Math.sqrt((fW2 * fW2) + (fW * fW)));
                    float f54 = fW + f52;
                    float f55 = fW2 + f53;
                    float f56 = f52 + f50;
                    float f57 = f53 + f51;
                    float fSqrt5 = fSqrt4 + ((float) Math.sqrt((f55 * f55) + (f54 * f54)));
                    float f58 = f54 + f56;
                    float f59 = f55 + f57;
                    float f60 = f56 + f50 + f58;
                    float f61 = f57 + f51 + f59;
                    fSqrt3 = fSqrt5 + ((float) Math.sqrt((f59 * f59) + (f58 * f58))) + ((float) Math.sqrt((f61 * f61) + (f60 * f60)));
                    size5[i24] = fSqrt3;
                    i24++;
                    i25 += 6;
                    f41 = f47;
                    f46 = f44;
                    f39 = f45;
                    i22 = i26;
                    z = z9;
                    i3 = i3;
                }
                z2 = z;
                int i27 = i3;
                tt = tt2;
                if (tt.f == QT.b) {
                    f37 *= fSqrt3;
                }
                int iOrdinal2 = tt.g.ordinal();
                float f62 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? 1.0f : fSqrt3 / i11 : fSqrt3;
                float f63 = f37;
                float f64 = f40;
                int i28 = 0;
                int i29 = -1;
                int i30 = 0;
                int i31 = 0;
                float fSqrt6 = 0.0f;
                float f65 = f39;
                float f66 = f46;
                int i32 = 0;
                while (i30 < i11) {
                    float f67 = fArr2[i30] * f62;
                    f63 += f67;
                    if (z7) {
                        f2 = f63 % fSqrt3;
                        if (f2 < 0.0f) {
                            f2 += fSqrt3;
                        }
                        f = f62;
                        i4 = 0;
                    } else {
                        if (f63 < 0.0f) {
                            c(size, size4, i32, f63);
                            f = f62;
                        } else {
                            f = f62;
                            if (f63 > fSqrt3) {
                                b(size, i27 - 4, size4, i32, f63 - fSqrt3);
                            } else {
                                int i33 = i28;
                                f2 = f63;
                                i4 = i33;
                            }
                        }
                        size = size;
                        i28 = i28;
                        i30++;
                        i32 += 3;
                        f62 = f;
                        size5 = size5;
                        z7 = z7;
                        size = size;
                    }
                    while (true) {
                        f3 = size5[i4];
                        if (f2 <= f3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        float f68 = size5[i4 - 1];
                        f2 -= f68;
                        f3 -= f68;
                    }
                    float f69 = f2 / f3;
                    float[] fArr4 = this.o;
                    if (i4 != i29) {
                        int i34 = i4 * 6;
                        float f70 = size[i34];
                        f65 = size[i34 + 1];
                        float f71 = size[i34 + 2];
                        i5 = i4;
                        float f72 = size[i34 + 3];
                        float f73 = size[i34 + 4];
                        float f74 = size[i34 + 5];
                        float f75 = size[i34 + 6];
                        float f76 = size[i34 + 7];
                        float f77 = ((f70 - (f71 * 2.0f)) + f73) * 0.03f;
                        float f78 = ((f65 - (f72 * 2.0f)) + f74) * 0.03f;
                        float f79 = ((((f71 - f73) * 3.0f) - f70) + f75) * 0.006f;
                        float f80 = ((((f72 - f74) * 3.0f) - f65) + f76) * 0.006f;
                        float f81 = (f77 * 2.0f) + f79;
                        float f82 = (f78 * 2.0f) + f80;
                        float fW3 = (f79 * 0.16666667f) + AbstractC5044xl.w(f71, f70, 0.3f, f77);
                        float fW4 = (f80 * 0.16666667f) + AbstractC5044xl.w(f72, f65, 0.3f, f78);
                        float fSqrt7 = (float) Math.sqrt((fW4 * fW4) + (fW3 * fW3));
                        fArr4[0] = fSqrt7;
                        int i35 = 1;
                        while (i35 < 8) {
                            fW3 += f81;
                            fW4 += f82;
                            f81 += f79;
                            f82 += f80;
                            fSqrt7 += (float) Math.sqrt((fW4 * fW4) + (fW3 * fW3));
                            fArr4[i35] = fSqrt7;
                            i35++;
                            f70 = f70;
                            f71 = f71;
                        }
                        float f83 = fW3 + f81;
                        float f84 = fW4 + f82;
                        float fSqrt8 = fSqrt7 + ((float) Math.sqrt((f84 * f84) + (f83 * f83)));
                        fArr4[8] = fSqrt8;
                        float f85 = f81 + f79 + f83;
                        float f86 = f82 + f80 + f84;
                        fSqrt6 = fSqrt8 + ((float) Math.sqrt((f86 * f86) + (f85 * f85)));
                        fArr4[9] = fSqrt6;
                        f5 = f73;
                        f6 = f74;
                        f7 = f75;
                        f8 = f76;
                        f4 = f72;
                        f66 = f70;
                        f64 = f71;
                        i29 = i5;
                        i31 = 0;
                    } else {
                        i5 = i4;
                        f4 = f41;
                        f5 = f42;
                        f6 = f43;
                        f7 = f44;
                        f8 = f45;
                    }
                    float f87 = f69 * fSqrt6;
                    while (true) {
                        f9 = fArr4[i31];
                        if (f87 <= f9) {
                            break;
                        } else {
                            i31++;
                        }
                    }
                    if (i31 == 0) {
                        f10 = f87 / f9;
                    } else {
                        float f88 = fArr4[i31 - 1];
                        f10 = ((f87 - f88) / (f9 - f88)) + i31;
                    }
                    d(0.1f * f10, f66, f65, f64, f4, f5, f6, f7, f8, size4, i32, z2 || (i30 > 0 && f67 < 1.0E-5f));
                    f41 = f4;
                    f42 = f5;
                    f43 = f6;
                    i28 = i5;
                    f44 = f7;
                    f45 = f8;
                    i30++;
                    i32 += 3;
                    f62 = f;
                    size5 = size5;
                    z7 = z7;
                    size = size;
                }
            } else {
                float[] fArr5 = ot.i;
                int i36 = i22 - (z7 ? 1 : 2);
                float f89 = fArr5[i36];
                if (tt2.f == QT.b) {
                    f37 *= f89;
                }
                int iOrdinal3 = tt2.g.ordinal();
                float f90 = iOrdinal3 != 2 ? iOrdinal3 != 3 ? 1.0f : f89 / i11 : f89;
                float[] size6 = floatArray3.setSize(8);
                float f91 = f37;
                int i37 = 0;
                int i38 = -1;
                int i39 = 0;
                int i40 = 0;
                while (i37 < i11) {
                    float f92 = fArr2[i37] * f90;
                    float f93 = f90;
                    float f94 = f91 + f92;
                    if (z7) {
                        f18 = f94 % f89;
                        if (f18 < 0.0f) {
                            f18 += f89;
                        }
                        fArr = fArr2;
                        i9 = 0;
                    } else {
                        if (f94 < 0.0f) {
                            fArr = fArr2;
                            if (i38 != -2) {
                                ot.i(n72, 2, 4, size6, 0, 2);
                                i38 = -2;
                            }
                            c(size6, size4, i39, f94);
                        } else {
                            fArr = fArr2;
                            if (f94 > f89) {
                                if (i38 != -3) {
                                    ot.i(n72, i21 - 6, 4, size6, 0, 2);
                                    i38 = -3;
                                }
                                b(size6, 0, size4, i39, f94 - f89);
                                i38 = i38;
                            } else {
                                i9 = i40;
                                f18 = f94;
                            }
                        }
                        i37++;
                        i39 += 3;
                        f91 = f94;
                        f90 = f93;
                        fArr2 = fArr;
                    }
                    while (true) {
                        f19 = fArr5[i9];
                        if (f18 <= f19) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (i9 != 0) {
                        float f95 = fArr5[i9 - 1];
                        f18 -= f95;
                        f19 -= f95;
                    }
                    float f96 = f18 / f19;
                    if (i9 != i38) {
                        if (z7 && i9 == i36) {
                            ot.i(n72, i21 - 4, 4, size6, 0, 2);
                            ot.i(n72, 0, 4, size6, 4, 2);
                        } else {
                            ot.i(n72, (i9 * 6) + 2, 8, size6, 0, 2);
                        }
                        i38 = i9;
                    }
                    d(f96, size6[0], size6[1], size6[2], size6[3], size6[4], size6[5], size6[6], size6[7], size4, i39, z || (i37 > 0 && f92 < 1.0E-5f));
                    i40 = i9;
                    i37++;
                    i39 += 3;
                    f91 = f94;
                    f90 = f93;
                    fArr2 = fArr;
                }
                z2 = z;
                tt = tt2;
            }
            float f97 = size4[0];
            float f98 = size4[1];
            float f99 = tt.i;
            if (f99 == 0.0f) {
                z3 = tt.h == RT.b;
                i7 = 0;
                i8 = 3;
                for (i6 = i2; i7 < i6; i6 = i6) {
                    c3443fb = (C3443fb) tArr[i7];
                    float f100 = c3443fb.u;
                    f25 = f25;
                    c3443fb.u = AbstractC5044xl.w(f97, f100, f25, f100);
                    float f101 = c3443fb.x;
                    f24 = f24;
                    c3443fb.x = AbstractC5044xl.w(f98, f101, f24, f101);
                    f11 = size4[i8];
                    f12 = size4[i8 + 1];
                    f13 = f11 - f97;
                    f14 = f12 - f98;
                    if (z5) {
                        f17 = fArr3[i7];
                        if (f17 >= 1.0E-5f) {
                            float fSqrt9 = (((((float) Math.sqrt((f14 * f14) + (f13 * f13))) / f17) - 1.0f) * f20) + 1.0f;
                            c3443fb.s *= fSqrt9;
                            c3443fb.v *= fSqrt9;
                        }
                    }
                    if (f20 > 0.0f) {
                        f15 = c3443fb.s;
                        float f102 = c3443fb.t;
                        f16 = c3443fb.v;
                        float f103 = c3443fb.w;
                        if (z2) {
                            fJ = size4[i8 - 1];
                        } else if (size2[i7 + 1] < 1.0E-5f) {
                            fJ = size4[i8 + 2];
                        } else {
                            fJ = AbstractC2340Cl.j(f14, f13);
                        }
                        fJ2 = fJ - AbstractC2340Cl.j(f16, f15);
                        if (z3) {
                            double d = fJ2;
                            float fCos = (float) Math.cos(d);
                            float fSin = (float) Math.sin(d);
                            float f104 = c3443fb.f4371a.d;
                            f11 += ((((fCos * f15) - (fSin * f16)) * f104) - f13) * f20;
                            f12 += ((((fCos * f16) + (fSin * f15)) * f104) - f14) * f20;
                        } else {
                            fJ2 += f99;
                        }
                        if (fJ2 > 3.1415927f) {
                            fJ2 -= 6.2831855f;
                        } else if (fJ2 < -3.1415927f) {
                            fJ2 += 6.2831855f;
                        }
                        double d2 = fJ2 * f20;
                        float fCos2 = (float) Math.cos(d2);
                        float fSin2 = (float) Math.sin(d2);
                        c3443fb.s = (fCos2 * f15) - (fSin2 * f16);
                        c3443fb.t = (fCos2 * f102) - (fSin2 * f103);
                        c3443fb.v = (f16 * fCos2) + (f15 * fSin2);
                        c3443fb.w = (fCos2 * f103) + (fSin2 * f102);
                    } else {
                        f25 = f25;
                        f24 = f24;
                        i7 = i7;
                        z3 = z3;
                    }
                    f97 = f11;
                    f98 = f12;
                    c3443fb.c();
                    i7++;
                    i8 += 3;
                    z3 = z3;
                }
            }
            C3443fb c3443fb5 = n70.b;
            f99 *= (c3443fb5.s * c3443fb5.w) - (c3443fb5.t * c3443fb5.v) > 0.0f ? 0.017453292f : -0.017453292f;
            i7 = 0;
            i8 = 3;
            while (i7 < i6) {
                c3443fb = (C3443fb) tArr[i7];
                float f105 = c3443fb.u;
                f25 = f25;
                c3443fb.u = AbstractC5044xl.w(f97, f105, f25, f105);
                float f106 = c3443fb.x;
                f24 = f24;
                c3443fb.x = AbstractC5044xl.w(f98, f106, f24, f106);
                f11 = size4[i8];
                f12 = size4[i8 + 1];
                f13 = f11 - f97;
                f14 = f12 - f98;
                if (z5) {
                    f17 = fArr3[i7];
                    if (f17 >= 1.0E-5f) {
                        float fSqrt10 = (((((float) Math.sqrt((f14 * f14) + (f13 * f13))) / f17) - 1.0f) * f20) + 1.0f;
                        c3443fb.s *= fSqrt10;
                        c3443fb.v *= fSqrt10;
                    }
                }
                if (f20 > 0.0f) {
                    f15 = c3443fb.s;
                    float f107 = c3443fb.t;
                    f16 = c3443fb.v;
                    float f108 = c3443fb.w;
                    if (z2) {
                        fJ = size4[i8 - 1];
                    } else if (size2[i7 + 1] < 1.0E-5f) {
                        fJ = size4[i8 + 2];
                    } else {
                        fJ = AbstractC2340Cl.j(f14, f13);
                    }
                    fJ2 = fJ - AbstractC2340Cl.j(f16, f15);
                    if (z3) {
                        double d3 = fJ2;
                        float fCos3 = (float) Math.cos(d3);
                        float fSin3 = (float) Math.sin(d3);
                        float f109 = c3443fb.f4371a.d;
                        f11 += ((((fCos3 * f15) - (fSin3 * f16)) * f109) - f13) * f20;
                        f12 += ((((fCos3 * f16) + (fSin3 * f15)) * f109) - f14) * f20;
                    } else {
                        fJ2 += f99;
                    }
                    if (fJ2 > 3.1415927f) {
                        fJ2 -= 6.2831855f;
                    } else if (fJ2 < -3.1415927f) {
                        fJ2 += 6.2831855f;
                    }
                    double d4 = fJ2 * f20;
                    float fCos4 = (float) Math.cos(d4);
                    float fSin4 = (float) Math.sin(d4);
                    c3443fb.s = (fCos4 * f15) - (fSin4 * f16);
                    c3443fb.t = (fCos4 * f107) - (fSin4 * f108);
                    c3443fb.v = (f16 * fCos4) + (f15 * fSin4);
                    c3443fb.w = (fCos4 * f108) + (fSin4 * f107);
                } else {
                    f25 = f25;
                    f24 = f24;
                    i7 = i7;
                    z3 = z3;
                }
                f97 = f11;
                f98 = f12;
                c3443fb.c();
                i7++;
                i8 += 3;
                z3 = z3;
            }
        }
    }

    public final String toString() {
        return this.f3553a.f3179a;
    }
}
