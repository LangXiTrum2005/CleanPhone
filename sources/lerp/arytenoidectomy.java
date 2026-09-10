package lerp;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: VelocityMatrix.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f32751attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f32752beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f32753dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f32754marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f32755saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f32756wireman;

    public void attabal(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f32753dern;
        float f8 = f4 + this.f32756wireman;
        float f9 = f7 + (this.f32751attabal * f5);
        float f10 = f8 + (this.f32755saneness * f6);
        float radians = (float) Math.toRadians(this.f32752beachfront);
        float radians2 = (float) Math.toRadians(this.f32754marial);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = f9 + (((float) ((((double) ((-i) * f5)) * Math.sin(d)) - (Math.cos(d) * d2))) * radians2);
        float fCos = f10 + (radians2 * ((float) ((((double) (i * f5)) * Math.cos(d)) - (d2 * Math.sin(d)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void beachfront(cutely cutelyVar, cutely cutelyVar2, float f) {
        if (cutelyVar != null) {
            this.f32751attabal = cutelyVar.saneness(f);
        }
        if (cutelyVar2 != null) {
            this.f32755saneness = cutelyVar2.saneness(f);
        }
    }

    public void competently(marial marialVar, marial marialVar2, float f) {
        if (marialVar != null) {
            this.f32753dern = marialVar.saneness(f);
        }
        if (marialVar2 != null) {
            this.f32756wireman = marialVar2.saneness(f);
        }
    }

    public void dern(marial marialVar, float f) {
        if (marialVar != null) {
            this.f32754marial = marialVar.saneness(f);
        }
    }

    public void impromptu(cutely cutelyVar, cutely cutelyVar2, float f) {
        if (cutelyVar != null) {
            this.f32753dern = cutelyVar.saneness(f);
        }
        if (cutelyVar2 != null) {
            this.f32756wireman = cutelyVar2.saneness(f);
        }
    }

    public void marial(marial marialVar, marial marialVar2, float f) {
        if (marialVar != null) {
            this.f32751attabal = marialVar.saneness(f);
        }
        if (marialVar2 != null) {
            this.f32755saneness = marialVar2.saneness(f);
        }
    }

    public void saneness() {
        this.f32754marial = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32756wireman = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32753dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32755saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32751attabal = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void wireman(cutely cutelyVar, float f) {
        if (cutelyVar != null) {
            this.f32754marial = cutelyVar.saneness(f);
            this.f32752beachfront = cutelyVar.attabal(f);
        }
    }
}
