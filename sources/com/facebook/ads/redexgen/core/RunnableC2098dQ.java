package com.facebook.ads.redexgen.core;

import com.smartdigimkt.a6.d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2098dQ implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C5T A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) + d.o);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 77, 72, 73, 83, 52, 80, 69, 93, 70, 69, 71, 79, 41, 86, 86, 83, 86};
    }

    public RunnableC2098dQ(C5T c5t) {
        this.A00 = c5t;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0S(A00(0, 18, 126));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
