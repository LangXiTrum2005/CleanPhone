package com.smartdigimkt.p4;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f37526b = 15;
    private static final int d = -1;
    private static final int f = 2;
    private static final int g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f37529h = 22;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f37530i = 29;
    private static final int j = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f37525a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f37527c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f37528e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private d() {
    }

    public static Pair<Integer, Integer> a(byte[] bArr) throws com.smartdigimkt.w3.t {
        return a(new r(bArr), false);
    }

    public static byte[][] b(byte[] bArr) {
        if (!b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iA = 0;
        do {
            arrayList.add(Integer.valueOf(iA));
            iA = a(bArr, iA + f37525a.length);
        } while (iA != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            int iIntValue2 = (i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }

    public static Pair<Integer, Integer> a(r rVar, boolean z2) throws com.smartdigimkt.w3.t {
        int iA = a(rVar);
        int iB = b(rVar);
        int iA2 = rVar.a(4);
        if (iA == 5 || iA == 29) {
            iB = b(rVar);
            iA = a(rVar);
            if (iA == 22) {
                iA2 = rVar.a(4);
            }
        }
        if (z2) {
            if (iA != 6 && iA != 7 && iA != 17 && iA != 1 && iA != 2 && iA != 3 && iA != 4) {
                switch (iA) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new com.smartdigimkt.w3.t(android.support.v4.media.a.h(iA, "Unsupported audio object type: "));
                }
            }
            a(rVar, iA, iA2);
            switch (iA) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iA3 = rVar.a(2);
                    if (iA3 == 2 || iA3 == 3) {
                        throw new com.smartdigimkt.w3.t(android.support.v4.media.a.h(iA3, "Unsupported epConfig: "));
                    }
                    break;
            }
        }
        int i2 = f37528e[iA2];
        a.a(i2 != -1);
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(i2));
    }

    private static boolean b(byte[] bArr, int i2) {
        if (bArr.length - i2 <= f37525a.length) {
            return false;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f37525a;
            if (i3 >= bArr2.length) {
                return true;
            }
            if (bArr[i2 + i3] != bArr2[i3]) {
                return false;
            }
            i3++;
        }
    }

    private static int b(r rVar) {
        int iA = rVar.a(4);
        if (iA == 15) {
            return rVar.a(24);
        }
        a.a(iA < 13);
        return f37527c[iA];
    }

    public static byte[] a(int i2, int i3) {
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int[] iArr = f37527c;
            if (i6 >= iArr.length) {
                break;
            }
            if (i2 == iArr[i6]) {
                i5 = i6;
            }
            i6++;
        }
        int i7 = -1;
        while (true) {
            int[] iArr2 = f37528e;
            if (i4 >= iArr2.length) {
                break;
            }
            if (i3 == iArr2[i4]) {
                i7 = i4;
            }
            i4++;
        }
        if (i2 != -1 && i7 != -1) {
            return a(2, i5, i7);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.g(i2, i3, "Invalid sample rate or number of channels: ", ", "));
    }

    public static byte[] a(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    public static byte[] a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = f37525a;
        byte[] bArr3 = new byte[bArr2.length + i3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, i3);
        return bArr3;
    }

    private static int a(byte[] bArr, int i2) {
        int length = bArr.length - f37525a.length;
        while (i2 <= length) {
            if (b(bArr, i2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static int a(r rVar) {
        int iA = rVar.a(5);
        return iA == 31 ? rVar.a(6) + 32 : iA;
    }

    private static void a(r rVar, int i2, int i3) {
        rVar.c(1);
        if (rVar.f()) {
            rVar.c(14);
        }
        boolean zF = rVar.f();
        if (i3 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 6 || i2 == 20) {
            rVar.c(3);
        }
        if (zF) {
            if (i2 == 22) {
                rVar.c(16);
            }
            if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                rVar.c(3);
            }
            rVar.c(1);
        }
    }
}
