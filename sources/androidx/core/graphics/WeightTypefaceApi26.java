package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.collection.LongSparseArray;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi26 {
    static {
        try {
            Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE).setAccessible(true);
            Typeface.class.getDeclaredConstructor(cls).setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
        }
        new LongSparseArray(3);
    }
}
