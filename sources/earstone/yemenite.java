package earstone;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewGroupUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class yemenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f25571attabal = true;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static boolean f25572dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Method f25573saneness;

    /* JADX INFO: compiled from: ViewGroupUtils.java */
    public static class attabal {
        public static int attabal(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        public static void saneness(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    public static int attabal(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return attabal.attabal(viewGroup, i);
        }
        if (!f25572dern) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f25573saneness = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f25572dern = true;
        }
        Method method = f25573saneness;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    public static void dern(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            attabal.saneness(viewGroup, z);
        } else {
            saneness(viewGroup, z);
        }
    }

    public static void saneness(ViewGroup viewGroup, boolean z) {
        if (f25571attabal) {
            try {
                attabal.saneness(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f25571attabal = false;
            }
        }
    }
}
