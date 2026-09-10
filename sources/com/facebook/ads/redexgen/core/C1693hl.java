package com.facebook.ads.redexgen.core;

import android.R;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1693hl extends BY {
    public final /* synthetic */ AnimationAnimationListenerC0656De A00;

    public C1693hl(AnimationAnimationListenerC0656De animationAnimationListenerC0656De) {
        this.A00 = animationAnimationListenerC0656De;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
