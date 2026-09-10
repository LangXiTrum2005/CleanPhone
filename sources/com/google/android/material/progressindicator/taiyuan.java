package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class taiyuan extends Drawable implements Animatable {

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final Property<taiyuan, Float> f20754yemenite = new dern(Float.class, "growFraction");

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f20755adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final com.google.android.material.progressindicator.saneness f20756arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f20757cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public float f20758cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public float f20759dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f20761graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f20762kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public ValueAnimator f20763molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ValueAnimator f20766polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public weimar.saneness f20767preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public List<weimar.saneness> f20768rotuma;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public int f20770trm;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public float f20760gintrap = -1.0f;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final Paint f20769stratoscope = new Paint();

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public Rect f20765oilcan = new Rect();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public com.google.android.material.progressindicator.attabal f20764monoploid = new com.google.android.material.progressindicator.attabal();

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            taiyuan.this.beachfront();
        }
    }

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class dern extends Property<taiyuan, Float> {
        public dern(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(taiyuan taiyuanVar) {
            return Float.valueOf(taiyuanVar.impromptu());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(taiyuan taiyuanVar, Float f) {
            taiyuanVar.arytenoidectomy(f.floatValue());
        }
    }

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class saneness extends AnimatorListenerAdapter {
        public saneness() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            taiyuan.super.setVisible(false, false);
            taiyuan.this.marial();
        }
    }

    public taiyuan(Context context, com.google.android.material.progressindicator.saneness sanenessVar) {
        this.f20762kowloon = context;
        this.f20756arytenoidectomy = sanenessVar;
        setAlpha(255);
    }

    public boolean adultoid(weimar.saneness sanenessVar) {
        List<weimar.saneness> list = this.f20768rotuma;
        if (list == null || !list.contains(sanenessVar)) {
            return false;
        }
        this.f20768rotuma.remove(sanenessVar);
        if (!this.f20768rotuma.isEmpty()) {
            return true;
        }
        this.f20768rotuma = null;
        return true;
    }

    public final boolean apical() {
        return this instanceof impromptu;
    }

    public void arytenoidectomy(float f) {
        if (this.f20758cuirassed != f) {
            this.f20758cuirassed = f;
            invalidateSelf();
        }
    }

    public final void beachfront() {
        weimar.saneness sanenessVar = this.f20767preprohormone;
        if (sanenessVar != null) {
            sanenessVar.dern(this);
        }
        List<weimar.saneness> list = this.f20768rotuma;
        if (list == null || this.f20757cord) {
            return;
        }
        Iterator<weimar.saneness> it = list.iterator();
        while (it.hasNext()) {
            it.next().dern(this);
        }
    }

    public final void competently(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f20757cord;
        this.f20757cord = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f20757cord = z;
    }

    public boolean cutely() {
        return molybdenite(false, false, false);
    }

    public boolean formularize() {
        ValueAnimator valueAnimator = this.f20763molybdenite;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f20755adultoid;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20770trm;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean graveside(boolean z, boolean z2, boolean z3) {
        triweekly();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.f20766polloi : this.f20763molybdenite;
        ValueAnimator valueAnimator2 = z ? this.f20763molybdenite : this.f20766polloi;
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                wireman(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                competently(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.f20756arytenoidectomy.wireman() : this.f20756arytenoidectomy.dern())) {
            competently(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z4;
        }
        valueAnimator.resume();
        return z4;
    }

    public boolean impassible() {
        ValueAnimator valueAnimator = this.f20766polloi;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f20761graveside;
    }

    public float impromptu() {
        if (this.f20756arytenoidectomy.wireman() || this.f20756arytenoidectomy.dern()) {
            return (this.f20755adultoid || this.f20761graveside) ? this.f20759dovishness : this.f20758cuirassed;
        }
        return 1.0f;
    }

    public boolean isRunning() {
        return impassible() || formularize();
    }

    public void kowloon(weimar.saneness sanenessVar) {
        if (this.f20768rotuma == null) {
            this.f20768rotuma = new ArrayList();
        }
        if (this.f20768rotuma.contains(sanenessVar)) {
            return;
        }
        this.f20768rotuma.add(sanenessVar);
    }

    public final void marial() {
        weimar.saneness sanenessVar = this.f20767preprohormone;
        if (sanenessVar != null) {
            sanenessVar.saneness(this);
        }
        List<weimar.saneness> list = this.f20768rotuma;
        if (list == null || this.f20757cord) {
            return;
        }
        Iterator<weimar.saneness> it = list.iterator();
        while (it.hasNext()) {
            it.next().saneness(this);
        }
    }

    public boolean molybdenite(boolean z, boolean z2, boolean z3) {
        return graveside(z, z2, z3 && this.f20764monoploid.attabal(this.f20762kowloon.getContentResolver()) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void monoploid(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f20763molybdenite;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f20763molybdenite = valueAnimator;
        valueAnimator.addListener(new saneness());
    }

    public final void polloi(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f20766polloi;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f20766polloi = valueAnimator;
        valueAnimator.addListener(new attabal());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f20770trm = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20769stratoscope.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return molybdenite(z, z2, true);
    }

    public void start() {
        graveside(true, true, false);
    }

    public void stop() {
        graveside(false, true, false);
    }

    public float taiyuan() {
        float f = this.f20760gintrap;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        if (this.f20756arytenoidectomy.saneness(apical()) && this.f20756arytenoidectomy.f20747impassible != 0) {
            float fAttabal = this.f20764monoploid.attabal(this.f20762kowloon.getContentResolver());
            if (fAttabal > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i = (int) ((((apical() ? this.f20756arytenoidectomy.f20744cutely : this.f20756arytenoidectomy.f20740apical) * 1000.0f) / this.f20756arytenoidectomy.f20747impassible) * fAttabal);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i)) / i;
                return fUptimeMillis < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void triweekly() {
        if (this.f20766polloi == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f20754yemenite, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20766polloi = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f20766polloi.setInterpolator(phrasemonger.saneness.f35310saneness);
            polloi(this.f20766polloi);
        }
        if (this.f20763molybdenite == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f20754yemenite, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f20763molybdenite = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f20763molybdenite.setInterpolator(phrasemonger.saneness.f35310saneness);
            monoploid(this.f20763molybdenite);
        }
    }

    public final void wireman(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f20757cord;
        this.f20757cord = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f20757cord = z;
    }
}
