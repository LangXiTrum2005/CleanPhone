package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public class CircleCrop extends BitmapTransformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12644b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(Key.f12364a);

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12644b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap c(BitmapPool bitmapPool, Bitmap bitmap, int i2, int i3) {
        Paint paint = TransformationUtils.f12693a;
        int iMin = Math.min(i2, i3);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapC = TransformationUtils.c(bitmap, bitmapPool);
        Bitmap bitmapE = bitmapPool.e(iMin, iMin, TransformationUtils.d(bitmap));
        bitmapE.setHasAlpha(true);
        Lock lock = TransformationUtils.d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawCircle(f2, f2, f2, TransformationUtils.f12694b);
            canvas.drawBitmap(bitmapC, (Rect) null, rectF, TransformationUtils.f12695c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapC.equals(bitmap)) {
                bitmapPool.b(bitmapC);
            }
            return bitmapE;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof CircleCrop;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return 1101716364;
    }
}
