package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import com.ironsource.InterfaceC0435l1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bg extends be {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f757 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f758 = 8179498684762241624L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f759 = 1;

    public bg(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﱟ */
    public final boolean mo807() {
        int i10 = (f757 + 89) % 128;
        f759 = i10;
        int i11 = i10 + 19;
        f757 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 3 / 0;
        }
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﱡ */
    public final boolean mo814() {
        int i10 = f757 + 95;
        f759 = i10 % 128;
        return i10 % 2 != 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f759 = (f757 + 61) % 128;
        String strIntern = m825("㨝尿\uf64bࡡꊰ쓐廪", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26152).intern();
        f759 = (f757 + 93) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        int i10 = f759 + InterfaceC0435l1.d.b.f29114k;
        f757 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        f759 = (f757 + InterfaceC0435l1.d.b.f29112i) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m825(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f758);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
