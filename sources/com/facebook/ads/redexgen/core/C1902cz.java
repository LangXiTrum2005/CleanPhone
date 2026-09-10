package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1902cz {
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-88, -73, -80, -80, -45, -53, -53, -55, -42, -74, -49, -62, -61, -51, -58, -127, -43, -48, -127, -60, -45, -58, -62, -43, -58, -127, -62, -59, -59, -54, -43, -54, -48, -49, -62, -51, -86, -49, -57, -48, -28, -25, -30, -26, -11, -24, -28, -9, -20, -7, -24, -30, -9, -4, -13, -24, -44, -41, -46, -39, -30, -27, -32, -44, -25, -46, -25, -20, -29, -40, ExecutionDataWriter.BLOCK_SESSIONINFO, 19, 14, 33, 20, RemoteControlWriter.BLOCK_CMDOK, 36, 20, 34, 35, 14, 24, 19, -26, -11, -18, -39, -35, -47, -41, -43, -6, -19, -24, -23, -13};
    }

    public C1902cz(String str, String str2, int i) {
        String strA01;
        this.A02 = str;
        this.A00 = i;
        if (!TextUtils.isEmpty(str2)) {
            strA01 = A01(91, 5, 56);
        } else {
            strA01 = A01(86, 5, 36);
        }
        this.A01 = strA01;
    }

    private C1544Te A00(String str) {
        C1544Te c1544Te = new C1544Te(str);
        c1544Te.A07(A02());
        c1544Te.A05(1);
        return c1544Te;
    }

    private JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(56, 14, 39), this.A00);
            jSONObject.put(A01(70, 13, 99), this.A02);
            jSONObject.put(A01(40, 16, 55), this.A01);
        } catch (JSONException e) {
            Log.w(A01(0, 9, 24), A01(9, 31, 21), e);
        }
        return jSONObject;
    }

    public final void A04(int i, String str) {
        C2127ge sdkContext = T7.A00();
        if (sdkContext != null) {
            sdkContext.A08().ABC(A01(83, 3, 54), i, A00(str));
        }
    }
}
