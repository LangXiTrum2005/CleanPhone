package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class YF implements ThreadFactory {
    public static byte[] A03;
    public final AtomicInteger A00 = new AtomicInteger(1);
    public final /* synthetic */ YG A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{121, 116, -127, 109, 88, -90, 83, 86, 88, -105, -111, -123, -113, -126, 126, -127, -112, 124, -128, -116, -110, -117, -111, -126, -113, 124, -112, -123, -116, -113, -111, 124, -111, 126, -112, -120, 124, -126, -107, -126, -128, -110, -111, -116, -113};
    }

    public YF(YG yg, String str) {
        this.A01 = yg;
        this.A02 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC1718Tj.A00(A00(10, 35, 22));
        return new Thread(runnable, String.format(Locale.US, A00(0, 10, 44), this.A02, Integer.valueOf(this.A00.getAndIncrement())));
    }
}
