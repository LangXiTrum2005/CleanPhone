package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dt extends dr {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1807 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1808 = 164;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1809;

    /* JADX WARN: Illegal instructions before constructor call */
    public dt(cl clVar, String str, String str2) {
        StringBuilder sbI = d5.u.i(str2);
        sbI.append(m2045(TextUtils.getTrimmedLength("") + 9, false, AndroidCharacter.getMirror('0') + 197, "#\u0017\u001e\u0013ￏ￩ￏ￼\u0014", 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
        sbI.append(str);
        super(clVar, null, f2.m(sbI, m2045((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13, true, TextUtils.getCapsMode("", 0, 0) + 255, "ￅ\u0018\u000eￅￓ\t\n\u0013\u000e\u000b\n\t\u0013\u001a", 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2045(int i10, boolean z10, int i11, String str, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1808);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.dn
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2033() {
        f1807 = (f1809 + 119) % 128;
        String strIntern = m2045(View.combineMeasuredStates(0, 0) + 35, false, Gravity.getAbsoluteGravity(0, 0) + 266, "\uffdf\u0012�\uffff\n\u000e\u0003\t\b\r\f\u0006\uffc8\u0006\ufffb\b\u0001\uffc8\uffef\b\r\u000f\n\n\t\f\u000e\uffff\ufffe\uffe7\uffff\u000e\u0002\t\ufffe", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8).intern();
        int i10 = f1809 + 121;
        f1807 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 61 / 0;
        }
        return strIntern;
    }
}
