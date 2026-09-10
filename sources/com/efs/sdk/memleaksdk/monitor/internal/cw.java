package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes2.dex */
public final class cw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f669a = new a(0);
    private static final int j = 32;
    private static final int k = 7;
    private static final int l = 256;
    private static final boolean m = false;
    private int b;
    private byte[] c;
    private int d;
    private final int[] e;
    private final int[] f;
    private final byte[] g;
    private final cv h;
    private final int i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        private final int b(byte[] bArr, int i, int i2, int i3, cv cvVar) {
            boolean unused = cw.m;
            int i4 = i + 1;
            if (i4 == i2) {
                return 1;
            }
            int i5 = i + 2;
            if (cvVar.a(i3, bArr, i4, bArr, i) >= 0) {
                while (i5 < i2) {
                    if (cvVar.a(i3, bArr, i5, bArr, i5 - 1) < 0) {
                        break;
                    }
                    i5++;
                }
            } else {
                while (i5 < i2) {
                    if (cvVar.a(i3, bArr, i5, bArr, i5 - 1) >= 0) {
                        break;
                    }
                    i5++;
                }
                a(bArr, i, i5, i3);
            }
            return i5 - i;
        }

        public final void a(byte[] bArr, int i, int i2, int i3, cv cvVar) {
            AbstractC2995aW.q(bArr, "a");
            AbstractC2995aW.q(cvVar, com.umeng.analytics.pro.bc.aL);
            a(bArr.length / i3, i, i2);
            int i4 = i2 - i;
            if (i4 < 2) {
                return;
            }
            if (i4 < cw.j) {
                a(bArr, i, i2, i + b(bArr, i, i2, i3, cvVar), i3, cvVar);
                return;
            }
            cw cwVar = new cw(bArr, cvVar, i3, (byte) 0);
            int iA = a(i4);
            int i5 = i4;
            int i6 = i;
            do {
                int iB = b(bArr, i6, i2, i3, cvVar);
                if (iB < iA) {
                    int i7 = i5 <= iA ? i5 : iA;
                    a(bArr, i6, i6 + i7, i6 + iB, i3, cvVar);
                    iB = i7;
                }
                cwVar.a(i6, iB);
                cwVar.c();
                i6 += iB;
                i5 -= iB;
            } while (i5 != 0);
            boolean unused = cw.m;
            cwVar.d();
            if (cw.m) {
                int unused2 = cwVar.d;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, cv cvVar) {
            int i6;
            int i7;
            boolean unused = cw.m;
            int i8 = i2 + i4;
            if (cvVar.a(i5, bArr, i, bArr2, i8) < 0) {
                int i9 = i4 + 1;
                int i10 = 1;
                int i11 = 0;
                while (i10 < i9 && cvVar.a(i5, bArr, i, bArr2, i8 - i10) < 0) {
                    int i12 = (i10 * 2) + 1;
                    if (i12 <= 0) {
                        i12 = i9;
                    }
                    int i13 = i12;
                    i11 = i10;
                    i10 = i13;
                }
                if (i10 <= i9) {
                    i9 = i10;
                }
                i6 = i4 - i9;
                i7 = i4 - i11;
            } else {
                int i14 = i3 - i4;
                int i15 = 1;
                int i16 = 0;
                while (i15 < i14 && cvVar.a(i5, bArr, i, bArr2, i8 + i15) >= 0) {
                    int i17 = (i15 * 2) + 1;
                    if (i17 <= 0) {
                        i17 = i14;
                    }
                    int i18 = i17;
                    i16 = i15;
                    i15 = i18;
                }
                if (i15 <= i14) {
                    i14 = i15;
                }
                i6 = i16 + i4;
                i7 = i4 + i14;
            }
            if (cw.m) {
            }
            int i19 = i6 + 1;
            while (i19 < i7) {
                int i20 = ((i7 - i19) >>> 1) + i19;
                if (cvVar.a(i5, bArr, i, bArr2, i2 + i20) < 0) {
                    i7 = i20;
                } else {
                    i19 = i20 + 1;
                }
            }
            boolean unused2 = cw.m;
            return i7;
        }

        private final void a(int i, int i2, int i3) {
            if (i2 < 0 || i3 > i) {
                StringBuilder sbT = AbstractC3950lJ.t("start < 0 || end > len. start=", i2, ", end=", i3, ", len=");
                sbT.append(i);
                throw new ArrayIndexOutOfBoundsException(sbT.toString());
            }
            if (i2 > i3) {
                throw new IllegalArgumentException(AbstractC3888ke0.h("start > end: ", i2, " > ", i3));
            }
        }

        private final void a(byte[] bArr, int i, int i2, int i3, int i4, cv cvVar) {
            int i5 = i3;
            boolean unused = cw.m;
            if (i5 == i) {
                i5++;
            }
            byte[] bArr2 = new byte[i4];
            for (int i6 = i5; i6 < i2; i6++) {
                int i7 = i6 * i4;
                for (int i8 = 0; i8 < i4; i8++) {
                    bArr2[i8] = bArr[i7 + i8];
                }
                boolean unused2 = cw.m;
                int i9 = i;
                int i10 = i6;
                while (i9 < i10) {
                    int i11 = (i9 + i10) >>> 1;
                    if (cvVar.a(i4, bArr2, 0, bArr, i11) < 0) {
                        i10 = i11;
                    } else {
                        i9 = i11 + 1;
                    }
                }
                boolean unused3 = cw.m;
                int i12 = i6 - i9;
                if (i12 == 1) {
                    int i13 = i9 * i4;
                    int i14 = (i9 + 1) * i4;
                    for (int i15 = 0; i15 < i4; i15++) {
                        bArr[i14 + i15] = bArr[i13 + i15];
                    }
                } else if (i12 != 2) {
                    System.arraycopy(bArr, i9 * i4, bArr, (i9 + 1) * i4, i12 * i4);
                } else {
                    int i16 = i9 * i4;
                    int i17 = (i9 + 1) * i4;
                    int i18 = (i9 + 2) * i4;
                    for (int i19 = 0; i19 < i4; i19++) {
                        bArr[i18 + i19] = bArr[i17 + i19];
                    }
                    for (int i20 = 0; i20 < i4; i20++) {
                        bArr[i17 + i20] = bArr[i16 + i20];
                    }
                }
                int i21 = i9 * i4;
                for (int i22 = 0; i22 < i4; i22++) {
                    bArr[i21 + i22] = bArr2[i22];
                }
            }
        }

        private final void a(byte[] bArr, int i, int i2, int i3) {
            while (true) {
                i2--;
                if (i >= i2) {
                    return;
                }
                int i4 = i * i3;
                int i5 = i2 * i3;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i4 + i6;
                    byte b = bArr[i7];
                    int i8 = i5 + i6;
                    bArr[i7] = bArr[i8];
                    bArr[i8] = b;
                }
                i++;
            }
        }

        private final int a(int i) {
            boolean unused = cw.m;
            int i2 = 0;
            while (i >= cw.j) {
                i2 |= i & 1;
                i >>= 1;
            }
            return i + i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, cv cvVar) {
            int i6;
            int i7;
            boolean unused = cw.m;
            int i8 = i2 + i4;
            if (cvVar.a(i5, bArr, i, bArr2, i8) > 0) {
                int i9 = i3 - i4;
                int i10 = 1;
                int i11 = 0;
                while (i10 < i9 && cvVar.a(i5, bArr, i, bArr2, i8 + i10) > 0) {
                    int i12 = (i10 * 2) + 1;
                    if (i12 <= 0) {
                        i12 = i9;
                    }
                    int i13 = i12;
                    i11 = i10;
                    i10 = i13;
                }
                if (i10 <= i9) {
                    i9 = i10;
                }
                i7 = i11 + i4;
                i6 = i9 + i4;
            } else {
                int i14 = i4 + 1;
                int i15 = 1;
                int i16 = 0;
                while (i15 < i14 && cvVar.a(i5, bArr, i, bArr2, i8 - i15) <= 0) {
                    int i17 = (i15 * 2) + 1;
                    if (i17 <= 0) {
                        i17 = i14;
                    }
                    int i18 = i17;
                    i16 = i15;
                    i15 = i18;
                }
                if (i15 <= i14) {
                    i14 = i15;
                }
                int i19 = i4 - i14;
                i6 = i4 - i16;
                i7 = i19;
            }
            if (cw.m) {
            }
            int i20 = i7 + 1;
            while (i20 < i6) {
                int i21 = ((i6 - i20) >>> 1) + i20;
                if (cvVar.a(i5, bArr, i, bArr2, i2 + i21) > 0) {
                    i20 = i21 + 1;
                } else {
                    i6 = i21;
                }
            }
            boolean unused2 = cw.m;
            return i6;
        }
    }

    public /* synthetic */ cw(byte[] bArr, cv cvVar, int i, byte b) {
        this(bArr, cvVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        while (true) {
            int i = this.d;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 > 0) {
                int[] iArr = this.f;
                if (iArr[i - 3] < iArr[i - 1]) {
                    i2 = i - 3;
                }
            }
            a(i2);
        }
    }

    private cw(byte[] bArr, cv cvVar, int i) {
        this.g = bArr;
        this.h = cvVar;
        this.i = i;
        this.b = k;
        int length = bArr.length / i;
        int i2 = l;
        this.c = new byte[i * (length < i2 * 2 ? length >>> 1 : i2)];
        int i3 = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.e = new int[i3];
        this.f = new int[i3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final void c() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        while (true) {
            int i = this.d;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 >= 1) {
                int[] iArr4 = this.f;
                if (iArr4[i - 3] > iArr4[i2] + iArr4[i - 1]) {
                    if (i2 >= 2) {
                        iArr2 = this.f;
                        if (iArr2[i - 4] <= iArr2[i2] + iArr2[i - 3]) {
                            iArr3 = this.f;
                            if (iArr3[i - 3] < iArr3[i - 1]) {
                                i2 = i - 3;
                            }
                        }
                    }
                    iArr = this.f;
                    if (iArr[i2] > iArr[i - 1]) {
                        return;
                    }
                } else {
                    iArr3 = this.f;
                    if (iArr3[i - 3] < iArr3[i - 1]) {
                        i2 = i - 3;
                    }
                }
            } else {
                if (i2 >= 2) {
                    iArr2 = this.f;
                    if (iArr2[i - 4] <= iArr2[i2] + iArr2[i - 3]) {
                        iArr3 = this.f;
                        if (iArr3[i - 3] < iArr3[i - 1]) {
                            i2 = i - 3;
                        }
                    }
                }
                iArr = this.f;
                if (iArr[i2] > iArr[i - 1]) {
                    return;
                }
            }
            a(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123 A[LOOP:6: B:50:0x0121->B:51:0x0123, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x0183 A[LOOP:7: B:63:0x0181->B:64:0x0183, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01db  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0203 A[LOOP:5: B:41:0x00dd->B:93:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x020b A[LOOP:3: B:22:0x007a->B:94:0x020b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x010c A[SYNTHETIC] */
    private final void b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iB;
        int i18;
        int i19;
        int i20;
        int i21;
        cv cvVar;
        int iA;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z;
        boolean z2;
        int i26;
        int i27;
        int i28;
        int i29 = i4;
        if (m && i2 > 0 && i29 > 0) {
            int i30 = i + i2;
        }
        byte[] bArr = this.g;
        byte[] bArrB = b(i29);
        int i31 = this.i;
        int i32 = i29 * i31;
        System.arraycopy(bArr, i3 * i31, bArrB, 0, i32);
        int i33 = i + i2;
        int i34 = i29 - 1;
        int i35 = i3 + i29;
        int i36 = (i35 - 1) * i31;
        int i37 = (i33 - 1) * i31;
        for (int i38 = 0; i38 < i31; i38++) {
            bArr[i36 + i38] = bArr[i37 + i38];
        }
        int i39 = i35 - 2;
        int i40 = i33 - 2;
        int i41 = i2 - 1;
        if (i41 == 0) {
            System.arraycopy(bArrB, 0, bArr, (i39 - i34) * i31, i32);
            return;
        }
        int i42 = 1;
        if (i29 == 1) {
            int i43 = i39 - i41;
            System.arraycopy(bArr, ((i40 - i41) + 1) * i31, bArr, (i43 + 1) * i31, i41 * i31);
            int i44 = i43 * i31;
            int i45 = i34 * i31;
            for (int i46 = 0; i46 < i31; i46++) {
                bArr[i44 + i46] = bArrB[i45 + i46];
            }
            return;
        }
        cv cvVar2 = this.h;
        int i47 = this.b;
        loop2: while (true) {
            int i48 = i47;
            i5 = i41;
            i6 = i34;
            int i49 = 0;
            int i50 = 0;
            while (true) {
                boolean z3 = m;
                int i51 = i48;
                if (cvVar2.a(i31, bArrB, i6, bArr, i40) < 0) {
                    int i52 = i39 * i31;
                    int i53 = i40 * i31;
                    for (int i54 = 0; i54 < i31; i54++) {
                        bArr[i52 + i54] = bArr[i53 + i54];
                    }
                    i39--;
                    i40--;
                    i49++;
                    i5--;
                    if (i5 == 0) {
                        i7 = i51;
                        i8 = 1;
                        i9 = i29;
                        i10 = i39;
                        i11 = 0;
                        break loop2;
                    }
                    i50 = 0;
                    if ((i49 | i50) >= i51) {
                        i12 = i29;
                        i13 = i5;
                        i14 = i6;
                        i15 = i40;
                        i7 = i51;
                        i16 = i39;
                        while (true) {
                            boolean z4 = m;
                            i17 = i12;
                            iB = i13 - f669a.b(bArrB, i14, bArr, i, i13, i13 - 1, i31, cvVar2);
                            if (iB != 0) {
                                i10 = i16 - iB;
                                i40 = i15 - iB;
                                i5 = i13 - iB;
                                System.arraycopy(bArr, (i40 + 1) * i31, bArr, (i10 + 1) * i31, iB * i31);
                                if (i5 == 0) {
                                    i6 = i14;
                                    i9 = i17;
                                } else {
                                    i16 = i10;
                                }
                                i11 = 0;
                                i8 = 1;
                                break loop2;
                            }
                            i40 = i15;
                            i5 = i13;
                            i18 = i16 * i31;
                            i19 = i14 * i31;
                            for (i20 = 0; i20 < i31; i20++) {
                                bArr[i18 + i20] = bArrB[i19 + i20];
                            }
                            i10 = i16 - 1;
                            i21 = i14 - 1;
                            i9 = i17 - 1;
                            if (i9 == i42) {
                                i6 = i21;
                                i11 = 0;
                                i8 = 1;
                                break loop2;
                            }
                            int i55 = i17 - 2;
                            cvVar = cvVar2;
                            i11 = 0;
                            iA = i9 - f669a.a(bArr, i40, bArrB, 0, i9, i55, i31, cvVar);
                            if (iA != 0) {
                                i10 -= iA;
                                i27 = i21 - iA;
                                i28 = i9 - iA;
                                System.arraycopy(bArrB, (i27 + 1) * i31, bArr, (i10 + 1) * i31, iA * i31);
                                i8 = 1;
                                if (i28 <= 1) {
                                    i9 = i28;
                                    i7 = i7;
                                    i6 = i27;
                                    break loop2;
                                }
                                i14 = i27;
                                i12 = i28;
                            } else {
                                i8 = 1;
                                i12 = i9;
                                i14 = i21;
                            }
                            i22 = i10 * i31;
                            i23 = i40 * i31;
                            for (i24 = 0; i24 < i31; i24++) {
                                bArr[i22 + i24] = bArr[i23 + i24];
                            }
                            i10--;
                            i40--;
                            i13 = i5 - 1;
                            if (i13 == 0) {
                                i9 = i12;
                                i7 = i7;
                                i5 = i13;
                                i6 = i14;
                                break loop2;
                            }
                            i7--;
                            i25 = k;
                            if (iB >= i25) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (iA >= i25) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z || z2) {
                                i16 = i10;
                                i15 = i40;
                                cvVar2 = cvVar;
                                i42 = 1;
                            } else {
                                if (i7 < 0) {
                                    i26 = 0;
                                } else {
                                    i26 = i7;
                                }
                                i47 = i26 + 2;
                                i39 = i10;
                                i29 = i12;
                                i41 = i13;
                                i34 = i14;
                                cvVar2 = cvVar;
                                i42 = 1;
                            }
                        }
                    } else {
                        i48 = i51;
                    }
                } else {
                    int i56 = i39 * i31;
                    int i57 = i6 * i31;
                    for (int i58 = 0; i58 < i31; i58++) {
                        bArr[i56 + i58] = bArrB[i57 + i58];
                    }
                    i39--;
                    i6--;
                    i50++;
                    i29--;
                    if (i29 == i42) {
                        i7 = i51;
                        i8 = 1;
                        i9 = i29;
                        i10 = i39;
                        i11 = 0;
                        break loop2;
                    }
                    i49 = 0;
                    if ((i49 | i50) >= i51) {
                        i12 = i29;
                        i13 = i5;
                        i14 = i6;
                        i15 = i40;
                        i7 = i51;
                        i16 = i39;
                        while (true) {
                            boolean z5 = m;
                            i17 = i12;
                            iB = i13 - f669a.b(bArrB, i14, bArr, i, i13, i13 - 1, i31, cvVar2);
                            if (iB != 0) {
                                i10 = i16 - iB;
                                i40 = i15 - iB;
                                i5 = i13 - iB;
                                System.arraycopy(bArr, (i40 + 1) * i31, bArr, (i10 + 1) * i31, iB * i31);
                                if (i5 == 0) {
                                    i6 = i14;
                                    i9 = i17;
                                } else {
                                    i16 = i10;
                                }
                                i11 = 0;
                                i8 = 1;
                                break loop2;
                            }
                            i40 = i15;
                            i5 = i13;
                            i18 = i16 * i31;
                            i19 = i14 * i31;
                            while (i20 < i31) {
                                bArr[i18 + i20] = bArrB[i19 + i20];
                            }
                            i10 = i16 - 1;
                            i21 = i14 - 1;
                            i9 = i17 - 1;
                            if (i9 == i42) {
                                i6 = i21;
                                i11 = 0;
                                i8 = 1;
                                break loop2;
                            }
                            int i59 = i17 - 2;
                            cvVar = cvVar2;
                            i11 = 0;
                            iA = i9 - f669a.a(bArr, i40, bArrB, 0, i9, i59, i31, cvVar);
                            if (iA != 0) {
                                i10 -= iA;
                                i27 = i21 - iA;
                                i28 = i9 - iA;
                                System.arraycopy(bArrB, (i27 + 1) * i31, bArr, (i10 + 1) * i31, iA * i31);
                                i8 = 1;
                                if (i28 <= 1) {
                                    i9 = i28;
                                    i7 = i7;
                                    i6 = i27;
                                    break loop2;
                                }
                                i14 = i27;
                                i12 = i28;
                            } else {
                                i8 = 1;
                                i12 = i9;
                                i14 = i21;
                            }
                            i22 = i10 * i31;
                            i23 = i40 * i31;
                            while (i24 < i31) {
                                bArr[i22 + i24] = bArr[i23 + i24];
                            }
                            i10--;
                            i40--;
                            i13 = i5 - 1;
                            if (i13 == 0) {
                                i9 = i12;
                                i7 = i7;
                                i5 = i13;
                                i6 = i14;
                                break loop2;
                            }
                            i7--;
                            i25 = k;
                            if (iB >= i25) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (iA >= i25) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z || z2) {
                                i16 = i10;
                                i15 = i40;
                                cvVar2 = cvVar;
                                i42 = 1;
                            } else {
                                if (i7 < 0) {
                                    i26 = 0;
                                } else {
                                    i26 = i7;
                                }
                                i47 = i26 + 2;
                                i39 = i10;
                                i29 = i12;
                                i41 = i13;
                                i34 = i14;
                                cvVar2 = cvVar;
                                i42 = 1;
                            }
                        }
                    } else {
                        i48 = i51;
                    }
                }
            }
        }
        if (i7 < i8) {
            i7 = 1;
        }
        this.b = i7;
        if (i9 != i8) {
            if (i9 != 0) {
                System.arraycopy(bArrB, i11, bArr, (i10 - (i9 - 1)) * i31, i9 * i31);
                return;
            }
            throw new IllegalArgumentException("Comparison method violates its general contract!");
        }
        int i60 = i10 - i5;
        System.arraycopy(bArr, ((i40 - i5) + i8) * i31, bArr, (i60 + 1) * i31, i5 * i31);
        int i61 = i60 * i31;
        int i62 = i6 * i31;
        for (int i63 = 0; i63 < i31; i63++) {
            bArr[i61 + i63] = bArrB[i62 + i63];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i2) {
        int[] iArr = this.e;
        int i3 = this.d;
        iArr[i3] = i;
        this.f[i3] = i2;
        this.d = i3 + 1;
    }

    private final void a(int i) {
        byte[] bArr;
        int iA;
        if (m) {
            int i2 = this.d;
            if (i != i2 - 2) {
                int i3 = i2 - 3;
            }
        }
        int[] iArr = this.e;
        int i4 = iArr[i];
        int[] iArr2 = this.f;
        int i5 = iArr2[i];
        int i6 = i + 1;
        int i7 = iArr[i6];
        int i8 = iArr2[i6];
        iArr2[i] = i5 + i8;
        int i9 = this.d;
        if (i == i9 - 3) {
            int i10 = i + 2;
            iArr[i6] = iArr[i10];
            iArr2[i6] = iArr2[i10];
        }
        this.d = i9 - 1;
        a aVar = f669a;
        byte[] bArr2 = this.g;
        int iB = aVar.b(bArr2, i7, bArr2, i4, i5, 0, this.i, this.h);
        int i11 = i4 + iB;
        int i12 = i5 - iB;
        if (i12 == 0 || (iA = aVar.a((bArr = this.g), (i11 + i12) - 1, bArr, i7, i8, i8 - 1, this.i, this.h)) == 0) {
            return;
        }
        if (i12 <= iA) {
            a(i11, i12, i7, iA);
        } else {
            b(i11, i12, i7, iA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8 A[PHI: r1 r17 r18
  0x00f8: PHI (r1v12 int) = (r1v11 int), (r1v15 int) binds: [B:41:0x00da, B:45:0x00f4] A[DONT_GENERATE, DONT_INLINE]
  0x00f8: PHI (r17v9 int) = (r17v8 int), (r17v18 int) binds: [B:41:0x00da, B:45:0x00f4] A[DONT_GENERATE, DONT_INLINE]
  0x00f8: PHI (r18v7 int) = (r18v6 int), (r18v13 int) binds: [B:41:0x00da, B:45:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff A[LOOP:7: B:47:0x00fd->B:48:0x00ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154 A[LOOP:8: B:59:0x0152->B:60:0x0154, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c5 A[LOOP:5: B:40:0x00c5->B:88:0x01c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x01cb A[LOOP:3: B:21:0x0068->B:89:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7 A[SYNTHETIC] */
    private final void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        cv cvVar;
        int iB;
        int i14;
        int i15;
        int i16;
        int iA;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z;
        boolean z2;
        int i21;
        int i22;
        int i23;
        int i24 = i2;
        if (m && i24 > 0 && i4 > 0) {
            int i25 = i + i24;
        }
        byte[] bArr = this.g;
        int i26 = this.i;
        byte[] bArrB = b(i24);
        int i27 = i * i26;
        int i28 = i24 * i26;
        System.arraycopy(bArr, i27, bArrB, 0, i28);
        int i29 = i3 * i26;
        for (int i30 = 0; i30 < i26; i30++) {
            bArr[i27 + i30] = bArr[i29 + i30];
        }
        int i31 = 1;
        int i32 = i + 1;
        int i33 = i3 + 1;
        int i34 = i4 - 1;
        if (i34 == 0) {
            System.arraycopy(bArrB, 0, bArr, i32 * i26, i28);
            return;
        }
        if (i24 == 1) {
            System.arraycopy(bArr, i33 * i26, bArr, i32 * i26, i34 * i26);
            int i35 = (i32 + i34) * i26;
            for (int i36 = 0; i36 < i26; i36++) {
                bArr[i35 + i36] = bArrB[i36];
            }
            return;
        }
        cv cvVar2 = this.h;
        int i37 = this.b;
        int i38 = 0;
        loop2: while (true) {
            i5 = i32;
            i6 = i38;
            i7 = i34;
            int i39 = 0;
            int i40 = 0;
            while (true) {
                boolean z3 = m;
                if (cvVar2.a(i26, bArr, i33, bArrB, i6) >= 0) {
                    int i41 = i5 * i26;
                    int i42 = i6 * i26;
                    for (int i43 = 0; i43 < i26; i43++) {
                        bArr[i41 + i43] = bArrB[i42 + i43];
                    }
                    i5++;
                    i6++;
                    i39++;
                    i24--;
                    if (i24 == i31) {
                        i8 = i37;
                        i9 = 1;
                        break loop2;
                    }
                    i40 = 0;
                    if ((i39 | i40) >= i37) {
                        i10 = i7;
                        i11 = i6;
                        i12 = i5;
                        i13 = i37;
                        while (true) {
                            boolean z4 = m;
                            cvVar = cvVar2;
                            i9 = 1;
                            iB = f669a.b(bArr, i33, bArrB, i11, i24, 0, i26, cvVar);
                            if (iB != 0) {
                                i14 = i12 * i26;
                                i15 = i33 * i26;
                                while (i16 < i26) {
                                    bArr[i14 + i16] = bArr[i15 + i16];
                                }
                                i12++;
                                i33++;
                                i10--;
                                if (i10 != 0) {
                                    iA = f669a.a(bArrB, i11, bArr, i33, i10, 0, i26, cvVar);
                                    if (iA != 0) {
                                        System.arraycopy(bArr, i33 * i26, bArr, i12 * i26, iA * i26);
                                        i21 = i12 + iA;
                                        i33 += iA;
                                        i22 = i10 - iA;
                                        if (i22 == 0) {
                                            i8 = i13;
                                            i6 = i11;
                                            i5 = i21;
                                            i7 = i22;
                                            break loop2;
                                        }
                                        i12 = i21;
                                        i10 = i22;
                                    }
                                    i17 = i12 * i26;
                                    i18 = i11 * i26;
                                    while (i19 < i26) {
                                        bArr[i17 + i19] = bArrB[i18 + i19];
                                    }
                                    i12++;
                                    i11++;
                                    i24--;
                                    if (i24 == 1) {
                                        i13--;
                                        i20 = k;
                                        if (iB >= i20) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (iA >= i20) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 || z) {
                                            cvVar2 = cvVar;
                                        } else {
                                            if (i13 < 0) {
                                                i13 = 0;
                                            }
                                            i37 = i13 + 2;
                                            i32 = i12;
                                            i38 = i11;
                                            i34 = i10;
                                            cvVar2 = cvVar;
                                            i31 = 1;
                                        }
                                    }
                                }
                                i8 = i13;
                                i5 = i12;
                                i6 = i11;
                                i7 = i10;
                                break loop2;
                            }
                            System.arraycopy(bArrB, i11 * i26, bArr, i12 * i26, iB * i26);
                            i23 = i12 + iB;
                            i6 = i11 + iB;
                            i24 -= iB;
                            if (i24 <= 1) {
                                i11 = i6;
                                i12 = i23;
                                i14 = i12 * i26;
                                i15 = i33 * i26;
                                while (i16 < i26) {
                                    bArr[i14 + i16] = bArr[i15 + i16];
                                }
                                i12++;
                                i33++;
                                i10--;
                                if (i10 != 0) {
                                    iA = f669a.a(bArrB, i11, bArr, i33, i10, 0, i26, cvVar);
                                    if (iA != 0) {
                                        System.arraycopy(bArr, i33 * i26, bArr, i12 * i26, iA * i26);
                                        i21 = i12 + iA;
                                        i33 += iA;
                                        i22 = i10 - iA;
                                        if (i22 == 0) {
                                            i8 = i13;
                                            i6 = i11;
                                            i5 = i21;
                                            i7 = i22;
                                            break loop2;
                                        }
                                        i12 = i21;
                                        i10 = i22;
                                    }
                                    i17 = i12 * i26;
                                    i18 = i11 * i26;
                                    while (i19 < i26) {
                                        bArr[i17 + i19] = bArrB[i18 + i19];
                                    }
                                    i12++;
                                    i11++;
                                    i24--;
                                    if (i24 == 1) {
                                        i13--;
                                        i20 = k;
                                        if (iB >= i20) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (iA >= i20) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 || z) {
                                            cvVar2 = cvVar;
                                        } else {
                                            if (i13 < 0) {
                                                i13 = 0;
                                            }
                                            i37 = i13 + 2;
                                            i32 = i12;
                                            i38 = i11;
                                            i34 = i10;
                                            cvVar2 = cvVar;
                                            i31 = 1;
                                        }
                                    }
                                }
                                i8 = i13;
                                i5 = i12;
                                i6 = i11;
                                i7 = i10;
                                break loop2;
                            }
                            i8 = i13;
                            i7 = i10;
                            i5 = i23;
                            break loop2;
                        }
                    }
                } else {
                    int i44 = i5 * i26;
                    int i45 = i33 * i26;
                    for (int i46 = 0; i46 < i26; i46++) {
                        bArr[i44 + i46] = bArr[i45 + i46];
                    }
                    i5++;
                    i33++;
                    i40++;
                    i7--;
                    if (i7 == 0) {
                        i8 = i37;
                        i9 = 1;
                        break loop2;
                    }
                    i39 = 0;
                    if ((i39 | i40) >= i37) {
                        i10 = i7;
                        i11 = i6;
                        i12 = i5;
                        i13 = i37;
                        while (true) {
                            boolean z5 = m;
                            cvVar = cvVar2;
                            i9 = 1;
                            iB = f669a.b(bArr, i33, bArrB, i11, i24, 0, i26, cvVar);
                            if (iB != 0) {
                                i14 = i12 * i26;
                                i15 = i33 * i26;
                                for (i16 = 0; i16 < i26; i16++) {
                                    bArr[i14 + i16] = bArr[i15 + i16];
                                }
                                i12++;
                                i33++;
                                i10--;
                                if (i10 != 0) {
                                    iA = f669a.a(bArrB, i11, bArr, i33, i10, 0, i26, cvVar);
                                    if (iA != 0) {
                                        System.arraycopy(bArr, i33 * i26, bArr, i12 * i26, iA * i26);
                                        i21 = i12 + iA;
                                        i33 += iA;
                                        i22 = i10 - iA;
                                        if (i22 == 0) {
                                            i8 = i13;
                                            i6 = i11;
                                            i5 = i21;
                                            i7 = i22;
                                            break loop2;
                                        }
                                        i12 = i21;
                                        i10 = i22;
                                    }
                                    i17 = i12 * i26;
                                    i18 = i11 * i26;
                                    for (i19 = 0; i19 < i26; i19++) {
                                        bArr[i17 + i19] = bArrB[i18 + i19];
                                    }
                                    i12++;
                                    i11++;
                                    i24--;
                                    if (i24 == 1) {
                                        i13--;
                                        i20 = k;
                                        if (iB >= i20) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (iA >= i20) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 || z) {
                                            cvVar2 = cvVar;
                                        } else {
                                            if (i13 < 0) {
                                                i13 = 0;
                                            }
                                            i37 = i13 + 2;
                                            i32 = i12;
                                            i38 = i11;
                                            i34 = i10;
                                            cvVar2 = cvVar;
                                            i31 = 1;
                                        }
                                    }
                                }
                                i8 = i13;
                                i5 = i12;
                                i6 = i11;
                                i7 = i10;
                                break loop2;
                            }
                            System.arraycopy(bArrB, i11 * i26, bArr, i12 * i26, iB * i26);
                            i23 = i12 + iB;
                            i6 = i11 + iB;
                            i24 -= iB;
                            if (i24 <= 1) {
                                i11 = i6;
                                i12 = i23;
                                i14 = i12 * i26;
                                i15 = i33 * i26;
                                while (i16 < i26) {
                                    bArr[i14 + i16] = bArr[i15 + i16];
                                }
                                i12++;
                                i33++;
                                i10--;
                                if (i10 != 0) {
                                    iA = f669a.a(bArrB, i11, bArr, i33, i10, 0, i26, cvVar);
                                    if (iA != 0) {
                                        System.arraycopy(bArr, i33 * i26, bArr, i12 * i26, iA * i26);
                                        i21 = i12 + iA;
                                        i33 += iA;
                                        i22 = i10 - iA;
                                        if (i22 == 0) {
                                            i8 = i13;
                                            i6 = i11;
                                            i5 = i21;
                                            i7 = i22;
                                            break loop2;
                                        }
                                        i12 = i21;
                                        i10 = i22;
                                    }
                                    i17 = i12 * i26;
                                    i18 = i11 * i26;
                                    while (i19 < i26) {
                                        bArr[i17 + i19] = bArrB[i18 + i19];
                                    }
                                    i12++;
                                    i11++;
                                    i24--;
                                    if (i24 == 1) {
                                        i13--;
                                        i20 = k;
                                        if (iB >= i20) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (iA >= i20) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 || z) {
                                            cvVar2 = cvVar;
                                        } else {
                                            if (i13 < 0) {
                                                i13 = 0;
                                            }
                                            i37 = i13 + 2;
                                            i32 = i12;
                                            i38 = i11;
                                            i34 = i10;
                                            cvVar2 = cvVar;
                                            i31 = 1;
                                        }
                                    }
                                }
                                i8 = i13;
                                i5 = i12;
                                i6 = i11;
                                i7 = i10;
                                break loop2;
                            }
                            i8 = i13;
                            i7 = i10;
                            i5 = i23;
                            break loop2;
                        }
                    }
                }
            }
        }
        if (i8 < i9) {
            i8 = 1;
        }
        this.b = i8;
        if (i24 != i9) {
            if (i24 != 0) {
                System.arraycopy(bArrB, i6 * i26, bArr, i5 * i26, i24 * i26);
                return;
            }
            throw new IllegalArgumentException("Comparison method violates its general contract!");
        }
        System.arraycopy(bArr, i33 * i26, bArr, i5 * i26, i7 * i26);
        int i47 = (i5 + i7) * i26;
        int i48 = i6 * i26;
        for (int i49 = 0; i49 < i26; i49++) {
            bArr[i47 + i49] = bArrB[i48 + i49];
        }
    }

    private final byte[] b(int i) {
        byte[] bArr = this.c;
        AbstractC2995aW.n(bArr);
        int length = bArr.length;
        int i2 = this.i;
        if (length < i * i2) {
            int i3 = (i >> 1) | i;
            int i4 = i3 | (i3 >> 2);
            int i5 = i4 | (i4 >> 4);
            int i6 = i5 | (i5 >> 8);
            int i7 = (i6 | (i6 >> 16)) + 1;
            if (i7 >= 0) {
                i = Math.min(i7, (this.g.length / i2) >>> 1);
            }
            this.c = new byte[i * this.i];
        }
        byte[] bArr2 = this.c;
        AbstractC2995aW.n(bArr2);
        return bArr2;
    }
}
