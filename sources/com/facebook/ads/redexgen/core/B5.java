package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class B5 {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static boolean A03;
    public static byte[] A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{96, 54, 127, 96, 54, 127, 96, 33, 127, 96, 33, 127, 96, 33, 81, 93, 81, 93, 85, 84, 4, 7, 11, 45, 55, 48, 57, 126, 50, 63, 45, 42, 126, 63, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, EnumC0601Al enumC0601Al) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (enumC0601Al) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return MBInterstitialActivity.WEB_LOAD_TIME;
            default:
                return -1000L;
        }
    }

    public static String A02(B6 b6) {
        AbstractC0606Au.A05(A01(44, 15, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), A01(22, 22, 6), A01(14, 8, 61));
        return A02.get(A03(b6));
    }

    public static String A03(B6 b6) {
        return String.format(Locale.US, A01(0, 14, 29), b6.A09(), b6.A07(), Integer.valueOf(b6.A08() == null ? 0 : b6.A08().A00()), Integer.valueOf(b6.A08() == null ? 0 : b6.A08().A01()), Integer.valueOf(b6.A04()));
    }

    public static void A05(long j, B6 b6) {
        A01.put(A03(b6), Long.valueOf(j));
    }

    public static void A06(B6 b6) {
        A00.put(A03(b6), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, B6 b6) {
        A02.put(A03(b6), str);
    }

    public static boolean A08(B6 b6) {
        if (A03) {
            return false;
        }
        String strA03 = A03(b6);
        if (A00.containsKey(strA03)) {
            return System.currentTimeMillis() - A00.get(strA03).longValue() < A00(strA03, b6.A07());
        }
        return false;
    }
}
