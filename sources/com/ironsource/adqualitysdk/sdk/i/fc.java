package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fc extends eu {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2024 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2025 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2026 = {0};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2027 = 926448935;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2028 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2029 = 85;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2030 = -1002558621;

    public fc(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2203(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2029;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2026;
                    i14 = bArr != null ? (byte) (bArr[f2027 + i12] + i13) : (short) (f2028[f2027 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2027 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2030);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2026;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2028;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        f2024 = (f2025 + 13) % 128;
        String strIntern = m2203((short) ((-118) - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 1002558681, (-84) - (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) - 926448935, (byte) ((-13) - Color.alpha(0))).intern();
        f2025 = (f2024 + 33) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ﾒ */
    public final boolean mo2197(int i10) {
        int i11 = f2024;
        int i12 = (i11 + 13) % 128;
        f2025 = i12;
        if (i10 >= 0) {
            f2025 = (i11 + 39) % 128;
            return false;
        }
        int i13 = (i12 + 27) % 128;
        f2024 = i13;
        f2025 = (i13 + 11) % 128;
        return true;
    }
}
