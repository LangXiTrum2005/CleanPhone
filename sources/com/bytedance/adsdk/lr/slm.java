package com.bytedance.adsdk.lr;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
class slm implements Interpolator {
    private final float[] lr;
    private final float[] ri;

    public slm(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        this.ri = new float[i2];
        this.lr = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / i, fArr, null);
            this.ri[i3] = fArr[0];
            this.lr[i3] = fArr[1];
        }
    }

    private static Path ri(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.ri.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.ri[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.ri;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this.lr[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.lr;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }

    public slm(float f, float f2, float f3, float f4) {
        this(ri(f, f2, f3, f4));
    }
}
