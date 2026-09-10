package com.google.android.material.animation;

import android.support.v4.media.a;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public class AnimationUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f19078a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FastOutSlowInInterpolator f19079b = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FastOutLinearInInterpolator f19080c = new FastOutLinearInInterpolator();
    public static final LinearOutSlowInInterpolator d = new LinearOutSlowInInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f19081e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return a.a(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(float f, int i2, int i3) {
        return Math.round(f * (i3 - i2)) + i2;
    }
}
