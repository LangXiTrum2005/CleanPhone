package com.facebook.ads.redexgen.core;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0596Ae {
    public final InterfaceC0594Ac A0B;
    public final boolean A0F;
    public final String A0C = C0596Ae.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C0595Ad> A0D = new LinkedList();

    public C0596Ae(AnonymousClass85 anonymousClass85, InterfaceC0594Ac interfaceC0594Ac) {
        int nativeViewabilityHistorySamplingRate = AbstractC05809o.A0D(anonymousClass85);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = anonymousClass85.A09().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC0594Ac;
    }

    private int A00() {
        return this.A0B.A7T();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C0595Ad c0595Ad) {
        synchronized (this.A0D) {
            this.A0D.add(c0595Ad);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C0595Ad(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C0595Ad(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C0595Ad(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C0595Ad(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C0595Ad(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C0595Ad(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C0595Ad(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C0595Ad(A01(), 102, A00(), null));
    }

    public final void A0C(AnonymousClass85 anonymousClass85, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C0595Ad(A01(), 103, A00(), null));
        D8.A06.execute(new RunnableC0593Ab(this, str, anonymousClass85));
    }
}
