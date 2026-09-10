package utwa;

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
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import kinesic.adultoid;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public final class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Matrix f39245attabal = new Matrix();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ThreadLocal<PathMeasure> f39249saneness = new attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final ThreadLocal<Path> f39247dern = new saneness();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final ThreadLocal<Path> f39250wireman = new dern();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ThreadLocal<float[]> f39248marial = new wireman();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final float f39246beachfront = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: compiled from: Utils.java */
    public class attabal extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public class dern extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public class saneness extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public class wireman extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static boolean apical(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void attabal(Path path, float f, float f2, float f3) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = f39249saneness.get();
        Path path2 = f39247dern.get();
        Path path3 = f39250wireman.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = apical.beachfront(fMin, length);
            fMax = apical.beachfront(fMax, length);
        }
        if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fMin = apical.beachfront(fMin, length);
        }
        if (fMax < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fMax = apical.beachfront(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("applyTrimPathIfNeeded");
                return;
            }
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
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("applyTrimPathIfNeeded");
        }
    }

    public static float beachfront(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float competently(Matrix matrix) {
        float[] fArr = f39248marial.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f39246beachfront;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean cutely(int i, int i2, int i3, int i4, int i5, int i6) {
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

    public static void dern(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static int formularize(int i, int i2) {
        return (int) ((((i / 255.0f) * i2) / 255.0f) * 255.0f);
    }

    public static Bitmap impassible(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean impromptu(Matrix matrix) {
        float[] fArr = f39248marial.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void kowloon(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("Utils#saveLayer");
        }
    }

    public static float marial() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static void saneness(Path path, adultoid adultoidVar) {
        if (adultoidVar == null || adultoidVar.formularize()) {
            return;
        }
        attabal(path, ((redevelopment.wireman) adultoidVar.cutely()).polloi() / 100.0f, ((redevelopment.wireman) adultoidVar.competently()).polloi() / 100.0f, ((redevelopment.wireman) adultoidVar.taiyuan()).polloi() / 360.0f);
    }

    public static int taiyuan(float f, float f2, float f3, float f4) {
        int i = f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (IronSourceError.ERROR_NON_EXISTENT_INSTANCE * f) : 17;
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f3);
        }
        return f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (i * 31 * f4) : i;
    }

    public static void triweekly(Canvas canvas, RectF rectF, Paint paint) {
        kowloon(canvas, rectF, paint, 31);
    }

    public static Path wireman(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && pointF4.length() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f = pointF.x + pointF3.x;
        float f2 = pointF.y + pointF3.y;
        float f3 = pointF2.x;
        float f4 = f3 + pointF4.x;
        float f5 = pointF2.y;
        path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        return path;
    }
}
