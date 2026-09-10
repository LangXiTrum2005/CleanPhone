package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC1787Wc {
    public final /* synthetic */ InterfaceC2122dp A00;
    public final /* synthetic */ C2123dq A01;

    public GX(C2123dq c2123dq, InterfaceC2122dp interfaceC2122dp) {
        this.A01 = c2123dq;
        this.A00 = interfaceC2122dp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
