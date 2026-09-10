package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0900Mw extends AbstractC1984md implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A04();
    }

    public C0900Mw(List<C2T> list) {
        super(list);
    }

    public static C0900Mw A02(JSONObject jSONObject, C1828k1 c1828k1) {
        C0900Mw c0900Mw = new C0900Mw(AbstractC1984md.A08(jSONObject, c1828k1, new C1981ma()));
        c0900Mw.A1k(jSONObject);
        c0900Mw.A10(A03(0, 12, 9));
        return c0900Mw;
    }

    @Override // com.facebook.ads.redexgen.core.C2S
    public final int A0X() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.C2S
    public final int A0Y() {
        return 0;
    }
}
