package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dn extends RuntimeException {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1774 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1775 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1776 = 8777031841893598247L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f1777;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final Throwable f1778;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final dy f1779;

    public dn(String str, dy dyVar, Throwable th2) {
        this.f1777 = str;
        this.f1779 = dyVar;
        this.f1778 = th2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2032(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1776);
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

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo2033());
        String string = "";
        sb2.append(m2032("䐝鋦", 55008 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
        sb2.append(this.f1777);
        sb2.append('\n');
        sb2.append(this.f1779);
        if (this.f1778 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2032("䐭軹텼ᮅ渠녓ﯭ칌Ⴍ寛긿\uf0b8", 51870 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            sb3.append(Log.getStackTraceString(this.f1778));
            string = sb3.toString();
        } else {
            f1775 = (f1774 + 65) % 128;
        }
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract String mo2033();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2034(String str) {
        f1775 = (f1774 + 7) % 128;
        cn.m1707(str, this.f1777, this);
        f1774 = (f1775 + 73) % 128;
    }
}
