package androidx.media3.common;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import decarock.grimness;

/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes.dex */
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f11261attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f11262dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f11263saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final preprohormone f11260wireman = new preprohormone(1.0f);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f11259marial = grimness.igbo(0);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f11258beachfront = grimness.igbo(1);

    public preprohormone(float f) {
        this(f, 1.0f);
    }

    public long attabal(long j) {
        return j * ((long) this.f11262dern);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && preprohormone.class == obj.getClass()) {
            preprohormone preprohormoneVar = (preprohormone) obj;
            if (this.f11261attabal == preprohormoneVar.f11261attabal && this.f11263saneness == preprohormoneVar.f11263saneness) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f11261attabal)) * 31) + Float.floatToRawIntBits(this.f11263saneness);
    }

    public preprohormone saneness(float f) {
        return new preprohormone(f, this.f11263saneness);
    }

    public String toString() {
        return grimness.sealless("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f11261attabal), Float.valueOf(this.f11263saneness));
    }

    public preprohormone(float f, float f2) {
        decarock.attabal.attabal(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        decarock.attabal.attabal(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f11261attabal = f;
        this.f11263saneness = f2;
        this.f11262dern = Math.round(f * 1000.0f);
    }
}
