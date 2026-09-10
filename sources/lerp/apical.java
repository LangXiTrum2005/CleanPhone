package lerp;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: SpringStopEngine.java */
/* JADX INFO: loaded from: classes.dex */
public class apical implements impassible {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f32742beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f32743competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f32744cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public double f32745dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f32746impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public double f32747marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f32749taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public double f32750wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public double f32741attabal = 0.5d;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f32748saneness = false;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f32740apical = 0;

    @Override // lerp.impassible
    public float attabal() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void dern(double d) {
        if (d <= 0.0d) {
            return;
        }
        double d2 = this.f32745dern;
        double d3 = this.f32741attabal;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f32749taiyuan)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) iSqrt);
        int i = 0;
        while (i < iSqrt) {
            float f = this.f32743competently;
            double d5 = this.f32750wireman;
            float f2 = this.f32746impromptu;
            double d6 = d2;
            double d7 = ((-d2) * (((double) f) - d5)) - (((double) f2) * d3);
            float f3 = this.f32749taiyuan;
            double d8 = d3;
            double d9 = ((double) f2) + (((d7 / ((double) f3)) * d4) / 2.0d);
            double d10 = ((((-((((double) f) + ((d4 * d9) / 2.0d)) - d5)) * d6) - (d9 * d8)) / ((double) f3)) * d4;
            double d11 = ((double) f2) + (d10 / 2.0d);
            float f4 = f2 + ((float) d10);
            this.f32746impromptu = f4;
            float f5 = f + ((float) (d11 * d4));
            this.f32743competently = f5;
            int i2 = this.f32740apical;
            if (i2 > 0) {
                if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i2 & 1) == 1) {
                    this.f32743competently = -f5;
                    this.f32746impromptu = -f4;
                }
                float f6 = this.f32743competently;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f32743competently = 2.0f - f6;
                    this.f32746impromptu = -this.f32746impromptu;
                }
            }
            i++;
            d2 = d6;
            d3 = d8;
        }
    }

    @Override // lerp.impassible
    public float getInterpolation(float f) {
        dern(f - this.f32742beachfront);
        this.f32742beachfront = f;
        if (saneness()) {
            this.f32743competently = (float) this.f32750wireman;
        }
        return this.f32743competently;
    }

    @Override // lerp.impassible
    public boolean saneness() {
        double d = ((double) this.f32743competently) - this.f32750wireman;
        double d2 = this.f32745dern;
        double d3 = this.f32746impromptu;
        return Math.sqrt((((d3 * d3) * ((double) this.f32749taiyuan)) + ((d2 * d) * d)) / d2) <= ((double) this.f32744cutely);
    }

    public void wireman(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f32750wireman = f2;
        this.f32741attabal = f6;
        this.f32748saneness = false;
        this.f32743competently = f;
        this.f32747marial = f3;
        this.f32745dern = f5;
        this.f32749taiyuan = f4;
        this.f32744cutely = f7;
        this.f32740apical = i;
        this.f32742beachfront = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
