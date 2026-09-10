package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1636Wv implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C2131gi A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_SETUP_REQUIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -50, -51, -58, -1, -3, 6, -3, 10, 1, -5};
    }

    public RunnableC1636Wv(C2131gi c2131gi) {
        this.A00 = c2131gi;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            C1544Te otsl = new C1544Te(A00(0, 4, 14));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A08().ABD(A00(4, 7, 44), AbstractC1543Td.A1Y, otsl);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
