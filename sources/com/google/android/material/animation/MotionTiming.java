package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.media.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class MotionTiming {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19088a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f19090c = null;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19091e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19089b = 150;

    public MotionTiming(long j) {
        this.f19088a = j;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f19088a);
        animator.setDuration(this.f19089b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.f19091e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f19090c;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.f19079b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (this.f19088a == motionTiming.f19088a && this.f19089b == motionTiming.f19089b && this.d == motionTiming.d && this.f19091e == motionTiming.f19091e) {
            return b().getClass().equals(motionTiming.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19088a;
        long j2 = this.f19089b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.f19091e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(getClass().getName());
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f19088a);
        sb.append(" duration: ");
        sb.append(this.f19089b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return a.i(this.f19091e, "}\n", sb);
    }
}
