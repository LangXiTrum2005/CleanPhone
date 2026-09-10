package fastrack;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: LookupTableInterpolator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class wireman implements Interpolator {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float[] f26262attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f26263saneness;

    public wireman(float[] fArr) {
        this.f26262attabal = fArr;
        this.f26263saneness = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float[] fArr = this.f26262attabal;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f26263saneness;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.f26262attabal;
        float f4 = fArr2[iMin];
        return f4 + (f3 * (fArr2[iMin + 1] - f4));
    }
}
