package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1800jZ implements AnonymousClass87 {
    public static C1800jZ A07;
    public static byte[] A08;
    public InterfaceC03721j A00;
    public InterfaceC05397x A01;
    public AnonymousClass86 A02;
    public C8M A03;
    public AnonymousClass94 A04;
    public AJ A05;
    public InterfaceC1236aF A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{cw.k, cw.m, 59, 61, 12, 18, 62, 60, cw.k, 31, 45, 45, 35, 41, 40, -38, 30, 27, 46, 27, -38, 35, 40, 35, 46, 35, 27, 38, 35, 52, 31, 30, 28, cw.m, 26, 25, 28, 30, -3, cw.m, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, cw.m, cw.l};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1827k0 c1827k0) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1827k0);
        this.A06 = A05(c1827k0, this.A03, A03(c1827k0));
        A09(c1827k0, A00(c1827k0, this.A06));
        A0A(c1827k0, this.A06);
        A0B(c1827k0, this.A06);
        if (this.A06 != null) {
            this.A06.A6T();
        }
    }

    public static C7N A00(C1827k0 c1827k0, InterfaceC1236aF interfaceC1236aF) {
        if (!C05789m.A1k(c1827k0) || interfaceC1236aF == null) {
            return null;
        }
        return C7O.A00().A00(interfaceC1236aF);
    }

    public static C8M A01(C1827k0 c1827k0) {
        return C8N.A00().A00(c1827k0, new C1807jg());
    }

    public static synchronized C1800jZ A02() {
        if (A07 == null) {
            A07 = new C1800jZ();
        }
        return A07;
    }

    public static JR A03(C1827k0 c1827k0) {
        if (!C05789m.A1g(c1827k0)) {
            return null;
        }
        return C0817Jj.A01(c1827k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC1236aF A95() {
        return this.A06;
    }

    public static InterfaceC1236aF A05(C1827k0 c1827k0, C8M c8m, JR jr) {
        if (!C05789m.A2c(c1827k0) || jr == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return K6.A00().A00(c1827k0, c8m, jr, BE.A04(c1827k0), new C1801ja(new B6(c1827k0, A06(0, 0, 9), null, EnumC0601Al.A08, 0, new C0605Aq(), AbstractC0637Cl.A01(C05789m.A0M(c1827k0)), null, null, new C1950m4()), c1827k0), K4.A00().A00());
    }

    public static void A08() {
        AbstractC0606Au.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C1827k0 c1827k0, C7N c7n) {
        if (!C05789m.A1k(c1827k0) || c7n == null) {
            return;
        }
        C7L.A00().A00(c7n, c1827k0);
    }

    public static void A0A(C1827k0 c1827k0, InterfaceC1236aF interfaceC1236aF) {
        if (!C05789m.A0l(c1827k0) || interfaceC1236aF == null) {
            return;
        }
        new C05247i(c1827k0, interfaceC1236aF, new C05257j(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1827k0 c1827k0, InterfaceC1236aF interfaceC1236aF) {
        if (interfaceC1236aF == null) {
            return;
        }
        AbstractC05829q.A00(c1827k0, interfaceC1236aF);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final A7 A6d(C1827k0 c1827k0) {
        return C1768j3.A01(c1827k0);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized AnonymousClass86 A6u(AnonymousClass85 anonymousClass85) {
        if (this.A02 == null) {
            this.A02 = new C1802jb(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized InterfaceC05397x A76() {
        if (this.A01 == null) {
            this.A01 = new C1829k2();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized C8M A7b(AnonymousClass85 anonymousClass85) {
        if (this.A03 == null) {
            this.A03 = A01(anonymousClass85.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized C8Z A7d(AnonymousClass85 anonymousClass85) {
        return new C1816jp(anonymousClass85);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized AnonymousClass88 A7n(AnonymousClass85 anonymousClass85) {
        return new M3(this, anonymousClass85);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized InterfaceC03721j A82(AnonymousClass85 anonymousClass85) {
        if (!C05789m.A12(anonymousClass85)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC03731k.A00().A00(new C1805je(anonymousClass85));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized C8A A8o(AnonymousClass85 anonymousClass85) {
        return new C1803jc(anonymousClass85);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final C1827k0 A8p(Context context) {
        C1827k0 sdkContext = AnonymousClass84.A00();
        if (sdkContext == null) {
            C1827k0 sdkContext2 = new C1827k0(context, this);
            AnonymousClass84.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized AJ A8q(C1827k0 c1827k0) {
        if (this.A05 == null) {
            this.A05 = new C1776jB(c1827k0);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass87
    public final synchronized AnonymousClass94 A8w() {
        if (this.A04 == null) {
            this.A04 = new AnonymousClass94();
            A08();
        }
        return this.A04;
    }
}
