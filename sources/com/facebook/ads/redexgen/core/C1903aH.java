package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1903aH extends Animator {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC1892a6 A01;
    public final /* synthetic */ C1905aJ A02;

    public C1903aH(C1905aJ c1905aJ, int i2, InterfaceC1892a6 interfaceC1892a6) {
        this.A02 = c1905aJ;
        this.A00 = i2;
        this.A01 = interfaceC1892a6;
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // android.animation.Animator
    public final void cancel() {
    }

    @Override // android.animation.Animator
    public final void end() {
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.A00;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return 0L;
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.A02.A04;
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        return null;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
    }

    @Override // android.animation.Animator
    public final void setTarget(Object obj) {
        this.A01.AK7(obj, getDuration());
    }

    @Override // android.animation.Animator
    public final void start() {
    }
}
