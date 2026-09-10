package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03741l {
    public static byte[] A02;
    public final InterfaceC03751m A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{55, 36, 63, 63, 52, 61, cw.l};
    }

    public C03741l(InterfaceC03751m interfaceC03751m, String str) {
        this.A00 = interfaceC03751m;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 99) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
