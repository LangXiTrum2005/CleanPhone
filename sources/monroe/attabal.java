package monroe;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: BitmapCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {
    @Deprecated
    public static boolean attabal(Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @Deprecated
    public static void saneness(Bitmap bitmap, boolean z) {
        bitmap.setHasMipMap(z);
    }
}
