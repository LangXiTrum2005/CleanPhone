package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class YD {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 66, 72, 94, 67, 69, 72, 2, 67, 95, 2, 109, 95, 85, 66, 79, 120, 77, 95, 71};
    }

    public static <P, PR, R> AsyncTask<P, PR, R> A00(Executor executor, AsyncTask<P, PR, R> task, P... params) {
        task.executeOnExecutor(executor, params);
        return task;
    }

    public static void A02() {
        try {
            Class.forName(A01(0, 20, 53));
        } catch (Throwable unused) {
        }
    }
}
