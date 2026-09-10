package com.google.common.primitives;

import com.google.common.base.formularize;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Longs.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront {

    /* JADX INFO: compiled from: Longs.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final byte[] f21972attabal;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            f21972attabal = bArr;
        }

        public static int attabal(char c) {
            if (c < 128) {
                return f21972attabal[c];
            }
            return -1;
        }
    }

    public static int attabal(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static long dern(long... jArr) {
        formularize.wireman(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static int saneness(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @CheckForNull
    public static Long wireman(String str, int i) {
        if (((String) formularize.triweekly(str)).isEmpty()) {
            return null;
        }
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i);
        }
        int i2 = str.charAt(0) == '-' ? 1 : 0;
        if (i2 == str.length()) {
            return null;
        }
        int i3 = i2 + 1;
        int iAttabal = attabal.attabal(str.charAt(i2));
        if (iAttabal < 0 || iAttabal >= i) {
            return null;
        }
        long j = -iAttabal;
        long j2 = i;
        long j3 = Long.MIN_VALUE / j2;
        while (i3 < str.length()) {
            int i4 = i3 + 1;
            int iAttabal2 = attabal.attabal(str.charAt(i3));
            if (iAttabal2 < 0 || iAttabal2 >= i || j < j3) {
                return null;
            }
            long j4 = j * j2;
            long j5 = iAttabal2;
            if (j4 < j5 - Long.MIN_VALUE) {
                return null;
            }
            j = j4 - j5;
            i3 = i4;
        }
        if (i2 != 0) {
            return Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j);
    }
}
