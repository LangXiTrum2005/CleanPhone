package com.facebook.ads.redexgen.core;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6U extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final C6W A02;
    public final C1828k1 A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, cw.l};
    }

    static {
        A02();
        A08 = C6U.class.getName();
    }

    public C6U(C1828k1 c1828k1, C6W c6w) {
        this(c1828k1, c6w, C05789m.A08(c1828k1));
    }

    public C6U(C1828k1 c1828k1, C6W c6w, int i) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new Runnable() { // from class: com.facebook.ads.redexgen.X.6T
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (BQ.A02(this)) {
                    return;
                }
                try {
                    this.A00.A05 = 0L;
                    this.A00.A06 = false;
                } catch (Throwable th) {
                    BQ.A00(th, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i;
        this.A03 = c1828k1;
        this.A02 = c6w;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z = interval == 0;
                this.A05 = j;
                if (z) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        if (this.A02.A05()) {
                            this.A03.A08().AAu(A01(15, 7, 8), AbstractC05418a.A1D, new C05428b(this.A02.A04()));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
