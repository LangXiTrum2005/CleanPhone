package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1900aE implements Animator.AnimatorListener {
    public final /* synthetic */ C1905aJ A00;

    public C1900aE(C1905aJ c1905aJ) {
        this.A00 = c1905aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A08();
        this.A00.A0B();
    }
}
