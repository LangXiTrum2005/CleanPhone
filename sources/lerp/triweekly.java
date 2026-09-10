package lerp;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: StopLogicEngine.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly implements impassible {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public String f32856apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f32858attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f32859beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f32860competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f32861cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f32862dern;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f32864impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f32865impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f32866kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f32867marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f32868saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f32869taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f32870triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f32871wireman;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f32863formularize = false;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f32857arytenoidectomy = false;

    @Override // lerp.impassible
    public float attabal() {
        return this.f32863formularize ? -marial(this.f32866kowloon) : marial(this.f32866kowloon);
    }

    public final void beachfront(float f, float f2, float f3, float f4, float f5) {
        this.f32857arytenoidectomy = false;
        this.f32869taiyuan = f2;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.0E-4f;
        }
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f32856apical = "backward accelerate, decelerate";
                this.f32861cutely = 2;
                this.f32858attabal = f;
                this.f32868saneness = fSqrt;
                this.f32862dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f8 = (fSqrt - f) / f3;
                this.f32871wireman = f8;
                this.f32867marial = fSqrt / f3;
                this.f32860competently = ((f + fSqrt) * f8) / 2.0f;
                this.f32865impromptu = f2;
                this.f32869taiyuan = f2;
                return;
            }
            this.f32856apical = "backward accelerate cruse decelerate";
            this.f32861cutely = 3;
            this.f32858attabal = f;
            this.f32868saneness = f4;
            this.f32862dern = f4;
            float f9 = (f4 - f) / f3;
            this.f32871wireman = f9;
            float f10 = f4 / f3;
            this.f32859beachfront = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f32867marial = ((f2 - f11) - f12) / f4;
            this.f32860competently = f11;
            this.f32865impromptu = f2 - f12;
            this.f32869taiyuan = f2;
            return;
        }
        if (f7 >= f2) {
            this.f32856apical = "hard stop";
            this.f32861cutely = 1;
            this.f32858attabal = f;
            this.f32868saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f32860competently = f2;
            this.f32871wireman = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f32856apical = "cruse decelerate";
            this.f32861cutely = 2;
            this.f32858attabal = f;
            this.f32868saneness = f;
            this.f32862dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f32860competently = f13;
            this.f32865impromptu = f2;
            this.f32871wireman = f14;
            this.f32867marial = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
        float f15 = (fSqrt2 - f) / f3;
        this.f32871wireman = f15;
        float f16 = fSqrt2 / f3;
        this.f32867marial = f16;
        if (fSqrt2 < f4) {
            this.f32856apical = "accelerate decelerate";
            this.f32861cutely = 2;
            this.f32858attabal = f;
            this.f32868saneness = fSqrt2;
            this.f32862dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f32871wireman = f15;
            this.f32867marial = f16;
            this.f32860competently = ((f + fSqrt2) * f15) / 2.0f;
            this.f32865impromptu = f2;
            return;
        }
        this.f32856apical = "accelerate cruse decelerate";
        this.f32861cutely = 3;
        this.f32858attabal = f;
        this.f32868saneness = f4;
        this.f32862dern = f4;
        float f17 = (f4 - f) / f3;
        this.f32871wireman = f17;
        float f18 = f4 / f3;
        this.f32859beachfront = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f32867marial = ((f2 - f19) - f20) / f4;
        this.f32860competently = f19;
        this.f32865impromptu = f2 - f20;
        this.f32869taiyuan = f2;
    }

    public final float dern(float f) {
        this.f32857arytenoidectomy = false;
        float f2 = this.f32871wireman;
        if (f <= f2) {
            float f3 = this.f32858attabal;
            return (f3 * f) + ((((this.f32868saneness - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f32861cutely;
        if (i == 1) {
            return this.f32860competently;
        }
        float f4 = f - f2;
        float f5 = this.f32867marial;
        if (f4 < f5) {
            float f6 = this.f32860competently;
            float f7 = this.f32868saneness;
            return f6 + (f7 * f4) + ((((this.f32862dern - f7) * f4) * f4) / (f5 * 2.0f));
        }
        if (i == 2) {
            return this.f32865impromptu;
        }
        float f8 = f4 - f5;
        float f9 = this.f32859beachfront;
        if (f8 > f9) {
            this.f32857arytenoidectomy = true;
            return this.f32869taiyuan;
        }
        float f10 = this.f32865impromptu;
        float f11 = this.f32862dern;
        return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
    }

    @Override // lerp.impassible
    public float getInterpolation(float f) {
        float fDern = dern(f);
        this.f32870triweekly = fDern;
        this.f32866kowloon = f;
        return this.f32863formularize ? this.f32864impassible - fDern : this.f32864impassible + fDern;
    }

    public float marial(float f) {
        float f2 = this.f32871wireman;
        if (f <= f2) {
            float f3 = this.f32858attabal;
            return f3 + (((this.f32868saneness - f3) * f) / f2);
        }
        int i = this.f32861cutely;
        if (i == 1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f4 = f - f2;
        float f5 = this.f32867marial;
        if (f4 < f5) {
            float f6 = this.f32868saneness;
            return f6 + (((this.f32862dern - f6) * f4) / f5);
        }
        if (i == 2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f7 = f4 - f5;
        float f8 = this.f32859beachfront;
        if (f7 >= f8) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f9 = this.f32862dern;
        return f9 - ((f7 * f9) / f8);
    }

    @Override // lerp.impassible
    public boolean saneness() {
        return attabal() < 1.0E-5f && Math.abs(this.f32869taiyuan - this.f32870triweekly) < 1.0E-5f;
    }

    public void wireman(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f32857arytenoidectomy = false;
        this.f32864impassible = f;
        boolean z = f > f2;
        this.f32863formularize = z;
        if (z) {
            beachfront(-f3, f - f2, f5, f6, f4);
        } else {
            beachfront(f3, f2 - f, f5, f6, f4);
        }
    }
}
