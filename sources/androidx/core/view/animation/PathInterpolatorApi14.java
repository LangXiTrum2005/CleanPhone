package androidx.core.view.animation;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
class PathInterpolatorApi14 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        throw null;
    }
}
