package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kowloon extends apical<ObjectAnimator> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final int[] f20712apical = {533, 567, 850, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS};

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final int[] f20713formularize = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final Property<kowloon, Float> f20714impassible = new dern(Float.class, "animationFraction");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final com.google.android.material.progressindicator.saneness f20715beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f20716competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public weimar.saneness f20717cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ObjectAnimator f20718dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f20719impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Interpolator[] f20720marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f20721taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ObjectAnimator f20722wireman;

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            kowloon kowloonVar = kowloon.this;
            kowloonVar.f20716competently = (kowloonVar.f20716competently + 1) % kowloon.this.f20715beachfront.f20749marial.length;
            kowloon.this.f20719impromptu = true;
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class dern extends Property<kowloon, Float> {
        public dern(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(kowloon kowloonVar) {
            return Float.valueOf(kowloonVar.triweekly());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(kowloon kowloonVar, Float f) {
            kowloonVar.polloi(f.floatValue());
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class saneness extends AnimatorListenerAdapter {
        public saneness() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            kowloon.this.attabal();
            kowloon kowloonVar = kowloon.this;
            weimar.saneness sanenessVar = kowloonVar.f20717cutely;
            if (sanenessVar != null) {
                sanenessVar.saneness(kowloonVar.f20653attabal);
            }
        }
    }

    public kowloon(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f20716competently = 0;
        this.f20717cutely = null;
        this.f20715beachfront = linearProgressIndicatorSpec;
        this.f20720marial = new Interpolator[]{weimar.wireman.attabal(context, bubbles.attabal.linear_indeterminate_line1_head_interpolator), weimar.wireman.attabal(context, bubbles.attabal.linear_indeterminate_line1_tail_interpolator), weimar.wireman.attabal(context, bubbles.attabal.linear_indeterminate_line2_head_interpolator), weimar.wireman.attabal(context, bubbles.attabal.linear_indeterminate_line2_tail_interpolator)};
    }

    private void arytenoidectomy() {
        if (this.f20719impromptu) {
            Iterator<cutely.attabal> it = this.f20654saneness.iterator();
            while (it.hasNext()) {
                it.next().f20666dern = this.f20715beachfront.f20749marial[this.f20716competently];
            }
            this.f20719impromptu = false;
        }
    }

    private void graveside(int i) {
        for (int i2 = 0; i2 < this.f20654saneness.size(); i2++) {
            cutely.attabal attabalVar = this.f20654saneness.get(i2);
            int[] iArr = f20713formularize;
            int i3 = i2 * 2;
            int i4 = iArr[i3];
            int[] iArr2 = f20712apical;
            attabalVar.f20663attabal = achondroplasia.attabal.attabal(this.f20720marial[i3].getInterpolation(saneness(i, i4, iArr2[i3])), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            int i5 = i3 + 1;
            attabalVar.f20669saneness = achondroplasia.attabal.attabal(this.f20720marial[i5].getInterpolation(saneness(i, iArr[i5], iArr2[i5])), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        }
    }

    private void kowloon() {
        if (this.f20718dern == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f20714impassible, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20718dern = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f20715beachfront.f20752triweekly * 1800.0f));
            this.f20718dern.setInterpolator(null);
            this.f20718dern.setRepeatCount(-1);
            this.f20718dern.addListener(new attabal());
        }
        if (this.f20722wireman == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f20714impassible, 1.0f);
            this.f20722wireman = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f20715beachfront.f20752triweekly * 1800.0f));
            this.f20722wireman.setInterpolator(null);
            this.f20722wireman.addListener(new saneness());
        }
    }

    private void molybdenite() {
        kowloon();
        this.f20718dern.setDuration((long) (this.f20715beachfront.f20752triweekly * 1800.0f));
        this.f20722wireman.setDuration((long) (this.f20715beachfront.f20752triweekly * 1800.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float triweekly() {
        return this.f20721taiyuan;
    }

    @Override // com.google.android.material.progressindicator.apical
    public void attabal() {
        ObjectAnimator objectAnimator = this.f20718dern;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.apical
    public void beachfront() {
        ObjectAnimator objectAnimator = this.f20722wireman;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        attabal();
        if (this.f20653attabal.isVisible()) {
            this.f20722wireman.setFloatValues(this.f20721taiyuan, 1.0f);
            this.f20722wireman.setDuration((long) ((1.0f - this.f20721taiyuan) * 1800.0f));
            this.f20722wireman.start();
        }
    }

    @Override // com.google.android.material.progressindicator.apical
    public void competently() {
        kowloon();
        monoploid();
        this.f20718dern.start();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void dern() {
        molybdenite();
        monoploid();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void impromptu() {
        this.f20717cutely = null;
    }

    public void monoploid() {
        this.f20716competently = 0;
        Iterator<cutely.attabal> it = this.f20654saneness.iterator();
        while (it.hasNext()) {
            it.next().f20666dern = this.f20715beachfront.f20749marial[0];
        }
    }

    public void polloi(float f) {
        this.f20721taiyuan = f;
        graveside((int) (f * 1800.0f));
        arytenoidectomy();
        this.f20653attabal.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.apical
    public void wireman(weimar.saneness sanenessVar) {
        this.f20717cutely = sanenessVar;
    }
}
