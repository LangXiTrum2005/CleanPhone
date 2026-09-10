package earstone;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ViewUtilsApi19.java */
/* JADX INFO: loaded from: classes.dex */
public class restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f25550attabal = true;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static boolean f25551dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Field f25552saneness;

    /* JADX INFO: compiled from: ViewUtilsApi19.java */
    public static class attabal {
        public static float attabal(View view) {
            return view.getTransitionAlpha();
        }

        public static void saneness(View view, float f) {
            view.setTransitionAlpha(f);
        }
    }

    public void beachfront(View view, float f) {
        if (f25550attabal) {
            try {
                attabal.saneness(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f25550attabal = false;
            }
        }
        view.setAlpha(f);
    }

    public void competently(View view, int i) {
        if (!f25551dern) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f25552saneness = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f25551dern = true;
        }
        Field field = f25552saneness;
        if (field != null) {
            try {
                f25552saneness.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void impromptu(View view, Matrix matrix) {
        throw null;
    }

    public void marial(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    public float saneness(View view) {
        if (f25550attabal) {
            try {
                return attabal.attabal(view);
            } catch (NoSuchMethodError unused) {
                f25550attabal = false;
            }
        }
        return view.getAlpha();
    }

    public void taiyuan(View view, Matrix matrix) {
        throw null;
    }

    public void wireman(View view, Matrix matrix) {
        throw null;
    }

    public void attabal(View view) {
    }

    public void dern(View view) {
    }
}
