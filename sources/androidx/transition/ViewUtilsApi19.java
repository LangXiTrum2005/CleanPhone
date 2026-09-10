package androidx.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f8456a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f8457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f8458c;

    public static class Api29Impl {
        public static float a(View view) {
            return view.getTransitionAlpha();
        }

        public static void b(View view, float f) {
            view.setTransitionAlpha(f);
        }
    }

    public float a(View view) {
        if (f8456a) {
            try {
                return Api29Impl.a(view);
            } catch (NoSuchMethodError unused) {
                f8456a = false;
            }
        }
        return view.getAlpha();
    }

    public void b(View view, float f) {
        if (f8456a) {
            try {
                Api29Impl.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f8456a = false;
            }
        }
        view.setAlpha(f);
    }

    public void c(View view, int i2) {
        if (!f8458c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f8457b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f8458c = true;
        }
        Field field = f8457b;
        if (field != null) {
            try {
                f8457b.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
