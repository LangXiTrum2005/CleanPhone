package com.bytedance.adsdk.ud.mo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.ud.qdl.qdl.jyq;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final class mo {
    private static final ThreadLocal<PathMeasure> qdl = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.ud.mo.mo.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> ud = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.ud.mo.mo.2
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> lnr = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.ud.mo.mo.3
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> mml = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.ud.mo.mo.4
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float mzz = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int qdl(float f, float f2, float f3, float f4) {
        int i2 = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i2 = (int) (i2 * 31 * f2);
        }
        if (f3 != 0.0f) {
            i2 = (int) (i2 * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i2 * 31 * f4) : i2;
    }

    public static boolean ud(Matrix matrix) {
        float[] fArr = mml.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static boolean qdl(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        if (i3 < i6) {
            return false;
        }
        return i3 > i6 || i4 >= i7;
    }

    public static Path qdl(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF.x + pointF3.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void qdl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float qdl(Matrix matrix) {
        float[] fArr = mml.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = mzz;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void qdl(Path path, jyq jyqVar) {
        if (jyqVar == null || jyqVar.mo()) {
            return;
        }
        qdl(path, ((com.bytedance.adsdk.ud.qdl.ud.mml) jyqVar.lnr()).tvp() / 100.0f, ((com.bytedance.adsdk.ud.qdl.ud.mml) jyqVar.mml()).tvp() / 100.0f, ((com.bytedance.adsdk.ud.qdl.ud.mml) jyqVar.mzz()).tvp() / 360.0f);
    }

    public static void qdl(Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.ud.mzz.qdl("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = qdl.get();
        Path path2 = ud.get();
        Path path3 = lnr.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            com.bytedance.adsdk.ud.mzz.ud("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = mzz.qdl(fMin, length);
                fMax = mzz.qdl(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = mzz.qdl(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = mzz.qdl(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                com.bytedance.adsdk.ud.mzz.ud("applyTrimPathIfNeeded");
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.bytedance.adsdk.ud.mzz.ud("applyTrimPathIfNeeded");
            return;
        }
        com.bytedance.adsdk.ud.mzz.ud("applyTrimPathIfNeeded");
    }

    public static float qdl() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float qdl(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap qdl(Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean qdl(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void qdl(Canvas canvas, RectF rectF, Paint paint) {
        qdl(canvas, rectF, paint, 31);
    }

    public static void qdl(Canvas canvas, RectF rectF, Paint paint, int i2) {
        com.bytedance.adsdk.ud.mzz.qdl("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.ud.mzz.ud("Utils#saveLayer");
    }
}
