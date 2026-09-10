package com.facebook.ads.redexgen.core;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class H2 {
    public static byte[] A04;
    public static String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public C1400Gw A00;
    public final int A01;
    public final C2658n0 A02;
    public final H1 A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 45, 47, 61, 43};
    }

    static {
        A03();
    }

    public H2(InterfaceC1401Gx interfaceC1401Gx, H1 h1, long j, long j2, long j3, long j4, long j5, long j6, int i2) {
        this.A03 = h1;
        this.A01 = i2;
        this.A02 = new C2658n0(interfaceC1401Gx, j, j2, j3, j4, j5, j6);
    }

    private final int A00(InterfaceC2651ms interfaceC2651ms, long j, HV hv) {
        if (j != interfaceC2651ms.A8n()) {
            hv.A00 = j;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final C1400Gw A01(long j) {
        return new C1400Gw(j, this.A02.A05(j), this.A02.A05, this.A02.A02, this.A02.A04, this.A02.A01, this.A02.A00);
    }

    private final void A04(boolean z2, long j) {
        this.A00 = null;
        this.A03.AFs();
    }

    private final boolean A05(InterfaceC2651ms interfaceC2651ms, long j) throws IOException {
        long jA8n = j - interfaceC2651ms.A8n();
        if (jA8n >= 0 && jA8n <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            interfaceC2651ms.AK3((int) jA8n);
            return true;
        }
        return false;
    }

    public final int A06(InterfaceC2651ms interfaceC2651ms, HV hv) throws IOException {
        while (true) {
            C1400Gw c1400Gw = (C1400Gw) AbstractC10843y.A02(this.A00);
            long jA01 = c1400Gw.A01();
            long jA00 = c1400Gw.A00();
            long jA02 = c1400Gw.A02();
            if (jA00 - jA01 <= this.A01) {
                A04(false, jA01);
                String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC2651ms, jA01, hv);
            }
            if (!A05(interfaceC2651ms, jA02)) {
                return A00(interfaceC2651ms, jA02, hv);
            }
            interfaceC2651ms.AIl();
            C1403Gz c1403GzAIw = this.A03.AIw(interfaceC2651ms, c1400Gw.A04());
            switch (c1403GzAIw.A00) {
                case -3:
                    A04(false, jA02);
                    return A00(interfaceC2651ms, jA02, hv);
                case -2:
                    c1400Gw.A0D(c1403GzAIw.A02, c1403GzAIw.A01);
                    break;
                case -1:
                    c1400Gw.A0C(c1403GzAIw.A02, c1403GzAIw.A01);
                    break;
                case 0:
                    A05(interfaceC2651ms, c1403GzAIw.A01);
                    long floorPosition = c1403GzAIw.A01;
                    A04(true, floorPosition);
                    return A00(interfaceC2651ms, c1403GzAIw.A01, hv);
                default:
                    throw new IllegalStateException(A02(0, 12, 109));
            }
        }
    }

    public final C2658n0 A07() {
        return this.A02;
    }

    public final void A08(long j) {
        if (this.A00 != null && this.A00.A03() == j) {
            return;
        }
        this.A00 = A01(j);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}
