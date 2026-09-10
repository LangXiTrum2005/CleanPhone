package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1947az implements Runnable {
    public final /* synthetic */ C1948b0 A00;
    public final /* synthetic */ InterfaceC1949b1 A01;

    public RunnableC1947az(C1948b0 c1948b0, InterfaceC1949b1 interfaceC1949b1) {
        this.A00 = c1948b0;
        this.A01 = interfaceC1949b1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
