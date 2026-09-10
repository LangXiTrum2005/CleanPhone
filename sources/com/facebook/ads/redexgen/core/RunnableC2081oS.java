package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2081oS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2080oR A01;
    public final /* synthetic */ Exception A02;

    public RunnableC2081oS(C2080oR c2080oR, int i, Exception exc) {
        this.A01 = c2080oR;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A01.A01) {
                    if (!C0910Nj.A08 || !this.A01.A08()) {
                        this.A01.A05(this.A01.A05.AC0());
                        this.A01.A04.postDelayed(this.A01.A0A, this.A00);
                    } else {
                        this.A01.A0C();
                    }
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
