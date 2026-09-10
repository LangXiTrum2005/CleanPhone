package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class GT extends AbstractRunnableC1787Wc {
    public static byte[] A02;
    public static String[] A03 = {"zQTxaAZtyj5Zf7xpyBa5Wo13", "ZyRPoqiC9PInhvt4VYdLIOd5Fjjwld3Q", "AJVcAlxtfo1o3uDwHkILc2qtWBcw5I", "qm4l90vWWtQXhhB5Cv7", "msnWA3qGYryppWjZvi7PZr4M3Bb415RH", "kQT0oRvSr6py", "zmROIVOKOovaIXaapuTgFe6PU", "TFR8Ke0ijybG7ZAZ7LbnVmkovmXx0N"};
    public final /* synthetic */ C4V A00;
    public final /* synthetic */ C4A A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{120, -85, -100, -100, -101, -88, -97, -92, -99, 86, -97, -92, -102, -101, -100, -97, -92, -97, -86, -101, -94, -81};
    }

    static {
        A01();
    }

    public GT(C4V c4v, C4A c4a) {
        this.A00 = c4v;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (this.A00.A0M.getState() == EnumC2242fm.A02) {
            int currentPositionInMillis = this.A00.A0M.getCurrentPositionInMillis();
            if (A03[1].charAt(3) != 'P') {
                throw new RuntimeException();
            }
            A03[3] = "tIcfuB5su4wQORzkX2J";
            if (currentPositionInMillis == A00()) {
                this.A00.A0Q(A00(0, 22, 32));
            }
        }
    }
}
