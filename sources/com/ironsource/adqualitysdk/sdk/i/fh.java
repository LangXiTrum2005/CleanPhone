package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fh extends ey {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2050 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2051 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2052 = {'*'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2053 = 1;

    public fh(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2208(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2052;
                char c4 = f2050;
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

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if ((r4 instanceof java.lang.Long) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if ((r4 instanceof java.lang.Long) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        return java.lang.Integer.valueOf(r4.intValue() * r3.intValue());
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number mo2199(java.lang.Number r3, java.lang.Number r4) {
        /*
            r2 = this;
            int r2 = com.ironsource.adqualitysdk.sdk.i.fh.f2053
            int r2 = r2 + 85
            int r0 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.fh.f2051 = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L15
            boolean r2 = r3 instanceof java.lang.Double
            r1 = 42
            int r1 = r1 / 0
            if (r2 != 0) goto L5e
            goto L19
        L15:
            boolean r2 = r3 instanceof java.lang.Double
            if (r2 != 0) goto L5e
        L19:
            boolean r2 = r4 instanceof java.lang.Double
            if (r2 == 0) goto L1e
            goto L5e
        L1e:
            boolean r2 = r3 instanceof java.lang.Long
            if (r2 != 0) goto L48
            int r0 = r0 + 109
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fh.f2053 = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L35
            boolean r2 = r4 instanceof java.lang.Long
            r0 = 78
            int r0 = r0 / 0
            if (r2 == 0) goto L3a
            goto L48
        L35:
            boolean r2 = r4 instanceof java.lang.Long
            if (r2 == 0) goto L3a
            goto L48
        L3a:
            int r2 = r3.intValue()
            int r3 = r4.intValue()
            int r3 = r3 * r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            return r2
        L48:
            long r2 = r3.longValue()
            long r0 = r4.longValue()
            long r0 = r0 * r2
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            int r3 = com.ironsource.adqualitysdk.sdk.i.fh.f2053
            int r3 = r3 + 61
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.fh.f2051 = r3
            return r2
        L5e:
            double r2 = r3.doubleValue()
            double r0 = r4.doubleValue()
            double r0 = r0 * r2
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fh.mo2199(java.lang.Number, java.lang.Number):java.lang.Number");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        f2051 = (f2053 + 7) % 128;
        String strIntern = m2208(1 - (ViewConfiguration.getTapTimeout() >> 16), "y", (byte) (80 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern();
        f2053 = (f2051 + 123) % 128;
        return strIntern;
    }
}
