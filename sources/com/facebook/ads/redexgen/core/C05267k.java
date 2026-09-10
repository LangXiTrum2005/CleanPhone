package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05267k {
    public static byte[] A03;
    public static final AtomicBoolean A04;
    public C1827k0 A00;
    public String A01;
    public final C0629Cd A02 = new C0629Cd(300000000000L, new C1835k8(this));

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, -50, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, -64, -78, -64, -64, -74, -68, -69, -52, -63, -74, -70, -78};
    }

    static {
        A04();
        A04 = new AtomicBoolean(false);
    }

    public static C9A A00(C1827k0 c1827k0) {
        if (C05789m.A19(c1827k0)) {
            return C9B.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12));
        }
        return C9B.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1827k0 c1827k0;
        synchronized (this) {
            c1827k0 = this.A00;
        }
        if (c1827k0 == null) {
            return;
        }
        String strA04 = C9D.A00().A01(c1827k0, true).A04(A00(c1827k0));
        synchronized (this) {
            this.A01 = strA04;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized String A06(C1827k0 c1827k0) {
        this.A00 = c1827k0;
        this.A00.A08().ABl();
        this.A00.A04().ACX(c1827k0);
        if (this.A00.A07().AJ2() || ((A04.get() && C05789m.A1u(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
