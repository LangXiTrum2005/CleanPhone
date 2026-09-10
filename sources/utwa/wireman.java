package utwa;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: GammaEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {
    public static float attabal(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int dern(float f, int i, int i2) {
        if (i == i2 || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float fAttabal = attabal(((i >> 16) & 255) / 255.0f);
        float fAttabal2 = attabal(((i >> 8) & 255) / 255.0f);
        float fAttabal3 = attabal((i & 255) / 255.0f);
        float fAttabal4 = attabal(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float fAttabal5 = fAttabal2 + ((attabal(((i2 >> 8) & 255) / 255.0f) - fAttabal2) * f);
        float fAttabal6 = fAttabal3 + (f * (attabal((i2 & 255) / 255.0f) - fAttabal3));
        return (Math.round(saneness(fAttabal + ((fAttabal4 - fAttabal) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(saneness(fAttabal5) * 255.0f) << 8) | Math.round(saneness(fAttabal6) * 255.0f);
    }

    public static float saneness(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
