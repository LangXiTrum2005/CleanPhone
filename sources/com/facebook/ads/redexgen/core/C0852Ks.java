package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0852Ks extends AbstractC1341c1 {
    public final /* synthetic */ C0851Kr A00;

    public C0852Ks(C0851Kr c0851Kr) {
        this.A00 = c0851Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1342c2 c1342c2) {
        new Handler(Looper.getMainLooper()).post(new HD(this));
    }
}
