package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1697So {
    public static byte[] A03;
    public static final AtomicBoolean A04;
    public C2296ge A00;
    public String A01;
    public final C1819Xl A02 = new C1819Xl(300000000000L, new C2307gp(this));

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 80);
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

    public static UD A00(C2296ge c2296ge) {
        if (C1750Up.A1B(c2296ge)) {
            return UE.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12));
        }
        return UE.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C2296ge c2296ge;
        synchronized (this) {
            c2296ge = this.A00;
        }
        if (c2296ge == null) {
            return;
        }
        String strA05 = UG.A00().A01(c2296ge, true).A05(A00(c2296ge));
        synchronized (this) {
            this.A01 = strA05;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized String A06(C2296ge c2296ge) {
        this.A00 = c2296ge;
        this.A00.A08().ACP();
        this.A00.A04().ADI(c2296ge);
        if (this.A00.A07().AJw() || ((A04.get() && C1750Up.A21(this.A00)) || this.A01 == null)) {
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
