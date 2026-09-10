package com.facebook.ads.redexgen.core;

import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05387w {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, 23, 25, 30, 27, -42, 26, 37, 45, 36, 34, 37, 23, 26, -42, 28, 23, 31, 34, 43, 40, 27, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, 22, 17, 21, 36, 23, 19, 38, 27, 40, 23, 17, 37, 27, 44, 23, 17, 20, 43, 38, 23, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, 29, 32, 27, 34, 43, 46, 41, 29, 48, 27, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, 30, 28, 30, 35, 32, 63, 61, 63, 68, 65, 59, 63, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, 23, 27, cw.m, 21, 19, 28, 31, 17, 20, cw.m, 36, 25, 29, 21, 70, 67, 61};
    }

    static {
        A01();
        A09 = C05387w.class.getSimpleName();
        A05 = AbstractC05418a.A0o;
        A06 = AbstractC05418a.A0s;
        A02 = AbstractC05418a.A0l;
        A01 = AbstractC05418a.A0k;
        A03 = AbstractC05418a.A0m;
        A00 = AbstractC05418a.A0i;
        A04 = AbstractC05418a.A0n;
        A07 = AbstractC05418a.A0t;
    }

    public static void A02(AnonymousClass85 anonymousClass85, C05287m c05287m, int i, String str, long j) {
        if (!A06(anonymousClass85)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c05287m.A01);
            jSONObject.put(A00(134, 13, 46), c05287m.A02);
            if (j > 0) {
                jSONObject.put(A00(Input.Keys.F21, 9, 73), C0646Cu.A07(System.currentTimeMillis() - j));
            }
            C05428b c05428b = new C05428b(str);
            c05428b.A07(jSONObject);
            c05428b.A05(1);
            anonymousClass85.A08().AAv(A00(Input.Keys.NUMPAD_DIVIDE, 5, 84), i, c05428b);
        } catch (Throwable deLogException) {
            anonymousClass85.A08().A48(deLogException);
        }
    }

    public static void A03(AnonymousClass85 anonymousClass85, C05337r c05337r, String str, int i, String str2, Long l, Long l2) {
        if (A06(anonymousClass85)) {
            A05(anonymousClass85, c05337r.A05, c05337r.A06, c05337r.A07, A00(Input.Keys.F16, 5, 71), str, i, str2, l, l2, null);
        }
    }

    public static void A04(AnonymousClass85 anonymousClass85, C05377v c05377v, boolean z) {
        if (!A06(anonymousClass85)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c05377v.A01);
            jSONObject.put(A00(134, 13, 46), c05377v.A03);
            jSONObject.put(A00(104, 16, 23), c05377v.A02);
            jSONObject.put(A00(Input.Keys.NUMPAD_COMMA, 13, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), c05377v.A00);
            if (C05789m.A2K(anonymousClass85)) {
                jSONObject.put(A00(200, 3, 106), c05377v.A04);
            }
            String strA00 = z ? A00(61, 10, 6) : A00(71, 11, 23);
            int i = z ? A05 : A06;
            C05428b c05428b = new C05428b(strA00);
            c05428b.A07(jSONObject);
            c05428b.A05(1);
            anonymousClass85.A08().AAv(A00(Input.Keys.NUMPAD_DIVIDE, 5, 84), i, c05428b);
        } catch (Throwable th) {
            anonymousClass85.A08().A48(th);
        }
    }

    public static void A05(AnonymousClass85 anonymousClass85, String str, String str2, String str3, String str4, String str5, int i, String str6, Long l, Long l2, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(Input.Keys.F21, 9, 73), String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(Input.Keys.NUMPAD_3, 7, 123), String.valueOf(num));
            }
            jSONObject.put(A00(Input.Keys.NUMPAD_COMMA, 13, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), str5);
            if (C05789m.A2K(anonymousClass85)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String strA00 = A00(19, 19, 14);
            if (i == A03) {
                strA00 = A00(38, 23, 79);
            } else if (i == A01) {
                strA00 = A00(0, 19, 39);
            }
            C05428b c05428b = new C05428b(strA00);
            c05428b.A07(jSONObject);
            c05428b.A05(1);
            anonymousClass85.A08().AAv(A00(Input.Keys.NUMPAD_DIVIDE, 5, 84), i, c05428b);
        } catch (Throwable th) {
            anonymousClass85.A08().A48(th);
        }
    }

    public static boolean A06(AnonymousClass85 anonymousClass85) {
        int iA06;
        if (anonymousClass85.A05().AAD()) {
            iA06 = 1;
        } else {
            iA06 = AbstractC05809o.A06(anonymousClass85);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || anonymousClass85.A09().A00() <= 1.0d / ((double) iA06);
    }
}
