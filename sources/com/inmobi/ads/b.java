package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.media.Y0;
import com.inmobi.media.Z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f, float f2) {
        Intrinsics.f(animationType, "animationType");
        int i2 = a.f22649a[animationType.ordinal()];
        if (i2 == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i2 == 2) {
            Y0 y0 = new Y0(f / 2.0f, f2 / 2.0f);
            y0.setDuration(500L);
            y0.setFillAfter(false);
            y0.setInterpolator(new AccelerateInterpolator());
            return y0;
        }
        if (i2 != 3) {
            return null;
        }
        Z0 z0 = new Z0(f / 2.0f, f2 / 2.0f);
        z0.setDuration(500L);
        z0.setFillAfter(false);
        z0.setInterpolator(new AccelerateInterpolator());
        return z0;
    }
}
