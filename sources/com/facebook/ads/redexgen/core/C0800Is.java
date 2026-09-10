package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0800Is implements Animator.AnimatorListener {
    public final /* synthetic */ C1277aw A00;

    public C0800Is(C1277aw c1277aw) {
        this.A00 = c1277aw;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        if (this.A00.A01 == null) {
            return;
        }
        this.A00.A01.removeAllListeners();
        this.A00.A01 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A02 = EnumC0797Ip.A04;
        D3.A0F(this.A00.A05);
        if (this.A00.A01 == null) {
            return;
        }
        this.A00.A01.removeAllListeners();
        this.A00.A01 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
