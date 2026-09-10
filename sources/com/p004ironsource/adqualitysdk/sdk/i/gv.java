package com.p004ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import com.tapjoy.Tapjoy;

/* JADX INFO: loaded from: classes5.dex */
public final class gv extends gi {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2158 = 4;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2159 = {'c', 'o', 'm', '.', 't', 'a', 'p', 'j', 'y', 'T', 'd', 'e', 'f', 'g', 'h', 'i'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2160 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2161;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2161 + 27;
        f2160 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2171((byte) ((ViewConfiguration.getLongPressTimeout() % 16) * 28), "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\u0000\t\u0001\u000b\u0006\u0007\u0005\u0003ð", 103 / (ViewConfiguration.getLongPressTimeout() % 19)) : m2171((byte) (119 - (ViewConfiguration.getLongPressTimeout() >> 16)), "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\u0000\t\u0001\u000b\u0006\u0007\u0005\u0003ð", (ViewConfiguration.getLongPressTimeout() >> 16) + 17)).intern();
        f2160 = (f2161 + 25) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2160 = (f2161 + 47) % 128;
        String strIntern = m2171((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21), "\u0005\u0006\u0007\u0004\u0000\t", TextUtils.indexOf("", "") + 6).intern();
        int i2 = f2161 + 95;
        f2160 = i2 % 128;
        if (i2 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = (f2161 + 41) % 128;
        f2160 = i2;
        f2161 = (i2 + 25) % 128;
        return Tapjoy.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        ce ceVar = new ce(mo2139());
        int i2 = f2160 + 27;
        f2161 = i2 % 128;
        if (i2 % 2 == 0) {
            return ceVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2171(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2159;
                char c2 = f2158;
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
}
