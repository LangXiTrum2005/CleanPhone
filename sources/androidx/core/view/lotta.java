package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class lotta {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final WeakReference<View> f9365attabal;

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    public class attabal extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ sayid f9366attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ View f9368saneness;

        public attabal(sayid sayidVar, View view) {
            this.f9366attabal = sayidVar;
            this.f9368saneness = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9366attabal.attabal(this.f9368saneness);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9366attabal.saneness(this.f9368saneness);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f9366attabal.dern(this.f9368saneness);
        }
    }

    public lotta(View view) {
        this.f9365attabal = new WeakReference<>(view);
    }

    public lotta apical(long j) {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public lotta beachfront(float f) {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public lotta competently(long j) {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final void cutely(View view, sayid sayidVar) {
        if (sayidVar != null) {
            view.animate().setListener(new attabal(sayidVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public void dern() {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public lotta formularize(final coi coiVar) {
        final View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().setUpdateListener(coiVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.nosophobia
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    coiVar.attabal(view);
                }
            } : null);
        }
        return this;
    }

    public void impassible() {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public lotta impromptu(Interpolator interpolator) {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public lotta marial(float f) {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public lotta saneness(float f) {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public lotta taiyuan(sayid sayidVar) {
        View view = this.f9365attabal.get();
        if (view != null) {
            cutely(view, sayidVar);
        }
        return this;
    }

    public lotta triweekly(float f) {
        View view = this.f9365attabal.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public long wireman() {
        View view = this.f9365attabal.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }
}
