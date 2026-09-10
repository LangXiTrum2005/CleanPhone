package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0831Jx implements Runnable {
    public final /* synthetic */ C1239aI A00;

    public RunnableC0831Jx(C1239aI c1239aI) {
        this.A00 = c1239aI;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            C1239aI.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
