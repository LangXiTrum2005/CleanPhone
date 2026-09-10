package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class PaintCompat {

    public static class Api23Impl {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static class Api29Impl {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    static {
        new ThreadLocal();
    }

    public static boolean a(TextPaint textPaint, String str) {
        return Api23Impl.a(textPaint, str);
    }
}
