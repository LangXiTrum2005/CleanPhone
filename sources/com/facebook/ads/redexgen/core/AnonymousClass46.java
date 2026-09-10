package com.facebook.ads.redexgen.core;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.46, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass46 {
    public static byte[] A00;
    public static String[] A01 = {"iRbt0o504Arwoby5JHXaSNdVCCanqX3Z", "ASbg6tg4kzyOiw5fOrTV48A6bdNu61QQ", "VJNj5t4vCwi8aTooUiCSn6hrJqJmgDCA", "jF3QiYzhpB2jmiLUWXOlRV8C8MCMW37s", "04l0YgLQyX7hnS2Tq5aYjCPcYldth61t", "viWvpQwMaKSmF6BaYaPf73TpnglWhe5o", "UZSp3mVbJo9", "8WqjnkkE7kcSKcejfHJHrMyyjo529bht"};
    public static final byte[] A02;
    public static final String[] A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-49, -58, -47, -45, -7, -5, -84, -74, 13, 34, 15, -35, -38, -47, -36, -34, 4, -47, -36, -34, 4, -47, -36, -34, 4, -43, -29, -48, -98, -101, -110, -32, -110, -47, -101, -110, -59, -101, -110, -48, -110, -47};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A03 = new String[]{A02(0, 0, 27), A02(5, 1, 112), A02(6, 1, 32), A02(7, 1, 41)};
    }

    public static Pair<Integer, Integer> A00(byte[] bArr) {
        C11074v c11074v = new C11074v(bArr);
        c11074v.A0f(9);
        int sampleRate = c11074v.A0I();
        c11074v.A0f(20);
        return Pair.create(Integer.valueOf(c11074v.A0L()), Integer.valueOf(sampleRate));
    }

    public static String A01(int i2, int i3, int i4) {
        return String.format(A02(8, 17, 98), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String A03(int i2, boolean z2, int i3, int i4, int[] iArr, int i5) {
        StringBuilder sb = new StringBuilder(C5C.A0n(A02(25, 17, 35), A03[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(z2 ? 'H' : 'L'), Integer.valueOf(i5)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(A02(0, 5, 87), Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static List<byte[]> A04(boolean z2) {
        byte[] bArr = new byte[1];
        if (z2) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return Collections.singletonList(bArr);
    }

    public static boolean A06(List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1) {
            return false;
        }
        byte b2 = list.get(0)[0];
        if (A01[6].length() != 11) {
            throw new RuntimeException();
        }
        A01[6] = "7rG63N7qIw7";
        return b2 == 1;
    }

    public static byte[] A07(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[A02.length + i3];
        byte[] bArr3 = A02;
        byte[] nalUnit = A02;
        System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A02;
        System.arraycopy(bArr, i2, bArr2, nalUnit2.length, i3);
        return bArr2;
    }
}
