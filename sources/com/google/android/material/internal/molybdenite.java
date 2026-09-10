package com.google.android.material.internal;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: ReversableAnimatedValueInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class molybdenite implements TimeInterpolator {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TimeInterpolator f20454attabal;

    public molybdenite(TimeInterpolator timeInterpolator) {
        this.f20454attabal = timeInterpolator;
    }

    public static TimeInterpolator attabal(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new molybdenite(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.f20454attabal.getInterpolation(f);
    }
}
