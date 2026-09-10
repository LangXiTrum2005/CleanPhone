package monroe;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.graphics.BlendModeCompat;

/* JADX INFO: compiled from: PaintCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ThreadLocal<technofreak.beachfront<Rect, Rect>> f33601attabal = new ThreadLocal<>();

    /* JADX INFO: compiled from: PaintCompat.java */
    public static class attabal {
        public static boolean attabal(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: compiled from: PaintCompat.java */
    public static class saneness {
        public static void attabal(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean attabal(Paint paint, String str) {
        return attabal.attabal(paint, str);
    }

    public static boolean saneness(Paint paint, BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            saneness.attabal(paint, blendModeCompat != null ? monroe.saneness.C0746saneness.attabal(blendModeCompat) : null);
            return true;
        }
        if (blendModeCompat == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeAttabal = monroe.saneness.attabal(blendModeCompat);
        paint.setXfermode(modeAttabal != null ? new PorterDuffXfermode(modeAttabal) : null);
        return modeAttabal != null;
    }
}
