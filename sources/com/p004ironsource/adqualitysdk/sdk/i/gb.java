package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.view.ViewConfiguration;
import com.amazon.device.ads.DTBAdRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class gb extends gi {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2063 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2064 = 2000707303426420125L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2065;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2063 = (f2065 + 59) % 128;
        String strIntern = m2147("俰侓\ufb07ꗾͥᛵ纩쮜痢彻㐱籔⍷ꇬ\uedf2㚾泉\ueb88嬁\uef35际㱄႕ꆦ\udfc7蛈컄娪ऊ켓葨ಸ늹ᆿ緭씃ﰣ婎", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        int i2 = f2065 + 123;
        f2063 = i2 % 128;
        if (i2 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2063 + 125;
        f2065 = i2 % 128;
        int i3 = i2 % 2;
        return m2147("㋎㊯顃࿉᠒疳풒킿蓕㰼鸆朩幕", -ImageFormat.getBitsPerPixel(0)).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2063 + 63;
        f2065 = i2 % 128;
        if (i2 % 2 == 0) {
            return DTBAdRequest.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bj bjVar = new bj(mo2139());
        int i2 = f2063 + 41;
        f2065 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return bjVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2147(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f2064, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f2064));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
