package sg.bigo.ads.common.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int b(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int c(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int d(Context context, int i2) {
        return (int) (((double) (i2 / f(context))) + 0.5d);
    }

    public static sg.bigo.ads.common.p e(Context context) {
        if (context == null) {
            return new sg.bigo.ads.common.p(0, 0);
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return new sg.bigo.ads.common.p((int) (point.x / context.getResources().getDisplayMetrics().density), (int) (point.y / context.getResources().getDisplayMetrics().density));
        } catch (Throwable unused) {
            return new sg.bigo.ads.common.p(0, 0);
        }
    }

    private static float f(Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int a(Context context, int i2) {
        return (int) (((double) (a(context) * i2)) + 0.5d);
    }

    public static int b(Context context, int i2) {
        return (int) (((double) (f(context) * i2)) + 0.5d);
    }

    public static int c(Context context, int i2) {
        return (int) (((double) (i2 / a(context))) + 0.5d);
    }

    public static Point d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return point;
        } catch (Throwable unused) {
            return new Point();
        }
    }
}
