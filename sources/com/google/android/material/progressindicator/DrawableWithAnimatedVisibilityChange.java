package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {
    public static final Property h0 = new AnonymousClass3(Float.class, "growFraction");
    public AnimatorDurationScaleProvider X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ObjectAnimator f19377Y;
    public ObjectAnimator Z;
    public ArrayList e0;
    public float f0;
    public int g0;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<DrawableWithAnimatedVisibilityChange, Float> {
        @Override // android.util.Property
        public final Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            drawableWithAnimatedVisibilityChange.getClass();
            throw null;
        }

        @Override // android.util.Property
        public final void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = drawableWithAnimatedVisibilityChange;
            float fFloatValue = f.floatValue();
            if (drawableWithAnimatedVisibilityChange2.f0 != fFloatValue) {
                drawableWithAnimatedVisibilityChange2.f0 = fFloatValue;
                drawableWithAnimatedVisibilityChange2.invalidateSelf();
            }
        }
    }

    public void b() {
        c();
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d(boolean z2) {
        ObjectAnimator objectAnimator = this.f19377Y;
        Property property = h0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) property, 0.0f, 1.0f);
            this.f19377Y = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f19377Y.setInterpolator(AnimationUtils.f19079b);
            ObjectAnimator objectAnimator2 = this.f19377Y;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f19377Y = objectAnimator2;
            objectAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    ArrayList arrayList = DrawableWithAnimatedVisibilityChange.this.e0;
                }
            });
        }
        if (this.Z == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) property, 1.0f, 0.0f);
            this.Z = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.Z.setInterpolator(AnimationUtils.f19079b);
            ObjectAnimator objectAnimator3 = this.Z;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.Z = objectAnimator3;
            objectAnimator3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                }
            });
        }
        if (!isVisible() && !z2) {
            return false;
        }
        ObjectAnimator objectAnimator4 = z2 ? this.f19377Y : this.Z;
        ObjectAnimator objectAnimator5 = z2 ? this.Z : this.f19377Y;
        if (objectAnimator5.isRunning()) {
            new ValueAnimator[]{objectAnimator5}[0].cancel();
        }
        if (objectAnimator4.isRunning()) {
            objectAnimator4.end();
        } else {
            new ValueAnimator[]{objectAnimator4}[0].end();
        }
        return super.setVisible(z2, false);
    }

    public boolean e(Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.e0;
        if (arrayList == null || !arrayList.contains(null)) {
            return false;
        }
        this.e0.remove((Object) null);
        if (!this.e0.isEmpty()) {
            return true;
        }
        this.e0 = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.g0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ObjectAnimator objectAnimator = this.f19377Y;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.Z;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.g0 = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        c();
        throw null;
    }

    public void start() {
        d(true);
    }

    public void stop() {
        d(false);
    }
}
