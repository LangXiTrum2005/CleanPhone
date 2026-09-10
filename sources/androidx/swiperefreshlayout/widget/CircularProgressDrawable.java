package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$1, reason: invalid class name */
    class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$2, reason: invalid class name */
    class AnonymousClass2 implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    public static class Ring {
    }

    static {
        new LinearInterpolator();
        new FastOutSlowInInterpolator();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(0.0f, bounds.exactCenterX(), bounds.exactCenterY());
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        throw null;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        throw null;
    }
}
