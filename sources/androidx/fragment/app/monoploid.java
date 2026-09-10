package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid {
    public static int attabal(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            return z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        }
        return z ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    public static int dern(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    public static attabal saneness(Context context, Fragment fragment, boolean z, boolean z2) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int iAttabal = attabal(fragment, z, z2);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(prefect.saneness.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(prefect.saneness.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, iAttabal);
        if (animationOnCreateAnimation != null) {
            return new attabal(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, iAttabal);
        if (animatorOnCreateAnimator != null) {
            return new attabal(animatorOnCreateAnimator);
        }
        if (iAttabal == 0 && nextTransition != 0) {
            iAttabal = wireman(context, nextTransition, z);
        }
        if (iAttabal != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iAttabal));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iAttabal);
                    if (animationLoadAnimation != null) {
                        return new attabal(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iAttabal);
                        if (animatorLoadAnimator != null) {
                            return new attabal(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (zEquals) {
                            throw e2;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iAttabal);
                        if (animationLoadAnimation2 != null) {
                            return new attabal(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iAttabal);
                if (animatorLoadAnimator != null) {
                    return new attabal(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    public static int wireman(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? prefect.attabal.fragment_open_enter : prefect.attabal.fragment_open_exit;
        }
        if (i == 8194) {
            return z ? prefect.attabal.fragment_close_enter : prefect.attabal.fragment_close_exit;
        }
        if (i == 8197) {
            return z ? dern(context, R.attr.activityCloseEnterAnimation) : dern(context, R.attr.activityCloseExitAnimation);
        }
        if (i == 4099) {
            return z ? prefect.attabal.fragment_fade_enter : prefect.attabal.fragment_fade_exit;
        }
        if (i != 4100) {
            return -1;
        }
        return z ? dern(context, R.attr.activityOpenEnterAnimation) : dern(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Animation f10349attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final AnimatorSet f10350saneness;

        public attabal(Animation animation) {
            this.f10349attabal = animation;
            this.f10350saneness = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public attabal(Animator animator) {
            this.f10349attabal = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10350saneness = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    public static class saneness extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final View f10351arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final ViewGroup f10352kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public boolean f10353molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public boolean f10354monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public boolean f10355polloi;

        public saneness(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f10353molybdenite = true;
            this.f10352kowloon = viewGroup;
            this.f10351arytenoidectomy = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f10353molybdenite = true;
            if (this.f10354monoploid) {
                return !this.f10355polloi;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f10354monoploid = true;
                androidx.core.view.polder.attabal(this.f10352kowloon, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10354monoploid || !this.f10353molybdenite) {
                this.f10352kowloon.endViewTransition(this.f10351arytenoidectomy);
                this.f10355polloi = true;
            } else {
                this.f10353molybdenite = false;
                this.f10352kowloon.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f10353molybdenite = true;
            if (this.f10354monoploid) {
                return !this.f10355polloi;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f10354monoploid = true;
                androidx.core.view.polder.attabal(this.f10352kowloon, this);
            }
            return true;
        }
    }
}
