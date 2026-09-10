package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: CircularIndeterminateAdvanceAnimatorDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman extends apical<ObjectAnimator> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final com.google.android.material.progressindicator.saneness f20786beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f20787competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public weimar.saneness f20788cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ObjectAnimator f20789dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f20790impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final fastrack.saneness f20791marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f20792taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ObjectAnimator f20793wireman;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final int[] f20781apical = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final int[] f20782formularize = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final int[] f20783impassible = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final Property<wireman, Float> f20785triweekly = new dern(Float.class, "animationFraction");

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final Property<wireman, Float> f20784kowloon = new C0304wireman(Float.class, "completeEndFraction");

    /* JADX INFO: compiled from: CircularIndeterminateAdvanceAnimatorDelegate.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            wireman wiremanVar = wireman.this;
            wiremanVar.f20787competently = (wiremanVar.f20787competently + 4) % wireman.this.f20786beachfront.f20749marial.length;
        }
    }

    /* JADX INFO: compiled from: CircularIndeterminateAdvanceAnimatorDelegate.java */
    public class dern extends Property<wireman, Float> {
        public dern(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(wireman wiremanVar) {
            return Float.valueOf(wiremanVar.kowloon());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(wireman wiremanVar, Float f) {
            wiremanVar.graveside(f.floatValue());
        }
    }

    /* JADX INFO: compiled from: CircularIndeterminateAdvanceAnimatorDelegate.java */
    public class saneness extends AnimatorListenerAdapter {
        public saneness() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            wireman.this.attabal();
            wireman wiremanVar = wireman.this;
            weimar.saneness sanenessVar = wiremanVar.f20788cutely;
            if (sanenessVar != null) {
                sanenessVar.saneness(wiremanVar.f20653attabal);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularIndeterminateAdvanceAnimatorDelegate.java */
    public class C0304wireman extends Property<wireman, Float> {
        public C0304wireman(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(wireman wiremanVar) {
            return Float.valueOf(wiremanVar.arytenoidectomy());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(wireman wiremanVar, Float f) {
            wiremanVar.adultoid(f.floatValue());
        }
    }

    public wireman(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f20787competently = 0;
        this.f20788cutely = null;
        this.f20786beachfront = circularProgressIndicatorSpec;
        this.f20791marial = new fastrack.saneness();
    }

    public final void adultoid(float f) {
        this.f20792taiyuan = f;
    }

    public final float arytenoidectomy() {
        return this.f20792taiyuan;
    }

    @Override // com.google.android.material.progressindicator.apical
    public void attabal() {
        ObjectAnimator objectAnimator = this.f20789dern;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.apical
    public void beachfront() {
        ObjectAnimator objectAnimator = this.f20793wireman;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f20653attabal.isVisible()) {
            this.f20793wireman.start();
        } else {
            attabal();
        }
    }

    @Override // com.google.android.material.progressindicator.apical
    public void competently() {
        monoploid();
        molybdenite();
        this.f20789dern.start();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void dern() {
        dovishness();
        molybdenite();
    }

    public final void dovishness() {
        monoploid();
        this.f20789dern.setDuration((long) (this.f20786beachfront.f20752triweekly * 5400.0f));
        this.f20793wireman.setDuration((long) (this.f20786beachfront.f20752triweekly * 333.0f));
    }

    public final void gintrap(int i) {
        cutely.attabal attabalVar = this.f20654saneness.get(0);
        float f = this.f20790impromptu;
        attabalVar.f20663attabal = (f * 1520.0f) - 20.0f;
        attabalVar.f20669saneness = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            attabalVar.f20669saneness += this.f20791marial.getInterpolation(saneness(i, f20781apical[i2], 667)) * 250.0f;
            attabalVar.f20663attabal += this.f20791marial.getInterpolation(saneness(i, f20782formularize[i2], 667)) * 250.0f;
        }
        float f2 = attabalVar.f20663attabal;
        float f3 = attabalVar.f20669saneness;
        attabalVar.f20663attabal = (f2 + ((f3 - f2) * this.f20792taiyuan)) / 360.0f;
        attabalVar.f20669saneness = f3 / 360.0f;
    }

    public void graveside(float f) {
        this.f20790impromptu = f;
        int i = (int) (f * 5400.0f);
        gintrap(i);
        polloi(i);
        this.f20653attabal.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void impromptu() {
        this.f20788cutely = null;
    }

    public final float kowloon() {
        return this.f20790impromptu;
    }

    public void molybdenite() {
        this.f20787competently = 0;
        this.f20654saneness.get(0).f20666dern = this.f20786beachfront.f20749marial[0];
        this.f20792taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void monoploid() {
        if (this.f20789dern == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f20785triweekly, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20789dern = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f20786beachfront.f20752triweekly * 5400.0f));
            this.f20789dern.setInterpolator(null);
            this.f20789dern.setRepeatCount(-1);
            this.f20789dern.addListener(new attabal());
        }
        if (this.f20793wireman == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f20784kowloon, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20793wireman = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f20786beachfront.f20752triweekly * 333.0f));
            this.f20793wireman.setInterpolator(this.f20791marial);
            this.f20793wireman.addListener(new saneness());
        }
    }

    public final void polloi(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float fSaneness = saneness(i, f20783impassible[i2], 333);
            if (fSaneness > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fSaneness < 1.0f) {
                int i3 = i2 + this.f20787competently;
                int[] iArr = this.f20786beachfront.f20749marial;
                int length = i3 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i4 = iArr[length];
                int i5 = iArr[length2];
                this.f20654saneness.get(0).f20666dern = phrasemonger.wireman.saneness().evaluate(this.f20791marial.getInterpolation(fSaneness), Integer.valueOf(i4), Integer.valueOf(i5)).intValue();
                return;
            }
        }
    }

    @Override // com.google.android.material.progressindicator.apical
    public void wireman(weimar.saneness sanenessVar) {
        this.f20788cutely = sanenessVar;
    }
}
