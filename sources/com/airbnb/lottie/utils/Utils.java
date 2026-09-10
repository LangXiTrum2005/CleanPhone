package com.airbnb.lottie.utils;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.L;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f9946a = new AnonymousClass1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f9947b = new AnonymousClass2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f9948c = new AnonymousClass3();
    public static final ThreadLocal d = new AnonymousClass4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f9949e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.Utils$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.Utils$2, reason: invalid class name */
    public class AnonymousClass2 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.Utils$3, reason: invalid class name */
    public class AnonymousClass3 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.Utils$4, reason: invalid class name */
    public class AnonymousClass4 extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f9946a.get();
        Path path2 = (Path) f9947b.get();
        Path path3 = (Path) f9948c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            L.a();
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            L.a();
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = MiscUtils.c(fMin, length);
            fMax = MiscUtils.c(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = MiscUtils.c(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = MiscUtils.c(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            L.a();
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
        L.a();
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f9949e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        L.a();
    }
}
