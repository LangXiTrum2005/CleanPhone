package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
final class DrawableToBitmapConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BitmapPool f12661a = new AnonymousClass1();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter$1, reason: invalid class name */
    public class AnonymousClass1 extends BitmapPoolAdapter {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
        public final void b(Bitmap bitmap) {
        }
    }

    public static BitmapResource a(BitmapPool bitmapPool, Drawable drawable, int i2, int i3) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z2 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i2 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i3 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i2 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i3 = current.getIntrinsicHeight();
                    }
                    Lock lock = TransformationUtils.d;
                    lock.lock();
                    Bitmap bitmapE = bitmapPool.e(i2, i3, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapE);
                        current.setBounds(0, 0, i2, i3);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapE;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z2 = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z2 = true;
        }
        if (!z2) {
            bitmapPool = f12661a;
        }
        return BitmapResource.b(bitmap, bitmapPool);
    }
}
