package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class GI extends AnimatorListenerAdapter {
    public final /* synthetic */ C1580fu A00;
    public final /* synthetic */ boolean A01;

    public GI(C1580fu c1580fu, boolean z) {
        this.A00 = c1580fu;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0N.setTranslationY(0.0f);
        this.A00.A0W();
        if (!this.A01 && this.A00.A0K != null) {
            this.A00.A0K.destroy();
        }
        if (this.A00.A0l == null) {
            return;
        }
        if (!this.A00.A0G.A1H()) {
            this.A00.A0l.setVisibility(this.A01 ? 8 : 0);
        } else {
            this.A00.A0l.setVisibility(8);
        }
    }
}
