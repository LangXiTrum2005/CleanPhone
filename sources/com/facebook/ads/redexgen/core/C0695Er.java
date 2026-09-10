package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0695Er {
    public static byte[] A02;
    public boolean A00 = true;
    public final C1656h9 A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{cw.k, 26, 26, 45, 66, cw.n, 59, 57, cw.m, 59, 58, 64, 49, 58, 64, 24, 59, 45, 48, 49, 48, 6, 20, 33, 33, 52, 73, 31, 66, 52, 55, 24, 73, 56, 65, 71, 24, 65, 55, cw.k, -52, -39, -39, -20, 1, -35, -16, -2, -5, -6, -7, -2, -16, -48, -7, -17, -59, 34, 27, 21, cw.n, -44, -44, 18, 33, 26, cw.m, 32, 21, 27, 26, -44, -43, -52, 39, 32, 30, 37, -52, 39, -52, -52, 21, 18, -52, -44, -51, 35, 21, 26, cw.n, 27, 35, -38, 28, 17, 30, 18, 27, 30, 25, cw.k, 26, cw.m, 17, -52, 40, 40, -52, -51, 35, 21, 26, cw.n, 27, 35, -38, 28, 17, 30, 18, 27, 30, 25, cw.k, 26, cw.m, 17, -38, 32, 21, 25, 21, 26, 19, -52, 40, 40, -52, -51, cw.n, 27, cw.m, 33, 25, 17, 26, 32, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, -51, cw.n, 27, cw.m, 33, 25, 17, 26, 32, -38, cw.l, 27, cw.n, 37, -52, 40, 40, -52, -51, cw.n, 27, cw.m, 33, 25, 17, 26, 32, -38, cw.l, 27, cw.n, 37, -38, cw.m, 20, 21, 24, cw.n, 30, 17, 26, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, cw.n, 27, cw.m, 33, 25, 17, 26, 32, -38, cw.l, 27, cw.n, 37, -38, cw.m, 20, 21, 24, cw.n, 30, 17, 26, -38, 24, 17, 26, 19, 32, 20, -52, -24, -52, -35, -43, -52, 39, -52, -52, -52, -52, 30, 17, 32, 33, 30, 26, -25, -52, -52, 41, -52, -52, 34, cw.k, 30, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, cw.k, 26, 11, 32, -52, -23, -52, 35, 21, 26, cw.n, 27, 35, -38, 28, 17, 30, 18, 27, 30, 25, cw.k, 26, cw.m, 17, -38, 32, 21, 25, 21, 26, 19, -25, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, cw.k, 26, 11, 32, -38, 30, 17, 31, 28, 27, 26, 31, 17, -15, 26, cw.n, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, cw.m, 27, 26, 31, 27, 24, 17, -38, 24, 27, 19, -44, -45, -19, -6, -6, cw.k, 34, -2, 17, 31, 28, 27, 26, 31, 17, -15, 26, cw.n, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, cw.k, 26, 11, 32, -38, 30, 17, 31, 28, 27, 26, 31, 17, -15, 26, cw.n, -43, -25, -52, -52, 41, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, cw.k, 26, 11, 32, -38, cw.n, 27, 25, -17, 27, 26, 32, 17, 26, 32, -8, 27, cw.k, cw.n, 17, cw.n, -15, 34, 17, 26, 32, -1, 32, cw.k, 30, 32, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, cw.m, 27, 26, 31, 27, 24, 17, -38, 24, 27, 19, -44, -45, -19, -6, -6, cw.k, 34, -16, 27, 25, -17, 27, 26, 32, 17, 26, 32, -8, 27, cw.k, cw.n, 17, cw.n, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, cw.k, 26, 11, 32, -38, cw.n, 27, 25, -17, 27, 26, 32, 17, 26, 32, -8, 27, cw.k, cw.n, 17, cw.n, -15, 34, 17, 26, 32, -1, 32, cw.k, 30, 32, -43, -25, -52, -52, 41, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, cw.k, 26, 11, 32, -38, 24, 27, cw.k, cw.n, -15, 34, 17, 26, 32, -15, 26, cw.n, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, cw.m, 27, 26, 31, 27, 24, 17, -38, 24, 27, 19, -44, -45, -19, -6, -6, cw.k, 34, -8, 27, cw.k, cw.n, -15, 34, 17, 26, 32, -15, 26, cw.n, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, cw.k, 26, 11, 32, -38, 24, 27, cw.k, cw.n, -15, 34, 17, 26, 32, -15, 26, cw.n, -43, -25, -52, -52, 41, 41, -52, cw.m, cw.k, 32, cw.m, 20, -44, 17, 30, 30, -43, -52, 39, -52, -52, cw.m, 27, 26, 31, 27, 24, 17, -38, 24, 27, 19, -44, -45, cw.k, 26, 11, 26, cw.k, 34, 21, 19, cw.k, 32, 21, 27, 26, 11, 32, 21, 25, 21, 26, 19, 11, 17, 30, 30, 27, 30, -26, -45, -52, -41, -52, 17, 30, 30, -38, 25, 17, 31, 31, cw.k, 19, 17, -43, -25, 41, 41, -43, -44, -43, -43, -25};
    }

    public C0695Er(C1656h9 c1656h9) {
        this.A01 = c1656h9;
    }

    public static long A00(String str, String str2) {
        String strSubstring = str.substring(str2.length());
        if (TextUtils.isEmpty(strSubstring)) {
            return -1L;
        }
        try {
            long j = Long.parseLong(strSubstring);
            if (j < 0) {
                return -1L;
            }
            return j;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A05(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (!this.A00) {
            return;
        }
        String strA01 = A01(40, 17, 54);
        if (str.startsWith(strA01)) {
            this.A01.A0H(A00(str, strA01));
            return;
        }
        String strA02 = A01(0, 22, EnumC4719u30.JSON_ENCODE_ERROR_VALUE);
        if (str.startsWith(strA02)) {
            this.A01.A0F(A00(str, strA02));
            return;
        }
        String strA03 = A01(22, 18, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        if (!str.startsWith(strA03)) {
            return;
        }
        this.A01.A0G(A00(str, strA03));
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
