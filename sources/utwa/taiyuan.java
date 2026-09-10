package utwa;

import android.view.Choreographer;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: LottieValueAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan extends dern implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public com.airbnb.lottie.impromptu f39267cord;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f39273polloi = 1.0f;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f39272molybdenite = false;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f39271graveside = 0;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public float f39266adultoid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public float f39269dovishness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f39270gintrap = 0;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f39275rotuma = -2.1474836E9f;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public float f39274preprohormone = 2.1474836E9f;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public boolean f39268cuirassed = false;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public boolean f39276stratoscope = false;

    public void adultoid() {
        rotuma();
        wireman();
    }

    public void apical() {
        this.f39267cord = null;
        this.f39275rotuma = -2.1474836E9f;
        this.f39274preprohormone = 2.1474836E9f;
    }

    @Override // utwa.dern
    public void attabal() {
        super.attabal();
        dern(graveside());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        attabal();
        rotuma();
    }

    public void cord() {
        this.f39268cuirassed = true;
        gintrap();
        this.f39271graveside = 0L;
        if (graveside() && triweekly() == polloi()) {
            trm(monoploid());
        } else if (!graveside() && triweekly() == monoploid()) {
            trm(polloi());
        }
        beachfront();
    }

    public void cuirassed() {
        supplicat(-molybdenite());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        gintrap();
        if (this.f39267cord == null || !isRunning()) {
            return;
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("LottieValueAnimator#doFrame");
        }
        long j2 = this.f39271graveside;
        float fKowloon = (j2 != 0 ? j - j2 : 0L) / kowloon();
        float f = this.f39266adultoid;
        if (graveside()) {
            fKowloon = -fKowloon;
        }
        float f2 = f + fKowloon;
        boolean zWireman = apical.wireman(f2, polloi(), monoploid());
        float f3 = this.f39266adultoid;
        float fSaneness = apical.saneness(f2, polloi(), monoploid());
        this.f39266adultoid = fSaneness;
        if (this.f39276stratoscope) {
            fSaneness = (float) Math.floor(fSaneness);
        }
        this.f39269dovishness = fSaneness;
        this.f39271graveside = j;
        if (zWireman) {
            taiyuan(f3);
        } else if (getRepeatCount() == -1 || this.f39270gintrap < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f39272molybdenite = !this.f39272molybdenite;
                cuirassed();
            } else {
                float fMonoploid = graveside() ? monoploid() : polloi();
                this.f39266adultoid = fMonoploid;
                this.f39269dovishness = fMonoploid;
            }
            this.f39271graveside = j;
            taiyuan(f3);
            marial();
            this.f39270gintrap++;
        } else {
            float fPolloi = this.f39273polloi < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? polloi() : monoploid();
            this.f39266adultoid = fPolloi;
            this.f39269dovishness = fPolloi;
            rotuma();
            taiyuan(f3);
            dern(graveside());
        }
        merc();
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("LottieValueAnimator#doFrame");
        }
    }

    public void dovishness() {
        this.f39268cuirassed = true;
        competently(graveside());
        trm((int) (graveside() ? monoploid() : polloi()));
        this.f39271graveside = 0L;
        this.f39270gintrap = 0;
        gintrap();
    }

    public void formularize() {
        rotuma();
        dern(graveside());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fPolloi;
        float fMonoploid;
        float fPolloi2;
        if (this.f39267cord == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (graveside()) {
            fPolloi = monoploid() - this.f39269dovishness;
            fMonoploid = monoploid();
            fPolloi2 = polloi();
        } else {
            fPolloi = this.f39269dovishness - polloi();
            fMonoploid = monoploid();
            fPolloi2 = polloi();
        }
        return fPolloi / (fMonoploid - fPolloi2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(impassible());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.impromptu impromptuVar = this.f39267cord;
        if (impromptuVar == null) {
            return 0L;
        }
        return (long) impromptuVar.wireman();
    }

    public void gintrap() {
        if (isRunning()) {
            preprohormone(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final boolean graveside() {
        return molybdenite() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float impassible() {
        com.airbnb.lottie.impromptu impromptuVar = this.f39267cord;
        return impromptuVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.f39269dovishness - impromptuVar.arytenoidectomy()) / (this.f39267cord.beachfront() - this.f39267cord.arytenoidectomy());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f39268cuirassed;
    }

    public final float kowloon() {
        com.airbnb.lottie.impromptu impromptuVar = this.f39267cord;
        if (impromptuVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / impromptuVar.taiyuan()) / Math.abs(this.f39273polloi);
    }

    public final void merc() {
        if (this.f39267cord == null) {
            return;
        }
        float f = this.f39269dovishness;
        if (f < this.f39275rotuma || f > this.f39274preprohormone) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f39275rotuma), Float.valueOf(this.f39274preprohormone), Float.valueOf(this.f39269dovishness)));
        }
    }

    public float molybdenite() {
        return this.f39273polloi;
    }

    public float monoploid() {
        com.airbnb.lottie.impromptu impromptuVar = this.f39267cord;
        if (impromptuVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.f39274preprohormone;
        return f == 2.1474836E9f ? impromptuVar.beachfront() : f;
    }

    public void oilcan(float f) {
        yemenite(this.f39275rotuma, f);
    }

    public float polloi() {
        com.airbnb.lottie.impromptu impromptuVar = this.f39267cord;
        if (impromptuVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.f39275rotuma;
        return f == -2.1474836E9f ? impromptuVar.arytenoidectomy() : f;
    }

    public void preprohormone(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f39268cuirassed = false;
        }
    }

    public void restrictive(boolean z) {
        this.f39276stratoscope = z;
    }

    public void rotuma() {
        preprohormone(true);
    }

    public void sealless(int i) {
        yemenite(i, (int) this.f39274preprohormone);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f39272molybdenite) {
            return;
        }
        this.f39272molybdenite = false;
        cuirassed();
    }

    public void stratoscope(com.airbnb.lottie.impromptu impromptuVar) {
        boolean z = this.f39267cord == null;
        this.f39267cord = impromptuVar;
        if (z) {
            yemenite(Math.max(this.f39275rotuma, impromptuVar.arytenoidectomy()), Math.min(this.f39274preprohormone, impromptuVar.beachfront()));
        } else {
            yemenite((int) impromptuVar.arytenoidectomy(), (int) impromptuVar.beachfront());
        }
        float f = this.f39269dovishness;
        this.f39269dovishness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f39266adultoid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        trm((int) f);
        impromptu();
    }

    public void supplicat(float f) {
        this.f39273polloi = f;
    }

    public final void taiyuan(float f) {
        if (this.f39276stratoscope && this.f39266adultoid == f) {
            return;
        }
        impromptu();
    }

    public float triweekly() {
        return this.f39269dovishness;
    }

    public void trm(float f) {
        if (this.f39266adultoid == f) {
            return;
        }
        float fSaneness = apical.saneness(f, polloi(), monoploid());
        this.f39266adultoid = fSaneness;
        if (this.f39276stratoscope) {
            fSaneness = (float) Math.floor(fSaneness);
        }
        this.f39269dovishness = fSaneness;
        this.f39271graveside = 0L;
        impromptu();
    }

    public void yemenite(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        com.airbnb.lottie.impromptu impromptuVar = this.f39267cord;
        float fArytenoidectomy = impromptuVar == null ? -3.4028235E38f : impromptuVar.arytenoidectomy();
        com.airbnb.lottie.impromptu impromptuVar2 = this.f39267cord;
        float fBeachfront = impromptuVar2 == null ? Float.MAX_VALUE : impromptuVar2.beachfront();
        float fSaneness = apical.saneness(f, fArytenoidectomy, fBeachfront);
        float fSaneness2 = apical.saneness(f2, fArytenoidectomy, fBeachfront);
        if (fSaneness == this.f39275rotuma && fSaneness2 == this.f39274preprohormone) {
            return;
        }
        this.f39275rotuma = fSaneness;
        this.f39274preprohormone = fSaneness2;
        trm((int) apical.saneness(this.f39269dovishness, fSaneness, fSaneness2));
    }
}
