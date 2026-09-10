package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2104dW extends AnimatorListenerAdapter {
    public final /* synthetic */ C5F A00;
    public final /* synthetic */ boolean A01;

    public C2104dW(C5F c5f, boolean z2) {
        this.A00 = c5f;
        this.A01 = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0H.setTranslationY(0.0f);
        this.A00.A0V();
        if (!this.A01 && this.A00.A0G != null) {
            this.A00.A0G.destroy();
        }
    }
}
