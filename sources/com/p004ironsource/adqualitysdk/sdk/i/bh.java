package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bh extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f761 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f762 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f763 = 124;

    public bh(String str) {
        super(str);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﱟ */
    public final boolean mo776() {
        int i2 = (f761 + 51) % 128;
        f762 = i2;
        f761 = (i2 + 51) % 128;
        return true;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        int i2 = f761 + 15;
        f762 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return map;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        int i2 = (f762 + 55) % 128;
        f761 = i2;
        int i3 = i2 + 13;
        f762 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f761 + 21;
        f762 = i2 % 128;
        return (i2 % 2 != 0 ? m795(3 / View.resolveSizeAndState(0, 1, 1), 16 % (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 16345 << TextUtils.lastIndexOf("", 'N'), "\ufffb\b\uffff\ufffe\uffff\u0006￼", false) : m795(View.resolveSizeAndState(0, 0, 0) + 3, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, TextUtils.lastIndexOf("", '0') + 195, "\ufffb\b\uffff\ufffe\uffff\u0006￼", true)).intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m795(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f763);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
