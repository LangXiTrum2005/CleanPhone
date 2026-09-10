package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import earstone.stratoscope;
import earstone.triweekly;

/* JADX INFO: compiled from: TranslationAnimationCreator.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {
    public static Animator attabal(View view, stratoscope stratoscopeVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) stratoscopeVar.f25563saneness.getTag(triweekly.transition_position);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        attabal attabalVar = new attabal(view, stratoscopeVar.f25563saneness, translationX, translationY);
        transition.wireman(attabalVar);
        objectAnimatorOfPropertyValuesHolder.addListener(attabalVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: compiled from: TranslationAnimationCreator.java */
    public static class attabal extends AnimatorListenerAdapter implements Transition.taiyuan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final View f13845attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final float f13846beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final float f13847competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int[] f13848dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public boolean f13849impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f13850marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final View f13851saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f13852wireman;

        public attabal(View view, View view2, float f, float f2) {
            this.f13851saneness = view;
            this.f13845attabal = view2;
            this.f13846beachfront = f;
            this.f13847competently = f2;
            int[] iArr = (int[]) view2.getTag(triweekly.transition_position);
            this.f13848dern = iArr;
            if (iArr != null) {
                view2.setTag(triweekly.transition_position, null);
            }
        }

        @Override // androidx.transition.Transition.taiyuan
        public void apical(Transition transition) {
            this.f13849impromptu = true;
            this.f13851saneness.setTranslationX(this.f13846beachfront);
            this.f13851saneness.setTranslationY(this.f13847competently);
        }

        public final void attabal() {
            if (this.f13848dern == null) {
                this.f13848dern = new int[2];
            }
            this.f13851saneness.getLocationOnScreen(this.f13848dern);
            this.f13845attabal.setTag(triweekly.transition_position, this.f13848dern);
        }

        @Override // androidx.transition.Transition.taiyuan
        public void competently(Transition transition, boolean z) {
            if (this.f13849impromptu) {
                return;
            }
            this.f13845attabal.setTag(triweekly.transition_position, null);
        }

        @Override // androidx.transition.Transition.taiyuan
        public void impromptu(Transition transition) {
            competently(transition, false);
        }

        @Override // androidx.transition.Transition.taiyuan
        public void marial(Transition transition) {
            attabal();
            this.f13852wireman = this.f13851saneness.getTranslationX();
            this.f13850marial = this.f13851saneness.getTranslationY();
            this.f13851saneness.setTranslationX(this.f13846beachfront);
            this.f13851saneness.setTranslationY(this.f13847competently);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13849impromptu = true;
            this.f13851saneness.setTranslationX(this.f13846beachfront);
            this.f13851saneness.setTranslationY(this.f13847competently);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            this.f13851saneness.setTranslationX(this.f13846beachfront);
            this.f13851saneness.setTranslationY(this.f13847competently);
        }

        @Override // androidx.transition.Transition.taiyuan
        public void saneness(Transition transition) {
            this.f13851saneness.setTranslationX(this.f13852wireman);
            this.f13851saneness.setTranslationY(this.f13850marial);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.taiyuan
        public void wireman(Transition transition) {
        }
    }
}
