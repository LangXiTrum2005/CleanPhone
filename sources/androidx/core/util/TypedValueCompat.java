package androidx.core.util;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class TypedValueCompat {

    public static class Api34Impl {
        public static float a(int i2, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i2, f, displayMetrics);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }
}
