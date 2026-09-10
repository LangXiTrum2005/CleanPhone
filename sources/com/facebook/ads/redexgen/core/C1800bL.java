package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1800bL extends AnimatorListenerAdapter {
    public final /* synthetic */ RunnableC1801bM A00;

    public C1800bL(RunnableC1801bM runnableC1801bM) {
        this.A00 = runnableC1801bM;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(250L);
        layoutTransition.setDuration(3, 0L);
        layoutTransition.addTransitionListener(new C1799bK(this));
        this.A00.A00.A0M.setLayoutTransition(layoutTransition);
        ((AbstractC1794bF) this.A00.A00).A09.setVisibility(8);
        this.A00.A00.A0Q.setVisibility(8);
        this.A00.A00.A0P.setVisibility(8);
    }
}
