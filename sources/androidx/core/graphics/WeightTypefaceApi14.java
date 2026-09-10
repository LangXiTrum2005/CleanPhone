package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.collection.LongSparseArray;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi14 {
    static {
        try {
            Typeface.class.getDeclaredField("native_instance").setAccessible(true);
        } catch (Exception e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
        }
        new LongSparseArray(3);
    }
}
