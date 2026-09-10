package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1558Na implements Serializable {
    public static byte[] A0A = null;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{110, 125, 126, 125, -126, 125, -111, 121, -118, -72, -118, -68, -117, -116, -77, -55, -64, -55, -60, -55, -13, -113, -46, -94, -46, -93, -46, -91, -128, -61, -61, -111, -115, -107, -115, -61, -61, -64, -62, -62, -60, -51, -45, -66, -62, -50, -53, -50, -47, 24, 29, 21, 25, 37, 34, 37, 40, 22, 35, 24, 45, 19, 23, 35, 32, 35, 38, 27, 44, 25, 23, 27, 39, 36, 39, 42, 14, 31, 12, 10, 14, 26, 23, 26, 29, 10, 26, 33, 16, 29, 10, 24, 16, 15, 20, 12, 17, 34, 15, 13, 18, 39, 28, 15, 27, 23, 17, 13, 17, 29, 26, 29, 32, -16, 1, -18, -20, 1, -14, 5, 1, -20, -16, -4, -7, -4, -1, 32, 49, 30, 28, 49, 34, 53, 49, 28, 32, 44, 41, 44, 47, 28, 44, 51, 34, 47, 28, 42, 34, 33, 38, 30, 28, 30, 11, 29, 18, 29, 21, 14, 8, 12, 24, 21, 24, 27, 41, 30, 41, 33, 26, 20, 24, 36, 33, 36, 39};
    }

    static {
        A03();
        A0B = Color.parseColor(A02(14, 7, 76));
        A0C = Color.parseColor(A02(7, 7, 18));
        A0D = Color.parseColor(A02(21, 7, 40));
        String strA02 = A02(28, 9, 25);
        A0E = Color.parseColor(strA02);
        A0F = Color.parseColor(A02(0, 7, 7));
        A0G = Color.parseColor(strA02);
    }

    public C1558Na(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A04 = i6;
        this.A05 = i7;
        this.A07 = i8;
        this.A08 = i9;
        this.A09 = i10;
        this.A06 = i11;
    }

    public static int A00(JSONObject jSONObject, String str, int i2) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i2;
    }

    public static C1558Na A01(JSONObject jSONObject) {
        return new C1558Na(A00(jSONObject, A02(37, 12, 27), A0B), A00(jSONObject, A02(57, 10, 112), A0C), A00(jSONObject, A02(152, 14, 101), -16777216), A00(jSONObject, A02(49, 8, 114), A0D), A00(jSONObject, A02(67, 9, 116), A0E), A00(jSONObject, A02(76, 20, 103), -1), A00(jSONObject, A02(113, 14, 73), -1), A00(jSONObject, A02(127, 25, 121), A0G), A00(jSONObject, A02(166, 11, 113), -16777216), A00(jSONObject, A02(96, 17, 106), A0E));
    }

    public final int A04() {
        return this.A06;
    }

    public final int A05(boolean z2) {
        if (z2) {
            return -1;
        }
        return this.A00;
    }

    public final int A06(boolean z2) {
        if (z2) {
            return -1;
        }
        return this.A01;
    }

    public final int A07(boolean z2) {
        if (z2) {
            return -1;
        }
        return this.A02;
    }

    public final int A08(boolean z2) {
        return z2 ? A0F : this.A03;
    }

    public final int A09(boolean z2) {
        return z2 ? this.A05 : this.A04;
    }

    public final int A0A(boolean z2) {
        return z2 ? this.A08 : this.A07;
    }

    public final int A0B(boolean z2) {
        if (z2) {
            return -1;
        }
        return this.A09;
    }
}
