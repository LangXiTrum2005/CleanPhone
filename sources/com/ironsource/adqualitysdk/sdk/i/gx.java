package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.moloco.sdk.publisher.Moloco;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gx extends gt {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2250 = 60;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2251 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2252 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2252 + 17;
        f2251 = i10 % 128;
        return (i10 % 2 != 0 ? m2265(ViewConfiguration.getMinimumFlingVelocity() - 65, false, MotionEvent.axisFromString("") * 6190, "\ufff7\u0003\u0000\u0003\u0001\u0003", 4 % ExpandableListView.getPackedPositionType(1L)) : m2265(6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, MotionEvent.axisFromString("") + 169, "\ufff7\u0003\u0000\u0003\u0001\u0003", ExpandableListView.getPackedPositionType(0L) + 5)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bv bvVar = new bv(mo2240());
        int i10 = f2251 + 107;
        f2252 = i10 % 128;
        if (i10 % 2 != 0) {
            return bvVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2252 = (f2251 + 47) % 128;
        String strIntern = m2265(KeyEvent.normalizeMetaState(0) + 31, true, (Process.myPid() >> 22) + 158, "\u0002\u0011ￌ\r\u0001\r\n\r\u000bￌ\u000b\r\u0001\r\u0001\r\n\r￫ￌ\u0010\u0003\u0006\u0011\u0007\n\u0000\u0013\u000eￌ\t", (ViewConfiguration.getWindowTouchSlop() >> 8) + 13).intern();
        int i10 = f2252 + 91;
        f2251 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2252 + 31;
        f2251 = i10 % 128;
        if (i10 % 2 == 0) {
            return Moloco.class;
        }
        int i11 = 33 / 0;
        return Moloco.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2265(int i10, boolean z10, int i11, String str, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2250);
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
}
