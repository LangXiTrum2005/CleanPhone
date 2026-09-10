package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import com.google.android.gms.internal.measurement.f2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class du extends dy {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1810 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1811 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1812 = 39987;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1813 = 19005;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1814 = 63967;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1815 = 14632;

    public du(String str, String str2, ee eeVar) {
        super(str, str2);
        m2047(str, str2, eeVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2046(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1814)) ^ ((c5 >>> 5) + f1813)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1812) ^ ((c10 + i12) ^ ((c10 << 4) + f1815))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2047(String str, String str2, ee eeVar) {
        String strM2107 = m2107();
        if (eeVar != null) {
            f1810 = (f1811 + 97) % 128;
            for (ee eeVar2 : eeVar.m2158()) {
                m2106(new dw(f2.k(m2046("䜸瞌", (Process.myPid() >> 22) + 1), str2, d5.u.i(str)), eeVar2.m2150().m2114(), strM2107, eeVar2.m2154()));
            }
        } else {
            m2106(new dw(str, str2, f2.m(d5.u.i(str), m2046("ؗᯏ\uefe6䙊㏄\ue25e뫐彦癀嵣ﳸ볫掎\uf04b祭ⲽ", ImageFormat.getBitsPerPixel(0) + 16))));
        }
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        ArrayList<StackTraceElement> arrayList = new ArrayList();
        String name = dz.class.getName();
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            int i10 = f1811 + 73;
            f1810 = i10 % 128;
            if (i10 % 2 == 0) {
                stackTrace[length].getClassName().equals(name);
                throw null;
            }
            StackTraceElement stackTraceElement = stackTrace[length];
            if (stackTraceElement.getClassName().equals(name)) {
                break;
            }
            arrayList.add(0, stackTraceElement);
        }
        for (StackTraceElement stackTraceElement2 : arrayList) {
            m2106(new dw(stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), stackTraceElement2.getLineNumber()));
        }
    }
}
