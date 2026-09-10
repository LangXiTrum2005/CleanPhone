package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class aq extends as.AnonymousClass3 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f334 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f335 = 2075124712864497594L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f336 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f337;

    public aq(au auVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(m453("᪕\u1ae6泂ￒ㼍", KeyEvent.normalizeMetaState(0)).intern());
        sb.append(UUID.randomUUID().toString().replace(m453("\ue256\ue27b芮\udedf毄", ViewConfiguration.getTouchSlop() >> 8).intern(), ""));
        this.f337 = sb.toString();
        m502(auVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m453(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f335, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f335));
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m454() {
        f336 = (f334 + 121) % 128;
        String strOptString = m501().optString(m453("괤굎녋躘玃ಙ秄", View.resolveSizeAndState(0, 0, 0)).intern(), this.f337);
        f336 = (f334 + 3) % 128;
        return strOptString;
    }
}
