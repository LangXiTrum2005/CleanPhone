package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04243j {
    public static byte[] A03;
    public AF A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-53, -45, -39, -30, -40, 27, cw.m, 28, cw.m, 21, 19, cw.k, cw.m, 18, cw.k, 30, 32, 19, 20, 19, 32, 19, 28, 17, 19, 33, -7, -6, -2, -13, -7, -8, -3, -23, -3, -17, -10, -17, -19, -2, -17, -18, 66, 67, 48, 65, 67, 0, -2, -16, -3, -22, -11, -6, 0, -3, -7, -16, 4, -36, -51, -34, -60, -58, -46, -60, -50, -60, -40, -54, -54, -50, -45, -52, -60, -39, -51, -50, -40};
    }

    public C04243j() {
    }

    public C04243j(AF af) {
        this.A00 = af;
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap();
        map.put(A00(47, 12, 49), new JSONArray((Collection) this.A02).toString());
        map.put(A00(26, 16, 48), new JSONArray((Collection) this.A01).toString());
        return map;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 84));
        if (this.A00 != null) {
            this.A00.A04(AE.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 11));
        if (this.A00 != null) {
            this.A00.A04(AE.A0C, null);
        }
    }

    public final void A07(int i) {
        this.A01.add(String.valueOf(i));
    }

    public final void A08(EnumC04233i enumC04233i) {
        this.A02.add(enumC04233i.A03() + A00(1, 4, 26));
        if (this.A00 != null) {
            this.A00.A04(AE.A09, null);
        }
    }

    public final void A09(EnumC04233i enumC04233i, int i) {
        this.A02.add(enumC04233i.A03() + A00(0, 1, 18) + i);
    }

    public final boolean A0A() {
        return (this.A02.isEmpty() && this.A01.isEmpty()) ? false : true;
    }
}
