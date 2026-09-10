package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class am {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f308 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f309 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Set<String> f310;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f311 = 1;

    static {
        m436();
        f310 = Collections.unmodifiableSet(new HashSet(Arrays.asList(m435(13 - TextUtils.indexOf("", "", 0), false, TextUtils.lastIndexOf("", '0') + 299, "\u0007\u0002\r\ufff8\ufffb\u0005\b\ufffb\ufffa�\n\ufff8\u0002", 9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m435((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, false, ExpandableListView.getPackedPositionType(0L) + 302, "\ufffa\u0003\n\ufff6\ufff9\b\ufff4\b\ufffa\b\b\ufffe\u0004\u0003\ufff4\t\u0004\u0000", KeyEvent.keyCodeFromString("") + 2).intern())));
        f311 = (f308 + 67) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m434(String str) {
        boolean zContains;
        int i10 = f308 + 5;
        f311 = i10 % 128;
        if (i10 % 2 == 0) {
            zContains = f310.contains(str);
            int i11 = 34 / 0;
        } else {
            zContains = f310.contains(str);
        }
        f311 = (f308 + 47) % 128;
        return zContains;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m436() {
        f309 = 195;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m437(Map<String, String> map) {
        Iterator<String> it = f310.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                f311 = (f308 + 23) % 128;
                i10++;
            }
        }
        f311 = (f308 + 35) % 128;
        return i10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m439(Map<String, String> map, String str) {
        f308 = (f311 + InterfaceC0435l1.d.b.f29109f) % 128;
        if (!map.containsKey(str)) {
            return map.size() >= m437(map) + 5;
        }
        f308 = (f311 + 47) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m435(int i10, boolean z10, int i11, String str, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f309);
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m438(String str, String str2) {
        int i10 = f311 + 71;
        f308 = i10 % 128;
        if (i10 % 2 == 0 ? kn.m2919(str, 64) : kn.m2919(str, 100)) {
            if (kn.m2919(str2, 64)) {
                int i11 = f311 + 43;
                int i12 = i11 % 128;
                f308 = i12;
                boolean z10 = i11 % 2 == 0;
                int i13 = i12 + 19;
                f311 = i13 % 128;
                if (i13 % 2 != 0) {
                    return z10;
                }
                throw null;
            }
        }
        return false;
    }
}
