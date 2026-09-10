package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fb extends ev {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2021 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2022 = 6842658195598748118L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2023;

    public fb(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ｋ */
    public final boolean mo2195(Object obj, Object obj2) {
        int i10 = f2023;
        int i11 = i10 + 53;
        f2021 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (obj != obj2) {
            return false;
        }
        int i12 = i10 + 57;
        f2021 = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2196(String str, String str2) {
        f2021 = (f2023 + InterfaceC0435l1.d.b.f29114k) % 128;
        boolean zEquals = str.equals(str2);
        f2021 = (f2023 + 73) % 128;
        return zEquals;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ﾒ */
    public final boolean mo2197(int i10) {
        int i11 = f2023;
        int i12 = i11 + 57;
        f2021 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 68 / 0;
            if (i10 == 0) {
                return true;
            }
        } else if (i10 == 0) {
            return true;
        }
        int i14 = i11 + 49;
        f2021 = i14 % 128;
        if (i14 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        int i10 = f2021 + 47;
        f2023 = i10 % 128;
        return m2202("⧫ᄔ", i10 % 2 != 0 ? 8132 - (ViewConfiguration.getScrollBarFadeDuration() + 59) : 14591 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2202(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2022);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
