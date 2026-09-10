package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: CircularIndeterminateRetreatAnimatorDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial extends apical<ObjectAnimator> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final com.google.android.material.progressindicator.saneness f20730beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f20731competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public weimar.saneness f20732cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ObjectAnimator f20733dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f20734impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final TimeInterpolator f20735marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f20736taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ObjectAnimator f20737wireman;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final TimeInterpolator f20725apical = phrasemonger.saneness.f35310saneness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final int[] f20726formularize = {0, 1500, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 4500};

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final float[] f20727impassible = {0.1f, 0.87f};

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final Property<marial, Float> f20729triweekly = new dern(Float.class, "animationFraction");

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final Property<marial, Float> f20728kowloon = new wireman(Float.class, "completeEndFraction");

    /* JADX INFO: compiled from: CircularIndeterminateRetreatAnimatorDelegate.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            marial marialVar = marial.this;
            marialVar.f20731competently = (marialVar.f20731competently + marial.f20726formularize.length) % marial.this.f20730beachfront.f20749marial.length;
        }
    }

    /* JADX INFO: compiled from: CircularIndeterminateRetreatAnimatorDelegate.java */
    public class dern extends Property<marial, Float> {
        public dern(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(marial marialVar) {
            return Float.valueOf(marialVar.arytenoidectomy());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(marial marialVar, Float f) {
            marialVar.adultoid(f.floatValue());
        }
    }

    /* JADX INFO: compiled from: CircularIndeterminateRetreatAnimatorDelegate.java */
    public class saneness extends AnimatorListenerAdapter {
        public saneness() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            marial.this.attabal();
            marial marialVar = marial.this;
            weimar.saneness sanenessVar = marialVar.f20732cutely;
            if (sanenessVar != null) {
                sanenessVar.saneness(marialVar.f20653attabal);
            }
        }
    }

    /* JADX INFO: compiled from: CircularIndeterminateRetreatAnimatorDelegate.java */
    public class wireman extends Property<marial, Float> {
        public wireman(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(marial marialVar) {
            return Float.valueOf(marialVar.monoploid());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(marial marialVar, Float f) {
            marialVar.dovishness(f.floatValue());
        }
    }

    public marial(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f20731competently = 0;
        this.f20732cutely = null;
        this.f20730beachfront = circularProgressIndicatorSpec;
        this.f20735marial = gown.apical.competently(context, bubbles.dern.motionEasingStandardInterpolator, f20725apical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float arytenoidectomy() {
        return this.f20734impromptu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dovishness(float f) {
        this.f20736taiyuan = f;
    }

    private void gintrap() {
        polloi();
        this.f20733dern.setDuration((long) (this.f20730beachfront.f20752triweekly * 6000.0f));
        this.f20737wireman.setDuration((long) (this.f20730beachfront.f20752triweekly * 500.0f));
    }

    private void molybdenite(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f20726formularize;
            if (i2 >= iArr.length) {
                return;
            }
            float fSaneness = saneness(i, iArr[i2], 100);
            if (fSaneness >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fSaneness <= 1.0f) {
                int i3 = i2 + this.f20731competently;
                int[] iArr2 = this.f20730beachfront.f20749marial;
                int length = i3 % iArr2.length;
                int length2 = (length + 1) % iArr2.length;
                int i4 = iArr2[length];
                int i5 = iArr2[length2];
                this.f20654saneness.get(0).f20666dern = phrasemonger.wireman.saneness().evaluate(this.f20735marial.getInterpolation(fSaneness), Integer.valueOf(i4), Integer.valueOf(i5)).intValue();
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float monoploid() {
        return this.f20736taiyuan;
    }

    private void polloi() {
        if (this.f20733dern == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f20729triweekly, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20733dern = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f20730beachfront.f20752triweekly * 6000.0f));
            this.f20733dern.setInterpolator(null);
            this.f20733dern.setRepeatCount(-1);
            this.f20733dern.addListener(new attabal());
        }
        if (this.f20737wireman == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f20728kowloon, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20737wireman = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f20730beachfront.f20752triweekly * 500.0f));
            this.f20737wireman.addListener(new saneness());
        }
    }

    private void rotuma(int i) {
        cutely.attabal attabalVar = this.f20654saneness.get(0);
        float f = this.f20734impromptu * 1080.0f;
        float interpolation = 0.0f;
        for (int i2 : f20726formularize) {
            interpolation += this.f20735marial.getInterpolation(saneness(i, i2, 500)) * 90.0f;
        }
        attabalVar.f20665competently = f + interpolation;
        float interpolation2 = this.f20735marial.getInterpolation(saneness(i, 0, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED)) - this.f20735marial.getInterpolation(saneness(i, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
        attabalVar.f20663attabal = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float[] fArr = f20727impassible;
        float fBeachfront = othin.attabal.beachfront(fArr[0], fArr[1], interpolation2);
        attabalVar.f20669saneness = fBeachfront;
        float f2 = this.f20736taiyuan;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            attabalVar.f20669saneness = fBeachfront * (1.0f - f2);
        }
    }

    public void adultoid(float f) {
        this.f20734impromptu = f;
        int i = (int) (f * 6000.0f);
        rotuma(i);
        molybdenite(i);
        this.f20653attabal.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void attabal() {
        ObjectAnimator objectAnimator = this.f20733dern;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.apical
    public void beachfront() {
        ObjectAnimator objectAnimator = this.f20737wireman;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f20653attabal.isVisible()) {
            this.f20737wireman.start();
        } else {
            attabal();
        }
    }

    @Override // com.google.android.material.progressindicator.apical
    public void competently() {
        polloi();
        graveside();
        this.f20733dern.start();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void dern() {
        gintrap();
        graveside();
    }

    public void graveside() {
        this.f20731competently = 0;
        this.f20654saneness.get(0).f20666dern = this.f20730beachfront.f20749marial[0];
        this.f20736taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.material.progressindicator.apical
    public void impromptu() {
        this.f20732cutely = null;
    }

    @Override // com.google.android.material.progressindicator.apical
    public void wireman(weimar.saneness sanenessVar) {
        this.f20732cutely = sanenessVar;
    }
}
