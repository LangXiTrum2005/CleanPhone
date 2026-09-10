package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2088dG implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C2091dJ A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{13, 33, 59, 34, 42, 110, 32, 33, 58, 110, 62, 47, 60, 61, 43, 110, 61, 43, 60, 56, 43, 60, 110, 35, 43, 61, 61, 47, 41, 43, 72, AbstractJsonLexerKt.TC_INVALID, AbstractJsonLexerKt.TC_INVALID, 98, AbstractJsonLexerKt.TC_INVALID, 45, 125, 108, AbstractJsonLexerKt.TC_INVALID, 126, 100, 99, 106, 45, 71, 94, 66, 67, 45, 100, 99, 45, 125, 98, 126, 121, 64, 104, 126, 126, 108, 106, 104, 45, 87, 67, 66, 94, 125, 83, 79, 53, 40, 36, 34, 49, 15, 52, 49, 36, 49, 14, 3, 10, 31, 58, 60};
    }

    public RunnableC2088dG(C2091dJ c2091dJ, String str) {
        this.A00 = c2091dJ;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                if (this.A00.A05.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(EnumC2089dH.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                } else {
                    this.A00.A04.A04(AbstractC1712Td.A11, A00(0, 30, 47));
                }
            } catch (JSONException e2) {
                this.A00.A04.A04(AbstractC1712Td.A15, A00(30, 34, 108) + e2.getMessage());
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
