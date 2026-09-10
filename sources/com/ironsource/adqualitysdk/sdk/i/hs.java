package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum hs {
    f2382(-1),
    f2381(0),
    f2380(1),
    f2378(2),
    f2379(3),
    f2375(4),
    f2376(5),
    f2377(6),
    f2374(7);


    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int[] f2370 = null;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2372 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2373 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final int f2383;

    static {
        m2296();
        int i10 = f2372 + 121;
        f2373 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    hs(int i10) {
        this.f2383 = i10;
    }

    public static hs valueOf(String str) {
        int i10 = f2373 + 31;
        f2372 = i10 % 128;
        int i11 = i10 % 2;
        hs hsVar = (hs) Enum.valueOf(hs.class, str);
        if (i11 != 0) {
            int i12 = 81 / 0;
        }
        f2372 = (f2373 + 47) % 128;
        return hsVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hs[] valuesCustom() {
        hs[] hsVarArr;
        int i10 = f2373 + 61;
        f2372 = i10 % 128;
        if (i10 % 2 != 0) {
            hsVarArr = (hs[]) values().clone();
            int i11 = 36 / 0;
        } else {
            hsVarArr = (hs[]) values().clone();
        }
        f2372 = (f2373 + 99) % 128;
        return hsVarArr;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static hs m2295(int i10) {
        switch (i10) {
            case -1:
                return f2382;
            case 0:
                return f2381;
            case 1:
                return f2380;
            case 2:
                hs hsVar = f2378;
                f2373 = (f2372 + 75) % 128;
                return hsVar;
            case 3:
                return f2379;
            case 4:
                return f2375;
            case 5:
                return f2376;
            case 6:
                return f2377;
            case 7:
                hs hsVar2 = f2374;
                int i11 = f2372 + InterfaceC0435l1.d.b.f29109f;
                f2373 = i11 % 128;
                if (i11 % 2 != 0) {
                    return hsVar2;
                }
                throw null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2296() {
        f2370 = new int[]{-1077194909, 118812584, -58858183, -1746563693, 288020993, -58735435, 1985736475, 1303989934, -1389986272, -340918760, 139450323, 983823714, -1527467829, 1522809222, 1527079327, -1988048549, -1452819418, -1220186796};
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2297(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2370.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2298() {
        int i10 = f2372 + 117;
        int i11 = i10 % 128;
        f2373 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = this.f2383;
        f2372 = (i11 + 41) % 128;
        return i12;
    }
}
