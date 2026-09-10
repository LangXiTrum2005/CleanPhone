package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0804Iw implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1274at A02;

    public C0804Iw(C1274at c1274at, int i, int i2) {
        this.A02 = c1274at;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 == null) {
            return;
        }
        this.A02.A00.removeAllListeners();
        this.A02.A00 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnumC0797Ip enumC0797Ip;
        C1274at c1274at = this.A02;
        if (this.A01 == this.A02.A04) {
            enumC0797Ip = EnumC0797Ip.A02;
        } else {
            enumC0797Ip = EnumC0797Ip.A04;
        }
        c1274at.A01 = enumC0797Ip;
        if (this.A02.A00 == null) {
            return;
        }
        this.A02.A00.removeAllListeners();
        this.A02.A00 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
