package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bd extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f734 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f735 = -5143092119604463161L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f736;

    public bd(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m775(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f735, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f735));
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean mo776() {
        f736 = (f734 + 35) % 128;
        return true;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean mo777() {
        int i2 = f736 + 79;
        f734 = i2 % 128;
        return i2 % 2 != 0;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        int i2 = f734 + 107;
        f736 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        int i2 = f736 + 17;
        f734 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f736 = (f734 + 15) % 128;
        String strIntern = m775("\u0ace꧵其ઋ큼ꊹ툚뼍\ued9e쥓讘", 1 - KeyEvent.normalizeMetaState(0)).intern();
        f736 = (f734 + 57) % 128;
        return strIntern;
    }
}
