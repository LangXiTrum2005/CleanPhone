package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1214Gf implements InterfaceC1665Ya {
    public static byte[] A01;
    public static String[] A02 = {"csDJTKMsYdQDTZ6oaAKl5T8I2UfElmlw", "ZPoBWwRbmlxJW4JBXeHiCznpgduRwX0R", "YnHNxwrcL4VP2rzDabEPBpSRhKQlF70O", "ZXjFBdL6N8QRVPocRq4T6yjW", "DvDV4BG5U2fSuPxyYCt3atNQBem4gb3r", "Lz5NxPzXDVZYAcKGP0xvxFjIAyYktO5Y", "USLnjf5V4FwfzNcoOXwUO87ZM5qcDzRn", "2jpbWPspWwKCP4YD7vZxOkEv1N6M1MwD"};
    public final /* synthetic */ C1213Ge A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[0].charAt(1) == '2') {
            throw new RuntimeException();
        }
        A02[3] = "dLINtRlzHu";
        A01 = new byte[]{117, 109, 111, 118};
    }

    static {
        A01();
    }

    public C1214Gf(C1213Ge c1213Ge) {
        this.A00 = c1213Ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1665Ya
    public final void ACl(AbstractC1666Yb abstractC1666Yb) {
        if (abstractC1666Yb.getToolbarActionMode() == 8 && this.A00.A04 != null) {
            this.A00.A0F.A04(VH.A0Y, null);
            this.A00.A04.A1D(A00(0, 4, 95));
            this.A00.A0G();
            return;
        }
        this.A00.A0E();
    }
}
