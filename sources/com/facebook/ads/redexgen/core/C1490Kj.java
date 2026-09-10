package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1490Kj {
    public static byte[] A04;
    public static String[] A05 = {"Tlnn5cKjLaIjRpnStB3TtMXpCr", "3ektkjDKhO", "UADsPGxQMgbdHUVZTw2T7TudB6ybNpUs", "wMkteQxfp4DsqI2DXiVAWfh1RT3", "vTGkM2prP14EX1TDx6P9XqiD0Fmww", "sal8paYv5RRrD9uY6TWNX8GISo", "qTpYd1bjPJIA7eigqjtgMToqdlzi", "UsOSpCey7qyyyJdYXs2GK2q4qSEth0kx"};
    public final int A00;
    public final String A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{2, 73, 59};
        if (A05[2].charAt(0) == 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[6] = "WMYi1W8Xbtf0WzjxHgJrZE6ARrtq";
        strArr[1] = "r4jVis15Qe";
    }

    static {
        A03();
    }

    public C1490Kj(String str, int i2, String str2, Set<String> classes) {
        this.A00 = i2;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = classes;
    }

    public static C1490Kj A00() {
        Set setEmptySet = Collections.emptySet();
        String strA02 = A02(0, 0, 5);
        return new C1490Kj(strA02, 0, strA02, setEmptySet);
    }

    public static C1490Kj A01(String str, int i2) {
        String strTrim;
        String strTrim2 = str.trim();
        AbstractC10843y.A07(!strTrim2.isEmpty());
        int iIndexOf = strTrim2.indexOf(A02(0, 1, 24));
        if (iIndexOf == -1) {
            strTrim = A02(0, 0, 5);
        } else {
            strTrim = strTrim2.substring(iIndexOf).trim();
            strTrim2 = strTrim2.substring(0, iIndexOf);
        }
        String[] strArrA1O = C5C.A1O(strTrim2, A02(1, 2, 47));
        String str2 = strArrA1O[0];
        HashSet hashSet = new HashSet();
        for (int i3 = 1; i3 < voiceStartIndex; i3++) {
            hashSet.add(strArrA1O[i3]);
        }
        return new C1490Kj(str2, i2, strTrim, hashSet);
    }
}
