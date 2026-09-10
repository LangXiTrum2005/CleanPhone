package androidx.core.graphics;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class PathUtils {

    public static class Api26Impl {
        public static float[] a(Path path, float f) {
            return path.approximate(f);
        }
    }
}
