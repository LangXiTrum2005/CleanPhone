package com.smartdigimkt.p4;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37594a = "NalUnitUtil";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37596c = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37597e = 6;
    private static final int f = 7;
    private static final int g = 39;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f37595b = {0, 0, 0, 1};
    public static final float[] d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f37598h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int[] f37599i = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f37602c;

        public a(int i2, int i3, boolean z2) {
            this.f37600a = i2;
            this.f37601b = i3;
            this.f37602c = z2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f37605c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f37606e;
        public final boolean f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f37607h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f37608i;
        public final boolean j;

        public b(int i2, int i3, int i4, float f, boolean z2, boolean z3, int i5, int i6, int i7, boolean z4) {
            this.f37603a = i2;
            this.f37604b = i3;
            this.f37605c = i4;
            this.d = f;
            this.f37606e = z2;
            this.f = z3;
            this.g = i5;
            this.f37607h = i6;
            this.f37608i = i7;
            this.j = z4;
        }
    }

    private p() {
    }

    public static void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i4 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i5 = byteBuffer.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i3 == 3) {
                if (i5 == 1 && (byteBuffer.get(i4) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i2 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i5 == 0) {
                i3++;
            }
            if (i5 != 0) {
                i3 = 0;
            }
            i2 = i4;
        }
    }

    public static int b(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static int c(byte[] bArr, int i2) {
        int i3;
        synchronized (f37598h) {
            int iA = 0;
            int i4 = 0;
            while (iA < i2) {
                try {
                    iA = a(bArr, iA, i2);
                    if (iA < i2) {
                        int[] iArr = f37599i;
                        if (iArr.length <= i4) {
                            f37599i = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f37599i[i4] = iA;
                        iA += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f37599i[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i9 + 2;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static a b(byte[] bArr, int i2, int i3) {
        t tVar = new t(bArr, i2, i3);
        tVar.d(8);
        int iF = tVar.f();
        int iF2 = tVar.f();
        tVar.g();
        return new a(iF, iF2, tVar.c());
    }

    public static boolean a(String str, byte b2) {
        return ("video/avc".equals(str) && (b2 & 31) == 6) || ("video/hevc".equals(str) && ((b2 & 126) >> 1) == 39);
    }

    public static int a(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0094, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = r2
            goto L9
        L8:
            r3 = r1
        L9:
            com.smartdigimkt.p4.a.b(r3)
            if (r0 != 0) goto L10
            goto Lba
        L10:
            r3 = 2
            if (r11 == 0) goto L41
            boolean r4 = r11[r1]
            if (r4 == 0) goto L1d
            a(r11)
            int r9 = r9 + (-3)
            return r9
        L1d:
            if (r0 <= r2) goto L2c
            boolean r4 = r11[r2]
            if (r4 == 0) goto L2c
            r4 = r8[r9]
            if (r4 != r2) goto L2c
            a(r11)
            int r9 = r9 - r3
            return r9
        L2c:
            if (r0 <= r3) goto L41
            boolean r4 = r11[r3]
            if (r4 == 0) goto L41
            r4 = r8[r9]
            if (r4 != 0) goto L41
            int r4 = r9 + 1
            r4 = r8[r4]
            if (r4 != r2) goto L41
            a(r11)
            int r9 = r9 - r2
            return r9
        L41:
            int r4 = r10 + (-1)
            int r9 = r9 + r3
        L44:
            if (r9 >= r4) goto L66
            r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L4d
            goto L63
        L4d:
            int r6 = r9 + (-2)
            r7 = r8[r6]
            if (r7 != 0) goto L61
            int r7 = r9 + (-1)
            r7 = r8[r7]
            if (r7 != 0) goto L61
            if (r5 != r2) goto L61
            if (r11 == 0) goto L60
            a(r11)
        L60:
            return r6
        L61:
            int r9 = r9 + (-2)
        L63:
            int r9 = r9 + 3
            goto L44
        L66:
            if (r11 == 0) goto Lba
            if (r0 <= r3) goto L7b
            int r9 = r10 + (-3)
            r9 = r8[r9]
            if (r9 != 0) goto L96
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L96
            r9 = r8[r4]
            if (r9 != r2) goto L96
            goto L94
        L7b:
            if (r0 != r3) goto L8c
            boolean r9 = r11[r3]
            if (r9 == 0) goto L96
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L96
            r9 = r8[r4]
            if (r9 != r2) goto L96
            goto L94
        L8c:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L96
            r9 = r8[r4]
            if (r9 != r2) goto L96
        L94:
            r9 = r2
            goto L97
        L96:
            r9 = r1
        L97:
            r11[r1] = r9
            if (r0 <= r2) goto La6
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto Lb0
            r9 = r8[r4]
            if (r9 != 0) goto Lb0
            goto Lae
        La6:
            boolean r9 = r11[r3]
            if (r9 == 0) goto Lb0
            r9 = r8[r4]
            if (r9 != 0) goto Lb0
        Lae:
            r9 = r2
            goto Lb1
        Lb0:
            r9 = r1
        Lb1:
            r11[r2] = r9
            r8 = r8[r4]
            if (r8 != 0) goto Lb8
            r1 = r2
        Lb8:
            r11[r3] = r1
        Lba:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.p4.p.a(byte[], int, int, boolean[]):int");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:66:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x0148  */
    public static b c(byte[] bArr, int i2, int i3) {
        int iF;
        boolean z2;
        int iF2;
        boolean z3;
        boolean zC;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        t tVar = new t(bArr, i2, i3);
        tVar.d(8);
        int iB = tVar.b(8);
        tVar.d(16);
        int iF3 = tVar.f();
        int i8 = 1;
        if (iB == 100 || iB == 110 || iB == 122 || iB == 244 || iB == 44 || iB == 83 || iB == 86 || iB == 118 || iB == 128 || iB == 138) {
            iF = tVar.f();
            boolean zC2 = iF == 3 ? tVar.c() : false;
            tVar.f();
            tVar.f();
            tVar.g();
            if (tVar.c()) {
                int i9 = iF != 3 ? 8 : 12;
                int i10 = 0;
                while (i10 < i9) {
                    if (tVar.c()) {
                        a(tVar, i10 < 6 ? 16 : 64);
                    }
                    i10++;
                }
            }
            z2 = zC2;
        } else {
            iF = 1;
            z2 = false;
        }
        int iF4 = tVar.f() + 4;
        int iF5 = tVar.f();
        if (iF5 == 0) {
            iF2 = tVar.f() + 4;
        } else {
            if (iF5 == 1) {
                boolean zC3 = tVar.c();
                tVar.e();
                tVar.e();
                long jF = tVar.f();
                z2 = z2;
                for (int i11 = 0; i11 < jF; i11++) {
                    tVar.f();
                }
                z3 = zC3;
                iF2 = 0;
            } else {
                iF2 = 0;
            }
            tVar.f();
            tVar.g();
            int iF6 = tVar.f() + 1;
            int iF7 = tVar.f() + 1;
            zC = tVar.c();
            i4 = 2 - (zC ? 1 : 0);
            int i12 = iF7 * i4;
            if (!zC) {
                tVar.g();
            }
            tVar.g();
            i5 = iF6 * 16;
            i6 = i12 * 16;
            if (tVar.c()) {
                int iF8 = tVar.f();
                int iF9 = tVar.f();
                int iF10 = tVar.f();
                int iF11 = tVar.f();
                if (iF != 0) {
                    if (iF == 3) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    i4 *= iF == 1 ? 2 : 1;
                    i8 = i7;
                }
                i5 -= (iF8 + iF9) * i8;
                i6 -= (iF10 + iF11) * i4;
            }
            int i13 = i5;
            int i14 = i6;
            if (tVar.c() || !tVar.c()) {
                f2 = 1.0f;
            } else {
                int iB2 = tVar.b(8);
                if (iB2 == 255) {
                    int iB3 = tVar.b(16);
                    int iB4 = tVar.b(16);
                    if (iB3 == 0 || iB4 == 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = iB3 / iB4;
                    }
                } else {
                    float[] fArr = d;
                    if (iB2 < fArr.length) {
                        f2 = fArr[iB2];
                    } else {
                        androidx.datastore.preferences.protobuf.a.u(iB2, "Unexpected aspect_ratio_idc value: ", f37594a);
                        f2 = 1.0f;
                    }
                }
            }
            return new b(iF3, i13, i14, f2, z2, zC, iF4, iF5, iF2, z3);
        }
        z3 = false;
        tVar.f();
        tVar.g();
        int iF12 = tVar.f() + 1;
        int iF13 = tVar.f() + 1;
        zC = tVar.c();
        i4 = 2 - (zC ? 1 : 0);
        int i15 = iF13 * i4;
        if (!zC) {
            tVar.g();
        }
        tVar.g();
        i5 = iF12 * 16;
        i6 = i15 * 16;
        if (tVar.c()) {
            int iF14 = tVar.f();
            int iF15 = tVar.f();
            int iF16 = tVar.f();
            int iF17 = tVar.f();
            if (iF != 0) {
                if (iF == 3) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                i4 *= iF == 1 ? 2 : 1;
                i8 = i7;
            }
            i5 -= (iF14 + iF15) * i8;
            i6 -= (iF16 + iF17) * i4;
        }
        int i16 = i5;
        int i17 = i6;
        if (tVar.c()) {
            f2 = 1.0f;
        } else {
            f2 = 1.0f;
        }
        return new b(iF3, i16, i17, f2, z2, zC, iF4, iF5, iF2, z3);
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static int a(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static void a(t tVar, int i2) {
        int iE = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i2; i4++) {
            if (iE != 0) {
                iE = ((tVar.e() + i3) + 256) % 256;
            }
            if (iE != 0) {
                i3 = iE;
            }
        }
    }
}
