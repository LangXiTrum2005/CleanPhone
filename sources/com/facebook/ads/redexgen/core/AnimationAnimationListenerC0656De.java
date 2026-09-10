package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.De, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC0656De implements Animation.AnimationListener {
    public final /* synthetic */ C04946e A00;
    public final /* synthetic */ AbstractC1690hh A01;
    public final /* synthetic */ AbstractC1690hh A02;

    public AnimationAnimationListenerC0656De(AbstractC1690hh abstractC1690hh, AbstractC1690hh abstractC1690hh2, C04946e c04946e) {
        this.A01 = abstractC1690hh;
        this.A02 = abstractC1690hh2;
        this.A00 = c04946e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        D3.A0F(this.A02);
        new Handler().postDelayed(new C1693hl(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
