package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05819p {
    public static byte[] A00;
    public static String[] A01 = {"QTcAMu2NTOnQYBZmZwc1s5", "djg1XP0D7NXFeZ0NOExGmhJDpZKI4dpr", "ihQhkuhtHB3Nrh2mtKDZtHhTCWsAfOgS", "rKuldGKjFGgUg8", "leLR2vmDgK1cO2", "qW6uohj2RnSHed6NlIulLWXBUQuwa2BT", "fEb7DtRuRt", "Zqv9"};
    public static final AtomicBoolean A02;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{124, 127, -119, -110, 122, -115, -115, 122, 124, 127, 122, -115, -128, -116, -112, -128, -114, -113, 122, -113, -124, -120, -128, -118, -112, -113, -36, -33, -23, -14, -38, -19, -19, -38, -35, -17, -38, -29, -36, -23, -33, -18, -29, -36, -26, -32, -38, -32, -23, -36, -35, -25, -32, -33, 112, 115, 125, -122, 110, -127, -127, 110, 116, 125, 112, 113, 123, 116, 115, -28, -25, -15, -6, -30, -11, -11, -30, -23, -26, -30, -24, -5, -13, -20, -11, -28, -9, -20, -14, -15, -30, -9, -20, -16, -24, -14, -8, -9, -65, -62, -52, -43, -67, -48, -48, -67, -58, -65, -52, -62, -47, -58, -65, -55, -61, -67, -61, -52, -65, -64, -54, -61, -62, -105, -102, -92, -83, -107, -88, -88, -107, -98, -105, -92, -102, -87, -98, -105, -95, -101, -107, -86, -97, -93, -101, -91, -85, -86, -89, -86, -76, -67, -91, -72, -72, -91, -81, -76, -70, -91, -85, -76, -89, -88, -78, -85, -86, -124, -121, -111, -102, -126, -107, -107, -126, -107, -113, -121, -126, -113, -122, -113, -55, -52, -42, -33, -57, -38, -38, -57, -38, -34, -57, -51, -42, -55, -54, -44, -51, -52, -58, -55, -45, -36, -60, -41, -41, -60, -40, -54, -45, -55, -60, -57, -39, -60, -54, -35, -39, -41, -58, -40, 117, -127, 127, 64, 120, 115, 117, 119, 116, -127, -127, 125, 64, 125, 115, -122, 115, -128, 115, 117, -127, 127, 64, 120, 115, 117, 119, 116, -127, -127, 125, 64, -119, 115, 125, 123, -116, 115, -123, 122, 123};
    }

    static {
        A05();
        A02 = new AtomicBoolean(false);
    }

    public static int A00(Context context) {
        return C05789m.A0U(context).A2s(A03(0, 26, 12), 10000);
    }

    public static int A01(Context context) {
        return C05789m.A0U(context).A2s(A03(123, 25, 39), 30000);
    }

    public static long A02(Context context) {
        return C05789m.A0U(context).A2t(A03(69, 29, 116), 86400000L);
    }

    public static String A04(boolean z) {
        return z ? A03(241, 22, 3) : A03(EnumC4719u30.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 19, 3);
    }

    public static void A06(Context context) {
        C05789m.A0U(context).A2v(A03(54, 15, 0));
    }

    public static boolean A07(Context context) {
        return A02.get() || A0H(context);
    }

    public static boolean A08(Context context) {
        return C05789m.A0U(context).A2y(A03(Input.Keys.NUMPAD_4, 19, 55), true);
    }

    public static boolean A09(Context context) {
        return C05789m.A0U(context).A2y(A03(182, 18, 89), true);
    }

    public static boolean A0A(Context context) {
        return C05789m.A0U(context).A2y(A03(167, 15, 20), true);
    }

    public static boolean A0B(Context context) {
        return C05789m.A1W(context) || A0E(context);
    }

    public static boolean A0C(Context context) {
        return A02.get() || A0F(context);
    }

    public static boolean A0D(Context context) {
        return C05789m.A0U(context).A2y(A03(200, 22, 86), false);
    }

    public static boolean A0E(Context context) {
        if (!A0H(context)) {
            return false;
        }
        C05789m c05789mA0U = C05789m.A0U(context);
        if (A01[5].charAt(3) != 'u') {
            throw new RuntimeException();
        }
        A01[1] = "s8XR5C0JhaykpGlf4kHqosaURTbELCS3";
        return c05789mA0U.A2y(A03(98, 25, 79), false);
    }

    public static boolean A0F(Context context) {
        return A0H(context) && C05789m.A0U(context).A2y(A03(26, 28, 108), false);
    }

    public static boolean A0G(Context context) {
        return A09(context) || A08(context);
    }

    public static boolean A0H(Context context) {
        return C05789m.A0U(context).A2y(A03(54, 15, 0), false) && A0G(context) && !A0I(context, A02(context));
    }

    public static boolean A0I(Context context, long j) {
        long lastUpdateTime = System.currentTimeMillis();
        long currentTime = C05789m.A0T(context);
        return lastUpdateTime - currentTime > j;
    }
}
