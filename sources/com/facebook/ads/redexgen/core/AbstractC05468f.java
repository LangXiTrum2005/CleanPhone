package com.facebook.ads.redexgen.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05468f {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 52, 60, 60, 50, 53, 60, 123, 21, 62, 47, 44, 52, 41, 48, 123, 30, 45, 62, 53, 47, 34, 51, 52, 39, 50, 47, 41, 40, 96, 119, 119, 106, 119, 32, 60, 60, 56, 23, 59, 60, 41, 60, 61, 59, 23, 43, 39, 44, 45, 98, 105, 120, 123, 99, 126, 103, 41, 56, 32, 53, 54, 56, 61, 6, 42, 48, 35, 60, 55, 48, 37, 54, 48, 27, 48, 45, 41, 33, 40, 45, 49, 50, 60, 57, 2, 46, 52, 39, 56};
    }

    public static JSONObject A01(AnonymousClass85 anonymousClass85, long j, long j2, long j3, long j4, int i, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j);
                try {
                    jSONObject.put(A00(21, 8, 54), j2 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j3);
                        try {
                            jSONObject.put(A00(79, 11, 45), j4);
                            try {
                                jSONObject.put(A00(34, 16, 56), i);
                                if (exc != null) {
                                    jSONObject.put(A00(29, 5, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), exc.getMessage());
                                }
                            } catch (JSONException e) {
                                e = e;
                                anonymousClass85.A08().A48(e);
                            }
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                    }
                } catch (JSONException e4) {
                    e = e4;
                }
            } catch (JSONException e5) {
                e = e5;
            }
        } catch (JSONException e6) {
            e = e6;
        }
        return jSONObject;
    }

    public static void A03(AnonymousClass85 anonymousClass85, long j, long j2, long j3, long j4, int i, Exception exc) {
        C05428b c05428b = new C05428b(A00(0, 21, 43));
        c05428b.A05(1);
        c05428b.A07(A01(anonymousClass85, j, j2, j3, j4, i, exc));
        anonymousClass85.A08().ABU(A00(50, 7, 124), AbstractC05418a.A20, c05428b);
    }
}
