package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import java.io.Closeable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ah0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3014ah0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Xg0 f4135a = new Xg0(0);
    public static final Xg0 b = new Xg0(1);
    public static final Xg0 c = new Xg0(2);
    public static final Xg0 d = new Xg0(3);
    public static final float e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f4135a.get();
        Path path2 = (Path) b.get();
        Path path3 = (Path) c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = AbstractC5187zP.c(fMin, length);
                fMax = AbstractC5187zP.c(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = AbstractC5187zP.c(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = AbstractC5187zP.c(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
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
        }
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

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint) {
        f(canvas, rectF, paint, 31);
    }

    public static void f(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }
}
