package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class TransformationUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Paint f12693a = new Paint(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Paint f12694b = new Paint(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Paint f12695c;
    public static final Lock d;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$1, reason: invalid class name */
    class AnonymousClass1 implements DrawRoundedCornerFn {
        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn
        public final void a(Canvas canvas, RectF rectF, Paint paint) {
            float f = 0;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$2, reason: invalid class name */
    class AnonymousClass2 implements DrawRoundedCornerFn {
        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn
        public final void a(Canvas canvas, RectF rectF, Paint paint) {
            Path path = new Path();
            path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    public interface DrawRoundedCornerFn {
        void a(Canvas canvas, RectF rectF, Paint paint);
    }

    public static final class NoLock implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new NoLock();
        Paint paint = new Paint(7);
        f12695c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f12693a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() != i2 || bitmap.getHeight() != i3) {
            float fMin = Math.min(i2 / bitmap.getWidth(), i3 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapE = bitmapPool.e((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                bitmapE.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i2 + "x" + i3);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + bitmapE.getWidth() + "x" + bitmapE.getHeight());
                    StringBuilder sb = new StringBuilder("minPct:   ");
                    sb.append(fMin);
                    Log.v("TransformationUtils", sb.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                a(bitmap, bitmapE, matrix);
                return bitmapE;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap c(Bitmap bitmap, BitmapPool bitmapPool) {
        Bitmap.Config configD = d(bitmap);
        if (configD.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapE = bitmapPool.e(bitmap.getWidth(), bitmap.getHeight(), configD);
        new Canvas(bitmapE).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapE;
    }

    public static Bitmap.Config d(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    public static Bitmap e(BitmapPool bitmapPool, Bitmap bitmap, DrawRoundedCornerFn drawRoundedCornerFn) {
        Bitmap.Config configD = d(bitmap);
        Bitmap bitmapC = c(bitmap, bitmapPool);
        Bitmap bitmapE = bitmapPool.e(bitmapC.getWidth(), bitmapC.getHeight(), configD);
        bitmapE.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapC, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapE.getWidth(), bitmapE.getHeight());
        Lock lock = d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            drawRoundedCornerFn.a(canvas, rectF, paint);
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
}
