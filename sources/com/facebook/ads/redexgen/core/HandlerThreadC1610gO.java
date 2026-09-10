package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.video.DummySurface;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class HandlerThreadC1610gO extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public Handler A00;
    public RunnableC1535fB A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{102, 87, 79, 79, 91, 113, 87, 80, 68, 67, 65, 71, 32, 7, cw.m, 10, 3, 2, 70, 18, 9, 70, cw.m, 8, cw.m, 18, cw.m, 7, 10, cw.m, 28, 3, 70, 2, 19, 11, 11, 31, 70, 21, 19, 20, 0, 7, 5, 3, 30, 57, 49, 52, 61, 60, 120, 44, 55, 120, 42, 61, 52, 61, 57, 43, 61, 120, 60, 45, 53, 53, 33, 120, 43, 45, 42, 62, 57, 59, 61, 70, 87, 79, 79, 91, 113, 87, 80, 68, 67, 65, 71};
    }

    public HandlerThreadC1610gO() {
        super(A00(77, 12, 60));
    }

    private void A01() {
        AbstractC1517es.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        AbstractC1517es.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new DummySurface(this, this.A01.A07(), i != 0);
    }

    public final DummySurface A04(int i) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new RunnableC1535fB(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (DummySurface) AbstractC1517es.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        AbstractC1517es.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                            break;
                        }
                    } catch (Error e) {
                        AbstractC1561fb.A08(A00(0, 12, 60), A00(12, 34, 120), e);
                        this.A03 = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        AbstractC1561fb.A08(A00(0, 12, 60), A00(12, 34, 120), e2);
                        this.A04 = e2;
                        synchronized (this) {
                            notify();
                            break;
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                        break;
                    } catch (Throwable th) {
                        try {
                            AbstractC1561fb.A08(A00(0, 12, 60), A00(46, 31, 70), th);
                        } finally {
                            quit();
                        }
                        break;
                    }
                    return true;
                default:
                    return true;
            }
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
        synchronized (this) {
            notify();
            throw th2;
        }
    }
}
