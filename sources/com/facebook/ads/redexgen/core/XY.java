package com.facebook.ads.redexgen.core;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class XY {
    public static byte[] A00;
    public static String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final String A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{27, 57, 54, AbstractJsonLexerKt.TC_INVALID, 44, 120, 60, 61, 44, 61, 42, 53, 49, 54, 61, 120, 49, 62, 120, 57, 40, 40, 120, 49, 43, 120, 13, 54, 49, 44, 33, 118, 55, 13, 94, 43, 16, 23, 10, 7, 94, 31, 14, 14, 68, 94, 88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 73, 94, 90, 88, 79, 21, 105, 94, 90, 88, 79, 122, 88, 79, 82, 77, 82, 79, 66, 18, 30, 28, 95, 4, 31, 24, 5, 8, 66, 21, 95, 1, 29, 16, 8, 20, 3, 95, 36, 31, 24, 5, 8, 33, 29, 16, 8, 20, 3, 48, 18, 5, 24, 7, 24, 5, 8};
    }

    static {
        A01();
        A02 = XY.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 44));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i2, int i3) {
        return i2 >= 640 && i3 >= 640;
    }

    public static boolean A05(T8 t8) {
        boolean z2 = false;
        try {
            PackageManager packageManager = t8.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(t8.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfo.name);
                    if (activityDeclared) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = t8.A05().AAO();
            if (activityDeclared3) {
                String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (Throwable th) {
            if (t8.A05().AAO()) {
                Log.e(A02, A00(0, 32, 79), th);
            }
            return false;
        }
    }
}
