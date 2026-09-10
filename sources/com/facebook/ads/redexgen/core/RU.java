package com.facebook.ads.redexgen.core;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RU extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final RW A02;
    public final C2300gi A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = RU.class.getName();
    }

    public RU(C2300gi c2300gi, RW rw) {
        this(c2300gi, rw, C1750Up.A08(c2300gi));
    }

    public RU(C2300gi c2300gi, RW rw, int i2) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new RT(this);
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i2;
        this.A03 = c2300gi;
        this.A02 = rw;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z2 = interval == 0;
                this.A05 = j;
                if (z2) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        String strA03 = this.A02.A03();
                        if (strA03 != null) {
                            this.A03.A08().ABC(A01(15, 7, 8), AbstractC1712Td.A1D, new C1713Te(this.A02.A04(strA03)));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
