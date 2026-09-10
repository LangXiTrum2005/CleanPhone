package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dw {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1829 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1830 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1831 = 9029573360206146788L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final int f1832;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f1833;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final String f1834;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f1835;

    public dw(String str, String str2, String str3) {
        this(str, str2, str3, 0);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2055(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f1831, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1831));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1835);
        sb2.append(m2055("̔䣳̺\uf010搟", TextUtils.getOffsetBefore("", 0)).intern());
        sb2.append(this.f1834);
        sb2.append(m2055("珬噸珄ᚼ쬅", Color.green(0)).intern());
        sb2.append(this.f1833);
        sb2.append(m2055("ন㙼\u0992鏚\ue8c8", ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb2.append(this.f1832);
        String strM = f2.m(sb2, m2055("ﱌ㑑ﱥ䜀\uf354", ViewConfiguration.getMaximumFlingVelocity() >> 16));
        int i10 = f1830 + 93;
        f1829 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public dw(String str, String str2, String str3, int i10) {
        this.f1835 = str;
        this.f1834 = str2;
        this.f1833 = str3;
        this.f1832 = i10;
    }
}
