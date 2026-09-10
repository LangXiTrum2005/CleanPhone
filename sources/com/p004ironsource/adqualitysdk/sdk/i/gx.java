package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.qq.e.comm.managers.GDTAdSdk;

/* JADX INFO: loaded from: classes5.dex */
public final class gx extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2169 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2170 = 5719860758020762456L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2171;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2169 + 49;
        f2171 = i2 % 128;
        return m2174("⬻Ǻ纯ꬑ耝ﴨ⮸¦紞ꨎ蜵ﷺ⪩ܟ簃ꤺ蟦ﲤ⥕؊献ꧺ蛨\uf374⠤ԉ珋ꢣ蕧\uf205⼵", i2 % 2 != 0 ? TextUtils.lastIndexOf("", '8') + 11395 : 10956 - TextUtils.lastIndexOf("", '0')).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2169 = (f2171 + 117) % 128;
        String strIntern = m2174("⬬洮꜐車㍱畩轞", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17938).intern();
        f2171 = (f2169 + 7) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2171 + 41;
        f2169 = i2 % 128;
        if (i2 % 2 != 0) {
            return GDTAdSdk.class;
        }
        int i3 = 37 / 0;
        return GDTAdSdk.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        cg cgVar = new cg(mo2139());
        int i2 = f2169 + 89;
        f2171 = i2 % 128;
        if (i2 % 2 == 0) {
            return cgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2174(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2170);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
