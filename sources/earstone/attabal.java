package earstone;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: CanvasUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Method f25509attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static boolean f25510dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Method f25511saneness;

    /* JADX INFO: renamed from: earstone.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CanvasUtils.java */
    public static class C0593attabal {
        public static void attabal(Canvas canvas) {
            canvas.disableZ();
        }

        public static void saneness(Canvas canvas) {
            canvas.enableZ();
        }
    }

    public static void attabal(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                C0593attabal.saneness(canvas);
                return;
            } else {
                C0593attabal.attabal(canvas);
                return;
            }
        }
        if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f25510dern) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f25509attabal = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                f25511saneness = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f25510dern = true;
        }
        if (z) {
            try {
                Method method2 = f25509attabal;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z || (method = f25511saneness) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
