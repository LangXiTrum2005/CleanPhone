package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ogury.ad.OguryReward;
import io.presage.Presage;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hb extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2270 = 4;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2271 = {'i', 'o', '.', 'p', 'r', 'e', 's', 'a', 'g', 'P', 'u', 'y', 'j', 'k', 'l', 'm'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2272 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2273;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends gt {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2274 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2275 = 60377;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f2276 = 12054;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f2277 = 6114;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2278 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2279 = 47364;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2240() {
            f2274 = (f2278 + 123) % 128;
            String strIntern = m2271("㴻5蓨鱦ƕ䄗", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5).intern();
            f2278 = (f2274 + 39) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ｋ */
        public final be mo2241() {
            bz bzVar = new bz(mo2240());
            int i10 = f2278 + 17;
            f2274 = i10 % 128;
            if (i10 % 2 != 0) {
                return bzVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2242() {
            f2274 = (f2278 + 89) % 128;
            String strIntern = m2271("ﰅ懠븿萧㴻5蓨鱦䀢ꮎ礁\uedb3⭟굕\ue5d7䵌\udda5䅩␧펹뾚凭ꌁ\ue4f3", 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
            f2274 = (f2278 + 43) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo2243() {
            int i10 = f2274 + InterfaceC0435l1.d.b.f29105b;
            f2278 = i10 % 128;
            if (i10 % 2 == 0) {
                return OguryReward.class;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2271(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (o.f3076) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    o.f3077 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = o.f3077;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c4 = cArr3[1];
                                char c5 = cArr3[0];
                                char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2276)) ^ ((c5 >>> 5) + f2275)));
                                cArr3[1] = c10;
                                cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2277) ^ ((c10 + i12) ^ ((c10 << 4) + f2279))));
                                i12 -= 40503;
                            }
                            int i14 = o.f3077;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            o.f3077 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2273 = (f2272 + 65) % 128;
        String strIntern = m2270(((Process.getThreadPriority(0) + 20) >> 6) + 5, "\u0000\t\b\u0006»", (byte) (65 - TextUtils.lastIndexOf("", '0', 0))).intern();
        int i10 = f2273 + 87;
        f2272 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        ca caVar = new ca(mo2240());
        int i10 = f2272 + 35;
        f2273 = i10 % 128;
        if (i10 % 2 == 0) {
            return caVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2273 = (f2272 + 11) % 128;
        String strIntern = m2270(19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\t\u0004\u0001\n\u0005\u0006\u0007\u0004\t\u0004", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 88)).intern();
        int i10 = f2273 + 9;
        f2272 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2273 + 77) % 128;
        f2272 = i10;
        int i11 = i10 + 119;
        f2273 = i11 % 128;
        if (i11 % 2 == 0) {
            return Presage.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2270(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2271;
                char c4 = f2270;
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
