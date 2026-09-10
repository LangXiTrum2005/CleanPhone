package com.facebook.ads.redexgen.core;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class CallableC05327q implements Callable<Boolean> {
    public static byte[] A02;
    public final C05317p A00;
    public final /* synthetic */ C05357t A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC05327q(C05357t c05357t, C05317p c05317p) {
        this.A01 = c05357t;
        this.A00 = c05317p;
    }

    private final Boolean A00() throws Throwable {
        String strA01;
        if (BQ.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                strA01 = A01(0, 6, 72);
            } else {
                strA01 = A01(6, 5, 72);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            C1J c1j = new C1J(str, creativeType, this.A00.A06, strA01, this.A00.A02, this.A00.A05);
            c1j.A04 = this.A00.A03;
            c1j.A02 = this.A00.A01;
            c1j.A05 = this.A00.A04;
            if (C05387w.A06(this.A01.A04)) {
                C05357t.A0F.put(this.A00.A08, c1j);
            }
            return Boolean.valueOf(C05357t.A03(this.A01.A04.A02()).AHm(c1j) != null);
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (BQ.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }
}
