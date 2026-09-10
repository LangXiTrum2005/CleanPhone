package com.p004ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static int f1953;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static int f1954;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final Object f1955 = new Object();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static char[] m2116(long j, char[] cArr, int i2) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i3 = 0;
        int i4 = 4;
        for (int i5 = 0; i5 < cArr.length; i5++) {
            if ((((j >>> i5) & 1) != i2 || i3 >= 4) && i4 < length) {
                cArr2[i4] = cArr[i5];
                i4++;
            } else {
                cArr2[i3] = cArr[i5];
                i3++;
            }
        }
        return cArr2;
    }
}
