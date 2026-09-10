package phrasemonger;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: compiled from: MotionTiming.java */
/* JADX INFO: loaded from: classes3.dex */
public class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public long f35298attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public TimeInterpolator f35299dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f35300marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public long f35301saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f35302wireman;

    public cutely(long j, long j2) {
        this.f35299dern = null;
        this.f35302wireman = 0;
        this.f35300marial = 1;
        this.f35298attabal = j;
        this.f35301saneness = j2;
    }

    public static cutely saneness(ValueAnimator valueAnimator) {
        cutely cutelyVar = new cutely(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        cutelyVar.f35302wireman = valueAnimator.getRepeatCount();
        cutelyVar.f35300marial = valueAnimator.getRepeatMode();
        return cutelyVar;
    }

    public void attabal(Animator animator) {
        animator.setStartDelay(dern());
        animator.setDuration(wireman());
        animator.setInterpolator(marial());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(beachfront());
            valueAnimator.setRepeatMode(competently());
        }
    }

    public int beachfront() {
        return this.f35302wireman;
    }

    public int competently() {
        return this.f35300marial;
    }

    public long dern() {
        return this.f35298attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cutely)) {
            return false;
        }
        cutely cutelyVar = (cutely) obj;
        if (dern() == cutelyVar.dern() && wireman() == cutelyVar.wireman() && beachfront() == cutelyVar.beachfront() && competently() == cutelyVar.competently()) {
            return marial().getClass().equals(cutelyVar.marial().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (dern() ^ (dern() >>> 32))) * 31) + ((int) (wireman() ^ (wireman() >>> 32)))) * 31) + marial().getClass().hashCode()) * 31) + beachfront()) * 31) + competently();
    }

    public TimeInterpolator marial() {
        TimeInterpolator timeInterpolator = this.f35299dern;
        return timeInterpolator != null ? timeInterpolator : saneness.f35310saneness;
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + dern() + " duration: " + wireman() + " interpolator: " + marial().getClass() + " repeatCount: " + beachfront() + " repeatMode: " + competently() + "}\n";
    }

    public long wireman() {
        return this.f35301saneness;
    }

    public cutely(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f35302wireman = 0;
        this.f35300marial = 1;
        this.f35298attabal = j;
        this.f35301saneness = j2;
        this.f35299dern = timeInterpolator;
    }
}
