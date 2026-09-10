package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dh {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1696 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1697 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1698 = 108;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1699;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1700;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1701;

    public dh(JSONObject jSONObject) {
        this.f1701 = jSONObject.optBoolean(m1928((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, true, MotionEvent.axisFromString("") + 211, "\u0007\ufffe\ufffb\uffff\f\u0002￮\b\u0003\ufffb", 1 - KeyEvent.normalizeMetaState(0)).intern());
        this.f1699 = jSONObject.optBoolean(m1928(8 - Process.getGidForName(""), true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 209, "\u000e\u0000\ufffb\b\u0003\ufffb\uffe7\f\uffff", 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
        this.f1700 = eb.m2127(jSONObject.optString(m1928(KeyEvent.keyCodeFromString("") + 6, true, Process.getGidForName("") + 215, "\ufffa\u0005\ufffe\n\ufffb\u0003", (ViewConfiguration.getScrollBarSize() >> 8) + 6).intern()));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1928(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f1698);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1929() {
        int i10 = f1697;
        int i11 = i10 + 61;
        f1696 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1700;
        if (i12 == 0) {
            int i13 = 9 / 0;
        }
        f1696 = (i10 + 117) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m1930() {
        int i10 = (f1697 + 5) % 128;
        f1696 = i10;
        boolean z10 = this.f1701;
        int i11 = i10 + 91;
        f1697 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m1931() {
        int i10 = (f1697 + 121) % 128;
        f1696 = i10;
        boolean z10 = this.f1699;
        f1697 = (i10 + InterfaceC0435l1.d.b.f29110g) % 128;
        return z10;
    }
}
