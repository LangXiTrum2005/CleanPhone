package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class ViewGroupUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f8452a = true;

    public static class Api29Impl {
        public static int a(ViewGroup viewGroup, int i2) {
            return viewGroup.getChildDrawingOrder(i2);
        }

        public static void b(ViewGroup viewGroup, boolean z2) {
            viewGroup.suppressLayout(z2);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(viewGroup, z2);
        } else if (f8452a) {
            try {
                Api29Impl.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f8452a = false;
            }
        }
    }
}
