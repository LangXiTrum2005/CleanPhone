package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class K7 {
    public static byte[] A05;
    public static String[] A06 = {"rlpJzJvMZPS96752sWOw4hHmtt9HQE0Q", "UPlQWo", "ZXUw26V2c7", "6tEwv6Up9NP4MOjnWwfRMdieV7ltrfDK", "1MWXcVZusFrtXDSpfsJ6Y4yHAb", "3y9vGkKnNQnOlcIPORqt4hFWNeEUPhWe", "", "J1HUrfSw1j9IlDpk2TzINIeAn4Xj8ByV"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].charAt(28) == strArr[3].charAt(28)) {
                throw new RuntimeException();
            }
            A06[6] = "";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 99);
            i5++;
        }
    }

    public static void A02() {
        A05 = new byte[]{122, 107, 66, 95, 64, 76, 89, 23, 89, 82, 88, 2, 5, 16, 3, 5, 118, 113, 124, 105, 96, 33, 48, 45, 33};
    }

    static {
        A02();
    }

    public K7(int i2, int i3, int i4, int i5, int i6) {
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A01 = i6;
    }

    public static K7 A00(String str) {
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        String strA01 = A01(1, 7, 78);
        AbstractC10843y.A07(str.startsWith(strA01));
        int startTimeIndex = strA01.length();
        String[] keys = TextUtils.split(str.substring(startTimeIndex), A01(0, 1, 53));
        int i6 = 0;
        while (true) {
            int startTimeIndex2 = keys.length;
            int textIndex = -1;
            if (i6 < startTimeIndex2) {
                String strA02 = AbstractC2495k7.A01(keys[i6].trim());
                int startTimeIndex3 = strA02.hashCode();
                switch (startTimeIndex3) {
                    case 100571:
                        if (strA02.equals(A01(8, 3, 95))) {
                            textIndex = 1;
                        }
                        break;
                    case 3556653:
                        if (strA02.equals(A01(21, 4, 54))) {
                            textIndex = 3;
                        }
                        break;
                    case 109757538:
                        if (strA02.equals(A01(11, 5, 18))) {
                            textIndex = 0;
                        }
                        break;
                    case 109780401:
                        int endTimeIndex = A06[7].charAt(11);
                        if (endTimeIndex == 70) {
                            throw new RuntimeException();
                        }
                        A06[6] = "";
                        if (strA02.equals(A01(16, 5, 102))) {
                            textIndex = 2;
                        }
                        break;
                        break;
                }
                switch (textIndex) {
                    case 0:
                        i2 = i6;
                        break;
                    case 1:
                        i3 = i6;
                        break;
                    case 2:
                        i4 = i6;
                        break;
                    case 3:
                        i5 = i6;
                        break;
                }
                i6++;
            } else {
                if (i2 != -1 && i3 != -1 && i5 != -1) {
                    return new K7(i2, i3, i4, i5, keys.length);
                }
                return null;
            }
        }
    }
}
