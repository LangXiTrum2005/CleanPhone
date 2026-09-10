package com.akexorcist.roundcornerprogressbar.common;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import com.akexorcist.roundcornerprogressbar.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnimatedRoundCornerProgressBar extends BaseRoundCornerProgressBar {
    public static final long DEFAULT_DURATION = 500;
    private float animationSpeedScale;
    private boolean isAnimationEnabled;
    private boolean isProgressAnimating;
    private boolean isSecondaryProgressAnimating;
    private float lastProgress;
    private float lastSecondaryProgress;
    private AnimatorListenerAdapter progressAnimationAdapterListener;
    private ValueAnimator.AnimatorUpdateListener progressAnimationUpdateListener;
    private ValueAnimator progressAnimator;
    private AnimatorListenerAdapter secondaryProgressAnimationAdapterListener;
    private ValueAnimator.AnimatorUpdateListener secondaryProgressAnimationUpdateListener;
    private ValueAnimator secondaryProgressAnimator;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new AnonymousClass1();
        public boolean Z;
        public boolean e0;
        public float f0;
        public float g0;
        public float h0;
        public boolean i0;

        /* JADX INFO: renamed from: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$SavedState$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readByte() != 0;
            this.e0 = parcel.readByte() != 0;
            this.f0 = parcel.readFloat();
            this.g0 = parcel.readFloat();
            this.h0 = parcel.readFloat();
            this.i0 = parcel.readByte() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.e0 ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.f0);
            parcel.writeFloat(this.g0);
            parcel.writeFloat(this.h0);
            parcel.writeByte(this.i0 ? (byte) 1 : (byte) 0);
        }
    }

    public AnimatedRoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isProgressAnimating = false;
        this.isSecondaryProgressAnimating = false;
        this.progressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.access$000(AnimatedRoundCornerProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
        this.progressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                AnimatedRoundCornerProgressBar.this.isProgressAnimating = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar = AnimatedRoundCornerProgressBar.this;
                animatedRoundCornerProgressBar.isProgressAnimating = false;
                AnimatedRoundCornerProgressBar.access$200(animatedRoundCornerProgressBar);
            }
        };
        this.secondaryProgressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.access$300(AnimatedRoundCornerProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
        this.secondaryProgressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                AnimatedRoundCornerProgressBar.this.isSecondaryProgressAnimating = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar = AnimatedRoundCornerProgressBar.this;
                animatedRoundCornerProgressBar.isSecondaryProgressAnimating = false;
                AnimatedRoundCornerProgressBar.access$500(animatedRoundCornerProgressBar);
            }
        };
    }

    public static void access$000(AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar, float f) {
        super.setProgress(f);
        animatedRoundCornerProgressBar.onProgressChangeAnimationUpdate(animatedRoundCornerProgressBar.layoutProgress, f, animatedRoundCornerProgressBar.lastProgress);
    }

    public static void access$200(AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar) {
        animatedRoundCornerProgressBar.onProgressChangeAnimationEnd(animatedRoundCornerProgressBar.layoutProgress);
    }

    public static void access$300(AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar, float f) {
        super.setSecondaryProgress(f);
        animatedRoundCornerProgressBar.onProgressChangeAnimationUpdate(animatedRoundCornerProgressBar.layoutSecondaryProgress, f, animatedRoundCornerProgressBar.lastProgress);
    }

    public static void access$500(AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar) {
        animatedRoundCornerProgressBar.onProgressChangeAnimationEnd(animatedRoundCornerProgressBar.layoutSecondaryProgress);
    }

    public final void a(float f, float f2) {
        this.isProgressAnimating = true;
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.progressAnimationUpdateListener);
            this.progressAnimator.removeListener(this.progressAnimationAdapterListener);
            this.progressAnimator.cancel();
            this.progressAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.progressAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration((long) (((Math.abs(f - f2) * 500.0f) / this.max) * this.animationSpeedScale));
        this.progressAnimator.addUpdateListener(this.progressAnimationUpdateListener);
        this.progressAnimator.addListener(this.progressAnimationAdapterListener);
        this.progressAnimator.start();
    }

    public final void b(float f, float f2) {
        this.isSecondaryProgressAnimating = true;
        ValueAnimator valueAnimator = this.secondaryProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.secondaryProgressAnimationUpdateListener);
            this.secondaryProgressAnimator.removeListener(this.secondaryProgressAnimationAdapterListener);
            this.secondaryProgressAnimator.cancel();
            this.secondaryProgressAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.secondaryProgressAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration((long) (((Math.abs(f - f2) * 500.0f) / this.max) * this.animationSpeedScale));
        this.secondaryProgressAnimator.addUpdateListener(this.secondaryProgressAnimationUpdateListener);
        this.secondaryProgressAnimator.addListener(this.secondaryProgressAnimationAdapterListener);
        this.secondaryProgressAnimator.start();
    }

    public void disableAnimation() {
        this.isAnimationEnabled = false;
    }

    public void enableAnimation() {
        this.isAnimationEnabled = true;
    }

    public float getAnimationSpeedScale() {
        return this.animationSpeedScale;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public float getProgress() {
        return (this.isAnimationEnabled || this.isProgressAnimating) ? this.lastProgress : super.getProgress();
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public float getSecondaryProgress() {
        return (this.isAnimationEnabled || this.isSecondaryProgressAnimating) ? this.lastSecondaryProgress : super.getSecondaryProgress();
    }

    public boolean isProgressAnimating() {
        return this.isProgressAnimating;
    }

    public boolean isSecondaryProgressAnimating() {
        return this.isSecondaryProgressAnimating;
    }

    public void onProgressChangeAnimationEnd(LinearLayout linearLayout) {
    }

    public void onProgressChangeAnimationUpdate(LinearLayout linearLayout, float f, float f2) {
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        boolean z2 = savedState.Z;
        this.isProgressAnimating = z2;
        this.isSecondaryProgressAnimating = savedState.e0;
        this.lastProgress = savedState.f0;
        this.lastSecondaryProgress = savedState.g0;
        this.animationSpeedScale = savedState.h0;
        this.isAnimationEnabled = savedState.i0;
        if (z2) {
            a(super.getProgress(), this.lastProgress);
        }
        if (this.isSecondaryProgressAnimating) {
            b(super.getSecondaryProgress(), this.lastSecondaryProgress);
        }
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.isProgressAnimating;
        savedState.e0 = this.isSecondaryProgressAnimating;
        savedState.f0 = this.lastProgress;
        savedState.g0 = this.lastSecondaryProgress;
        savedState.h0 = this.animationSpeedScale;
        savedState.i0 = this.isAnimationEnabled;
        return savedState;
    }

    public void setAnimationSpeedScale(float f) {
        this.animationSpeedScale = Math.max(Math.min(f, 5.0f), 0.2f);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setProgress(int i2) {
        setProgress(i2);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setSecondaryProgress(int i2) {
        setSecondaryProgress(i2);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setupStyleable(Context context, AttributeSet attributeSet) {
        super.setupStyleable(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f9967a);
        this.isAnimationEnabled = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.animationSpeedScale = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.lastProgress = super.getProgress();
        this.lastSecondaryProgress = super.getSecondaryProgress();
    }

    public void stopProgressAnimationImmediately() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.progressAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.secondaryProgressAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.secondaryProgressAnimator.cancel();
        }
        if (this.isAnimationEnabled && this.isProgressAnimating) {
            disableAnimation();
            if (this.isProgressAnimating) {
                super.setProgress(this.lastProgress);
            }
            if (this.isSecondaryProgressAnimating) {
                super.setSecondaryProgress(this.lastProgress);
            }
            enableAnimation();
        }
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setProgress(float f) {
        float fMin = f >= 0.0f ? Math.min(f, this.max) : 0.0f;
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.progressAnimator.cancel();
        }
        this.lastProgress = fMin;
        if (this.isAnimationEnabled) {
            a(super.getProgress(), fMin);
        } else {
            super.setProgress(fMin);
        }
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setSecondaryProgress(float f) {
        float fMin = f >= 0.0f ? Math.min(f, this.max) : 0.0f;
        ValueAnimator valueAnimator = this.secondaryProgressAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.secondaryProgressAnimator.cancel();
        }
        this.lastSecondaryProgress = fMin;
        if (this.isAnimationEnabled) {
            b(super.getSecondaryProgress(), fMin);
        } else {
            super.setSecondaryProgress(fMin);
        }
    }

    public AnimatedRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.isProgressAnimating = false;
        this.isSecondaryProgressAnimating = false;
        this.progressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.access$000(AnimatedRoundCornerProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
        this.progressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                AnimatedRoundCornerProgressBar.this.isProgressAnimating = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar = AnimatedRoundCornerProgressBar.this;
                animatedRoundCornerProgressBar.isProgressAnimating = false;
                AnimatedRoundCornerProgressBar.access$200(animatedRoundCornerProgressBar);
            }
        };
        this.secondaryProgressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.access$300(AnimatedRoundCornerProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
        this.secondaryProgressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                AnimatedRoundCornerProgressBar.this.isSecondaryProgressAnimating = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar = AnimatedRoundCornerProgressBar.this;
                animatedRoundCornerProgressBar.isSecondaryProgressAnimating = false;
                AnimatedRoundCornerProgressBar.access$500(animatedRoundCornerProgressBar);
            }
        };
    }

    public AnimatedRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.isProgressAnimating = false;
        this.isSecondaryProgressAnimating = false;
        this.progressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.access$000(AnimatedRoundCornerProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
        this.progressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                AnimatedRoundCornerProgressBar.this.isProgressAnimating = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar = AnimatedRoundCornerProgressBar.this;
                animatedRoundCornerProgressBar.isProgressAnimating = false;
                AnimatedRoundCornerProgressBar.access$200(animatedRoundCornerProgressBar);
            }
        };
        this.secondaryProgressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.access$300(AnimatedRoundCornerProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
        this.secondaryProgressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                AnimatedRoundCornerProgressBar.this.isSecondaryProgressAnimating = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedRoundCornerProgressBar animatedRoundCornerProgressBar = AnimatedRoundCornerProgressBar.this;
                animatedRoundCornerProgressBar.isSecondaryProgressAnimating = false;
                AnimatedRoundCornerProgressBar.access$500(animatedRoundCornerProgressBar);
            }
        };
    }
}
