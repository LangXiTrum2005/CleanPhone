package acaudal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;
import com.unity3d.services.UnityAdsConstants;
import molet.formularize;
import molet.impassible;
import molet.taiyuan;
import phrasemonger.wireman;

/* JADX INFO: compiled from: LoadingIndicatorAnimatorDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f3246attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public LoadingIndicatorSpec f3247beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public acaudal.saneness f3248competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f3249dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public acaudal.dern.attabal f3250impromptu = new acaudal.dern.attabal();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public formularize f3251marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f3252saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ObjectAnimator f3253wireman;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final Property<attabal, Float> f3245taiyuan = new saneness(Float.class, "animationFraction");

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final taiyuan<attabal> f3244cutely = new dern("morphFactor");

    /* JADX INFO: renamed from: acaudal.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoadingIndicatorAnimatorDelegate.java */
    public class C0000attabal extends AnimatorListenerAdapter {
        public C0000attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            attabal.this.f3251marial.graveside(attabal.attabal(attabal.this));
        }
    }

    /* JADX INFO: compiled from: LoadingIndicatorAnimatorDelegate.java */
    public class dern extends taiyuan<attabal> {
        public dern(String str) {
            super(str);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(attabal attabalVar) {
            return attabalVar.competently();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(attabal attabalVar, float f) {
            attabalVar.impassible(f);
        }
    }

    /* JADX INFO: compiled from: LoadingIndicatorAnimatorDelegate.java */
    public class saneness extends Property<attabal, Float> {
        public saneness(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(attabal attabalVar) {
            return Float.valueOf(attabalVar.beachfront());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(attabal attabalVar, Float f) {
            attabalVar.formularize(f.floatValue());
        }
    }

    public attabal(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f3247beachfront = loadingIndicatorSpec;
    }

    public static /* synthetic */ int attabal(attabal attabalVar) {
        int i = attabalVar.f3246attabal + 1;
        attabalVar.f3246attabal = i;
        return i;
    }

    public void apical() {
        this.f3246attabal = 1;
        impassible(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f3250impromptu.f3260attabal = this.f3247beachfront.f20546marial[0];
    }

    public final void arytenoidectomy() {
        acaudal.dern.attabal attabalVar = this.f3250impromptu;
        attabalVar.f3262saneness = this.f3249dern;
        int i = this.f3246attabal - 1;
        int[] iArr = this.f3247beachfront.f20546marial;
        int length = i % iArr.length;
        attabalVar.f3260attabal = wireman.saneness().evaluate(achondroplasia.attabal.attabal(this.f3249dern - (this.f3246attabal - 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
    }

    public final float beachfront() {
        return this.f3252saneness;
    }

    public final float competently() {
        return this.f3249dern;
    }

    public void cutely(acaudal.saneness sanenessVar) {
        this.f3248competently = sanenessVar;
    }

    public void formularize(float f) {
        this.f3252saneness = f;
        kowloon((int) (f * 650.0f));
        acaudal.saneness sanenessVar = this.f3248competently;
        if (sanenessVar != null) {
            sanenessVar.invalidateSelf();
        }
    }

    public void impassible(float f) {
        this.f3249dern = f;
        arytenoidectomy();
        acaudal.saneness sanenessVar = this.f3248competently;
        if (sanenessVar != null) {
            sanenessVar.invalidateSelf();
        }
    }

    public void impromptu() {
        apical();
    }

    public final void kowloon(int i) {
        float f = this.f3246attabal - 1;
        float f2 = this.f3249dern - f;
        float f3 = i / 650.0f;
        if (f3 == 1.0f) {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.f3250impromptu.f3261dern = (((f * 140.0f) + (f3 * 50.0f)) + (f2 * 90.0f)) % 360.0f;
    }

    public void marial() {
        ObjectAnimator objectAnimator = this.f3253wireman;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        formularize formularizeVar = this.f3251marial;
        if (formularizeVar != null) {
            formularizeVar.preprohormone();
        }
    }

    public final void taiyuan() {
        if (this.f3251marial == null) {
            this.f3251marial = new formularize(this, f3244cutely).rotuma(new impassible().impromptu(200.0f).beachfront(0.6f)).formularize(0.01f);
        }
        if (this.f3253wireman == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f3245taiyuan, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f3253wireman = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(650L);
            this.f3253wireman.setInterpolator(null);
            this.f3253wireman.setRepeatCount(-1);
            this.f3253wireman.addListener(new C0000attabal());
        }
    }

    public void triweekly() {
        taiyuan();
        apical();
        this.f3251marial.graveside(this.f3246attabal);
        this.f3253wireman.start();
    }
}
