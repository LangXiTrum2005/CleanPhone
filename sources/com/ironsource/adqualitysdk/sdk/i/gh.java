package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.internal.measurement.f2;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gh extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2170 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2171 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2172 = {'c', 'o', 'm', '.', 'g', 'l', 'e', 'a', 'n', 'd', 'r', 'i', 's', 'M', 'b', 'A', 'V', 'I', 'f', 'h', 'j', 'k', 'p', 'q', 't'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2173 = 5;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.Prode.m198() != false) goto L9;
     */
    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m2245() {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.gh.f2171
            int r0 = r0 + 77
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.gh.f2170 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.Prode.m198()     // Catch: java.lang.Throwable -> L4c
            r3 = 74
            int r3 = r3 / r2
            if (r0 == 0) goto L2c
            goto L1e
        L18:
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.Prode.m198()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2c
        L1e:
            int r0 = com.ironsource.adqualitysdk.sdk.i.gh.f2171
            int r0 = r0 + 39
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.gh.f2170 = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L2b
            return r2
        L2b:
            return r1
        L2c:
            r0 = 0
            float r3 = android.graphics.PointF.length(r0, r0)     // Catch: java.lang.Throwable -> L4c
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            int r0 = r0 + 38
            java.lang.String r3 = "\u0001\u0002\u0003\u0004\u0000\u0002\u0002\u0000\u0006\u0007\u0002\b\t\u0005\u000b\u0000\u000e\u0006\u0004\u0000\u0007\u0011\u0002\b\u0007\u000e\u0001\u0012\u0005\u000b\r\f\u0003\u0006\u0012\u0007\u0010\u0003"
            r4 = 0
            int r4 = android.widget.ExpandableListView.getPackedPositionType(r4)     // Catch: java.lang.Throwable -> L4c
            int r4 = 82 - r4
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = m2246(r0, r3, r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> L4c
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4c
            return r1
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.gh.m2245():boolean");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2171 + 9;
        f2170 = i10 % 128;
        return (i10 % 2 == 0 ? m2246(5 / TextUtils.indexOf((CharSequence) "", 'a', 0), "\b\u0005\u0003\u0002µ", (byte) (31 - (TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)))) : m2246(4 - TextUtils.indexOf((CharSequence) "", '0', 0), "\b\u0005\u0003\u0002µ", (byte) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 83))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        int i10 = f2171 + 51;
        f2170 = i10 % 128;
        if (i10 % 2 == 0) {
            m2245();
            throw null;
        }
        if (m2245()) {
            bc.e eVar = new bc.e(mo2240());
            f2170 = (f2171 + 29) % 128;
            return eVar;
        }
        bc bcVar = new bc(mo2240());
        f2171 = (f2170 + 107) % 128;
        return bcVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10;
        byte size;
        int i11 = f2171 + 7;
        f2170 = i11 % 128;
        int i12 = i11 % 2;
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (i12 == 0) {
            i10 = 8 >>> (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1));
            size = (byte) (11 % View.MeasureSpec.getSize(1));
        } else {
            i10 = (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)) + 35;
            size = (byte) (View.MeasureSpec.getSize(0) + 74);
        }
        return m2246(i10, "\u0001\u0002\u0003\u0004\u0000\u0002\u0002\u0000\u0006\u0007\u0002\b\t\u0005\u000b\u0000\u000e\u0006\u0004\u0000\u0007\u0011\u0002\b\u0007\u000e\b\u0012\u0004\u000b\n\u0006\u0005\u0010\u0007\u000e", size).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2171 + 15;
        int i11 = i10 % 128;
        f2170 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        f2171 = (i11 + 59) % 128;
        return MobileAds.class;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2246(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2172;
                char c4 = f2173;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
