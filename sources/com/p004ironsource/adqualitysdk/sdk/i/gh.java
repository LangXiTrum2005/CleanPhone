package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.AdSettings;

/* JADX INFO: loaded from: classes5.dex */
public final class gh extends gi {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2093 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2094 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2095 = -6771820301133283168L;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2093 + 117;
        f2094 = i2 % 128;
        return m2155("讇軦ᣟ⚟诤踩᧲❑襡趧᭼⊚軥謩Ự—谩蚧ၻ⾌膩萇ᏻ\u2d2c蝢莲ᕫ⢖蓩脡࣬", i2 % 2 == 0 ? View.combineMeasuredStates(1, 0) : View.combineMeasuredStates(0, 0)).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2093 + 105;
        f2094 = i2 % 128;
        if (i2 % 2 == 0) {
            m2155("䌥\uddad檴\ud9a2䍃\udd6c殗\ud827䇇\udee2椛\udda9", TextUtils.getTrimmedLength("")).intern();
            throw null;
        }
        String strIntern = m2155("䌥\uddad檴\ud9a2䍃\udd6c殗\ud827䇇\udee2椛\udda9", TextUtils.getTrimmedLength("")).intern();
        f2094 = (f2093 + 35) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2094 + 115;
        int i3 = i2 % 128;
        f2093 = i3;
        if (i2 % 2 != 0) {
            int i4 = 45 / 0;
        }
        f2094 = (i3 + 23) % 128;
        return AdSettings.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bn bnVar = new bn(mo2139());
        int i2 = f2093 + 5;
        f2094 = i2 % 128;
        if (i2 % 2 != 0) {
            return bnVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2155(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f2095, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f2095));
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
