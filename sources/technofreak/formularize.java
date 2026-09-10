package technofreak;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: TypedValueCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize {

    /* JADX INFO: compiled from: TypedValueCompat.java */
    public static class attabal {
        public static float attabal(int i, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }

    public static float attabal(int i, float f, DisplayMetrics displayMetrics) {
        float f2;
        float f3;
        if (Build.VERSION.SDK_INT >= 34) {
            return attabal.attabal(i, f, displayMetrics);
        }
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            float f4 = displayMetrics.density;
            return f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f / f4;
        }
        if (i == 2) {
            float f5 = displayMetrics.scaledDensity;
            return f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f / f5;
        }
        if (i == 3) {
            float f6 = displayMetrics.xdpi;
            if (f6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            f2 = f / f6;
            f3 = 0.013888889f;
        } else {
            if (i == 4) {
                float f7 = displayMetrics.xdpi;
                return f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f / f7;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + i);
            }
            float f8 = displayMetrics.xdpi;
            if (f8 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            f2 = f / f8;
            f3 = 0.03937008f;
        }
        return f2 / f3;
    }

    public static float dern(float f, DisplayMetrics displayMetrics) {
        return attabal(1, f, displayMetrics);
    }

    public static int saneness(int i) {
        return i & 15;
    }
}
