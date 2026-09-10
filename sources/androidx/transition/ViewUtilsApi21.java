package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi21 extends ViewUtilsApi19 {
    public static boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f8459e = true;
    public static boolean f = true;

    public static class Api29Impl {
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    public void d(View view, Matrix matrix) {
        if (d) {
            try {
                Api29Impl.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void e(View view, Matrix matrix) {
        if (f8459e) {
            try {
                Api29Impl.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f8459e = false;
            }
        }
    }

    public void f(View view, Matrix matrix) {
        if (f) {
            try {
                Api29Impl.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
