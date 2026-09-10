package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ft extends fq {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2024 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2025 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2026 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2027 = 260;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2028 = {378, 357, 374, 292, 304, 319};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2029 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<ee> f2030;

    public ft(List<ee> list) {
        this.f2030 = list;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2135(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f2028;
                int i3 = f2027;
                if (f2026) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2029) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        f2024 = (f2025 + 87) % 128;
        if (this.f2030 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m2135(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u0083\u0082\u0081").intern());
            sb.append(TextUtils.join(m2135(null, null, 127 - Color.blue(0), "\u0084\u0085").intern(), this.f2030));
            return a.C(sb, m2135(null, null, TextUtils.indexOf("", "", 0, 0) + 127, "\u0086"));
        }
        String strIntern = m2135(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0086\u0084\u0083\u0082\u0081").intern();
        int i2 = f2025 + 9;
        f2024 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    public final du mo2122(dr drVar, cp cpVar) {
        Iterator<ee> it;
        int i2 = f2024 + 101;
        f2025 = i2 % 128;
        if (i2 % 2 != 0) {
            it = this.f2030.iterator();
            int i3 = 83 / 0;
        } else {
            it = this.f2030.iterator();
        }
        while (true) {
            el elVarM2053 = null;
            if (!it.hasNext()) {
                return new du(null);
            }
            ee next = it.next();
            if (next instanceof el) {
                elVarM2053 = (el) next;
                f2024 = (f2025 + 91) % 128;
            } else if (next instanceof dx) {
                elVarM2053 = ((dx) next).m2053();
            }
            if (elVarM2053 != null) {
                f2024 = (f2025 + 43) % 128;
                drVar.m1982(Arrays.asList(elVarM2053.m2103()));
            }
            next.mo2050(drVar, cpVar);
        }
    }
}
