package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5188zQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5325a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        FW.s(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static C4924wQ c(byte[] bArr, int i, int i2) {
        int i3;
        float f;
        int[] iArrCopyOf;
        Uh0 uh0 = new Uh0(bArr, i + 2, i2);
        int i4 = 4;
        uh0.s(4);
        int i5 = uh0.i(3);
        uh0.r();
        int i6 = uh0.i(2);
        boolean zH = uh0.h();
        int i7 = uh0.i(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (uh0.h()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = uh0.i(8);
        }
        int i12 = uh0.i(8);
        int i13 = 0;
        for (int i14 = 0; i14 < i5; i14++) {
            if (uh0.h()) {
                i13 += 89;
            }
            if (uh0.h()) {
                i13 += 8;
            }
        }
        uh0.s(i13);
        if (i5 > 0) {
            uh0.s((8 - i5) * 2);
        }
        uh0.l();
        int iL = uh0.l();
        if (iL == 3) {
            uh0.r();
        }
        int iL2 = uh0.l();
        int iL3 = uh0.l();
        if (uh0.h()) {
            int iL4 = uh0.l();
            int iL5 = uh0.l();
            int iL6 = uh0.l();
            int iL7 = uh0.l();
            iL2 -= (iL4 + iL5) * ((iL == 1 || iL == 2) ? 2 : 1);
            iL3 -= (iL6 + iL7) * (iL == 1 ? 2 : 1);
        }
        int i15 = iL3;
        int i16 = iL2;
        uh0.l();
        uh0.l();
        int iL8 = uh0.l();
        for (int i17 = uh0.h() ? 0 : i5; i17 <= i5; i17++) {
            uh0.l();
            uh0.l();
            uh0.l();
        }
        uh0.l();
        uh0.l();
        uh0.l();
        uh0.l();
        uh0.l();
        uh0.l();
        if (uh0.h() && uh0.h()) {
            int i18 = 0;
            while (i18 < i4) {
                int i19 = 0;
                while (i19 < i10) {
                    if (uh0.h()) {
                        int iMin = Math.min(64, 1 << ((i18 << 1) + 4));
                        if (i18 > 1) {
                            uh0.m();
                        }
                        for (int i20 = 0; i20 < iMin; i20++) {
                            uh0.m();
                        }
                    } else {
                        uh0.l();
                    }
                    i19 += i18 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i18++;
                i4 = 4;
                i10 = 6;
            }
        }
        uh0.s(2);
        if (uh0.h()) {
            uh0.s(8);
            uh0.l();
            uh0.l();
            uh0.r();
        }
        int iL9 = uh0.l();
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i21 = -1;
        int i22 = 0;
        int iL10 = -1;
        while (i22 < iL9) {
            if (i22 == 0 || !uh0.h()) {
                int iL11 = uh0.l();
                iL10 = uh0.l();
                iArr2 = new int[iL11];
                for (int i23 = 0; i23 < iL11; i23++) {
                    iArr2[i23] = uh0.l() + 1;
                    uh0.r();
                }
                int[] iArr4 = new int[iL10];
                for (int i24 = 0; i24 < iL10; i24++) {
                    iArr4[i24] = uh0.l() + 1;
                    uh0.r();
                }
                i21 = iL11;
                iArrCopyOf = iArr4;
            } else {
                int i25 = i21 + iL10;
                int iL12 = (1 - ((uh0.h() ? 1 : 0) * 2)) * (uh0.l() + 1);
                int i26 = i25 + 1;
                boolean[] zArr = new boolean[i26];
                for (int i27 = 0; i27 <= i25; i27++) {
                    if (uh0.h()) {
                        zArr[i27] = true;
                    } else {
                        zArr[i27] = uh0.h();
                    }
                }
                int[] iArr5 = new int[i26];
                int[] iArr6 = new int[i26];
                int i28 = 0;
                for (int i29 = iL10 - 1; i29 >= 0; i29--) {
                    int i30 = iArr3[i29] + iL12;
                    if (i30 < 0 && zArr[i21 + i29]) {
                        iArr5[i28] = i30;
                        i28++;
                    }
                }
                if (iL12 < 0 && zArr[i25]) {
                    iArr5[i28] = iL12;
                    i28++;
                }
                int i31 = i28;
                for (int i32 = 0; i32 < i21; i32++) {
                    int i33 = iArr2[i32] + iL12;
                    if (i33 < 0 && zArr[i32]) {
                        iArr5[i31] = i33;
                        i31++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i31);
                int i34 = 0;
                for (int i35 = i21 - 1; i35 >= 0; i35--) {
                    int i36 = iArr2[i35] + iL12;
                    if (i36 > 0 && zArr[i35]) {
                        iArr6[i34] = i36;
                        i34++;
                    }
                }
                if (iL12 > 0 && zArr[i25]) {
                    iArr6[i34] = iL12;
                    i34++;
                }
                int i37 = i34;
                for (int i38 = 0; i38 < iL10; i38++) {
                    int i39 = iArr3[i38] + iL12;
                    if (i39 > 0 && zArr[i21 + i38]) {
                        iArr6[i37] = i39;
                        i37++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i37);
                iL10 = i37;
                iArr2 = iArrCopyOf2;
                i21 = i31;
            }
            i22++;
            iArr3 = iArrCopyOf;
            iL9 = iL9;
            i12 = i12;
            iArr = iArr;
            i8 = i8;
            i7 = i7;
        }
        int i40 = i7;
        int i41 = i8;
        int[] iArr7 = iArr;
        int i42 = i12;
        if (uh0.h()) {
            for (int i43 = 0; i43 < uh0.l(); i43++) {
                uh0.s(iL8 + 5);
            }
        }
        uh0.s(2);
        float f2 = 1.0f;
        if (uh0.h()) {
            if (uh0.h()) {
                int i44 = uh0.i(8);
                if (i44 == 255) {
                    int i45 = uh0.i(16);
                    int i46 = uh0.i(16);
                    if (i45 != 0 && i46 != 0) {
                        f2 = i45 / i46;
                    }
                } else if (i44 < 17) {
                    f2 = b[i44];
                } else {
                    AbstractC4038mJ.f();
                }
            }
            if (uh0.h()) {
                uh0.r();
            }
            if (uh0.h()) {
                uh0.s(4);
                if (uh0.h()) {
                    uh0.s(24);
                }
            }
            if (uh0.h()) {
                uh0.l();
                uh0.l();
            }
            uh0.r();
            if (uh0.h()) {
                i15 *= 2;
            }
            f = f2;
            i3 = i15;
        } else {
            i3 = i15;
            f = 1.0f;
        }
        return new C4924wQ(i6, zH, i40, i41, iArr7, i42, i16, i3, f);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    public static C5100yQ d(byte[] bArr, int i, int i2) {
        int iL;
        boolean zH;
        int iL2;
        boolean z;
        boolean zH2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Uh0 uh0 = new Uh0(bArr, i + 1, i2);
        int i11 = uh0.i(8);
        int i12 = uh0.i(8);
        int i13 = uh0.i(8);
        int iL3 = uh0.l();
        if (i11 == 100 || i11 == 110 || i11 == 122 || i11 == 244 || i11 == 44 || i11 == 83 || i11 == 86 || i11 == 118 || i11 == 128 || i11 == 138) {
            iL = uh0.l();
            zH = iL == 3 ? uh0.h() : false;
            uh0.l();
            uh0.l();
            uh0.r();
            if (uh0.h()) {
                int i14 = iL != 3 ? 8 : 12;
                int i15 = 0;
                while (i15 < i14) {
                    if (uh0.h()) {
                        int i16 = i15 < 6 ? 16 : 64;
                        int iM = 8;
                        int i17 = 8;
                        for (int i18 = 0; i18 < i16; i18++) {
                            if (iM != 0) {
                                iM = ((uh0.m() + i17) + 256) % 256;
                            }
                            if (iM != 0) {
                                i17 = iM;
                            }
                        }
                    }
                    i15++;
                }
            }
        } else {
            iL = 1;
            zH = false;
        }
        int iL4 = uh0.l() + 4;
        int iL5 = uh0.l();
        if (iL5 != 0) {
            if (iL5 == 1) {
                boolean zH3 = uh0.h();
                uh0.m();
                uh0.m();
                long jL = uh0.l();
                for (int i19 = 0; i19 < jL; i19++) {
                    uh0.l();
                }
                z = zH3;
                iL2 = 0;
            } else {
                iL2 = 0;
            }
            uh0.l();
            uh0.r();
            int iL6 = uh0.l() + 1;
            int iL7 = uh0.l() + 1;
            zH2 = uh0.h();
            i3 = 2 - (zH2 ? 1 : 0);
            int i20 = iL7 * i3;
            if (!zH2) {
                uh0.r();
            }
            uh0.r();
            i4 = iL6 * 16;
            i5 = i20 * 16;
            if (uh0.h()) {
                int iL8 = uh0.l();
                int iL9 = uh0.l();
                int iL10 = uh0.l();
                int iL11 = uh0.l();
                if (iL == 0) {
                    i10 = 1;
                } else {
                    if (iL == 3) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    i3 *= iL == 1 ? 2 : 1;
                    i10 = i9;
                }
                i4 -= (iL8 + iL9) * i10;
                i5 -= (iL10 + iL11) * i3;
            }
            int i21 = i5;
            f = 1.0f;
            if (uh0.h() && uh0.h()) {
                i6 = uh0.i(8);
                if (i6 == 255) {
                    i7 = uh0.i(16);
                    i8 = uh0.i(16);
                    if (i7 != 0 && i8 != 0) {
                        f = i7 / i8;
                    }
                } else if (i6 < 17) {
                    f = b[i6];
                } else {
                    AbstractC4038mJ.f();
                }
            }
            return new C5100yQ(i11, i12, i13, iL3, i4, i21, f, zH, zH2, iL4, iL5, iL2, z);
        }
        iL2 = uh0.l() + 4;
        z = false;
        uh0.l();
        uh0.r();
        int iL12 = uh0.l() + 1;
        int iL13 = uh0.l() + 1;
        zH2 = uh0.h();
        i3 = 2 - (zH2 ? 1 : 0);
        int i22 = iL13 * i3;
        if (!zH2) {
            uh0.r();
        }
        uh0.r();
        i4 = iL12 * 16;
        i5 = i22 * 16;
        if (uh0.h()) {
            int iL14 = uh0.l();
            int iL15 = uh0.l();
            int iL16 = uh0.l();
            int iL17 = uh0.l();
            if (iL == 0) {
                i10 = 1;
            } else {
                if (iL == 3) {
                    i9 = 1;
                } else {
                    i9 = 2;
                }
                i3 *= iL == 1 ? 2 : 1;
                i10 = i9;
            }
            i4 -= (iL14 + iL15) * i10;
            i5 -= (iL16 + iL17) * i3;
        }
        int i23 = i5;
        f = 1.0f;
        if (uh0.h()) {
            i6 = uh0.i(8);
            if (i6 == 255) {
                i7 = uh0.i(16);
                i8 = uh0.i(16);
                if (i7 != 0) {
                    f = i7 / i8;
                }
            } else if (i6 < 17) {
                f = b[i6];
            } else {
                AbstractC4038mJ.f();
            }
        }
        return new C5100yQ(i11, i12, i13, iL3, i4, i23, f, zH, zH2, iL4, iL5, iL2, z);
    }

    public static int e(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
