package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0949Oy implements InterfaceC1552fS {
    public static final List<C0950Oz> A01 = new ArrayList(50);
    public final Handler A00;

    public C0949Oy(Handler handler) {
        this.A00 = handler;
    }

    public static C0950Oz A00() {
        C0950Oz c0950Oz;
        synchronized (A01) {
            c0950Oz = A01.isEmpty() ? new C0950Oz() : A01.remove(A01.size() - 1);
        }
        return c0950Oz;
    }

    public static void A01(C0950Oz c0950Oz) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c0950Oz);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final Looper A8H() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final boolean A9d(int i) {
        return this.A00.hasMessages(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final C0950Oz AC1(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final C0950Oz AC2(int i, int i2, int i3) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final C0950Oz AC3(int i, int i2, int i3, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final C0950Oz AC4(int i, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final void AHZ(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final boolean AIG(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final boolean AIH(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552fS
    public final boolean AIJ(InterfaceC1551fR interfaceC1551fR) {
        return ((C0950Oz) interfaceC1551fR).A03(this.A00);
    }
}
