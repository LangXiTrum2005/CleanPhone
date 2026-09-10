package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fj extends em {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2060 = 23;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2061 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2062 = 1;

    public fj(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2210(int i10, boolean z10, int i11, String str, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2060);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r2.m2124() instanceof java.lang.String) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r3 = r0.m2121();
        r2 = r2.m2121();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if ((r3 instanceof java.lang.Double) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if ((r2 instanceof java.lang.Double) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if ((r3 instanceof java.lang.Long) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.fj.f2062 + com.ironsource.InterfaceC0435l1.d.b.f29107d;
        com.ironsource.adqualitysdk.sdk.i.fj.f2061 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if ((r4 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if ((r2 instanceof java.lang.Long) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Integer.valueOf(r2.intValue() + r3.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Long.valueOf(r2.longValue() + r3.longValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r4 = new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Double.valueOf(r2.doubleValue() + r3.doubleValue()));
        com.ironsource.adqualitysdk.sdk.i.fj.f2061 = (com.ironsource.adqualitysdk.sdk.i.fj.f2062 + 97) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if ((r2.m2124() instanceof java.lang.String) != false) goto L32;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo2164(com.ironsource.adqualitysdk.sdk.i.ee r3, com.ironsource.adqualitysdk.sdk.i.cl r4) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fj.mo2164(com.ironsource.adqualitysdk.sdk.i.ee, com.ironsource.adqualitysdk.sdk.i.cl):com.ironsource.adqualitysdk.sdk.i.ea");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        f2061 = (f2062 + 23) % 128;
        String strIntern = m2210((Process.myPid() >> 22) + 1, true, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 66, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, TextUtils.indexOf("", "", 0) + 1).intern();
        f2061 = (f2062 + 51) % 128;
        return strIntern;
    }
}
