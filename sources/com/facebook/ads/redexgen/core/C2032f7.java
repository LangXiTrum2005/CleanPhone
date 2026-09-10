package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2032f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C08953c A00;

    public C2032f7(C08953c c08953c) {
        this.A00 = c08953c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new C1140Di(this), 2000L);
    }
}
