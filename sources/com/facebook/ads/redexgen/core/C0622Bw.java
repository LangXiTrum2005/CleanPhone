package com.facebook.ads.redexgen.core;

import android.app.Activity;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0622Bw {
    public static final C0622Bw A04 = new C0622Bw(new C1727iM(), new C1726iL());
    public final InterfaceC0621Bv A02;
    public final InterfaceC0645Ct A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0622Bw(InterfaceC0645Ct interfaceC0645Ct, InterfaceC0621Bv interfaceC0621Bv) {
        this.A03 = interfaceC0645Ct;
        this.A02 = interfaceC0621Bv;
    }

    public static C0622Bw A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5d();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A8C();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0622Bw.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5d() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
