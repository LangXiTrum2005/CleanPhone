package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class GH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1580fu A00;

    public GH(C1580fu c1580fu) {
        this.A00 = c1580fu;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0A.getLayoutParams().height = num.intValue();
        this.A00.A0A.requestLayout();
    }
}
