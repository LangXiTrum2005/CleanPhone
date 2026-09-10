package com.inmobi.media;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class R8 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23125a;

    public R8(T8 view) {
        Intrinsics.f(view, "view");
        this.f23125a = new WeakReference(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.f(animation, "animation");
        T8 t8 = (T8) this.f23125a.get();
        if (t8 == null) {
            return;
        }
        int visibility = t8.getVisibility();
        if (visibility == 4 || visibility == 8) {
            Object animatedValue = animation.getAnimatedValue();
            Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue).floatValue() >= 1.0d) {
                t8.a();
                return;
            }
            return;
        }
        Object animatedValue2 = animation.getAnimatedValue();
        Intrinsics.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        t8.f23229l = 360 * ((Float) animatedValue2).floatValue();
        t8.invalidate();
    }
}
