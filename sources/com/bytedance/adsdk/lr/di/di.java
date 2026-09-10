package com.bytedance.adsdk.lr.di;

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
import com.bytedance.adsdk.lr.ri.ri.ihz;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public final class di {
    private static final ThreadLocal<PathMeasure> ri = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.lr.di.di.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> lr = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lr.di.di.2
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> ik = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lr.di.di.3
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> ka = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.lr.di.di.4
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float fi = (float) (Math.sqrt(2.0d) / 2.0d);

    public static boolean lr(Matrix matrix) {
        float[] fArr = ka.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int ri(float f, float f2, float f3, float f4) {
        int i = f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (f * 527.0f) : 17;
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f3);
        }
        return f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (i * 31 * f4) : i;
    }

    public static boolean ri(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static Path ri(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF4.length() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
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

    public static void ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float ri(Matrix matrix) {
        float[] fArr = ka.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = fi;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void ri(Path path, ihz ihzVar) {
        if (ihzVar == null || ihzVar.di()) {
            return;
        }
        ri(path, ((com.bytedance.adsdk.lr.ri.lr.ka) ihzVar.ik()).jbs() / 100.0f, ((com.bytedance.adsdk.lr.ri.lr.ka) ihzVar.ka()).jbs() / 100.0f, ((com.bytedance.adsdk.lr.ri.lr.ka) ihzVar.fi()).jbs() / 360.0f);
    }

    public static void ri(Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.lr.fi.ri("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = ri.get();
        Path path2 = lr.get();
        Path path3 = ik.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.adsdk.lr.fi.lr("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = fi.ri(fMin, length);
                fMax = fi.ri(fMax, length);
            }
            if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fMin = fi.ri(fMin, length);
            }
            if (fMax < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fMax = fi.ri(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                com.bytedance.adsdk.lr.fi.lr("applyTrimPathIfNeeded");
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.bytedance.adsdk.lr.fi.lr("applyTrimPathIfNeeded");
            return;
        }
        com.bytedance.adsdk.lr.fi.lr("applyTrimPathIfNeeded");
    }

    public static float ri() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float ri(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap ri(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean ri(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void ri(Canvas canvas, RectF rectF, Paint paint) {
        ri(canvas, rectF, paint, 31);
    }

    public static void ri(Canvas canvas, RectF rectF, Paint paint, int i) {
        com.bytedance.adsdk.lr.fi.ri("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.lr.fi.lr("Utils#saveLayer");
    }
}
