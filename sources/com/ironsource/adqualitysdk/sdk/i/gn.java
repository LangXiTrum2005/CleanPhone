package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.five_corp.ad.FiveAd;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gn extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2197 = 4;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2198 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2199 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2200 = {'c', 'o', 'm', '.', 'f', 'i', 'v', 'e', '_', 'r', 'p', 'a', 'd', 'F', 'A', 'g'};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2199 + 31;
        f2198 = i10 % 128;
        String strIntern = m2252(i10 % 2 != 0 ? 2 >> AndroidCharacter.getMirror('\b') : AndroidCharacter.getMirror('0') - '*', "\u0005\u0006\u0007\u0004\b\u000f", (byte) (1 - TextUtils.indexOf("", ""))).intern();
        f2199 = (f2198 + 119) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        br brVar = new br(mo2240());
        int i10 = f2198 + InterfaceC0435l1.d.b.f29109f;
        f2199 = i10 % 128;
        if (i10 % 2 != 0) {
            return brVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int iIndexOf;
        int trimmedLength;
        int i10 = f2198 + 63;
        f2199 = i10 % 128;
        if (i10 % 2 == 0) {
            iIndexOf = 22 >>> TextUtils.indexOf("", "", 0);
            trimmedLength = 116 >> TextUtils.getTrimmedLength("");
        } else {
            iIndexOf = 23 - TextUtils.indexOf("", "", 0);
            trimmedLength = TextUtils.getTrimmedLength("") + 48;
        }
        return m2252(iIndexOf, "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\f\u0004\u0005\r\u000b\u0002\b\u000f\u0001\u000f\u0006\u0007\u0006\u000f\u0094", (byte) trimmedLength).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2199 + 87) % 128;
        f2198 = i10;
        int i11 = i10 + 33;
        f2199 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 42 / 0;
        }
        return FiveAd.class;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2252(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2200;
                char c4 = f2197;
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
