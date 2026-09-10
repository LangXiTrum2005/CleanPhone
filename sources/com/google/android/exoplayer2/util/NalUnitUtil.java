package com.google.android.exoplayer2.util;

import com.applovin.impl.Z;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class NalUnitUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f18927a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f18928b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f18929c = new Object();
    public static int[] d = new int[10];

    public static final class H265SpsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18932c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f18933e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f18934h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f18935i;
        public final int j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f18936l;

        public H265SpsData(int i2, boolean z2, int i3, int i4, int[] iArr, int i5, int i6, int i7, float f, int i8, int i9, int i10) {
            this.f18930a = i2;
            this.f18931b = z2;
            this.f18932c = i3;
            this.d = i4;
            this.f18933e = iArr;
            this.f = i5;
            this.g = i6;
            this.f18934h = i7;
            this.f18935i = f;
            this.j = i8;
            this.k = i9;
            this.f18936l = i10;
        }
    }

    public static final class PpsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18938b;

        public PpsData(int i2, int i3, boolean z2) {
            this.f18937a = i3;
            this.f18938b = z2;
        }
    }

    public static final class SpsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18941c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18942e;
        public final int f;
        public final float g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f18943h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f18944i;
        public final int j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f18945l;
        public final boolean m;

        public SpsData(int i2, int i3, int i4, int i5, int i6, int i7, float f, boolean z2, boolean z3, int i8, int i9, int i10, boolean z4) {
            this.f18939a = i2;
            this.f18940b = i3;
            this.f18941c = i4;
            this.d = i5;
            this.f18942e = i6;
            this.f = i7;
            this.g = f;
            this.f18943h = z2;
            this.f18944i = z3;
            this.j = i8;
            this.k = i9;
            this.f18945l = i10;
            this.m = z4;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        Assertions.d(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x02fc  */
    public static H265SpsData c(int i2, int i3, byte[] bArr) {
        int i4;
        int i5;
        int i6;
        int iB;
        int iF;
        int i7 = 2;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2 + 2, i3);
        int i8 = 4;
        parsableNalUnitBitArray.j(4);
        int iE = parsableNalUnitBitArray.e(3);
        parsableNalUnitBitArray.i();
        int iE2 = parsableNalUnitBitArray.e(2);
        boolean zD = parsableNalUnitBitArray.d();
        int iE3 = parsableNalUnitBitArray.e(5);
        int i9 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (parsableNalUnitBitArray.d()) {
                i9 |= 1 << i10;
            }
        }
        int i11 = 6;
        int[] iArr = new int[6];
        for (int i12 = 0; i12 < 6; i12++) {
            iArr[i12] = parsableNalUnitBitArray.e(8);
        }
        int i13 = i9;
        int iE4 = parsableNalUnitBitArray.e(8);
        int i14 = 0;
        for (int i15 = 0; i15 < iE; i15++) {
            if (parsableNalUnitBitArray.d()) {
                i14 += 89;
            }
            if (parsableNalUnitBitArray.d()) {
                i14 += 8;
            }
        }
        parsableNalUnitBitArray.j(i14);
        if (iE > 0) {
            parsableNalUnitBitArray.j((8 - iE) * 2);
        }
        parsableNalUnitBitArray.f();
        int iF2 = parsableNalUnitBitArray.f();
        if (iF2 == 3) {
            parsableNalUnitBitArray.i();
        }
        int iF3 = parsableNalUnitBitArray.f();
        int iF4 = parsableNalUnitBitArray.f();
        if (parsableNalUnitBitArray.d()) {
            int iF5 = parsableNalUnitBitArray.f();
            int iF6 = parsableNalUnitBitArray.f();
            int iF7 = parsableNalUnitBitArray.f();
            int iF8 = parsableNalUnitBitArray.f();
            iF3 -= (iF5 + iF6) * ((iF2 == 1 || iF2 == 2) ? 2 : 1);
            iF4 -= (iF7 + iF8) * (iF2 == 1 ? 2 : 1);
        }
        parsableNalUnitBitArray.f();
        parsableNalUnitBitArray.f();
        int iF9 = parsableNalUnitBitArray.f();
        for (int i16 = parsableNalUnitBitArray.d() ? 0 : iE; i16 <= iE; i16++) {
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.f();
        }
        parsableNalUnitBitArray.f();
        parsableNalUnitBitArray.f();
        parsableNalUnitBitArray.f();
        parsableNalUnitBitArray.f();
        parsableNalUnitBitArray.f();
        parsableNalUnitBitArray.f();
        if (parsableNalUnitBitArray.d() && parsableNalUnitBitArray.d()) {
            int i17 = 0;
            while (i17 < i8) {
                int i18 = 0;
                while (i18 < i11) {
                    if (parsableNalUnitBitArray.d()) {
                        int iMin = Math.min(64, 1 << ((i17 << 1) + 4));
                        if (i17 > 1) {
                            parsableNalUnitBitArray.g();
                        }
                        for (int i19 = 0; i19 < iMin; i19++) {
                            parsableNalUnitBitArray.g();
                        }
                    } else {
                        parsableNalUnitBitArray.f();
                    }
                    i18 += i17 == 3 ? 3 : 1;
                    i11 = 6;
                }
                i17++;
                i8 = 4;
                i11 = 6;
            }
        }
        parsableNalUnitBitArray.j(2);
        if (parsableNalUnitBitArray.d()) {
            parsableNalUnitBitArray.j(8);
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.i();
        }
        int iF10 = parsableNalUnitBitArray.f();
        int i20 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int iA = -1;
        int i21 = -1;
        int i22 = -1;
        while (i20 < iF10) {
            if (i20 == 0 || !parsableNalUnitBitArray.d()) {
                iF = parsableNalUnitBitArray.f();
                int iF11 = parsableNalUnitBitArray.f();
                int[] iArr3 = new int[iF];
                for (int i23 = 0; i23 < iF; i23++) {
                    iArr3[i23] = parsableNalUnitBitArray.f() + 1;
                    parsableNalUnitBitArray.i();
                }
                int[] iArr4 = new int[iF11];
                for (int i24 = 0; i24 < iF11; i24++) {
                    iArr4[i24] = parsableNalUnitBitArray.f() + 1;
                    parsableNalUnitBitArray.i();
                }
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
                i21 = iF11;
            } else {
                int i25 = i22 + i21;
                int iF12 = (1 - ((parsableNalUnitBitArray.d() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.f() + 1);
                int i26 = i25 + 1;
                boolean[] zArr = new boolean[i26];
                for (int i27 = 0; i27 <= i25; i27++) {
                    if (parsableNalUnitBitArray.d()) {
                        zArr[i27] = true;
                    } else {
                        zArr[i27] = parsableNalUnitBitArray.d();
                    }
                }
                int[] iArr5 = new int[i26];
                int[] iArr6 = new int[i26];
                int i28 = 0;
                for (int i29 = i21 - 1; i29 >= 0; i29--) {
                    int i30 = iArrCopyOf[i29] + iF12;
                    if (i30 < 0 && zArr[i22 + i29]) {
                        iArr5[i28] = i30;
                        i28++;
                    }
                }
                if (iF12 < 0 && zArr[i25]) {
                    iArr5[i28] = iF12;
                    i28++;
                }
                iF = i28;
                for (int i31 = 0; i31 < i22; i31++) {
                    int i32 = iArr2[i31] + iF12;
                    if (i32 < 0 && zArr[i31]) {
                        iArr5[iF] = i32;
                        iF++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, iF);
                int i33 = 0;
                for (int i34 = i22 - 1; i34 >= 0; i34--) {
                    int i35 = iArr2[i34] + iF12;
                    if (i35 > 0 && zArr[i34]) {
                        iArr6[i33] = i35;
                        i33++;
                    }
                }
                if (iF12 > 0 && zArr[i25]) {
                    iArr6[i33] = iF12;
                    i33++;
                }
                int i36 = i33;
                for (int i37 = 0; i37 < i21; i37++) {
                    int i38 = iArrCopyOf[i37] + iF12;
                    if (i38 > 0 && zArr[i22 + i37]) {
                        iArr6[i36] = i38;
                        i36++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i36);
                iArr2 = iArrCopyOf2;
                i21 = i36;
            }
            i22 = iF;
            i20++;
            i7 = i7;
            iF10 = iF10;
            iF9 = iF9;
        }
        int i39 = i7;
        int i40 = iF9;
        if (parsableNalUnitBitArray.d()) {
            for (int i41 = 0; i41 < parsableNalUnitBitArray.f(); i41++) {
                parsableNalUnitBitArray.j(i40 + 5);
            }
        }
        int i42 = i39;
        parsableNalUnitBitArray.j(i42);
        float f = 1.0f;
        if (parsableNalUnitBitArray.d()) {
            if (parsableNalUnitBitArray.d()) {
                int iE5 = parsableNalUnitBitArray.e(8);
                if (iE5 == 255) {
                    int iE6 = parsableNalUnitBitArray.e(16);
                    int iE7 = parsableNalUnitBitArray.e(16);
                    if (iE6 != 0 && iE7 != 0) {
                        f = iE6 / iE7;
                    }
                } else if (iE5 < 17) {
                    f = f18928b[iE5];
                } else {
                    Z.s(iE5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.i();
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.j(3);
                boolean zD2 = parsableNalUnitBitArray.d();
                if (parsableNalUnitBitArray.d()) {
                    int iE8 = parsableNalUnitBitArray.e(8);
                    int iE9 = parsableNalUnitBitArray.e(8);
                    parsableNalUnitBitArray.j(8);
                    iA = ColorInfo.a(iE8);
                    if (zD2) {
                        i42 = 1;
                    }
                    iB = ColorInfo.b(iE9);
                } else {
                    i42 = -1;
                    iB = -1;
                }
            } else {
                i42 = -1;
                iB = -1;
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.f();
                parsableNalUnitBitArray.f();
            }
            parsableNalUnitBitArray.i();
            if (parsableNalUnitBitArray.d()) {
                iF4 *= 2;
            }
            i4 = iF4;
            i5 = iA;
            i6 = i42;
            iA = iB;
        } else {
            i4 = iF4;
            i5 = -1;
            i6 = -1;
        }
        return new H265SpsData(iE2, zD, iE3, i13, iArr, iE4, iF3, i4, f, i5, i6, iA);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0123  */
    /* JADX WARN: Code duplicated, block: B:72:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x0168  */
    /* JADX WARN: Code duplicated, block: B:90:0x016d  */
    public static SpsData d(int i2, int i3, byte[] bArr) {
        int iF;
        boolean zD;
        int i4;
        int iF2;
        boolean z2;
        boolean zD2;
        int i5;
        int i6;
        int i7;
        float f;
        int iE;
        int iE2;
        int iE3;
        int i8;
        int i9 = 1;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2 + 1, i3);
        int i10 = 8;
        int iE4 = parsableNalUnitBitArray.e(8);
        int iE5 = parsableNalUnitBitArray.e(8);
        int iE6 = parsableNalUnitBitArray.e(8);
        int iF3 = parsableNalUnitBitArray.f();
        if (iE4 == 100 || iE4 == 110 || iE4 == 122 || iE4 == 244 || iE4 == 44 || iE4 == 83 || iE4 == 86 || iE4 == 118 || iE4 == 128 || iE4 == 138) {
            iF = parsableNalUnitBitArray.f();
            zD = iF == 3 ? parsableNalUnitBitArray.d() : false;
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.i();
            if (parsableNalUnitBitArray.d()) {
                int i11 = iF != 3 ? 8 : 12;
                int i12 = 0;
                while (i12 < i11) {
                    if (parsableNalUnitBitArray.d()) {
                        int i13 = i12 < 6 ? 16 : 64;
                        int iG = 8;
                        int i14 = 8;
                        for (int i15 = 0; i15 < i13; i15++) {
                            if (iG != 0) {
                                iG = ((parsableNalUnitBitArray.g() + i14) + 256) % 256;
                            }
                            if (iG != 0) {
                                i14 = iG;
                            }
                        }
                    }
                    i12++;
                }
            }
        } else {
            iF = 1;
            zD = false;
        }
        int iF4 = parsableNalUnitBitArray.f() + 4;
        int iF5 = parsableNalUnitBitArray.f();
        if (iF5 != 0) {
            if (iF5 == 1) {
                boolean zD3 = parsableNalUnitBitArray.d();
                parsableNalUnitBitArray.g();
                parsableNalUnitBitArray.g();
                i4 = 16;
                long jF = parsableNalUnitBitArray.f();
                parsableNalUnitBitArray = parsableNalUnitBitArray;
                for (int i16 = 0; i16 < jF; i16++) {
                    parsableNalUnitBitArray.f();
                }
                z2 = zD3;
                i10 = 8;
                iF2 = 0;
            } else {
                i4 = 16;
                iF2 = 0;
            }
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.i();
            int iF6 = parsableNalUnitBitArray.f() + 1;
            int iF7 = parsableNalUnitBitArray.f() + 1;
            zD2 = parsableNalUnitBitArray.d();
            i5 = 2 - (zD2 ? 1 : 0);
            int i17 = iF7 * i5;
            if (!zD2) {
                parsableNalUnitBitArray.i();
            }
            parsableNalUnitBitArray.i();
            i6 = iF6 * 16;
            i7 = i17 * 16;
            if (parsableNalUnitBitArray.d()) {
                int iF8 = parsableNalUnitBitArray.f();
                int iF9 = parsableNalUnitBitArray.f();
                int iF10 = parsableNalUnitBitArray.f();
                int iF11 = parsableNalUnitBitArray.f();
                if (iF != 0) {
                    if (iF == 3) {
                        i8 = 1;
                    } else {
                        i8 = 2;
                    }
                    i5 *= iF == 1 ? 2 : 1;
                    i9 = i8;
                }
                i6 -= (iF8 + iF9) * i9;
                i7 -= (iF10 + iF11) * i5;
            }
            int i18 = i6;
            f = 1.0f;
            if (parsableNalUnitBitArray.d() && parsableNalUnitBitArray.d()) {
                iE = parsableNalUnitBitArray.e(i10);
                if (iE == 255) {
                    int i19 = i4;
                    iE2 = parsableNalUnitBitArray.e(i19);
                    iE3 = parsableNalUnitBitArray.e(i19);
                    if (iE2 != 0 && iE3 != 0) {
                        f = iE2 / iE3;
                    }
                } else if (iE < 17) {
                    f = f18928b[iE];
                } else {
                    Z.s(iE, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            return new SpsData(iE4, iE5, iE6, iF3, i18, i7, f, zD, zD2, iF4, iF5, iF2, z2);
        }
        iF2 = parsableNalUnitBitArray.f() + 4;
        i4 = 16;
        z2 = false;
        parsableNalUnitBitArray.f();
        parsableNalUnitBitArray.i();
        int iF12 = parsableNalUnitBitArray.f() + 1;
        int iF13 = parsableNalUnitBitArray.f() + 1;
        zD2 = parsableNalUnitBitArray.d();
        i5 = 2 - (zD2 ? 1 : 0);
        int i110 = iF13 * i5;
        if (!zD2) {
            parsableNalUnitBitArray.i();
        }
        parsableNalUnitBitArray.i();
        i6 = iF12 * 16;
        i7 = i110 * 16;
        if (parsableNalUnitBitArray.d()) {
            int iF14 = parsableNalUnitBitArray.f();
            int iF15 = parsableNalUnitBitArray.f();
            int iF16 = parsableNalUnitBitArray.f();
            int iF17 = parsableNalUnitBitArray.f();
            if (iF != 0) {
                if (iF == 3) {
                    i8 = 1;
                } else {
                    i8 = 2;
                }
                i5 *= iF == 1 ? 2 : 1;
                i9 = i8;
            }
            i6 -= (iF14 + iF15) * i9;
            i7 -= (iF16 + iF17) * i5;
        }
        int i111 = i6;
        f = 1.0f;
        if (parsableNalUnitBitArray.d()) {
            iE = parsableNalUnitBitArray.e(i10);
            if (iE == 255) {
                int i112 = i4;
                iE2 = parsableNalUnitBitArray.e(i112);
                iE3 = parsableNalUnitBitArray.e(i112);
                if (iE2 != 0) {
                    f = iE2 / iE3;
                }
            } else if (iE < 17) {
                f = f18928b[iE];
            } else {
                Z.s(iE, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
            }
        }
        return new SpsData(iE4, iE5, iE6, iF3, i111, i7, f, zD, zD2, iF4, iF5, iF2, z2);
    }

    public static int e(byte[] bArr, int i2) {
        int i3;
        synchronized (f18929c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = d;
                    if (iArr.length <= i5) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }
}
