package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes5.dex */
public final class ex extends en {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1943 = {'%'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1944 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1945 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1946 = 1;

    public ex(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2114(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1943;
                char c2 = f1944;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        f1945 = (f1946 + 37) % 128;
        String strIntern = m2114((byte) (113 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0095", -ImageFormat.getBitsPerPixel(0)).intern();
        int i2 = f1946 + 99;
        f1945 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo2105(Number number, Number number2) {
        int i2 = (f1945 + 107) % 128;
        f1946 = i2;
        if (!(number instanceof Double)) {
            int i3 = i2 + 115;
            f1945 = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z2 = number2 instanceof Double;
                throw null;
            }
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    f1945 = (i2 + 95) % 128;
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number.intValue() % number2.intValue());
                    }
                }
                return Long.valueOf(number.longValue() % number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() % number2.doubleValue());
    }
}
