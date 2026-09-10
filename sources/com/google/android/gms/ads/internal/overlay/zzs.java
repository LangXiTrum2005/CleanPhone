package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzs extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzu f10955a;

    public zzs(zzu zzuVar) {
        this.f10955a = zzuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zzu zzuVar = this.f10955a;
        zzuVar.setEnabled(true);
        zzuVar.f10956a.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zzu zzuVar = this.f10955a;
        zzuVar.setEnabled(true);
        zzuVar.f10956a.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zzu zzuVar = this.f10955a;
        zzuVar.setEnabled(false);
        zzuVar.f10956a.setEnabled(false);
    }
}
