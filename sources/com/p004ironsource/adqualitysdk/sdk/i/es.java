package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.dc;

/* JADX INFO: loaded from: classes5.dex */
public final class es extends ek {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1924 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1925 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1926 = {dc.T};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1927 = 1;

    public es(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        int i2 = f1925 + 13;
        f1927 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2109((byte) (121 >> TextUtils.getOffsetBefore("", 1)), "\u0080\u0080", 5 % (TypedValue.complexToFraction(1, 2.0f, 0.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(1, 2.0f, 0.0f) == 1.0f ? 0 : -1))) : m2109((byte) (TextUtils.getOffsetBefore("", 0) + 67), "\u0080\u0080", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2)).intern();
        f1927 = (f1925 + 57) % 128;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.es.f1927 = (r1 + 87) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return true;
     */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2099(int r4) {
        /*
            r3 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.es.f1927
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.es.f1925 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L13
            r0 = 50
            int r0 = r0 / r2
            if (r4 != 0) goto L1d
            goto L15
        L13:
            if (r4 != 0) goto L1d
        L15:
            int r1 = r1 + 87
            int r1 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.es.f1927 = r1
            r4 = 1
            return r4
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.es.mo2099(int):boolean");
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2101(String str, String str2) {
        int i2 = f1927 + 113;
        f1925 = i2 % 128;
        if (i2 % 2 != 0) {
            str.equals(str2);
            throw null;
        }
        boolean zEquals = str.equals(str2);
        f1927 = (f1925 + 103) % 128;
        return zEquals;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2109(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1926;
                char c2 = f1924;
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    public final boolean mo2100(Object obj, Object obj2) {
        int i2 = f1927;
        f1925 = (i2 + 39) % 128;
        if (obj == obj2) {
            f1925 = (i2 + 83) % 128;
            return true;
        }
        f1925 = (i2 + 1) % 128;
        return false;
    }
}
