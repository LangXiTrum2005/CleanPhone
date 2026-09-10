package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class WE {
    public static byte[] A00;
    public static String[] A01 = {"1xbaBrS", "A5o8L0K", "NCBBTtQ91bL4qNkC9", "VOiFjhrLKrSiOl", "IzdWV2mN1IZOPy8q", "dzpcam", "yMP3JjbsUfzn40YA", "FhpQzKItQmfQ6pj5K9dUgRwf2x"};
    public static final WE A02;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{118, 115, 72, 101, 114, 103, 120, 101, 99, 126, 121, 112, 72, 116, 120, 121, 113, 126, 112, 77, 72, 77, 92, 88, 73, 94, 24, 29, 10, 100, 107, 90, 115, 100, 105, 108, 97, 100, 113, 108, 106, 107, 90, 112, 112, 108, 97, 44, 46, 44, 39, 42, 105, 98, 107, 99, 100, 85, 122, 107, 120, 107, 103, 121, 39, 43, 32, 33, 122, AbstractJsonLexerKt.TC_INVALID, 106, AbstractJsonLexerKt.TC_INVALID, 16, 21, 0, 21, 59, 22, 30, 17, 23, 0, 84, 29, 7, 84, 26, 1, 24, 24, 108, 105, 124, 105, 87, 101, 103, 108, 109, 100, 87, 124, 113, 120, 109, 120, 121, 126, 105, 123, 67, 122, 105, 114, 114, 121, 112, 67, AbstractJsonLexerKt.TC_INVALID, 115, 114, 122, 117, 123, 26, 27, 24, 23, 16, 23, 10, 23, 17, 16, 24, 15, 15, 18, 15, 75, 72, 76, 89, 88, 95, 72, 114, 78, 66, 67, 75, 68, 74, 82, 88, 85, 71, 92, 107, 87, 91, 90, 82, 93, 83, 46, 45, 37, 29, 33, 55, 48, 48, 39, 44, 54, 29, 36, 55, 44, 44, 39, 46, 89, 81, 71, 71, 85, 83, 81, 121, 101, 104, 106, 108, 100, 108, 103, 125, 122, 115, 100, 107, 95, 99, 97, 99, 104, 101, 41, 47, 60, 62, 54, 56, 47, 46, 87, 90, 83, 70};
    }

    static {
        A05();
        A02 = new WE();
    }

    public static synchronized WE A00() {
        return A02;
    }

    private RG A01(C2300gi c2300gi, JSONObject data, long j) throws JSONException {
        JSONArray placements = data.getJSONArray(A04(190, 10, 45));
        JSONObject jSONObject = placements.getJSONObject(0);
        C1732Tx c1732TxA00 = C1732Tx.A00(jSONObject.getJSONObject(A04(124, 10, 90)));
        String strOptString = jSONObject.optString(A04(139, 14, 9));
        String strA04 = A04(47, 5, 107);
        String str = null;
        String flashConfig = jSONObject.has(strA04) ? jSONObject.optString(strA04) : null;
        String strA05 = A04(200, 9, 36);
        String strOptString2 = jSONObject.has(strA05) ? jSONObject.optString(strA05) : null;
        String adReportingConfig = jSONObject.optString(A04(0, 19, 51));
        String strA06 = A04(153, 12, 16);
        String cache = jSONObject.has(strA06) ? jSONObject.optString(strA06) : null;
        C1731Tw c1731Tw = new C1731Tw(c1732TxA00, strOptString, adReportingConfig, cache, flashConfig, strOptString2, A06(jSONObject));
        String strA07 = A04(26, 3, 93);
        if (jSONObject.has(strA07)) {
            JSONArray jSONArray = jSONObject.getJSONArray(strA07);
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                VK.A06(c2300gi, jSONObject2, j, str);
                String strOptString3 = jSONObject2.optString(A04(19, 7, 8));
                String strOptString4 = jSONObject2.optString(A04(90, 15, 44));
                JSONObject ad = jSONObject2.optJSONObject(A04(68, 4, 58));
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(A04(209, 8, 121));
                if (ad != null) {
                    c1731Tw.A0F(new C1729Tu(strOptString3, strOptString4, ad, jSONArrayOptJSONArray));
                } else {
                    InterfaceC1526Lt interfaceC1526LtA0F = c2300gi.A0F();
                    int errorCode = AdErrorType.UNKNOWN_ERROR.getErrorCode();
                    String[] strArr = A01;
                    if (strArr[0].length() != strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    A01[7] = "vhqatTRLHh1uNEmkPYajEb8nOj";
                    interfaceC1526LtA0F.A5g(errorCode, A04(72, 18, 80));
                }
                i2++;
                str = null;
            }
        }
        String strA08 = A04(52, 12, 46);
        if (jSONObject.has(strA08)) {
            c1731Tw.A0G(jSONObject.getJSONObject(strA08));
        }
        String anValidationUuid = data.optString(A04(29, 18, 33));
        return new RG(c1731Tw, anValidationUuid);
    }

    private R4 A02(JSONObject jSONObject) {
        return new R4(jSONObject.optString(A04(183, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), null);
    }

    private R4 A03(JSONObject jSONObject) {
        String strA04 = A04(200, 9, 36);
        String strA05 = A04(47, 5, 107);
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray(A04(190, 10, 45)).getJSONObject(0);
            C1732Tx c1732TxA00 = C1732Tx.A00(jSONObject2.getJSONObject(A04(124, 10, 90)));
            String strOptString = jSONObject2.optString(A04(139, 14, 9));
            String strOptString2 = jSONObject2.has(strA05) ? jSONObject2.optString(strA05) : null;
            String cache = jSONObject2.has(strA04) ? jSONObject2.optString(strA04) : null;
            String featureConfig = jSONObject2.optString(A04(0, 19, 51));
            return new R4(jSONObject.optString(A04(183, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), new C1731Tw(c1732TxA00, strOptString, featureConfig, null, strOptString2, cache, A06(jSONObject2)));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public static boolean A06(JSONObject jSONObject) throws JSONException {
        String strA04 = A04(105, 19, 56);
        if (jSONObject.has(strA04)) {
            return jSONObject.getJSONObject(strA04).optBoolean(A04(165, 18, 102), false);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    public final WG A07(C2300gi c2300gi, String str, long j) throws JSONException {
        byte b2;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(A04(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 4, 7));
            int iHashCode = strOptString.hashCode();
            String strA04 = A04(134, 5, 89);
            switch (iHashCode) {
                case 96432:
                    if (!strOptString.equals(A04(26, 3, 93))) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 96784904:
                    if (!strOptString.equals(strA04)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return A01(c2300gi, jSONObject, j);
                case 1:
                    return A03(jSONObject);
                default:
                    JSONObject jsonResponse = jSONObject.optJSONObject(strA04);
                    if (jsonResponse != null) {
                        return A02(jsonResponse);
                    }
                    break;
            }
        }
        return new WG(WF.A04);
    }
}
