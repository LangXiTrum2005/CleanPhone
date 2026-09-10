package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
public class BlendModeColorFilterCompat {

    public static class Api29Impl {
        public static ColorFilter a(int i2, Object obj) {
            return new BlendModeColorFilter(i2, (BlendMode) obj);
        }
    }
}
