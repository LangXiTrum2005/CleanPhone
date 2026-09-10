package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QR implements Runnable {
    public final /* synthetic */ C7P A00;
    public final /* synthetic */ ArrayList A01;

    public QR(C7P c7p, ArrayList arrayList) {
        this.A00 = c7p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C1633Qa c1633Qa : this.A01) {
            this.A00.A0e(c1633Qa.A04, c1633Qa.A00, c1633Qa.A01, c1633Qa.A02, c1633Qa.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
