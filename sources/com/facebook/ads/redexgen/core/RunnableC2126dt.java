package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2126dt implements Runnable {
    public final /* synthetic */ C4V A00;

    public RunnableC2126dt(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            ((AbstractC1387Gj) this.A00).A0A.A4j(((AbstractC1387Gj) this.A00).A0B.A7w());
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
