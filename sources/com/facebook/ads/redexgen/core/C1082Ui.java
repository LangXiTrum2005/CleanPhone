package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1082Ui {
    public static byte[] A02;
    public static String[] A03 = {"DcZnPoy59v7sj6PT8aConXR6jEPAL960", "Pv8IBEx58pJkNNVPq5bnbeRuMFJtpa1x", "3Zs54Ju7SHVe", "H", "RKR9j3xEV0ivPjQ8DuOkvj9eC5GtakEP", "8QNaCEG2mWsibXa4TFiVJYyhNMyXSiHE", "uazceyLmjty8LR90DaJQZdEYzqeKFyaJ", "Ew5eYlEYbVVB"};
    public final C1083Uk A00;
    public final C1083Uk A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{70, 74, 28, 56};
    }

    static {
        A01();
    }

    public C1082Ui(C1083Uk c1083Uk) {
        this(c1083Uk, c1083Uk);
    }

    public C1082Ui(C1083Uk c1083Uk, C1083Uk c1083Uk2) {
        this.A00 = (C1083Uk) AbstractC1517es.A01(c1083Uk);
        this.A01 = (C1083Uk) AbstractC1517es.A01(c1083Uk2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(6) != strArr[4].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "TGB2jMu9Hb97";
        strArr2[3] = bc.aK;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1082Ui c1082Ui = (C1082Ui) obj;
        return this.A00.equals(c1082Ui.A00) && this.A01.equals(c1082Ui.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return A00(2, 1, 56) + this.A00 + (this.A00.equals(this.A01) ? A00(0, 0, 31) : A00(0, 2, 21) + this.A01) + A00(3, 1, 26);
    }
}
