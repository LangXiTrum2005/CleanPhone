package powdery;

import android.content.Context;
import android.graphics.Color;
import bubbles.dern;
import com.unity3d.services.UnityAdsConstants;
import mullein.saneness;

/* JADX INFO: compiled from: ElevationOverlayProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f35616beachfront = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f35617attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f35618dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final float f35619marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f35620saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f35621wireman;

    public attabal(Context context) {
        this(saneness.saneness(context, dern.elevationOverlayEnabled, false), pyrope.attabal.saneness(context, dern.elevationOverlayColor, 0), pyrope.attabal.saneness(context, dern.elevationOverlayAccentColor, 0), pyrope.attabal.saneness(context, dern.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public float attabal(float f) {
        float f2 = this.f35619marial;
        return (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public final boolean beachfront(int i) {
        return monroe.dern.apical(i, 255) == this.f35621wireman;
    }

    public int dern(int i, float f) {
        return (this.f35617attabal && beachfront(i)) ? saneness(i, f) : i;
    }

    public boolean marial() {
        return this.f35617attabal;
    }

    public int saneness(int i, float f) {
        int i2;
        float fAttabal = attabal(f);
        int iAlpha = Color.alpha(i);
        int iCutely = pyrope.attabal.cutely(monroe.dern.apical(i, 255), this.f35620saneness, fAttabal);
        if (fAttabal > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i2 = this.f35618dern) != 0) {
            iCutely = pyrope.attabal.taiyuan(iCutely, monroe.dern.apical(i2, f35616beachfront));
        }
        return monroe.dern.apical(iCutely, iAlpha);
    }

    public int wireman(float f) {
        return dern(this.f35621wireman, f);
    }

    public attabal(boolean z, int i, int i2, int i3, float f) {
        this.f35617attabal = z;
        this.f35620saneness = i;
        this.f35618dern = i2;
        this.f35621wireman = i3;
        this.f35619marial = f;
    }
}
