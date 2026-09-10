package androidx.media3.container;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class NalUnitUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5695a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f5696b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5697c = new Object();
    public static int[] d = new int[10];

    public static final class H265SpsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5700c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5701e;
        public final int f;
        public final int[] g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f5702h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f5703i;
        public final int j;
        public final float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f5704l;
        public final int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f5705n;
        public final int o;

        public H265SpsData(int i2, boolean z2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, float f, int i10, int i11, int i12, int i13) {
            this.f5698a = i2;
            this.f5699b = z2;
            this.f5700c = i3;
            this.d = i4;
            this.f5701e = i5;
            this.f = i6;
            this.g = iArr;
            this.f5702h = i7;
            this.f5703i = i8;
            this.j = i9;
            this.k = f;
            this.f5704l = i10;
            this.m = i11;
            this.f5705n = i12;
            this.o = i13;
        }
    }

    public static final class PpsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5707b;

        public PpsData(int i2, int i3, boolean z2) {
            this.f5706a = i3;
            this.f5707b = z2;
        }
    }

    public static final class SpsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5710c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5711e;
        public final int f;
        public final float g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f5712h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f5713i;
        public final boolean j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f5714l;
        public final int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f5715n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f5716p;
        public final int q;
        public final int r;
        public final int s;

        public SpsData(int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z2, boolean z3, int i10, int i11, int i12, boolean z4, int i13, int i14, int i15, int i16) {
            this.f5708a = i2;
            this.f5709b = i3;
            this.f5710c = i4;
            this.d = i5;
            this.f5711e = i6;
            this.f = i7;
            this.g = f;
            this.f5712h = i8;
            this.f5713i = i9;
            this.j = z2;
            this.k = z3;
            this.f5714l = i10;
            this.m = i11;
            this.f5715n = i12;
            this.o = z4;
            this.f5716p = i13;
            this.q = i14;
            this.r = i15;
            this.s = i16;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        Assertions.e(i4 >= 0);
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

    public static H265SpsData c(int i2, int i3, byte[] bArr) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iG;
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
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = parsableNalUnitBitArray.e(8);
        }
        int iE4 = parsableNalUnitBitArray.e(8);
        int i12 = 0;
        for (int i13 = 0; i13 < iE; i13++) {
            if (parsableNalUnitBitArray.d()) {
                i12 += 89;
            }
            if (parsableNalUnitBitArray.d()) {
                i12 += 8;
            }
        }
        parsableNalUnitBitArray.j(i12);
        if (iE > 0) {
            parsableNalUnitBitArray.j((8 - iE) * 2);
        }
        parsableNalUnitBitArray.f();
        int iF = parsableNalUnitBitArray.f();
        if (iF == 3) {
            parsableNalUnitBitArray.i();
        }
        int iF2 = parsableNalUnitBitArray.f();
        int iF3 = parsableNalUnitBitArray.f();
        if (parsableNalUnitBitArray.d()) {
            int iF4 = parsableNalUnitBitArray.f();
            int iF5 = parsableNalUnitBitArray.f();
            int iF6 = parsableNalUnitBitArray.f();
            int iF7 = parsableNalUnitBitArray.f();
            iF2 -= (iF4 + iF5) * ((iF == 1 || iF == 2) ? 2 : 1);
            iF3 -= (iF6 + iF7) * (iF == 1 ? 2 : 1);
        }
        int iF8 = parsableNalUnitBitArray.f();
        int i14 = iF2;
        int i15 = i9;
        int iF9 = parsableNalUnitBitArray.f();
        int iF10 = parsableNalUnitBitArray.f();
        int iF11 = -1;
        int iMax = -1;
        for (int i16 = parsableNalUnitBitArray.d() ? 0 : iE; i16 <= iE; i16++) {
            parsableNalUnitBitArray.f();
            iMax = Math.max(parsableNalUnitBitArray.f(), iMax);
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
                while (i18 < 6) {
                    if (parsableNalUnitBitArray.d()) {
                        int iMin = Math.min(64, 1 << ((i17 << 1) + i8));
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
                    i8 = 4;
                }
                i17++;
                i8 = 4;
            }
        }
        parsableNalUnitBitArray.j(2);
        if (parsableNalUnitBitArray.d()) {
            parsableNalUnitBitArray.j(8);
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.i();
        }
        int iF12 = parsableNalUnitBitArray.f();
        int[] iArrCopyOf = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i20 = 0;
        int i21 = -1;
        int i22 = -1;
        while (i20 < iF12) {
            if (i20 == 0 || !parsableNalUnitBitArray.d()) {
                int iF13 = parsableNalUnitBitArray.f();
                int iF14 = parsableNalUnitBitArray.f();
                int[] iArr2 = new int[iF13];
                int i23 = 0;
                while (i23 < iF13) {
                    iArr2[i23] = (i23 > 0 ? iArr2[i23 - 1] : 0) - (parsableNalUnitBitArray.f() + 1);
                    parsableNalUnitBitArray.i();
                    i23++;
                }
                int[] iArr3 = new int[iF14];
                int i24 = 0;
                while (i24 < iF14) {
                    iArr3[i24] = parsableNalUnitBitArray.f() + 1 + (i24 > 0 ? iArr3[i24 - 1] : 0);
                    parsableNalUnitBitArray.i();
                    i24++;
                }
                i22 = iF14;
                iArrCopyOf2 = iArr3;
                iArrCopyOf = iArr2;
                i21 = iF13;
            } else {
                int i25 = i21 + i22;
                int iF15 = (1 - ((parsableNalUnitBitArray.d() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.f() + 1);
                int i26 = i25 + 1;
                int[] iArr4 = iArrCopyOf;
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
                for (int i29 = i22 - 1; i29 >= 0; i29--) {
                    int i30 = iArrCopyOf2[i29] + iF15;
                    if (i30 < 0 && zArr[i21 + i29]) {
                        iArr5[i28] = i30;
                        i28++;
                    }
                }
                if (iF15 < 0 && zArr[i25]) {
                    iArr5[i28] = iF15;
                    i28++;
                }
                int i31 = i28;
                for (int i32 = 0; i32 < i21; i32++) {
                    int i33 = iArr4[i32] + iF15;
                    if (i33 < 0 && zArr[i32]) {
                        iArr5[i31] = i33;
                        i31++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i31);
                int i34 = 0;
                for (int i35 = i21 - 1; i35 >= 0; i35--) {
                    int i36 = iArr4[i35] + iF15;
                    if (i36 > 0 && zArr[i35]) {
                        iArr6[i34] = i36;
                        i34++;
                    }
                }
                if (iF15 > 0 && zArr[i25]) {
                    iArr6[i34] = iF15;
                    i34++;
                }
                int i37 = i31;
                int i38 = i34;
                for (int i39 = 0; i39 < i22; i39++) {
                    int i40 = iArrCopyOf2[i39] + iF15;
                    if (i40 > 0 && zArr[i21 + i39]) {
                        iArr6[i38] = i40;
                        i38++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr6, i38);
                i22 = i38;
                i21 = i37;
            }
            i20++;
            iMax = iMax;
            iF12 = iF12;
            iF8 = iF8;
        }
        int i41 = iMax;
        int i42 = iF8;
        if (parsableNalUnitBitArray.d()) {
            int iF16 = parsableNalUnitBitArray.f();
            for (int i43 = 0; i43 < iF16; i43++) {
                parsableNalUnitBitArray.j(iF10 + 5);
            }
        }
        parsableNalUnitBitArray.j(2);
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
                    f = f5696b[iE5];
                } else {
                    a.C(iE5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.i();
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.j(3);
                i7 = parsableNalUnitBitArray.d() ? 1 : 2;
                if (parsableNalUnitBitArray.d()) {
                    int iE8 = parsableNalUnitBitArray.e(8);
                    int iE9 = parsableNalUnitBitArray.e(8);
                    parsableNalUnitBitArray.j(8);
                    iF11 = ColorInfo.f(iE8);
                    iG = ColorInfo.g(iE9);
                } else {
                    iG = -1;
                }
            } else {
                i7 = -1;
                iG = -1;
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.f();
                parsableNalUnitBitArray.f();
            }
            parsableNalUnitBitArray.i();
            if (parsableNalUnitBitArray.d()) {
                iF3 *= 2;
            }
            i6 = i7;
            i4 = iF3;
            i5 = iF11;
            iF11 = iG;
        } else {
            i4 = iF3;
            i5 = -1;
            i6 = -1;
        }
        return new H265SpsData(iE2, zD, iE3, i15, i42, iF9, iArr, iE4, i14, i4, f, i41, i5, i6, iF11);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01da  */
    /* JADX WARN: Code duplicated, block: B:115:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:119:0x0200  */
    /* JADX WARN: Code duplicated, block: B:120:0x0203  */
    /* JADX WARN: Code duplicated, block: B:123:0x020c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0218  */
    /* JADX WARN: Code duplicated, block: B:129:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0233  */
    /* JADX WARN: Code duplicated, block: B:138:0x023f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0269  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0163  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0194  */
    /* JADX WARN: Code duplicated, block: B:99:0x019e  */
    public static SpsData d(int i2, int i3, byte[] bArr) {
        int iF;
        boolean zD;
        int i4;
        int i5;
        int i6;
        int iF2;
        boolean z2;
        boolean zD2;
        int i7;
        int i8;
        int i9;
        int iF3;
        int i10;
        float f;
        int i11;
        int i12;
        int i13;
        float f2;
        int i14;
        int i15;
        int i16;
        boolean zD3;
        boolean zD4;
        int iE;
        int iE2;
        int iE3;
        int i17;
        int i18;
        int i19 = 1;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2 + 1, i3);
        int iE4 = parsableNalUnitBitArray.e(8);
        int iE5 = parsableNalUnitBitArray.e(8);
        int iE6 = parsableNalUnitBitArray.e(8);
        int iF4 = parsableNalUnitBitArray.f();
        if (iE4 == 100 || iE4 == 110 || iE4 == 122 || iE4 == 244 || iE4 == 44 || iE4 == 83 || iE4 == 86 || iE4 == 118 || iE4 == 128 || iE4 == 138) {
            iF = parsableNalUnitBitArray.f();
            zD = iF == 3 ? parsableNalUnitBitArray.d() : false;
            int iF5 = parsableNalUnitBitArray.f();
            int iF6 = parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.i();
            if (parsableNalUnitBitArray.d()) {
                int i20 = iF != 3 ? 8 : 12;
                i4 = 16;
                int i21 = 0;
                while (i21 < i20) {
                    if (parsableNalUnitBitArray.d()) {
                        int i22 = i21 < 6 ? 16 : 64;
                        int iG = 8;
                        int i23 = 8;
                        for (int i24 = 0; i24 < i22; i24++) {
                            if (iG != 0) {
                                iG = ((parsableNalUnitBitArray.g() + i23) + 256) % 256;
                            }
                            if (iG != 0) {
                                i23 = iG;
                            }
                        }
                    }
                    i21++;
                }
            } else {
                i4 = 16;
            }
            i5 = iF5;
            i6 = iF6;
        } else {
            iF = 1;
            i4 = 16;
            i5 = 0;
            i6 = 0;
            zD = false;
        }
        int iF7 = parsableNalUnitBitArray.f() + 4;
        int iF8 = parsableNalUnitBitArray.f();
        if (iF8 != 0) {
            if (iF8 == 1) {
                boolean zD5 = parsableNalUnitBitArray.d();
                parsableNalUnitBitArray.g();
                parsableNalUnitBitArray.g();
                long jF = parsableNalUnitBitArray.f();
                i19 = 1;
                iF7 = iF7;
                for (int i25 = 0; i25 < jF; i25++) {
                    parsableNalUnitBitArray.f();
                }
                z2 = zD5;
                iF2 = 0;
            } else {
                iF2 = 0;
            }
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.i();
            int iF9 = parsableNalUnitBitArray.f() + 1;
            int iF10 = parsableNalUnitBitArray.f() + 1;
            zD2 = parsableNalUnitBitArray.d();
            i7 = 2 - (zD2 ? 1 : 0);
            int i26 = iF10 * i7;
            if (!zD2) {
                parsableNalUnitBitArray.i();
            }
            parsableNalUnitBitArray.i();
            i8 = iF9 * 16;
            i9 = i26 * 16;
            if (parsableNalUnitBitArray.d()) {
                int iF11 = parsableNalUnitBitArray.f();
                int iF12 = parsableNalUnitBitArray.f();
                int iF13 = parsableNalUnitBitArray.f();
                int iF14 = parsableNalUnitBitArray.f();
                if (iF == 0) {
                    i17 = i19;
                    if (iF != 3) {
                        i19 = 2;
                    }
                    if (iF == i17) {
                        i18 = 2;
                    } else {
                        i18 = i17;
                    }
                    i7 *= i18;
                }
                i8 -= (iF11 + iF12) * i19;
                i9 -= (iF13 + iF14) * i7;
            }
            int i27 = i9;
            int i28 = i8;
            iF3 = ((iE4 != 44 || iE4 == 86 || iE4 == 100 || iE4 == 110 || iE4 == 122 || iE4 == 244) && (iE5 & 16) != 0) ? 0 : i4;
            i10 = -1;
            f = 1.0f;
            if (parsableNalUnitBitArray.d()) {
                if (parsableNalUnitBitArray.d()) {
                    iE = parsableNalUnitBitArray.e(8);
                    if (iE == 255) {
                        int i29 = i4;
                        iE2 = parsableNalUnitBitArray.e(i29);
                        iE3 = parsableNalUnitBitArray.e(i29);
                        if (iE2 != 0 && iE3 != 0) {
                            f = iE2 / iE3;
                        }
                    } else if (iE < 17) {
                        f = f5696b[iE];
                    } else {
                        a.C(iE, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (parsableNalUnitBitArray.d()) {
                    parsableNalUnitBitArray.i();
                }
                if (parsableNalUnitBitArray.d()) {
                    parsableNalUnitBitArray.j(3);
                    if (parsableNalUnitBitArray.d()) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    if (parsableNalUnitBitArray.d()) {
                        int iE7 = parsableNalUnitBitArray.e(8);
                        int iE8 = parsableNalUnitBitArray.e(8);
                        parsableNalUnitBitArray.j(8);
                        int iF15 = ColorInfo.f(iE7);
                        int iG2 = ColorInfo.g(iE8);
                        i10 = iF15;
                        i16 = iG2;
                    } else {
                        i16 = -1;
                    }
                } else {
                    i15 = -1;
                    i16 = -1;
                }
                if (parsableNalUnitBitArray.d()) {
                    parsableNalUnitBitArray.f();
                    parsableNalUnitBitArray.f();
                }
                if (parsableNalUnitBitArray.d()) {
                    parsableNalUnitBitArray.j(65);
                }
                zD3 = parsableNalUnitBitArray.d();
                if (zD3) {
                    e(parsableNalUnitBitArray);
                }
                zD4 = parsableNalUnitBitArray.d();
                if (zD4) {
                    e(parsableNalUnitBitArray);
                }
                if (zD3 || zD4) {
                    parsableNalUnitBitArray.i();
                }
                parsableNalUnitBitArray.i();
                if (parsableNalUnitBitArray.d()) {
                    parsableNalUnitBitArray.i();
                    parsableNalUnitBitArray.f();
                    parsableNalUnitBitArray.f();
                    parsableNalUnitBitArray.f();
                    parsableNalUnitBitArray.f();
                    iF3 = parsableNalUnitBitArray.f();
                    parsableNalUnitBitArray.f();
                }
                f2 = f;
                i14 = i10;
                i12 = i15;
                i13 = i16;
                i11 = iF3;
            } else {
                i11 = iF3;
                i12 = -1;
                i13 = -1;
                f2 = 1.0f;
                i14 = -1;
            }
            return new SpsData(iE4, iE5, iE6, iF4, i28, i27, f2, i5, i6, zD, zD2 ? 1 : 0, iF7, iF8, iF2, z2, i14, i12, i13, i11);
        }
        iF2 = parsableNalUnitBitArray.f() + 4;
        z2 = false;
        parsableNalUnitBitArray.f();
        parsableNalUnitBitArray.i();
        int iF16 = parsableNalUnitBitArray.f() + 1;
        int iF17 = parsableNalUnitBitArray.f() + 1;
        zD2 = parsableNalUnitBitArray.d();
        i7 = 2 - (zD2 ? 1 : 0);
        int i210 = iF17 * i7;
        if (!zD2) {
            parsableNalUnitBitArray.i();
        }
        parsableNalUnitBitArray.i();
        i8 = iF16 * 16;
        i9 = i210 * 16;
        if (parsableNalUnitBitArray.d()) {
            int iF18 = parsableNalUnitBitArray.f();
            int iF19 = parsableNalUnitBitArray.f();
            int iF110 = parsableNalUnitBitArray.f();
            int iF111 = parsableNalUnitBitArray.f();
            if (iF == 0) {
                i17 = i19;
                if (iF != 3) {
                    i19 = 2;
                }
                if (iF == i17) {
                    i18 = 2;
                } else {
                    i18 = i17;
                }
                i7 *= i18;
            }
            i8 -= (iF18 + iF19) * i19;
            i9 -= (iF110 + iF111) * i7;
        }
        int i211 = i9;
        int i212 = i8;
        if (iE4 != 44) {
        }
        i10 = -1;
        f = 1.0f;
        if (parsableNalUnitBitArray.d()) {
            if (parsableNalUnitBitArray.d()) {
                iE = parsableNalUnitBitArray.e(8);
                if (iE == 255) {
                    int i213 = i4;
                    iE2 = parsableNalUnitBitArray.e(i213);
                    iE3 = parsableNalUnitBitArray.e(i213);
                    if (iE2 != 0) {
                        f = iE2 / iE3;
                    }
                } else if (iE < 17) {
                    f = f5696b[iE];
                } else {
                    a.C(iE, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.i();
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.j(3);
                if (parsableNalUnitBitArray.d()) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
                if (parsableNalUnitBitArray.d()) {
                    int iE9 = parsableNalUnitBitArray.e(8);
                    int iE10 = parsableNalUnitBitArray.e(8);
                    parsableNalUnitBitArray.j(8);
                    int iF112 = ColorInfo.f(iE9);
                    int iG3 = ColorInfo.g(iE10);
                    i10 = iF112;
                    i16 = iG3;
                } else {
                    i16 = -1;
                }
            } else {
                i15 = -1;
                i16 = -1;
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.f();
                parsableNalUnitBitArray.f();
            }
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.j(65);
            }
            zD3 = parsableNalUnitBitArray.d();
            if (zD3) {
                e(parsableNalUnitBitArray);
            }
            zD4 = parsableNalUnitBitArray.d();
            if (zD4) {
                e(parsableNalUnitBitArray);
            }
            if (zD3) {
                parsableNalUnitBitArray.i();
            } else {
                parsableNalUnitBitArray.i();
            }
            parsableNalUnitBitArray.i();
            if (parsableNalUnitBitArray.d()) {
                parsableNalUnitBitArray.i();
                parsableNalUnitBitArray.f();
                parsableNalUnitBitArray.f();
                parsableNalUnitBitArray.f();
                parsableNalUnitBitArray.f();
                iF3 = parsableNalUnitBitArray.f();
                parsableNalUnitBitArray.f();
            }
            f2 = f;
            i14 = i10;
            i12 = i15;
            i13 = i16;
            i11 = iF3;
        } else {
            i11 = iF3;
            i12 = -1;
            i13 = -1;
            f2 = 1.0f;
            i14 = -1;
        }
        return new SpsData(iE4, iE5, iE6, iF4, i212, i211, f2, i5, i6, zD, zD2 ? 1 : 0, iF7, iF8, iF2, z2, i14, i12, i13, i11);
    }

    public static void e(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int iF = parsableNalUnitBitArray.f() + 1;
        parsableNalUnitBitArray.j(8);
        for (int i2 = 0; i2 < iF; i2++) {
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.i();
        }
        parsableNalUnitBitArray.j(20);
    }

    public static int f(byte[] bArr, int i2) {
        int i3;
        synchronized (f5697c) {
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
