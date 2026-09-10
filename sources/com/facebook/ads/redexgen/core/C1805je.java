package com.facebook.ads.redexgen.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1805je implements InterfaceC03691g {
    public static byte[] A01;
    public final AnonymousClass85 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70};
    }

    public C1805je(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z, int i2) {
        C05428b c05428b = new C05428b(A00(4, 6, 44));
        c05428b.A07(jSONObject);
        c05428b.A05(1);
        c05428b.A09(z);
        c05428b.A04(i2);
        try {
            jSONObject.put(A00(33, 13, 62), C8U.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A08().AAv(A00(27, 6, 13), i + 4000, c05428b);
        if (this.A00.A05().AAD()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i + A00(1, 3, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC03711i enumC03711i) {
        for (EnumC03711i enumC03711i2 : C1797jW.A06) {
            if (enumC03711i2.equals(enumC03711i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03691g
    public final void AAw(EnumC03711i enumC03711i, JSONObject jSONObject, int i) {
        A02(enumC03711i.A03(), enumC03711i.toString(), jSONObject, A03(enumC03711i), i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03691g
    public final void ABH(int i, JSONObject jSONObject) {
        A02(i, A00(18, 9, 111) + i, jSONObject, false, 0);
    }
}
