package com.bytedance.adsdk.LD.lc;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> Lxb = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> LD = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> lk = new CopyOnWriteArraySet();

    public void JXs() {
        Iterator<Animator.AnimatorPauseListener> it = this.lk.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    public void LD(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.LD) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void Lxb(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.LD) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    public void ZU() {
        Iterator<Animator.AnimatorPauseListener> it = this.lk.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.LD.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lk.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.Lxb.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void lk() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.Lxb.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.LD.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.Lxb.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.LD.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lk.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.Lxb.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void LD() {
        Iterator<Animator.AnimatorListener> it = this.LD.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    public void Lxb() {
        Iterator<Animator.AnimatorListener> it = this.LD.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }
}
