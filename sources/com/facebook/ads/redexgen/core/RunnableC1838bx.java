package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1838bx implements Runnable {
    public final /* synthetic */ C1314Kc A00;

    public RunnableC1838bx(C1314Kc c1314Kc) {
        this.A00 = c1314Kc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC1844c3) this.A00).A07.A0D() != null) {
                ((AbstractC1844c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
