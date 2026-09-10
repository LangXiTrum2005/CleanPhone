package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ao {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f317 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f318 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f319 = {53450, 34557, 31932, 53881, 34831, 32719, 54676};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f320 = -3457442536816159178L;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f322;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f325 = "";

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f327 = m432(TextUtils.lastIndexOf("", '0', 0) + 8, ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (53380 - TextUtils.getOffsetBefore("", 0))).intern();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f328 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f326 = "";

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f324 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Map<String, String> f323 = new HashMap();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f321 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m433() {
        int i2 = f317 + 71;
        f318 = i2 % 128;
        int i3 = i2 % 2;
        this.f321 = true;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Map<String, String> m434() {
        int i2 = f317 + 89;
        f318 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f323;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m435() {
        int i2 = f318 + 105;
        f317 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f321;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType m436() {
        int i2 = f318;
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = this.f322;
        int i3 = i2 + 89;
        f317 = i3 % 128;
        if (i3 % 2 == 0) {
            return iSAdQualityDeviceIdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m437(String str) {
        int i2 = f318 + 71;
        int i3 = i2 % 128;
        f317 = i3;
        int i4 = i2 % 2;
        this.f325 = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 3;
        f318 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m439() {
        int i2 = f318;
        String str = this.f325;
        int i3 = i2 + 13;
        f317 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m440() {
        String str;
        try {
            int i2 = f318 + 111;
            int i3 = i2 % 128;
            f317 = i3;
            if (i2 % 2 != 0) {
                str = this.f327;
                int i4 = 34 / 0;
            } else {
                str = this.f327;
            }
            int i5 = i3 + 29;
            f318 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m446(String str) {
        int i2 = f317;
        int i3 = i2 + 97;
        f318 = i3 % 128;
        if (i3 % 2 == 0) {
            this.f327 = str;
            throw null;
        }
        this.f327 = str;
        f318 = (i2 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m448() {
        int i2 = f317 + 59;
        f318 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f328;
        }
        int i3 = 29 / 0;
        return this.f328;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m438() {
        int i2 = f317;
        boolean z2 = this.f324;
        f318 = (i2 + 105) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m441(String str) {
        int i2 = f317;
        int i3 = i2 + 9;
        f318 = i3 % 128;
        int i4 = i3 % 2;
        this.f326 = str;
        if (i4 == 0) {
            int i5 = 60 / 0;
        }
        int i6 = i2 + 37;
        f318 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m444() {
        int i2 = f318 + 111;
        f317 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f326;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m447(boolean z2) {
        int i2 = f318;
        this.f328 = z2;
        int i3 = i2 + 105;
        f317 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m432(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f319[i3 + i4]) ^ (((long) i4) * f320)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m443(boolean z2) {
        int i2 = (f317 + 7) % 128;
        f318 = i2;
        this.f324 = z2;
        f317 = (i2 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m445(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i2 = f317 + 85;
        f318 = i2 % 128;
        int i3 = i2 % 2;
        this.f322 = iSAdQualityDeviceIdType;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m442(Map<String, String> map) {
        int i2 = f318 + 21;
        int i3 = i2 % 128;
        f317 = i3;
        int i4 = i2 % 2;
        this.f323 = map;
        if (i4 != 0) {
            int i5 = 92 / 0;
        }
        f318 = (i3 + 51) % 128;
    }
}
