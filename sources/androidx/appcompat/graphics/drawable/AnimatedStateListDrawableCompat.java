package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.appcompat.resources.Compatibility;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    public AnimatedStateListState q0;
    public Transition r0;
    public int s0 = -1;
    public int t0 = -1;
    public boolean u0;

    public static class AnimatableTransition extends Transition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animatable f3391a;

        public AnimatableTransition(Animatable animatable) {
            this.f3391a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f3391a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f3391a.stop();
        }
    }

    public static class AnimatedStateListState extends StateListDrawableCompat.StateListState {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public LongSparseArray f3392J;
        public SparseArrayCompat K;

        public AnimatedStateListState(AnimatedStateListState animatedStateListState, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.f3392J = animatedStateListState.f3392J;
                this.K = animatedStateListState.K;
            } else {
                this.f3392J = new LongSparseArray();
                this.K = new SparseArrayCompat();
            }
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public final void d() {
            this.f3392J = this.f3392J.clone();
            this.K = this.K.clone();
        }

        public final int f(int i2) {
            Object obj;
            if (i2 < 0) {
                return 0;
            }
            SparseArrayCompat sparseArrayCompat = this.K;
            Object obj2 = 0;
            int iA = ContainerHelpersKt.a(sparseArrayCompat.Z, i2, sparseArrayCompat.X);
            if (iA >= 0 && (obj = sparseArrayCompat.f3772Y[iA]) != SparseArrayCompatKt.f3773a) {
                obj2 = obj;
            }
            return ((Integer) obj2).intValue();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    public static class AnimatedVectorDrawableTransition extends Transition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedVectorDrawableCompat f3393a;

        public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.f3393a = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f3393a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f3393a.stop();
        }
    }

    public static class AnimationDrawableTransition extends Transition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f3394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3395b;

        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z2 ? numberOfFrames - 1 : 0;
            int i3 = z2 ? 0 : numberOfFrames - 1;
            FrameInterpolator frameInterpolator = new FrameInterpolator();
            int numberOfFrames2 = animationDrawable.getNumberOfFrames();
            frameInterpolator.f3397b = numberOfFrames2;
            int[] iArr = frameInterpolator.f3396a;
            if (iArr == null || iArr.length < numberOfFrames2) {
                frameInterpolator.f3396a = new int[numberOfFrames2];
            }
            int[] iArr2 = frameInterpolator.f3396a;
            int i4 = 0;
            for (int i5 = 0; i5 < numberOfFrames2; i5++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i5) - 1 : i5);
                iArr2[i5] = duration;
                i4 += duration;
            }
            frameInterpolator.f3398c = i4;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            Compatibility.Api18Impl.a(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(frameInterpolator.f3398c);
            objectAnimatorOfInt.setInterpolator(frameInterpolator);
            this.f3395b = z3;
            this.f3394a = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final boolean a() {
            return this.f3395b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void b() {
            this.f3394a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f3394a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f3394a.cancel();
        }
    }

    public static class FrameInterpolator implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f3396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3398c;

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i2 = (int) ((f * this.f3398c) + 0.5f);
            int i3 = this.f3397b;
            int[] iArr = this.f3396a;
            int i4 = 0;
            while (i4 < i3) {
                int i5 = iArr[i4];
                if (i2 < i5) {
                    break;
                }
                i2 -= i5;
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f3398c : 0.0f);
        }
    }

    public static abstract class Transition {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public AnimatedStateListDrawableCompat(AnimatedStateListState animatedStateListState, Resources resources) {
        e(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final DrawableContainerCompat.DrawableContainerState b() {
        return new AnimatedStateListState(this.q0, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final void e(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.e(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.q0 = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    /* JADX INFO: renamed from: f */
    public final StateListDrawableCompat.StateListState b() {
        return new AnimatedStateListState(this.q0, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.r0;
        if (transition != null) {
            transition.d();
            this.r0 = null;
            d(this.s0);
            this.s0 = -1;
            this.t0 = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.u0) {
            super.mutate();
            this.q0.d();
            this.u0 = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iF;
        Transition animatableTransition;
        AnimatedStateListState animatedStateListState = this.q0;
        int iE = animatedStateListState.e(iArr);
        if (iE < 0) {
            iE = animatedStateListState.e(StateSet.WILD_CARD);
        }
        int i2 = this.h0;
        boolean z2 = false;
        if (iE != i2) {
            Transition transition = this.r0;
            if (transition == null) {
                this.r0 = null;
                this.t0 = -1;
                this.s0 = -1;
                AnimatedStateListState animatedStateListState2 = this.q0;
                int iF2 = animatedStateListState2.f(i2);
                iF = animatedStateListState2.f(iE);
                if (iF == 0 && iF2 != 0) {
                    long j = ((long) iF) | (((long) iF2) << 32);
                    int iLongValue = (int) ((Long) animatedStateListState2.f3392J.e(j)).longValue();
                    if (iLongValue >= 0) {
                        boolean z3 = (((Long) animatedStateListState2.f3392J.e(j)).longValue() & 8589934592L) != 0;
                        d(iLongValue);
                        Object obj = this.Z;
                        if (obj instanceof AnimationDrawable) {
                            animatableTransition = new AnimationDrawableTransition((AnimationDrawable) obj, (((Long) animatedStateListState2.f3392J.e(j)).longValue() & 4294967296L) != 0, z3);
                        } else if (obj instanceof AnimatedVectorDrawableCompat) {
                            animatableTransition = new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat) obj);
                        } else if (obj instanceof Animatable) {
                            animatableTransition = new AnimatableTransition((Animatable) obj);
                        } else if (d(iE)) {
                            z2 = true;
                        }
                        animatableTransition.c();
                        this.r0 = animatableTransition;
                        this.t0 = i2;
                        this.s0 = iE;
                        z2 = true;
                    } else if (d(iE)) {
                        z2 = true;
                    }
                } else if (d(iE)) {
                    z2 = true;
                }
            } else {
                if (iE != this.s0) {
                    if (iE == this.t0 && transition.a()) {
                        transition.b();
                        this.s0 = this.t0;
                        this.t0 = iE;
                    } else {
                        i2 = this.s0;
                        transition.d();
                        this.r0 = null;
                        this.t0 = -1;
                        this.s0 = -1;
                        AnimatedStateListState animatedStateListState3 = this.q0;
                        int iF3 = animatedStateListState3.f(i2);
                        iF = animatedStateListState3.f(iE);
                        if (iF == 0) {
                            if (d(iE)) {
                            }
                        } else if (d(iE)) {
                        }
                    }
                }
                z2 = true;
            }
        }
        Drawable drawable = this.Z;
        return drawable != null ? drawable.setState(iArr) | z2 : z2;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Transition transition = this.r0;
        if (transition != null && (visible || z3)) {
            if (z2) {
                transition.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
