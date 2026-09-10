package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1793bE implements InterfaceC1358Lu {
    public static byte[] A01;
    public final T8 A00;

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
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70, -58, -43, -50, -50, -59, -52, -65, -52, -49, -57, -57, -55, -50, -57, -65, -51, -49, -60, -59};
    }

    public C1793bE(T8 t8) {
        this.A00 = t8;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z, int i2) {
        C1544Te c1544Te = new C1544Te(A00(4, 6, 44));
        c1544Te.A07(jSONObject);
        c1544Te.A05(1);
        c1544Te.A09(z);
        c1544Te.A04(i2);
        try {
            jSONObject.put(A00(33, 13, 62), TX.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i2);
        } catch (JSONException unused2) {
        }
        this.A00.A08().ABD(A00(27, 6, 13), i + 4000, c1544Te);
        if (this.A00.A05().AAO()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i + A00(1, 3, 118) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC1360Lw enumC1360Lw) {
        for (EnumC1360Lw enumC1360Lw2 : ZJ.A06) {
            if (enumC1360Lw2.equals(enumC1360Lw)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1358Lu
    public final void ABE(EnumC1360Lw enumC1360Lw, JSONObject jSONObject, int i) {
        A02(enumC1360Lw.A03(), enumC1360Lw.toString(), jSONObject, A03(enumC1360Lw), i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1358Lu
    public final void ABs(int i, JSONObject jSONObject, int i2) {
        A02(i, A00(18, 9, 111) + i, jSONObject, false, i2);
    }
}
