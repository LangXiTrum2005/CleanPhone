package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.dc;

/* JADX INFO: loaded from: classes5.dex */
public final class fb extends ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1962 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1963 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1964 = {'|'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1965 = 1;

    public fb(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2118(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1964;
                char c2 = f1962;
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
        byte windowTouchSlop;
        int iIndexOf;
        int i2 = f1963 + 15;
        f1965 = i2 % 128;
        if (i2 % 2 == 0) {
            windowTouchSlop = (byte) ((ViewConfiguration.getWindowTouchSlop() >> 81) + 75);
            TextUtils.indexOf("", dc.T);
            iIndexOf = 0;
        } else {
            windowTouchSlop = (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 63);
            iIndexOf = 1 - TextUtils.indexOf((CharSequence) "", '0');
        }
        return m2118(windowTouchSlop, "»»", iIndexOf).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        int i2 = f1965 + 103;
        f1963 = i2 % 128;
        if (i2 % 2 != 0) {
            m2091().m2086(drVar, cpVar).m2047();
            throw null;
        }
        du duVarM2086 = m2091().m2086(drVar, cpVar);
        if (!duVarM2086.m2047()) {
            return m2090().m2086(drVar, cpVar);
        }
        int i3 = f1963 + 59;
        f1965 = i3 % 128;
        if (i3 % 2 != 0) {
            return duVarM2086;
        }
        throw null;
    }
}
