package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0872Ln extends AbstractC1341c1 {
    public final /* synthetic */ C1679hW A00;

    public C0872Ln(C1679hW c1679hW) {
        this.A00 = c1679hW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1342c2 c1342c2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0660Di(this));
    }
}
