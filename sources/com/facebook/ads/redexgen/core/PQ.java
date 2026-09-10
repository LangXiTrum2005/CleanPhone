package com.facebook.ads.redexgen.core;

import android.R;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class PQ extends AbstractRunnableC1787Wc {
    public final /* synthetic */ AnimationAnimationListenerC1854Yu A00;

    public PQ(AnimationAnimationListenerC1854Yu animationAnimationListenerC1854Yu) {
        this.A00 = animationAnimationListenerC1854Yu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
