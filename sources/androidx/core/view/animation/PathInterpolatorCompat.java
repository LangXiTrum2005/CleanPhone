package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class PathInterpolatorCompat {

    public static class Api21Impl {
        public static Interpolator a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        public static Interpolator b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f, float f2, float f3, float f4) {
        return Api21Impl.b(f, f2, f3, f4);
    }

    public static Interpolator b(Path path) {
        return Api21Impl.c(path);
    }
}
