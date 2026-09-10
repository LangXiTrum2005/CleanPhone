package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.inmobi.sdk.InMobiSdk;

/* JADX INFO: loaded from: classes5.dex */
public final class gj extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2103 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2104 = 53208;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2105 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2106 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2107;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2103 = (f2106 + 5) % 128;
        String strIntern = m2158(KeyEvent.normalizeMetaState(0), (char) (MotionEvent.axisFromString("") + 1), "뎉\ue88bۇ\ue837", "ݤ㍗䖓팥퉐扢ꓘ㉇빾۰\uf359轢\udb33㍚⏣欰籿⮐\ue6b5\ufde7璼ꑜﭭꛢ", "\u0000\u0000\u0000\u0000").intern();
        f2106 = (f2103 + 77) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2106 = (f2103 + 29) % 128;
        String strIntern = m2158(TextUtils.getOffsetAfter("", 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 23584), "꽀舥Ἅ剜", "뽃녫㟃ꖯ젖\ue2d3", "\u0000\u0000\u0000\u0000").intern();
        int i2 = f2103 + 95;
        f2106 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        f2106 = (f2103 + 11) % 128;
        return InMobiSdk.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        br brVar = new br(mo2139());
        f2106 = (f2103 + 73) % 128;
        return brVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2158(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2107) ^ ((long) f2105)) ^ ((long) f2104));
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
}
