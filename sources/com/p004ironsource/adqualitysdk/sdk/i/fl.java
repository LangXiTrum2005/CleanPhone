package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes5.dex */
public final class fl extends ff<String> {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1983 = 4527750729700833870L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1984 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1985 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1986 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1987 = 1;

    public fl(String str, dm dmVar) {
        super(dw.m2051(str), dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2124(int i2, char c2, String str, String str2, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2569) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c2 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                j.f2567 = 0;
                while (true) {
                    int i3 = j.f2567;
                    if (i3 < length) {
                        int i4 = (i3 + 2) % 4;
                        int i5 = (i3 + 3) % 4;
                        int i6 = cArr4[i3 % 4] * 32718;
                        char c3 = cArr5[i4];
                        char c4 = (char) ((i6 + c3) % 65535);
                        j.f2568 = c4;
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                        cArr4[i5] = c4;
                        int i7 = j.f2567;
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f1983) ^ ((long) f1985)) ^ ((long) f1984));
                        j.f2567 = i7 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ff
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2124(((byte) KeyEvent.getModifierMetaStateMask()) + 2027554257, (char) (14876 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "퀟\uda05᭸ᠺ", "\ue945", "穎덕쵌㻕").intern());
        sb.append(super.toString());
        String strC = a.C(sb, m2124(2027554256 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (14875 - TextUtils.getOffsetBefore("", 0)), "퀟\uda05᭸ᠺ", "\ue945", "穎덕쵌㻕"));
        f1986 = (f1987 + 27) % 128;
        return strC;
    }
}
