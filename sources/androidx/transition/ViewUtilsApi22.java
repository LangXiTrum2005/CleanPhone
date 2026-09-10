package androidx.transition;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi22 extends ViewUtilsApi21 {
    public static boolean g = true;

    public static class Api29Impl {
        public static void a(View view, int i2, int i3, int i4, int i5) {
            view.setLeftTopRightBottom(i2, i3, i4, i5);
        }
    }

    public void g(View view, int i2, int i3, int i4, int i5) {
        if (g) {
            try {
                Api29Impl.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
