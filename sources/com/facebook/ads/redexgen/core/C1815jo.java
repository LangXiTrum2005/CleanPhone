package com.facebook.ads.redexgen.core;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1815jo extends BY {
    public static byte[] A02;
    public static String[] A03 = {"w4GsGaTCcJA9wFWp2KNopTJOjqP8UDpw", "KJoDcXHO6XERgkU18ZjJw4XTw2kjUjU4", "R80wDz5faPpVYHVxJychiW2DfFSiKcfh", "t0Fzi1DjxmxSLCfz9XJ2VaEQot34azEH", "xhDPy00jOuqmtbPp3auQzix75rw9IX8h", "Uu427jBhvNl8yC5HrJluoVTOz", "6hGUj4iS9agb9", "ga1SCcoGdvIpCjYHRj6uJxXsB"};
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1827k0 A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A03[1].charAt(16) != '8') {
                throw new RuntimeException();
            }
            A03[1] = "4HO8Ss9k2AmZ8k9M8zrjCYxt48xbOoMK";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{3, 52, 59, 112, 35, 37, 51, 51, 53, 35, 35, 54, 37, 60, 60, 41, 112, 57, 62, 57, 36, 57, 49, 60, 57, 42, 53, 52, 113};
    }

    static {
        A04();
    }

    public C1815jo(C1827k0 c1827k0, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1827k0;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        try {
            C1800jZ.A02().A0C(this.A01);
        } catch (Throwable th) {
            this.A01.A08().A48(th);
        }
        C05658z.A0C(this.A01);
        if (this.A00 != null) {
            C05658z.A04(this.A00, new C05648y(true, A01(0, 29, 22)));
        }
    }
}
