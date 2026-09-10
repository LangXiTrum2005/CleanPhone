package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1446di extends BY {
    public static byte[] A01;
    public static String[] A02 = {"zQTxaAZtyj5Zf7xpyBa5Wo13", "ZyRPoqiC9PInhvt4VYdLIOd5Fjjwld3Q", "AJVcAlxtfo1o3uDwHkILc2qtWBcw5I", "qm4l90vWWtQXhhB5Cv7", "msnWA3qGYryppWjZvi7PZr4M3Bb415RH", "kQT0oRvSr6py", "zmROIVOKOovaIXaapuTgFe6PU", "TFR8Ke0ijybG7ZAZ7LbnVmkovmXx0N"};
    public final /* synthetic */ C0843Kj A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-116, -97, -102, -101, -91, 86, -92, -101, -84, -101, -88, 86, -87, -86, -105, -88, -86, -101, -102, 86, -90, -94, -105, -81, -97, -92, -99};
    }

    static {
        A04();
    }

    public C1446di(C0843Kj c0843Kj) {
        this.A00 = c0843Kj;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (!this.A00.A0F) {
            C0843Kj c0843Kj = this.A00;
            if (A02[1].charAt(3) != 'P') {
                throw new RuntimeException();
            }
            A02[3] = "tIcfuB5su4wQORzkX2J";
            c0843Kj.A0Q(A01(0, 27, 32));
        }
    }
}
