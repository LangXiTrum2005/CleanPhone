package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class WindowCompat {

    public static class Api16Impl {
    }

    public static class Api28Impl {
        public static <T> T a(Window window, int i2) {
            return (T) window.requireViewById(i2);
        }
    }

    public static class Api30Impl {
        public static void a(Window window, boolean z2) {
            window.setDecorFitsSystemWindows(z2);
        }
    }

    public static void a(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
