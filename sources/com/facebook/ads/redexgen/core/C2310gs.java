package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2310gs implements SU {
    public static byte[] A02;
    public static String[] A03 = {"frztuTbk90jgHBlm3zQJyLa", "1t5yWCu7Rr8GJSKN0jLr3suU4yLwpLao", "qy8Ulx", "lpakeOCplwfUbPlWH1mKRjN93sjJNeLK", "9U38xP8piwyhajLb0oPtN8g0SrDQbMul", "5doBkCOudtbbit2jQfjyLRk0HEXNCLN", "an6q6r3Pxi3Yd1Uxl34WEMAekK7mvAv", "C2viYzQ805EsgOX4y3n8lLHcCQmdv4Bq"};
    public final SV A00;
    public final String A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[7].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            A03[1] = "szQ1vN1s54Hk3y1OQ1NRUBnkClWieIjw";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 62);
            i5++;
        }
    }

    public static void A02() {
        A02 = new byte[]{-1, 4, -5, -16, -69, -72, -78};
    }

    static {
        A02();
    }

    public C2310gs(SV sv, String str) {
        this.A00 = sv;
        this.A01 = str;
    }

    public static C2310gs A00(JSONObject jSONObject) {
        SV svA00 = SV.A00(jSONObject.optString(A01(0, 4, 77)));
        String url = jSONObject.optString(A01(4, 3, 8));
        if (svA00 == null || url == null) {
            return null;
        }
        return new C2310gs(svA00, url);
    }

    @Override // com.facebook.ads.redexgen.core.SU
    public final SV A9O() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A03[1].charAt(30) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "4HA6u4Nz4keiLa8sOcHfyEhD3wtH4bT";
            strArr[5] = "zctnvSkfK8HVemf9ezG6OofbW6HL5VM";
            if (cls == obj.getClass()) {
                C2310gs c2310gs = (C2310gs) obj;
                if (this.A00 != c2310gs.A00) {
                    return false;
                }
                return this.A01.equals(c2310gs.A01);
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.SU
    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        int i2 = result * 31;
        int result2 = this.A01.hashCode();
        return i2 + result2;
    }
}
