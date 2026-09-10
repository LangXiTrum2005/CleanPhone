package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class triweekly extends apical<ObjectAnimator> {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final Property<triweekly, Float> f20773taiyuan = new saneness(Float.class, "animationFraction");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f20774beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f20775competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ObjectAnimator f20776dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f20777impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final com.google.android.material.progressindicator.saneness f20778marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public fastrack.saneness f20779wireman;

    /* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            triweekly triweeklyVar = triweekly.this;
            triweeklyVar.f20774beachfront = (triweeklyVar.f20774beachfront + 1) % triweekly.this.f20778marial.f20749marial.length;
            triweekly.this.f20775competently = true;
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    public class saneness extends Property<triweekly, Float> {
        public saneness(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(triweekly triweeklyVar) {
            return Float.valueOf(triweeklyVar.triweekly());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(triweekly triweeklyVar, Float f) {
            triweeklyVar.polloi(f.floatValue());
        }
    }

    public triweekly(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f20774beachfront = 1;
        this.f20778marial = linearProgressIndicatorSpec;
        this.f20779wireman = new fastrack.saneness();
    }

    private void graveside(int i) {
        this.f20654saneness.get(0).f20663attabal = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fSaneness = saneness(i, 0, 667);
        cutely.attabal attabalVar = this.f20654saneness.get(0);
        cutely.attabal attabalVar2 = this.f20654saneness.get(1);
        float interpolation = this.f20779wireman.getInterpolation(fSaneness);
        attabalVar2.f20663attabal = interpolation;
        attabalVar.f20669saneness = interpolation;
        cutely.attabal attabalVar3 = this.f20654saneness.get(1);
        cutely.attabal attabalVar4 = this.f20654saneness.get(2);
        float interpolation2 = this.f20779wireman.getInterpolation(fSaneness + 0.49925038f);
        attabalVar4.f20663attabal = interpolation2;
        attabalVar3.f20669saneness = interpolation2;
        this.f20654saneness.get(2).f20669saneness = 1.0f;
    }

    private void kowloon() {
        if (this.f20776dern == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f20773taiyuan, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20776dern = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f20778marial.f20752triweekly * 333.0f));
            this.f20776dern.setInterpolator(null);
            this.f20776dern.setRepeatCount(-1);
            this.f20776dern.addListener(new attabal());
        }
    }

    private void molybdenite() {
        kowloon();
        this.f20776dern.setDuration((long) (this.f20778marial.f20752triweekly * 333.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float triweekly() {
        return this.f20777impromptu;
    }

    public final void arytenoidectomy() {
        if (!this.f20775competently || this.f20654saneness.get(1).f20669saneness >= 1.0f) {
            return;
        }
        this.f20654saneness.get(2).f20666dern = this.f20654saneness.get(1).f20666dern;
        this.f20654saneness.get(1).f20666dern = this.f20654saneness.get(0).f20666dern;
        this.f20654saneness.get(0).f20666dern = this.f20778marial.f20749marial[this.f20774beachfront];
        this.f20775competently = false;
    }

    @Override // com.google.android.material.progressindicator.apical
    public void attabal() {
        ObjectAnimator objectAnimator = this.f20776dern;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.apical
    public void competently() {
        kowloon();
        monoploid();
        this.f20776dern.start();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void dern() {
        molybdenite();
        monoploid();
    }

    public void monoploid() {
        this.f20775competently = true;
        this.f20774beachfront = 1;
        for (cutely.attabal attabalVar : this.f20654saneness) {
            com.google.android.material.progressindicator.saneness sanenessVar = this.f20778marial;
            attabalVar.f20666dern = sanenessVar.f20749marial[0];
            attabalVar.f20670wireman = sanenessVar.f20751taiyuan / 2;
        }
    }

    public void polloi(float f) {
        this.f20777impromptu = f;
        graveside((int) (f * 333.0f));
        arytenoidectomy();
        this.f20653attabal.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void beachfront() {
    }

    @Override // com.google.android.material.progressindicator.apical
    public void impromptu() {
    }

    @Override // com.google.android.material.progressindicator.apical
    public void wireman(weimar.saneness sanenessVar) {
    }
}
