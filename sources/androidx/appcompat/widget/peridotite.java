package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class peridotite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f5533attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final boolean f5534dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Method f5535saneness;

    /* JADX INFO: compiled from: ViewUtils.java */
    public static class attabal {
        public static void attabal(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f5534dern = Build.VERSION.SDK_INT >= 27;
    }

    public static void attabal(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            attabal.attabal(view, rect, rect2);
            return;
        }
        if (!f5533attabal) {
            f5533attabal = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f5535saneness = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f5535saneness.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = f5535saneness;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused2) {
            }
        }
    }

    public static void dern(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public static boolean saneness(View view) {
        return view.getLayoutDirection() == 1;
    }
}
