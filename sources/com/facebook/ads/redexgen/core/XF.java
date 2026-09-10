package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum XF {
    A07(0),
    A0G(1),
    A08(2),
    A0H(3),
    A09(4),
    A06(5),
    A0E(6),
    A0F(7),
    A0K(8),
    A0D(9),
    A0A(10),
    A0I(11),
    A0J(16),
    A0C(17),
    A0B(18);

    public static byte[] A01;
    public static String[] A02 = {"GbuBsSM1xhQoS8Y9reObCc9WG4REEdk3", "3inGwPOv", "kEgr1UstPMrvCW01nPyEnw", "sDtxFhHTxnkounG", "sPUJsFRJw3lzzMTWDdjyjiVEH8hW8JO7", "B8rHcVyybdzy0uHTSoedXLBdMJjc3Dyy", "NVuWY3VIAgTMV2CQJlZL2IdcLJ4", "cMObfoRVVv9ZpGW59yOoyGmNv0XOfBEh"};
    public static final XF[] A03;
    public static final String A04;
    public final int A00;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {88, 93, 70, 90, 81, 86, 80, 90, 92, 74, 122, 107, 107, 100, 122, AbstractJsonLexerKt.TC_INVALID, 43, 58, 58, 53, 43, 46, 53, 60, 88, 110, AbstractJsonLexerKt.TC_INVALID, AbstractJsonLexerKt.TC_INVALID, 112, 106, 97, 104, 110, 104, 106, 98, 106, 97, 123, 112, 110, 107, 71, 68, 75, 75, 64, 87, 90, 81, 74, 90, 76, 75, 81, 64, 87, 86, 81, 76, 81, 76, 68, 73, 52, 32, 55, 35, 39, 55, 60, 49, 43, 45, 49, 51, 34, 34, 59, 60, 53, 43, 55, 55, 51, 60, 47, 42, 45, 40, 48, 8, 15, 13, 8, 15, 4, 30, 23, 8, 5, 4, 14, 30, 0, 5, 93, 68, 72, 67, 69, 94, 80, 80, 82, 69, 21, 12, 0, 11, 13, 22, 24, 24, 26, 13, 0, 17, 16, 0, 30, 10, 11, 16, 0, 22, 18, 15, 0, 19, 16, 24, 24, 22, 17, 24, 103, 98, 101, 96, 116, 106, 111, 77, 72, 79, 74, 94, 64, 69, 94, 87, 51, 3, 12, 25, 4, 27, 8, 18, 14, 1, 2, 30, 8, 18, 15, 24, 25, 25, 2, 3, 47, 52, 51, 60, 51, 63, 62, 37, 54, 53, 61, 61, 51, 52, 61, 57, 38, 43, 42, 32, 48, 46, 43};
        if (A02[5].charAt(26) != 'j') {
            throw new RuntimeException();
        }
        A02[5] = "gBI5PCJLXGTma8ivl9EUy8DAEVjXdNbR";
        A01 = bArr;
    }

    static {
        A03();
        A03 = new XF[]{A0H, A09, A06, A0F, A0I, A0J, A0C, A0B};
        JSONArray jSONArray = new JSONArray();
        for (XF supportedCapability : A03) {
            jSONArray.put(supportedCapability.A00());
        }
        A04 = jSONArray.toString();
    }

    XF(int i2) {
        this.A00 = i2;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A04;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
