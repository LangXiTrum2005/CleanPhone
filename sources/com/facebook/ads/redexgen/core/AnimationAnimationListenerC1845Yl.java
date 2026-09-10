package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC1845Yl implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC11616x A00;

    public AnimationAnimationListenerC1845Yl(ViewOnClickListenerC11616x viewOnClickListenerC11616x) {
        this.A00 = viewOnClickListenerC11616x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.A06();
        if (this.A00.A04 > 0) {
            this.A00.A05.postDelayed(this.A00.A07, this.A00.A04);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
