package utwa;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: BaseLottieAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class dern extends ValueAnimator {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Set<ValueAnimator.AnimatorUpdateListener> f39259kowloon = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f39258arytenoidectomy = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Set<Animator.AnimatorPauseListener> f39260monoploid = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f39258arytenoidectomy.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f39260monoploid.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39259kowloon.add(animatorUpdateListener);
    }

    public void attabal() {
        Iterator<Animator.AnimatorListener> it = this.f39258arytenoidectomy.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    public void beachfront() {
        Iterator<Animator.AnimatorPauseListener> it = this.f39260monoploid.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    public void competently(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f39258arytenoidectomy) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    public void dern(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f39258arytenoidectomy) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void impromptu() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f39259kowloon.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    public void marial() {
        Iterator<Animator.AnimatorListener> it = this.f39258arytenoidectomy.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f39258arytenoidectomy.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f39259kowloon.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f39258arytenoidectomy.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f39260monoploid.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39259kowloon.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public void wireman() {
        Iterator<Animator.AnimatorPauseListener> it = this.f39260monoploid.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
