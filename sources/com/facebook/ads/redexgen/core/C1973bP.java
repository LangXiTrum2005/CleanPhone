package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1973bP implements Animator.AnimatorListener {
    public final /* synthetic */ C1975bR A00;

    public C1973bP(C1975bR c1975bR) {
        this.A00 = c1975bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A06();
        this.A00.A02 = true;
        this.A00.A07.A0F().ADF();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
