package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class db extends cw {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1634 = -727503175;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1635 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1636;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1637;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1638;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m1871(cl clVar, List<Object> list, ee eeVar) {
        int i10 = f1638 + InterfaceC0435l1.d.b.f29112i;
        f1635 = i10 % 128;
        if (i10 % 2 != 0) {
            p.m2997(m1874(clVar, list, eeVar), m1869(list));
            return null;
        }
        p.m2997(m1874(clVar, list, eeVar), m1869(list));
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1872(cl clVar, List<Object> list, ee eeVar) {
        f1638 = (f1635 + 13) % 128;
        p.m2996(m1874(clVar, list, eeVar));
        int i10 = f1638 + 29;
        f1635 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 41 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1873(cl clVar, List<Object> list, ee eeVar) {
        f1635 = (f1638 + 25) % 128;
        p.m3001(m1874(clVar, list, eeVar));
        int i10 = f1635 + 39;
        f1638 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final je m1874(final cl clVar, List<Object> list, final ee eeVar) {
        final List<Object> listM1803;
        f1635 = (f1638 + 39) % 128;
        try {
            if (cw.m1804(list, 0, je.class)) {
                f1638 = (f1635 + InterfaceC0435l1.d.b.f29109f) % 128;
                return (je) cw.m1805(list, 0, je.class);
            }
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            if (list.size() > 2) {
                f1635 = (f1638 + 49) % 128;
                listM1803 = cw.m1803(list, 2);
            } else {
                listM1803 = cw.m1803(list, 1);
            }
            return new je() { // from class: com.ironsource.adqualitysdk.sdk.i.db.3
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    listM1803.add(0, this);
                    dzVar.m2113(eeVar, clVar, listM1803);
                    listM1803.remove(0);
                }
            };
        } catch (Exception e10) {
            cn.m1708(clVar.m1643(), m1870((char) (TextUtils.indexOf("", "", 0) + 30232), "\u0000\u0000\u0000\u0000", "\uf791\u1cffᡛᙶ", "崕섪◅\u0a00ܳ㠾皀웃Ὲ톢͛聣⍘椨ᥔ\ud94c䏄鉛洈\u2d74⪪륭蒙\uea17軓㷩閅䫸蜓뮟", View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1875(cl clVar, List<Object> list, ee eeVar) {
        f1638 = (f1635 + 23) % 128;
        p.m2991(m1874(clVar, list, eeVar), m1869(list));
        int i10 = f1638 + 77;
        f1635 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1876(cl clVar, List<Object> list, ee eeVar) {
        int i10 = f1635 + 125;
        f1638 = i10 % 128;
        if (i10 % 2 == 0) {
            p.m2998(m1874(clVar, list, eeVar));
            return null;
        }
        p.m2998(m1874(clVar, list, eeVar));
        int i11 = 13 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1877(cl clVar, List<Object> list, ee eeVar) {
        f1638 = (f1635 + 1) % 128;
        p.m2994(m1874(clVar, list, eeVar));
        f1638 = (f1635 + 27) % 128;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long m1869(List<Object> list) {
        long jIntValue;
        int i10 = f1635 + 99;
        f1638 = i10 % 128;
        if (i10 % 2 == 0 ? list.size() <= 1 : list.size() <= 1) {
            if (list.size() > 2) {
                f1635 = (f1638 + 75) % 128;
                jIntValue = ((Integer) cw.m1805(list, 2, Integer.class)).intValue();
            } else {
                jIntValue = 0;
            }
        } else if (cw.m1804(list, 1, Integer.class)) {
            jIntValue = ((Integer) cw.m1805(list, 1, Integer.class)).intValue();
            f1638 = (f1635 + 71) % 128;
        } else if (list.size() > 2) {
            f1635 = (f1638 + 75) % 128;
            jIntValue = ((Integer) cw.m1805(list, 2, Integer.class)).intValue();
        } else {
            jIntValue = 0;
        }
        f1635 = (f1638 + 107) % 128;
        return jIntValue;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1870(char c4, String str, String str2, String str3, int i10) {
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
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f1636) ^ ((long) f1634)) ^ ((long) f1637));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
