package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1168Xv {
    public static byte[] A04;
    public static String[] A05 = {"hjpknHLaZZjTdZzPCplZgY68kqFKs9mJ", "fo5QOU9KZ1ze1tQ2eGsYwj31w4KFQTsD", "06z", "6Z72OwuEHb40vMQfmYIas25Gx5L8ij", "zgyYojDCJH22MHpnUjUFo8SKgGpe9h", "JcVFSl2tthjhNAn0lu8TGNWCgvyky9P9", "deNP2WXA6WXugCSEshlHSlwQbr3L", "kabWlZRWqkAXFRNcB1wCIj8czJ08"};
    public final int A00;
    public final String A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{39, 3, 113};
    }

    static {
        A03();
    }

    public C1168Xv(String str, int i, String str2, Set<String> classes) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = classes;
    }

    public static C1168Xv A00() {
        Set setEmptySet = Collections.emptySet();
        String strA02 = A02(0, 0, 1);
        return new C1168Xv(strA02, 0, strA02, setEmptySet);
    }

    public static C1168Xv A01(String str, int i) {
        String voice;
        String strTrim = str.trim();
        AbstractC1517es.A07(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(A02(0, 1, 33));
        if (iIndexOf == -1) {
            if (A05[5].charAt(24) == 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "TPv4WQIeZgDhTbeMgiDwQ4K3MF2s0D1K";
            strArr[0] = "YOSfeERLZnTaiYt6KgbGqR9k755H0tYs";
            voice = A02(0, 0, 1);
        } else {
            voice = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
        }
        String[] strArrA1O = AbstractC1600gE.A1O(strTrim, A02(1, 2, 121));
        String str2 = strArrA1O[0];
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < voiceStartIndex; i2++) {
            hashSet.add(strArrA1O[i2]);
        }
        return new C1168Xv(str2, i, voice, hashSet);
    }
}
