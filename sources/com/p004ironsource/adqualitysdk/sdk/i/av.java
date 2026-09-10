package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class av extends as.AnonymousClass3 {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f405 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f406 = 15908;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f407 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f408 = 45182;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f409 = 21380;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f410 = 22872;

    public av(au auVar) {
        m502(auVar);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m552() {
        f405 = (f407 + 11) % 128;
        boolean zOptBoolean = m501().optBoolean(m551("翢椚♗綌", TextUtils.getOffsetAfter("", 0) + 4).intern(), true);
        f405 = (f407 + 9) % 128;
        return zOptBoolean;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m553() {
        int i2 = f407 + 23;
        f405 = i2 % 128;
        if (i2 % 2 == 0) {
            m500().m544();
            throw null;
        }
        int iM544 = m500().m544();
        int i3 = f407 + 109;
        f405 = i3 % 128;
        if (i3 % 2 != 0) {
            return iM544;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m554() {
        f405 = (f407 + 109) % 128;
        int iM549 = m500().m549();
        f407 = (f405 + 71) % 128;
        return iM549;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m555() {
        int i2 = f407 + 91;
        f405 = i2 % 128;
        if (i2 % 2 != 0) {
            return m500().m547();
        }
        m500().m547();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m556() {
        List<String> listM548;
        int i2 = f405 + 123;
        f407 = i2 % 128;
        if (i2 % 2 != 0) {
            listM548 = m500().m548();
            int i3 = 93 / 0;
        } else {
            listM548 = m500().m548();
        }
        int i4 = f407 + 29;
        f405 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return listM548;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m557() {
        JSONObject jSONObjectM501;
        int iIndexOf;
        int i2 = f407 + 59;
        f405 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM501 = m501();
            iIndexOf = TextUtils.indexOf((CharSequence) "", (char) 25, 0, 0) + 3;
        } else {
            jSONObjectM501 = m501();
            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5;
        }
        return jSONObjectM501.optBoolean(m551("翢椚ሽ峨", iIndexOf).intern(), true);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m551(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f408)) ^ ((c3 >>> 5) + f406)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f409) ^ ((c4 + i4) ^ ((c4 << 4) + f410))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
