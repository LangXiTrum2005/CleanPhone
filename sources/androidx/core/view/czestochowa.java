package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: WindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class czestochowa {

    /* JADX INFO: compiled from: WindowCompat.java */
    public static class attabal {
        public static void attabal(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: compiled from: WindowCompat.java */
    public static class dern {
        public static void attabal(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* JADX INFO: compiled from: WindowCompat.java */
    public static class saneness {
        public static void attabal(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static cig attabal(Window window, View view) {
        return new cig(window, view);
    }

    public static void saneness(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            dern.attabal(window, z);
        } else if (i >= 30) {
            saneness.attabal(window, z);
        } else {
            attabal.attabal(window, z);
        }
    }
}
