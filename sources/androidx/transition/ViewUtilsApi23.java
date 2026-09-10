package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f8460h = true;

    public static class Api29Impl {
        public static void a(View view, int i2) {
            view.setTransitionVisibility(i2);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void c(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.c(view, i2);
        } else if (f8460h) {
            try {
                Api29Impl.a(view, i2);
            } catch (NoSuchMethodError unused) {
                f8460h = false;
            }
        }
    }
}
