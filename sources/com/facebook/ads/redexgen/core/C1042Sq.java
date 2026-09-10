package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1042Sq extends Thread {
    public final /* synthetic */ AbstractC1139Ws A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042Sq(AbstractC1139Ws abstractC1139Ws, String str) {
        super(str);
        this.A00 = abstractC1139Ws;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0R();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
