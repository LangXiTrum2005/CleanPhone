package patty;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: DrawableToBitmapConverter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final trawler.wireman f35130attabal = new attabal();

    public static endosteum.cutely<Bitmap> attabal(trawler.wireman wiremanVar, Drawable drawable, int i, int i2) {
        Bitmap bitmapSaneness;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapSaneness = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapSaneness = null;
        } else {
            bitmapSaneness = saneness(wiremanVar, current, i, i2);
            z = true;
        }
        if (!z) {
            wiremanVar = f35130attabal;
        }
        return competently.wireman(bitmapSaneness, wiremanVar);
    }

    public static Bitmap saneness(trawler.wireman wiremanVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                drawable.toString();
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                drawable.toString();
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock lockMarial = cord.marial();
        lockMarial.lock();
        Bitmap bitmapWireman = wiremanVar.wireman(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapWireman);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapWireman;
        } finally {
            lockMarial.unlock();
        }
    }

    /* JADX INFO: compiled from: DrawableToBitmapConverter.java */
    public class attabal extends trawler.marial {
        @Override // trawler.marial, trawler.wireman
        public void dern(Bitmap bitmap) {
        }
    }
}
