package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

/* JADX INFO: loaded from: classes.dex */
class FragmentAnim {
    public static int a(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class AnimationOrAnimator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f5104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f5105b;

        public AnimationOrAnimator(Animation animation) {
            this.f5104a = animation;
            this.f5105b = null;
        }

        public AnimationOrAnimator(Animator animator) {
            this.f5104a = null;
            this.f5105b = animator;
        }
    }

    public static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        public final ViewGroup X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final View f5106Y;
        public boolean Z;
        public boolean e0;
        public boolean f0;

        public EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f0 = true;
            this.X = viewGroup;
            this.f5106Y = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.f0 = true;
            if (this.Z) {
                return !this.e0;
            }
            if (!super.getTransformation(j, transformation)) {
                this.Z = true;
                OneShotPreDrawListener.a(this.X, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2 = this.Z;
            ViewGroup viewGroup = this.X;
            if (z2 || !this.f0) {
                viewGroup.endViewTransition(this.f5106Y);
                this.e0 = true;
            } else {
                this.f0 = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f0 = true;
            if (this.Z) {
                return !this.e0;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.Z = true;
                OneShotPreDrawListener.a(this.X, this);
            }
            return true;
        }
    }
}
