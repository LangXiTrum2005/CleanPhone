package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1455ds extends D2 {
    public final /* synthetic */ C1449dl A00;

    public C1455ds(C1449dl c1449dl) {
        this.A00 = c1449dl;
    }

    @Override // com.facebook.ads.redexgen.core.D2, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        D3.A0F(this.A00.A01);
        this.A00.A00.ADa();
    }
}
