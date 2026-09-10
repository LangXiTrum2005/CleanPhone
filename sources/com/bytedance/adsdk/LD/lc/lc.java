package com.bytedance.adsdk.LD.lc;

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
import android.os.Build;
import android.provider.Settings;
import com.bytedance.adsdk.LD.Lxb.Lxb.Sfi;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final class lc {
    private static final ThreadLocal<PathMeasure> Lxb = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.LD.lc.lc.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> LD = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.LD.lc.lc.2
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> lk = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.LD.lc.lc.3
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> ZU = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.LD.lc.lc.4
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float JXs = (float) (Math.sqrt(2.0d) / 2.0d);

    public static boolean LD(Matrix matrix) {
        float[] fArr = ZU.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int Lxb(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean Lxb(int i, int i2, int i3, int i4, int i5, int i6) {
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

    public static Path Lxb(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void Lxb(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float Lxb(Matrix matrix) {
        float[] fArr = ZU.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = JXs;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void Lxb(Path path, Sfi sfi) {
        if (sfi == null || sfi.lc()) {
            return;
        }
        Lxb(path, ((com.bytedance.adsdk.LD.Lxb.LD.ZU) sfi.lk()).QAg() / 100.0f, ((com.bytedance.adsdk.LD.Lxb.LD.ZU) sfi.ZU()).QAg() / 100.0f, ((com.bytedance.adsdk.LD.Lxb.LD.ZU) sfi.JXs()).QAg() / 360.0f);
    }

    public static void Lxb(Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.LD.JXs.Lxb("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = Lxb.get();
        Path path2 = LD.get();
        Path path3 = lk.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            com.bytedance.adsdk.LD.JXs.LD("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = JXs.Lxb(fMin, length);
                fMax = JXs.Lxb(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = JXs.Lxb(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = JXs.Lxb(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                com.bytedance.adsdk.LD.JXs.LD("applyTrimPathIfNeeded");
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
            com.bytedance.adsdk.LD.JXs.LD("applyTrimPathIfNeeded");
            return;
        }
        com.bytedance.adsdk.LD.JXs.LD("applyTrimPathIfNeeded");
    }

    public static float Lxb() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float Lxb(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap Lxb(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean Lxb(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void Lxb(Canvas canvas, RectF rectF, Paint paint) {
        Lxb(canvas, rectF, paint, 31);
    }

    public static void Lxb(Canvas canvas, RectF rectF, Paint paint, int i) {
        com.bytedance.adsdk.LD.JXs.Lxb("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        com.bytedance.adsdk.LD.JXs.LD("Utils#saveLayer");
    }
}
