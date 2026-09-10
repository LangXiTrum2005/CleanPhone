package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf extends gt {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2163 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2164 = {-178739692, 1224641553, 695382658, 150277714, 1904753255, 1560876294, 526176487, 160632955, -1504954199, 319112613, -944885437, 1154886072, 786109611, -544092803, 1765205102, -847322824, 1017990372, 1385617906};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2165 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String mo2240() {
        f2165 = (f2163 + 63) % 128;
        String strIntern = m2239(new int[]{1121518947, -1272594854, 1433638924, 95353652, 148585053, 18240133, -726702962, 2049997775}, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        int i10 = f2165 + 21;
        f2163 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final be mo2241() {
        bh bhVar = new bh(mo2240());
        f2165 = (f2163 + 73) % 128;
        return bhVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String mo2242() {
        int i10 = f2163 + 67;
        f2165 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m2239(new int[]{1514605843, 1987786353, -1791855257, 2114537255, -74143364, 38012059, 1389636476, -1953947555, 631020739, -167235100, 214846977, -1327948683, -687676631, 1738255441, -687676631, 1738255441, 955238923, -1005533004, -874501581, -58948541, -713193944, -455037016, -1561816356, 6401604, -1123124134, -464463640}, 77 % (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1))) : m2239(new int[]{1514605843, 1987786353, -1791855257, 2114537255, -74143364, 38012059, 1389636476, -1953947555, 631020739, -167235100, 214846977, -1327948683, -687676631, 1738255441, -687676631, 1738255441, 955238923, -1005533004, -874501581, -58948541, -713193944, -455037016, -1561816356, 6401604, -1123124134, -464463640}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50)).intern();
        int i11 = f2165 + 1;
        f2163 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Class mo2243() {
        int i10 = f2163;
        int i11 = i10 + 33;
        f2165 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 99;
        f2165 = i12 % 128;
        if (i12 % 2 != 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2239(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2164.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
