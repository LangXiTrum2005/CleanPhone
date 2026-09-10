package com.facebook.ads.redexgen.core;

import com.facebook.ads.VideoStartReason;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MA extends AbstractC1343c3 {
    public final /* synthetic */ C05116v A00;

    public MA(C05116v c05116v) {
        this.A00 = c05116v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0834Ka c0834Ka) {
        this.A00.A00.onCompleted();
        if (C05789m.A1c(this.A00.A00.getContext())) {
            this.A00.A00.play(VideoStartReason.AUTO_STARTED);
        }
    }
}
