package com.facebook.ads.redexgen.core;

import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC03801r {
    A0D(A00(Input.Keys.F21, 5, 106)),
    A0B(A00(178, 5, 95)),
    A04(A00(109, 8, 91)),
    A0C(A00(Input.Keys.F13, 8, 25)),
    A08(A00(Input.Keys.NUMPAD_6, 10, 89)),
    A0A(A00(169, 9, 102)),
    A09(A00(Input.Keys.NUMPAD_ENTER, 9, 13)),
    A05(A00(EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE, 7, 40)),
    A06(A00(124, 13, 36)),
    A07(A00(137, 13, 39)),
    A0E(A00(196, 22, 1));

    public static byte[] A01;
    public static String[] A02 = {"oCsQT6uSz7ndvPMuhNCnHwcy1cykmRIP", "dxQgW1fHfG7Li9QwjA", "TlDnXloLJlBDv", "qrnaS13DqrzNxoM4SqOtGSj6SkXXKDQP", "QLSlnpUZPESqj81ZgNRIADff9IPI", "BL2v8T5j9auQgeZuOiJA3Si6ird26Og", "iKYEyte3TNWgl6dOfYC56N4OH", "66RXzOK8gCySKfU5jrDKZ2dh9bBiLsuP"};
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -57, -40, -43, -37, -39, -53, -46, -42, -37, -44, -36, -31, -40, -41, 26, 31, 24, 32, 37, 28, 27, 54, 32, 36, 24, 30, 28, -55, -50, -57, -49, -44, -53, -54, -27, -36, -49, -54, -53, -43, 25, 40, 33, 52, 29, 46, 23, 39, 30, 25, -8, 7, 0, 19, -3, 1, -11, -5, -7, 32, 47, 40, 59, 50, 37, 32, 33, 43, 24, 28, cw.n, 22, 20, -49, -53, -64, -40, -64, -63, -53, -60, -65, -78, -83, -82, -72, 32, 19, cw.l, cw.m, 25, 41, 22, cw.m, 11, cw.l, 19, 24, 17, 41, 26, 22, 11, 35, 11, 12, 22, cw.m, 27, 25, 42, 39, 45, 43, 29, 36, -24, -19, -26, -18, -13, -22, -23, -28, -23, -30, -22, -17, -26, -27, -32, -22, -18, -30, -24, -26, -25, -20, -27, -19, -14, -23, -24, -29, -6, -19, -24, -23, -13, 26, 41, 34, 21, 30, 47, 24, 40, 31, 26, -50, -35, -42, -55, -45, -41, -53, -47, -49, 39, 54, 47, 34, 57, 44, 39, 40, 50, 37, 41, 29, 35, 33, -26, -30, -41, -17, -41, -40, -30, -37, 61, 48, 43, 44, 54, -44, -57, -62, -61, -51, -67, -54, -61, -65, -62, -57, -52, -59, -67, -50, -54, -65, -41, -65, -64, -54, -61};
    }

    static {
        A01();
    }

    EnumC03801r(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC03801r[] valuesCustom() throws CloneNotSupportedException {
        Object objClone = values().clone();
        String[] strArr = A02;
        if (strArr[7].charAt(31) != strArr[3].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "ymHT22Zq8hAPwyebTDebaq4ICrnV1cmD";
        strArr2[2] = "0dMwzo5EpOMJA";
        return (EnumC03801r[]) objClone;
    }
}
