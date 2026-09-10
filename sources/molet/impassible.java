package molet;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: SpringForce.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public double f33524attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public double f33525beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public double f33526competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final impromptu.arytenoidectomy f33527cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f33528dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public double f33529impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public double f33530marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public double f33531saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public double f33532taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public double f33533wireman;

    public impassible() {
        this.f33524attabal = Math.sqrt(1500.0d);
        this.f33531saneness = 0.5d;
        this.f33528dern = false;
        this.f33532taiyuan = Double.MAX_VALUE;
        this.f33527cutely = new impromptu.arytenoidectomy();
    }

    public float attabal() {
        return (float) this.f33531saneness;
    }

    public impassible beachfront(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f33531saneness = f;
        this.f33528dern = false;
        return this;
    }

    public impassible competently(float f) {
        this.f33532taiyuan = f;
        return this;
    }

    public impromptu.arytenoidectomy cutely(double d, double d2, long j) {
        double dPow;
        double dCos;
        wireman();
        double d3 = j / 1000.0d;
        double d4 = d - this.f33532taiyuan;
        double d5 = this.f33531saneness;
        if (d5 > 1.0d) {
            double d6 = this.f33526competently;
            double d7 = this.f33525beachfront;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f33525beachfront * d3) * d9);
            double d10 = this.f33526competently;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f33525beachfront;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.f33524attabal;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.f33524attabal) * d3);
            double d15 = this.f33524attabal;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.f33529impromptu;
            double d17 = this.f33524attabal;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            dPow = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.f33529impromptu * d3) * d4) + (Math.sin(this.f33529impromptu * d3) * d18));
            double d19 = this.f33524attabal;
            double d20 = this.f33531saneness;
            double dPow4 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d21 = this.f33529impromptu;
            double dSin = (-d21) * d4 * Math.sin(d21 * d3);
            double d22 = this.f33529impromptu;
            dCos = ((-d19) * dPow * d20) + (dPow4 * (dSin + (d18 * d22 * Math.cos(d22 * d3))));
        }
        impromptu.arytenoidectomy arytenoidectomyVar = this.f33527cutely;
        arytenoidectomyVar.f33561attabal = (float) (dPow + this.f33532taiyuan);
        arytenoidectomyVar.f33562saneness = (float) dCos;
        return arytenoidectomyVar;
    }

    public float dern() {
        double d = this.f33524attabal;
        return (float) (d * d);
    }

    public impassible impromptu(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f33524attabal = Math.sqrt(f);
        this.f33528dern = false;
        return this;
    }

    public boolean marial(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f33530marial && ((double) Math.abs(f - saneness())) < this.f33533wireman;
    }

    public float saneness() {
        return (float) this.f33532taiyuan;
    }

    public void taiyuan(double d) {
        double dAbs = Math.abs(d);
        this.f33533wireman = dAbs;
        this.f33530marial = dAbs * 62.5d;
    }

    public final void wireman() {
        if (this.f33528dern) {
            return;
        }
        if (this.f33532taiyuan == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.f33531saneness;
        if (d > 1.0d) {
            double d2 = this.f33524attabal;
            this.f33525beachfront = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.f33531saneness;
            double d4 = this.f33524attabal;
            this.f33526competently = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= 0.0d && d < 1.0d) {
            this.f33529impromptu = this.f33524attabal * Math.sqrt(1.0d - (d * d));
        }
        this.f33528dern = true;
    }

    public impassible(float f) {
        this.f33524attabal = Math.sqrt(1500.0d);
        this.f33531saneness = 0.5d;
        this.f33528dern = false;
        this.f33532taiyuan = Double.MAX_VALUE;
        this.f33527cutely = new impromptu.arytenoidectomy();
        this.f33532taiyuan = f;
    }
}
